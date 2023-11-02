package growthcraft.apples.world;

import java.util.List;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GrowthcraftApplesConfiguredFeatures {
	
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE_TREE_KEY =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                  // Trunk block
                  BlockStateProvider.simple(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get()),
                  // Trunk placer (baseHeight, heightRandA, heightRandB)
                  new StraightTrunkPlacer(5, 2, 0),
                  // Leaves block
                  BlockStateProvider.simple(GrowthcraftApplesBlocks.APPLE_TREE_LEAVES.get()),
                  // Leaves placer (radius, offset, height)
                  new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                  // Spawn Area Saturation (limit, lowerSize, upperSize)
                  new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> APPLE_TREE_CHECKED = PlacementUtils.register("ebony_checked", APPLE_TREE_KEY,
                    PlacementUtils.filteredByBlockSurvival(GrowthcraftApplesBlocks.APPLE_TREE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> APPLE_TREE_SPAWN =
            FeatureUtils.register("apple_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(APPLE_TREE_CHECKED,0.5F)), APPLE_TREE_CHECKED));
}
