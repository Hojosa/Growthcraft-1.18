package growthcraft.core.world;

import java.util.List;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class GrowthcraftOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier countModifier, PlacementModifier placementModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), placementModifier, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(count), placementModifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int count, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(count), placementModifier);
    }

    private GrowthcraftOrePlacement() {
        /* Prevent generation of default public constructor. */
    }
}
