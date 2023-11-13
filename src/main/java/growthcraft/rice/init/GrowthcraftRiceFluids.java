package growthcraft.rice.init;

import growthcraft.lib.utils.FluidUtils;
import growthcraft.rice.shared.Reference;
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

public class GrowthcraftRiceFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
            ForgeRegistries.FLUIDS, Reference.MODID
    );

//    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(
//            ForgeRegistries.Keys.FLUID_TYPES, Reference.MODID
//    );
    
    public static final RegistryObject<FlowingFluid> RICE_WATER
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WATER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftRiceFluids.RICE_WATER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> RICE_WATER_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WATER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftRiceFluids.RICE_WATER_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties RICE_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> RICE_WATER.get(), () -> RICE_WATER_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.RICE_WATER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftRiceFluids.RICE_WATER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftRiceItems.RICE_WATER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> RICE_WATER_FLUID_BLOCK = GrowthcraftRiceBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WATER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftRiceFluids.RICE_WATER.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> RICE_WINE
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WINE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftRiceFluids.RICE_WINE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> RICE_WINE_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WINE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftRiceFluids.RICE_WINE_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties RICE_WINE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> RICE_WINE.get(), () -> RICE_WINE_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.RICE_WINE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftRiceFluids.RICE_WINE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftRiceItems.RICE_WINE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> RICE_WINE_FLUID_BLOCK = GrowthcraftRiceBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WINE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftRiceFluids.RICE_WINE.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> SAKE
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SAKE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftRiceFluids.SAKE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> SAKE_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SAKE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftRiceFluids.SAKE_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties SAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> SAKE.get(), () -> SAKE_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.SAKE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftRiceFluids.SAKE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftRiceItems.SAKE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> SAKE_FLUID_BLOCK = GrowthcraftRiceBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SAKE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftRiceFluids.SAKE.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));

//    public static final GrowthcraftRiceFluidRegistryContainer RICE_WATER = new GrowthcraftRiceFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WATER).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftRiceFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WATER).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.RICE_WATER.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.RICE_WATER.toFloatValues().get("red"),
//                                    Reference.FluidColor.RICE_WATER.toFloatValues().get("green"),
//                                    Reference.FluidColor.RICE_WATER.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftRiceFluidRegistryContainer RICE_WINE = new GrowthcraftRiceFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WINE).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftRiceFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.RICE_WINE).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.RICE_WINE.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.RICE_WINE.toFloatValues().get("red"),
//                                    Reference.FluidColor.RICE_WINE.toFloatValues().get("green"),
//                                    Reference.FluidColor.RICE_WINE.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftRiceFluidRegistryContainer SAKE = new GrowthcraftRiceFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.SAKE).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftRiceFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.SAKE).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.SAKE.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.SAKE.toFloatValues().get("red"),
//                                    Reference.FluidColor.SAKE.toFloatValues().get("green"),
//                                    Reference.FluidColor.SAKE.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );

    private GrowthcraftRiceFluids() {
        /* Prevent default public constructor */
    }
}
