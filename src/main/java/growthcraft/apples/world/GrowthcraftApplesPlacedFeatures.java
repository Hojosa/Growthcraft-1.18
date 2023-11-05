package growthcraft.apples.world;

import growthcraft.apples.shared.Reference;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GrowthcraftApplesPlacedFeatures {
    
    public static final Holder<PlacedFeature> APPLE_TREE_PLACED_KEY = PlacementUtils.register(Reference.UnlocalizedName.APPLE_TREE + "_placed",
            		GrowthcraftApplesConfiguredFeatures.APPLE_TREE_SPAWN, VegetationPlacements.treePlacement(
            				PlacementUtils.countExtra(3, 0.1f, 2)));
}

