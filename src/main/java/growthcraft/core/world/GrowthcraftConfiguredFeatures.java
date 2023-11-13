package growthcraft.core.world;

import java.util.List;

import growthcraft.core.init.GrowthcraftBlocks;
import growthcraft.core.init.config.GrowthcraftConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class GrowthcraftConfiguredFeatures {
    private static final int SALT_ORE_GEN_VEIN_SIZE = GrowthcraftConfig.getSaltOreGenVeinSize(); // Iron is 9, Diamond is 0.7
    public static RuleTest endstoneReplaceable = new BlockMatchTest(Blocks.END_STONE);
    
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SALT_ORE_KEY = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()));
    
    public static final List<OreConfiguration.TargetBlockState> NETHER_SALT_ORE_KEY = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()));
    
    public static final List<OreConfiguration.TargetBlockState> END_SALT_ORE_KEY = List.of(
            OreConfiguration.target(endstoneReplaceable, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SALT_ORE = FeatureUtils.register("Reference.UnlocalizedName.SALT_ORE",
            Feature.ORE, new OreConfiguration(OVERWORLD_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SALT_ORE = FeatureUtils.register("Reference.UnlocalizedName.SALT_ORE + _nether",
            Feature.ORE, new OreConfiguration(NETHER_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_SALT_ORE = FeatureUtils.register("Reference.UnlocalizedName.SALT_ORE + _end",
            Feature.ORE, new OreConfiguration(END_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));
    
//    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SALT_ORE_KEY = registerKey(Reference.UnlocalizedName.SALT_ORE);
//    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SALT_ORE_KEY = registerKey(Reference.UnlocalizedName.SALT_ORE + "_nether");
//    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SALT_ORE_KEY = registerKey(Reference.UnlocalizedName.SALT_ORE + "_end");
//
//    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
//        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
//        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
//        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
//        RuleTest endstoneReplaceable = new BlockMatchTest(Blocks.END_STONE);
//
//        List<OreConfiguration.TargetBlockState> overworldSaltOres = List.of(
//                OreConfiguration.target(stoneReplaceable, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()),
//                // TODO: Create a deepslate version of SALT_ORE
//                OreConfiguration.target(deepslateReplaceable, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState())
//        );
//
//        register(context, OVERWORLD_SALT_ORE_KEY, Feature.ORE, new OreConfiguration(
//                overworldSaltOres, SALT_ORE_GEN_VEIN_SIZE));
//        register(context, END_SALT_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceable,
//                GrowthcraftBlocks.SALT_ORE.get().defaultBlockState(), 9));
//        register(context, NETHER_SALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceable,
//                GrowthcraftBlocks.SALT_ORE.get().defaultBlockState(), 9));
//    }
//
//    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
//        return ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, new ResourceLocation(Reference.MODID, name));
//    }
//
//    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
//            BootstapContext<ConfiguredFeature<?, ?>> context,
//            ResourceKey<ConfiguredFeature<?, ?>> key,
//            F feature,
//            FC configuration
//    ) {
//        context.register(key, new ConfiguredFeature<>(feature, configuration));
//    }

    private GrowthcraftConfiguredFeatures() {
        /* Prevent generation of default public constructor. */
    }

}
