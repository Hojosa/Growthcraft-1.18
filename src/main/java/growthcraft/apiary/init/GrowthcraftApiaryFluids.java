package growthcraft.apiary.init;

import growthcraft.apiary.shared.Reference;
import growthcraft.apiary.shared.Reference.UnlocalizedName;
import growthcraft.lib.utils.FluidUtils;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftApiaryFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
            ForgeRegistries.FLUIDS, Reference.MODID
    );

//    public static final DeferredRegister<ForgeFl> FLUID_TYPES = DeferredRegister.create(
//            ForgeRegistries.Keys.FLUID_TYPES, Reference.MODID
//    );

//    public static final RegistryObject<FlowingFluid> HONEY_FLUID_STILL = FLUIDS.register(
//            FluidUtils.getFluidNames(UnlocalizedName.HONEY).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftApiaryFluids.HONEY_PROPERTIES));
//    public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING = FLUIDS.register(
//            FluidUtils.getFluidNames(UnlocalizedName.HONEY).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Source(GrowthcraftApiaryFluids.HONEY_PROPERTIES));
//    
//    public static final ForgeFlowingFluid.Properties HONEY_PROPERTIES = new ForgeFlowingFluid.Properties(
//    		() -> HONEY_FLUID_STILL.get(), () -> HONEY_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
//    		.color(Reference.FluidColor.HONEY.toIntValue()).sound(SoundEvents.HONEY_DRINK).overlay(FluidUtils.FluidResource.OVERLAY))
//    		.block(() -> GrowthcraftApiaryFluids.HONEY_FLUID_BLOCK.get()).bucket(() -> GrowthcraftApiaryItems.HONEY_BUCKET.get());
//    
//    public static final RegistryObject<LiquidBlock> HONEY_FLUID_BLOCK =
//            GrowthcraftApiaryBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.BLOCK),
//                    () -> new LiquidBlock(HONEY_FLUID_STILL, BlockBehaviour.Properties.of(Material.WATER)));
    
    
//  FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.STILL)
//  FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.FLOWING)
    

    public static final RegistryObject<FlowingFluid> HONEY_FLUID
            = FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftApiaryFluids.HONEY_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING
            = FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftApiaryFluids.HONEY_PROPERTIES));


    public static final ForgeFlowingFluid.Properties HONEY_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> HONEY_FLUID.get(), () -> HONEY_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
            .sound(SoundEvents.HONEY_DRINK).overlay(FluidUtils.FluidResource.OVERLAY)
            .color(Reference.FluidColor.HONEY.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> GrowthcraftApiaryFluids.HONEY_FLUID_BLOCK.get()).bucket(() -> GrowthcraftApiaryItems.HONEY_BUCKET.get());

    public static final RegistryObject<LiquidBlock> HONEY_FLUID_BLOCK = GrowthcraftApiaryBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.STILL),
            () -> new LiquidBlock(() -> GrowthcraftApiaryFluids.HONEY_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
            .noCollission().strength(100f).noDrops()));
    
    
    
    public static final RegistryObject<FlowingFluid> HONEY_MEAD_FLUID
    		= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY_MEAD).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftApiaryFluids.HONEY_MEAD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HONEY_MEAD_FLUID_FLOWING
    		= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY_MEAD).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftApiaryFluids.HONEY_MEAD_PROPERTIES));


	public static final ForgeFlowingFluid.Properties HONEY_MEAD_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> HONEY_MEAD_FLUID.get(), () -> HONEY_MEAD_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.HONEY_DRINK).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.HONEY_MEAD.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftApiaryFluids.HONEY_MEAD_FLUID_BLOCK.get()).bucket(() -> GrowthcraftApiaryItems.HONEY_MEAD_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> HONEY_MEAD_FLUID_BLOCK = GrowthcraftApiaryBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY_MEAD).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftApiaryFluids.HONEY_MEAD_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
	        .noCollission().strength(100f).noDrops()));
    
    
    
//    public static final GrowthcraftApiaryFluidRegistryContainer HONEY = new GrowthcraftApiaryFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftApiaryFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY).get(FluidUtils.STILL)
//                    )
//                    .tint(
//                            Reference.FluidColor.HONEY.toIntValue()
//                    )
//                    .fogColor(
//                            Reference.FluidColor.HONEY.toFloatValues().get("red"),
//                            Reference.FluidColor.HONEY.toFloatValues().get("green"),
//                            Reference.FluidColor.HONEY.toFloatValues().get("blue")
//                    )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftApiaryFluidRegistryContainer HONEY_MEAD = new GrowthcraftApiaryFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY_MEAD).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftApiaryFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.HONEY_MEAD).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.HONEY_MEAD.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.HONEY_MEAD.toFloatValues().get("red"),
//                                    Reference.FluidColor.HONEY_MEAD.toFloatValues().get("green"),
//                                    Reference.FluidColor.HONEY_MEAD.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );

    private GrowthcraftApiaryFluids() {
        /* Prevent default public constructor */
    }
}
