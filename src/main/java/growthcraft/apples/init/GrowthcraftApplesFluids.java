package growthcraft.apples.init;

import growthcraft.apiary.init.GrowthcraftApiaryBlocks;
import growthcraft.apiary.init.GrowthcraftApiaryFluids;
import growthcraft.apiary.init.GrowthcraftApiaryItems;
import growthcraft.apples.shared.Reference;
import growthcraft.lib.utils.FluidUtils;
import net.minecraft.sounds.SoundEvents;
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

public class GrowthcraftApplesFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
            ForgeRegistries.FLUIDS, Reference.MODID
    );

//    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(
//            ForgeRegistries.Keys.FLUID_TYPES, Reference.MODID
//    );

//    public static final GrowthcraftApplesFluidRegistryContainer APPLE_CIDER_FLUID = new GrowthcraftApplesFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_CIDER).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftApplesFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_CIDER).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.APPLE_CIDER_FLUID_COLOR.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.APPLE_CIDER_FLUID_COLOR.toFloatValues().get("red"),
//                                    Reference.FluidColor.APPLE_CIDER_FLUID_COLOR.toFloatValues().get("green"),
//                                    Reference.FluidColor.APPLE_CIDER_FLUID_COLOR.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftApplesFluidRegistryContainer APPLE_JUICE_FLUID = new GrowthcraftApplesFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_JUICE).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftApplesFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_JUICE).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.APPLE_JUICE_FLUID_COLOR.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.APPLE_JUICE_FLUID_COLOR.toFloatValues().get("red"),
//                                    Reference.FluidColor.APPLE_JUICE_FLUID_COLOR.toFloatValues().get("green"),
//                                    Reference.FluidColor.APPLE_JUICE_FLUID_COLOR.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
    
    public static final RegistryObject<FlowingFluid> APPLE_CIDER_FLUID
    		= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_CIDER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftApplesFluids.APPLE_CIDER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> APPLE_CIDER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_CIDER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftApplesFluids.APPLE_CIDER_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties APPLE_CIDER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> APPLE_CIDER_FLUID.get(), () -> APPLE_CIDER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.APPLE_CIDER_FLUID_COLOR.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftApplesFluids.APPLE_CIDER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftApplesItems.APPLE_CIDER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> APPLE_CIDER_FLUID_BLOCK = GrowthcraftApplesBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_CIDER).get(FluidUtils.STILL),
		    () -> new LiquidBlock(() -> GrowthcraftApplesFluids.APPLE_CIDER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	
	public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_JUICE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftApplesFluids.APPLE_JUICE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_JUICE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftApplesFluids.APPLE_JUICE_PROPERTIES));


	public static final ForgeFlowingFluid.Properties APPLE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> APPLE_JUICE_FLUID.get(), () -> APPLE_JUICE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.APPLE_JUICE_FLUID_COLOR.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftApplesFluids.APPLE_JUICE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftApplesItems.APPLE_JUICE_BUCKET.get());

	public static final RegistryObject<LiquidBlock> APPLE_JUICE_FLUID_BLOCK = GrowthcraftApplesBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.APPLE_JUICE).get(FluidUtils.STILL),
		    () -> new LiquidBlock(() -> GrowthcraftApplesFluids.APPLE_JUICE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));

    private GrowthcraftApplesFluids() {
        /* Prevent default public constructor */
    }
}
