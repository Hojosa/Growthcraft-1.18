package growthcraft.cellar.init;

import growthcraft.cellar.shared.Reference;
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

public class GrowthcraftCellarFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
            ForgeRegistries.FLUIDS, Reference.MODID
    );
    
    public static final RegistryObject<FlowingFluid> AMBER_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.AMBER_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> AMBER_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.AMBER_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties AMBER_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> AMBER_ALE_FLUID.get(), () -> AMBER_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.AMBER_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.AMBER_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.AMBER_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> AMBER_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_ALE).get(FluidUtils.STILL),
	    () -> new LiquidBlock(() -> GrowthcraftCellarFluids.AMBER_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
	    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> AMBER_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.AMBER_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> AMBER_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.AMBER_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties AMBER_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> AMBER_LAGER_FLUID.get(), () -> AMBER_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.AMBER_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.AMBER_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.AMBER_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> AMBER_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.AMBER_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> AMBER_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.AMBER_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> AMBER_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.AMBER_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties AMBER_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> AMBER_WORT_FLUID.get(), () -> AMBER_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.AMBER_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.AMBER_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.AMBER_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> AMBER_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.AMBER_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.AMBER_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> BROWN_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.BROWN_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> BROWN_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.BROWN_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties BROWN_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> BROWN_ALE_FLUID.get(), () -> BROWN_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.BROWN_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.BROWN_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.BROWN_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> BROWN_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_ALE).get(FluidUtils.STILL),
	    () -> new LiquidBlock(() -> GrowthcraftCellarFluids.BROWN_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
	    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> BROWN_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.BROWN_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> BROWN_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.BROWN_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties BROWN_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> BROWN_LAGER_FLUID.get(), () -> BROWN_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.BROWN_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.BROWN_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.BROWN_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> BROWN_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.BROWN_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> BROWN_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.BROWN_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> BROWN_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.BROWN_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties BROWN_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> BROWN_WORT_FLUID.get(), () -> BROWN_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.BROWN_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.BROWN_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.BROWN_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> BROWN_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BROWN_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.BROWN_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> COPPER_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.COPPER_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> COPPER_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.COPPER_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties COPPER_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> COPPER_ALE_FLUID.get(), () -> COPPER_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.COPPER_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.COPPER_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.COPPER_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> COPPER_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_ALE).get(FluidUtils.STILL),
	    () -> new LiquidBlock(() -> GrowthcraftCellarFluids.COPPER_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
	    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> COPPER_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.COPPER_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> COPPER_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.COPPER_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties COPPER_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> COPPER_LAGER_FLUID.get(), () -> COPPER_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.COPPER_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.COPPER_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.COPPER_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> COPPER_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.COPPER_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> COPPER_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.COPPER_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> COPPER_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.COPPER_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties COPPER_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> COPPER_WORT_FLUID.get(), () -> COPPER_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.COPPER_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.COPPER_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.COPPER_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> COPPER_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.COPPER_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.COPPER_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> DARK_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.DARK_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> DARK_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.DARK_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties DARK_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> DARK_LAGER_FLUID.get(), () -> DARK_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.DARK_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.DARK_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.DARK_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> DARK_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.DARK_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> DARK_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.DARK_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> DARK_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.DARK_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties DARK_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> DARK_WORT_FLUID.get(), () -> DARK_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.DARK_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.DARK_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.DARK_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> DARK_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DARK_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.DARK_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> DEEP_AMBER_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_AMBER_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.DEEP_AMBER_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> DEEP_AMBER_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_AMBER_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.DEEP_AMBER_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties DEEP_AMBER_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> DEEP_AMBER_WORT_FLUID.get(), () -> DEEP_AMBER_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.DEEP_AMBER_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.DEEP_AMBER_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.DEEP_AMBER_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> DEEP_AMBER_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_AMBER_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.DEEP_AMBER_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> DEEP_COPPER_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_COPPER_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.DEEP_COPPER_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> DEEP_COPPER_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_COPPER_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.DEEP_COPPER_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties DEEP_COPPER_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> DEEP_COPPER_WORT_FLUID.get(), () -> DEEP_COPPER_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.DEEP_COPPER_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.DEEP_COPPER_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.DEEP_COPPER_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> DEEP_COPPER_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.DEEP_COPPER_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.DEEP_COPPER_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> GOLDEN_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.GOLDEN_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.GOLDEN_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> GOLDEN_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.GOLDEN_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.GOLDEN_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties GOLDEN_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> GOLDEN_WORT_FLUID.get(), () -> GOLDEN_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.GOLDEN_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.GOLDEN_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.GOLDEN_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> GOLDEN_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.GOLDEN_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.GOLDEN_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> HOPPED_GOLDEN_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HOPPED_GOLDEN_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> HOPPED_GOLDEN_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HOPPED_GOLDEN_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties HOPPED_GOLDEN_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> HOPPED_GOLDEN_WORT_FLUID.get(), () -> HOPPED_GOLDEN_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.HOPPED_GOLDEN_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.HOPPED_GOLDEN_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> HOPPED_GOLDEN_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.HOPPED_GOLDEN_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> IPA_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.IPA_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.IPA_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> IPA_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.IPA_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.IPA_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties IPA_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> IPA_ALE_FLUID.get(), () -> IPA_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.IPA_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.IPA_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.IPA_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> IPA_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.IPA_ALE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.IPA_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> OLD_PORT_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.OLD_PORT_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.OLD_PORT_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> OLD_PORT_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.OLD_PORT_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.OLD_PORT_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties OLD_PORT_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> OLD_PORT_ALE_FLUID.get(), () -> OLD_PORT_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.OLD_PORT_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.OLD_PORT_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.OLD_PORT_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> OLD_PORT_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.OLD_PORT_ALE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.OLD_PORT_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> PALE_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PALE_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PALE_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PALE_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PALE_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PALE_ALE_FLUID.get(), () -> PALE_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PALE_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PALE_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PALE_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PALE_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_ALE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PALE_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> PALE_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PALE_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PALE_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PALE_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PALE_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PALE_LAGER_FLUID.get(), () -> PALE_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PALE_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PALE_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PALE_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PALE_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PALE_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> PALE_GOLDEN_WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_GOLDEN_WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PALE_GOLDEN_WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PALE_GOLDEN_WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_GOLDEN_WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PALE_GOLDEN_WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PALE_GOLDEN_WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PALE_GOLDEN_WORT_FLUID.get(), () -> PALE_GOLDEN_WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PALE_GOLDEN_WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PALE_GOLDEN_WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PALE_GOLDEN_WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PALE_GOLDEN_WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PALE_GOLDEN_WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PALE_GOLDEN_WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> PILSNER_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PILSNER_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PILSNER_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PILSNER_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PILSNER_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PILSNER_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PILSNER_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PILSNER_LAGER_FLUID.get(), () -> PILSNER_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PILSNER_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PILSNER_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PILSNER_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PILSNER_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PILSNER_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PILSNER_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> PURPLE_GRAPE_JUICE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_JUICE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PURPLE_GRAPE_JUICE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_JUICE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PURPLE_GRAPE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PURPLE_GRAPE_JUICE_FLUID.get(), () -> PURPLE_GRAPE_JUICE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PURPLE_GRAPE_JUICE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PURPLE_GRAPE_JUICE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PURPLE_GRAPE_JUICE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_JUICE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> PURPLE_GRAPE_WINE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_WINE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> PURPLE_GRAPE_WINE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_WINE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties PURPLE_GRAPE_WINE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> PURPLE_GRAPE_WINE_FLUID.get(), () -> PURPLE_GRAPE_WINE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.PURPLE_GRAPE_WINE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.PURPLE_GRAPE_WINE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> PURPLE_GRAPE_WINE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.PURPLE_GRAPE_WINE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> RED_GRAPE_JUICE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_JUICE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.RED_GRAPE_JUICE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> RED_GRAPE_JUICE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_JUICE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.RED_GRAPE_JUICE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties RED_GRAPE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> RED_GRAPE_JUICE_FLUID.get(), () -> RED_GRAPE_JUICE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.RED_GRAPE_JUICE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.RED_GRAPE_JUICE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.RED_GRAPE_JUICE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> RED_GRAPE_JUICE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_JUICE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.RED_GRAPE_JUICE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> RED_GRAPE_WINE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_WINE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.RED_GRAPE_WINE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> RED_GRAPE_WINE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_WINE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.RED_GRAPE_WINE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties RED_GRAPE_WINE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> RED_GRAPE_WINE_FLUID.get(), () -> RED_GRAPE_WINE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.RED_GRAPE_WINE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.RED_GRAPE_WINE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.RED_GRAPE_WINE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> RED_GRAPE_WINE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RED_GRAPE_WINE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.RED_GRAPE_WINE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> STOUT_ALE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.STOUT_ALE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.STOUT_ALE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> STOUT_ALE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.STOUT_ALE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.STOUT_ALE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties STOUT_ALE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> STOUT_ALE_FLUID.get(), () -> STOUT_ALE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.STOUT_ALE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.STOUT_ALE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.STOUT_ALE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> STOUT_ALE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.STOUT_ALE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.STOUT_ALE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> VIENNA_LAGER_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.VIENNA_LAGER).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.VIENNA_LAGER_PROPERTIES));

	public static final RegistryObject<FlowingFluid> VIENNA_LAGER_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.VIENNA_LAGER).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.VIENNA_LAGER_PROPERTIES));

	public static final ForgeFlowingFluid.Properties VIENNA_LAGER_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> VIENNA_LAGER_FLUID.get(), () -> VIENNA_LAGER_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.VIENNA_LAGER.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.VIENNA_LAGER_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.VIENNA_LAGER_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> VIENNA_LAGER_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.VIENNA_LAGER).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.VIENNA_LAGER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> WHITE_GRAPE_JUICE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_JUICE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> WHITE_GRAPE_JUICE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_JUICE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties WHITE_GRAPE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> WHITE_GRAPE_JUICE_FLUID.get(), () -> WHITE_GRAPE_JUICE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.WHITE_GRAPE_JUICE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.WHITE_GRAPE_JUICE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> WHITE_GRAPE_JUICE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_JUICE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> WHITE_GRAPE_WINE_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_WINE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.WHITE_GRAPE_WINE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> WHITE_GRAPE_WINE_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_WINE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.WHITE_GRAPE_WINE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties WHITE_GRAPE_WINE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> WHITE_GRAPE_WINE_FLUID.get(), () -> WHITE_GRAPE_WINE_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.WHITE_GRAPE_WINE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.WHITE_GRAPE_WINE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.WHITE_GRAPE_WINE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> WHITE_GRAPE_WINE_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHITE_GRAPE_WINE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.WHITE_GRAPE_WINE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> WORT_FLUID
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WORT).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftCellarFluids.WORT_PROPERTIES));

	public static final RegistryObject<FlowingFluid> WORT_FLUID_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WORT).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftCellarFluids.WORT_PROPERTIES));

	public static final ForgeFlowingFluid.Properties WORT_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> WORT_FLUID.get(), () -> WORT_FLUID_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.WORT.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftCellarFluids.WORT_FLUID_BLOCK.get()).bucket(() -> GrowthcraftCellarItems.WORT_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> WORT_FLUID_BLOCK = GrowthcraftCellarBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WORT).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftCellarFluids.WORT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
			.noCollission().strength(100f).noDrops()));

    private GrowthcraftCellarFluids() {
        /* Prevent default public constructor */
    }
}
