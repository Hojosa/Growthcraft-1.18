package growthcraft.apples.world.feature.tree;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import growthcraft.apples.world.GrowthcraftApplesConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class AppleTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random randomSource, boolean largeHive) {
        return (@Nullable Holder<? extends ConfiguredFeature<?, ?>>) GrowthcraftApplesConfiguredFeatures.APPLE_TREE_KEY;
    }
}
