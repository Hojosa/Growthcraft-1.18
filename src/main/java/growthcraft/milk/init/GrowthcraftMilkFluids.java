package growthcraft.milk.init;

import growthcraft.lib.utils.FluidUtils;
import growthcraft.milk.shared.Reference;
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

public class GrowthcraftMilkFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
            ForgeRegistries.FLUIDS, Reference.MODID
    );

//    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(
//            ForgeRegistries.Keys.FLUID_TYPES, Reference.MODID
//    );

    public static final RegistryObject<FlowingFluid> BUTTER_MILK
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BUTTER_MILK).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.BUTTER_MILK_PROPERTIES));

	public static final RegistryObject<FlowingFluid> BUTTER_MILK_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BUTTER_MILK).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.BUTTER_MILK_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties BUTTER_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> BUTTER_MILK.get(), () -> BUTTER_MILK_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.BUTTER_MILK.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.BUTTER_MILK_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.BUTTER_MILK_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> BUTTER_MILK_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.BUTTER_MILK).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.BUTTER_MILK.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> CHEESE_BASE
    		= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CHEESE_BASE).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.CHEESE_BASE_PROPERTIES));

	public static final RegistryObject<FlowingFluid> CHEESE_BASE_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CHEESE_BASE).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.CHEESE_BASE_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties CHEESE_BASE_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> CHEESE_BASE.get(), () -> CHEESE_BASE_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.CHEESE_BASE.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.CHEESE_BASE_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.CHEESE_BASE_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> CHEESE_BASE_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CHEESE_BASE).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.CHEESE_BASE.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	
    public static final RegistryObject<FlowingFluid> CONDENSED_MILK
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CONDENSED_MILK).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.CONDENSED_MILK_PROPERTIES));

	public static final RegistryObject<FlowingFluid> CONDENSED_MILK_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CONDENSED_MILK).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.CONDENSED_MILK_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties CONDENSED_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> CONDENSED_MILK.get(), () -> CONDENSED_MILK_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.CONDENSED_MILK.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.CONDENSED_MILK_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.CONDENSED_MILK_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> CONDENSED_MILK_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CONDENSED_MILK).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.CONDENSED_MILK.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
    public static final RegistryObject<FlowingFluid> CREAM
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CREAM).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.CREAM_PROPERTIES));

	public static final RegistryObject<FlowingFluid> CREAM_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CREAM).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.CREAM_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties CREAM_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> CREAM.get(), () -> CREAM_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.CREAM.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.CREAM_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.CREAM_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> CREAM_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CREAM).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.CREAM.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	public static final RegistryObject<FlowingFluid> CULTURED_MILK
		= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CULTURED_MILK).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.CULTURED_MILK_PROPERTIES));

	public static final RegistryObject<FlowingFluid> CULTURED_MILK_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CULTURED_MILK).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.CULTURED_MILK_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties CULTURED_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> CULTURED_MILK.get(), () -> CULTURED_MILK_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.CULTURED_MILK.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.CULTURED_MILK_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.CULTURED_MILK_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> CULTURED_MILK_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.CULTURED_MILK).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.CULTURED_MILK.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	public static final RegistryObject<FlowingFluid> KUMIS
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.KUMIS).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.KUMIS_PROPERTIES));

	public static final RegistryObject<FlowingFluid> KUMIS_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.KUMIS).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.KUMIS_PROPERTIES));


	public static final ForgeFlowingFluid.Properties KUMIS_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> KUMIS.get(), () -> KUMIS_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.KUMIS.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.KUMIS_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.KUMIS_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> KUMIS_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.KUMIS).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.KUMIS.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));	
	
	public static final RegistryObject<FlowingFluid> MILK
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.MILK).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.MILK_PROPERTIES));

	public static final RegistryObject<FlowingFluid> MILK_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.MILK).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.MILK_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> MILK.get(), () -> MILK_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.MILK.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.MILK_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.MILK_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> MILK_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.MILK).get(FluidUtils.STILL),
			() -> new LiquidBlock(() -> GrowthcraftMilkFluids.MILK.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	    
	public static final RegistryObject<FlowingFluid> RENNET
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RENNET).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.RENNET_PROPERTIES));

	public static final RegistryObject<FlowingFluid> RENNET_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RENNET).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.RENNET_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties RENNET_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> RENNET.get(), () -> RENNET_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.RENNET.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.RENNET_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.RENNET_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> RENNET_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.RENNET).get(FluidUtils.STILL),
		    () -> new LiquidBlock(() -> GrowthcraftMilkFluids.RENNET.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	public static final RegistryObject<FlowingFluid> SKIM_MILK
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SKIM_MILK).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.SKIM_MILK_PROPERTIES));

	public static final RegistryObject<FlowingFluid> SKIM_MILK_FLOWING
	    	= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SKIM_MILK).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.SKIM_MILK_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties SKIM_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> SKIM_MILK.get(), () -> SKIM_MILK_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.SKIM_MILK.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.SKIM_MILK_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.SKIM_MILK_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> SKIM_MILK_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.SKIM_MILK).get(FluidUtils.STILL),
		    () -> new LiquidBlock(() -> GrowthcraftMilkFluids.SKIM_MILK.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
	
	public static final RegistryObject<FlowingFluid> WHEY
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHEY).get(FluidUtils.STILL), () -> new ForgeFlowingFluid.Source(GrowthcraftMilkFluids.WHEY_PROPERTIES));

	public static final RegistryObject<FlowingFluid> WHEY_FLOWING
			= FLUIDS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHEY).get(FluidUtils.FLOWING), () -> new ForgeFlowingFluid.Flowing(GrowthcraftMilkFluids.WHEY_PROPERTIES));
	
	
	public static final ForgeFlowingFluid.Properties WHEY_PROPERTIES = new ForgeFlowingFluid.Properties(
		    () -> WHEY.get(), () -> WHEY_FLOWING.get(), FluidAttributes.builder(FluidUtils.FluidResource.STILL, FluidUtils.FluidResource.FLOWING)
		    .sound(SoundEvents.BUCKET_EMPTY).overlay(FluidUtils.FluidResource.OVERLAY)
		    .color(Reference.FluidColor.WHEY.toIntValue())).slopeFindDistance(2).levelDecreasePerBlock(2)
		    .block(() -> GrowthcraftMilkFluids.WHEY_FLUID_BLOCK.get()).bucket(() -> GrowthcraftMilkItems.WHEY_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> WHEY_FLUID_BLOCK = GrowthcraftMilkBlocks.BLOCKS.register(FluidUtils.getFluidNames(Reference.UnlocalizedName.WHEY).get(FluidUtils.STILL),
		    () -> new LiquidBlock(() -> GrowthcraftMilkFluids.WHEY.get(), BlockBehaviour.Properties.of(Material.WATER)
		    .noCollission().strength(100f).noDrops()));
    
//    public static final GrowthcraftMilkFluidRegistryContainer BUTTER_MILK = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.BUTTER_MILK).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.BUTTER_MILK).get(FluidUtils.STILL)
//                    ).tint(
//                                    Reference.FluidColor.BUTTER_MILK.toIntValue()
//                            )
//                            .fogColor(
//                                    Reference.FluidColor.BUTTER_MILK.toFloatValues().get("red"),
//                                    Reference.FluidColor.BUTTER_MILK.toFloatValues().get("green"),
//                                    Reference.FluidColor.BUTTER_MILK.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer CHEESE_BASE = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.CHEESE_BASE).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.CHEESE_BASE).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.CHEESE_BASE.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.CHEESE_BASE.toFloatValues().get("red"),
//                                    Reference.FluidColor.CHEESE_BASE.toFloatValues().get("green"),
//                                    Reference.FluidColor.CHEESE_BASE.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer CONDENSED_MILK = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.CONDENSED_MILK).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.CONDENSED_MILK).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.CONDENSED_MILK.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.CONDENSED_MILK.toFloatValues().get("red"),
//                                    Reference.FluidColor.CONDENSED_MILK.toFloatValues().get("green"),
//                                    Reference.FluidColor.CONDENSED_MILK.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer CREAM = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.CREAM).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.CREAM).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.CREAM.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.CREAM.toFloatValues().get("red"),
//                                    Reference.FluidColor.CREAM.toFloatValues().get("green"),
//                                    Reference.FluidColor.CREAM.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer CULTURED_MILK = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.CULTURED_MILK).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.CULTURED_MILK).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.CULTURED_MILK.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.CULTURED_MILK.toFloatValues().get("red"),
//                                    Reference.FluidColor.CULTURED_MILK.toFloatValues().get("green"),
//                                    Reference.FluidColor.CULTURED_MILK.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer KUMIS = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.KUMIS).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.KUMIS).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.KUMIS.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.KUMIS.toFloatValues().get("red"),
//                                    Reference.FluidColor.KUMIS.toFloatValues().get("green"),
//                                    Reference.FluidColor.KUMIS.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer MILK = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.MILK).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.MILK).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.MILK.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.MILK.toFloatValues().get("red"),
//                                    Reference.FluidColor.MILK.toFloatValues().get("green"),
//                                    Reference.FluidColor.MILK.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer RENNET = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.RENNET).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.RENNET).get(FluidUtils.STILL)
//                    ).tint(
//                            Reference.FluidColor.RENNET.toIntValue()
//                    ).fogColor(
//                            Reference.FluidColor.RENNET.toFloatValues().get("red"),
//                            Reference.FluidColor.RENNET.toFloatValues().get("green"),
//                            Reference.FluidColor.RENNET.toFloatValues().get("blue")
//                    )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer SKIM_MILK = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.SKIM_MILK).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.SKIM_MILK).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.SKIM_MILK.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.SKIM_MILK.toFloatValues().get("red"),
//                                    Reference.FluidColor.SKIM_MILK.toFloatValues().get("green"),
//                                    Reference.FluidColor.SKIM_MILK.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );
//
//    public static final GrowthcraftMilkFluidRegistryContainer WHEY = new GrowthcraftMilkFluidRegistryContainer(
//            FluidUtils.getFluidNames(Reference.UnlocalizedName.WHEY).get(FluidUtils.STILL),
//            FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
//            () -> GrowthcraftMilkFluidRegistryContainer.createExtension(
//                    new ClientFluidTypeExtensions(
//                            Reference.MODID,
//                            FluidUtils.getFluidNames(Reference.UnlocalizedName.WHEY).get(FluidUtils.STILL)
//                    ).tint(Reference.FluidColor.WHEY.toIntValue())
//                            .fogColor(
//                                    Reference.FluidColor.WHEY.toFloatValues().get("red"),
//                                    Reference.FluidColor.WHEY.toFloatValues().get("green"),
//                                    Reference.FluidColor.WHEY.toFloatValues().get("blue")
//                            )
//            ),
//            BlockBehaviour.Properties.copy(Blocks.WATER),
//            new Item.Properties().stacksTo(1)
//    );

    private GrowthcraftMilkFluids() {
        /* Prevent default public constructor */
    }
}
