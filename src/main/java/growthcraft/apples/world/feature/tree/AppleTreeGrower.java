package growthcraft.apples.world.feature.tree;

import growthcraft.apples.world.GrowthcraftApplesConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

public class AppleTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random randomSource, boolean largeHive) {
        return (@Nullable Holder<? extends ConfiguredFeature<?, ?>>) GrowthcraftApplesConfiguredFeatures.APPLE_TREE_KEY;
    }
}
