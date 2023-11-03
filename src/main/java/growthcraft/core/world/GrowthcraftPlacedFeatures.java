package growthcraft.core.world;

import growthcraft.core.init.config.GrowthcraftConfig;
import growthcraft.core.shared.Reference;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftPlacedFeatures {
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Reference.MODID);
	
	
	public static final RegistryObject<PlacedFeature> SALT_ORE_PLACED = PLACED_FEATURES.register(Reference.UnlocalizedName.SALT_ORE_PLACED,
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            		GrowthcraftConfiguredFeatures.SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(
            				GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax())))));
	
	public static final RegistryObject<PlacedFeature> NETHER_SALT_ORE_PLACED = PLACED_FEATURES.register(Reference.UnlocalizedName.SALT_ORE_PLACED + "_nether",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            		GrowthcraftConfiguredFeatures.NETHER_SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(
            				GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax())))));
	
	public static final RegistryObject<PlacedFeature> END_SALT_ORE_PLACED = PLACED_FEATURES.register(Reference.UnlocalizedName.SALT_ORE_PLACED + "_end",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            		GrowthcraftConfiguredFeatures.END_SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(
            				GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax())))));
//    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED_KEY = createKey(Reference.UnlocalizedName.SALT_ORE_PLACED);

//    public static void bootstrap(BootstapContext<PlacedFeature> context) {
//    	GrowcraftHolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registry.PLACED_FEATURE_REGISTRY );
//
//        register(context, SALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(GrowthcraftConfiguredFeatures.OVERWORLD_SALT_ORE_KEY),
//                GrowthcraftOrePlacement.commonOrePlacement(
//                        GrowthcraftConfig.getSaltOreGenSpreadAmount(),
//                        HeightRangePlacement.uniform(
//                                VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()),
//                                VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax()))
//                ));
//    }
//
//    private static ResourceKey<PlacedFeature> createKey(String name) {
//        return ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(Reference.MODID, name));
//    }
//
//    private static void register(
//            BootstapContext<PlacedFeature> context,
//            ResourceKey<PlacedFeature> key,
//            Holder<ConfiguredFeature<?, ?>> configuration,
//            List<PlacementModifier> modifiers
//    ) {
//        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
//    }
//
//    private static void register(
//            BootstapContext<PlacedFeature> context,
//            ResourceKey<PlacedFeature> key,
//            Holder<ConfiguredFeature<?, ?>> configuration,
//            PlacementModifier... modifiers
//    ) {
//        register(context, key, configuration, List.of(modifiers));
//    }

    private GrowthcraftPlacedFeatures() {
        /* Prevent generation of default public constructor. */
    }

}
