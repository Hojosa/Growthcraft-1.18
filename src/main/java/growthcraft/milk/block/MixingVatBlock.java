package growthcraft.milk.block;

import javax.annotation.ParametersAreNonnullByDefault;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import growthcraft.core.utils.BlockPropertiesUtils;
import growthcraft.lib.utils.BlockStateUtils;
import growthcraft.milk.GrowthcraftMilk;
import growthcraft.milk.block.entity.MixingVatBlockEntity;
import growthcraft.milk.init.GrowthcraftMilkBlockEntities;
import growthcraft.milk.init.config.GrowthcraftMilkConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.network.NetworkHooks;

public class MixingVatBlock extends BaseEntityBlock {
    //TODO[5]: Implement MixingVatBlock
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public MixingVatBlock() {
        this(getInitProperties());
    }

    public MixingVatBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, false));

    }

    private static Properties getInitProperties() {
        Properties properties = Properties.copy(Blocks.STONE);
        properties.noOcclusion();
        properties.sound(SoundType.METAL);
        properties.isRedstoneConductor(BlockPropertiesUtils::never);
        properties.isViewBlocking(BlockPropertiesUtils::never);
        return properties;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        super.createBlockStateDefinition(stateBuilder.add(LIT));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(LIT, BlockStateUtils.isHeated(context.getLevel(), context.getClickedPos()));
    }

    @Override
    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return GrowthcraftMilkBlockEntities.MIXING_VAT_BLOCK_ENTITY.get().create(blockPos, blockState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (!level.isClientSide) {
            return createTickerHelper(
                    blockEntityType,
                    GrowthcraftMilkBlockEntities.MIXING_VAT_BLOCK_ENTITY.get(),
                    (worldLevel, pos, blockState, blockEntity) -> (blockEntity).tick()
            );
        }

        return null;
    }

    @ParametersAreNonnullByDefault
    public @NotNull InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        MixingVatBlockEntity blockEntity = (MixingVatBlockEntity) level.getBlockEntity(blockPos);

        assert blockEntity != null;
        FluidTank inputFluidTank = blockEntity.getFluidTank("input");
        FluidTank reagentFluidTank = blockEntity.getFluidTank("reagent");

        // Try to do fluid handling first.
        if (player.getItemInHand(interactionHand)
                .getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY)
                .isPresent()
        ) {
            boolean fluidInteractionResult = false;

            if (player.getItemInHand(interactionHand).getItem() == Items.BUCKET) {
                // Then we are trying to drain the tanks.
                if (!reagentFluidTank.isEmpty()) {
                    fluidInteractionResult = FluidUtil.interactWithFluidHandler(player, interactionHand, level, blockPos, Direction.NORTH);
                } else if (!inputFluidTank.isEmpty()) {
                    fluidInteractionResult = FluidUtil.interactWithFluidHandler(player, interactionHand, level, blockPos, Direction.UP);
                }
            } else {
                // Try and fill the input tank first.
                if (inputFluidTank.getFluidAmount() < inputFluidTank.getCapacity()) {
                    fluidInteractionResult = FluidUtil.interactWithFluidHandler(player, interactionHand, level, blockPos, Direction.UP);
                } else if (reagentFluidTank.getFluidAmount() < reagentFluidTank.getCapacity()) {
                    fluidInteractionResult = FluidUtil.interactWithFluidHandler(player, interactionHand, level, blockPos, Direction.NORTH);
                }
            }

            return fluidInteractionResult ? InteractionResult.SUCCESS : InteractionResult.FAIL;
            // TODO Handle tool activation of MixingVat.
	     } else if (!player.getItemInHand(interactionHand).isEmpty()
	                && (player.getItemInHand(interactionHand).is(blockEntity.getActivationTool().getItem())
	                || player.getItemInHand(interactionHand).is(blockEntity.getResultActivationTool().getItem()))
	        ) {
            // Try and activate the recipe.
            if(blockEntity.activateRecipe(player.getItemInHand(interactionHand))) {
                if (GrowthcraftMilkConfig.isConsumeMixingVatActivator())
                    player.getItemInHand(interactionHand).shrink(1);
                return InteractionResult.SUCCESS;
            }

            // Process the Cheese Curds extraction.
            if(!blockEntity.getInventoryHandler().getStackInSlot(3).isEmpty()
                && blockEntity.activateResult(player, player.getItemInHand(interactionHand))) {
                player.getItemInHand(interactionHand).shrink(1);
                return InteractionResult.SUCCESS;
            }

        } else {
            // Otherwise, try and interact with the GUI.
            try {
                // Play sound
                blockEntity.playSound("open");
                // Open the GUI
                NetworkHooks.openGui(((ServerPlayer) player), blockEntity, blockPos);
                return InteractionResult.SUCCESS;
            } catch (Exception ex) {
                GrowthcraftMilk.LOGGER.error(
                        String.format("%s unable to open MixingVatBlockEntity GUI at %s.",
                                player.getDisplayName().getString(),
                                blockPos)
                );
                GrowthcraftMilk.LOGGER.error(ex.getMessage());
                GrowthcraftMilk.LOGGER.error(ex.fillInStackTrace());
                return InteractionResult.FAIL;
            }
        }
        return InteractionResult.SUCCESS;
    }
}
