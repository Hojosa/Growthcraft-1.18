package growthcraft.apples.world;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.shared.Reference;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftApplesPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Reference.MODID);
    
    public static final RegistryObject<PlacedFeature> APPLE_TREE_PLACED_KEY = PLACED_FEATURES.register(Reference.UnlocalizedName.APPLE_TREE + "_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            		GrowthcraftApplesConfiguredFeatures.APPLE_TREE_SPAWN, VegetationPlacements.treePlacement(
            				PlacementUtils.countExtra(3, 0.1f, 2), GrowthcraftApplesBlocks.APPLE_TREE_SAPLING.get())));
	
}
