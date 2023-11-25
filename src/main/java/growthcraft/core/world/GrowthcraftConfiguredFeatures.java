package growthcraft.core.world;

import java.util.List;

import growthcraft.core.init.GrowthcraftBlocks;
import growthcraft.core.init.config.GrowthcraftConfig;
import growthcraft.core.shared.Reference;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftConfiguredFeatures {
	
    private static final int SALT_ORE_GEN_VEIN_SIZE = GrowthcraftConfig.getSaltOreGenVeinSize(); // Iron is 9, Diamond is 0.7
    public static RuleTest endstoneReplaceable = new BlockMatchTest(Blocks.END_STONE);
    
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SALT_ORE_KEY = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE_DEEPSLATE.get().defaultBlockState()));
    
    public static final List<OreConfiguration.TargetBlockState> NETHER_SALT_ORE_KEY = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, GrowthcraftBlocks.SALT_ORE_NETHER.get().defaultBlockState()));
    
    public static final List<OreConfiguration.TargetBlockState> END_SALT_ORE_KEY = List.of(
            OreConfiguration.target(endstoneReplaceable, GrowthcraftBlocks.SALT_ORE_END.get().defaultBlockState()));
//    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SALT_ORE = FeatureUtils.register(Reference.UnlocalizedName.SALT_ORE,
            Feature.ORE, new OreConfiguration(OVERWORLD_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));
//    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SALT_ORE = FeatureUtils.register(Reference.UnlocalizedName.SALT_ORE + "_nether",
            Feature.ORE, new OreConfiguration(NETHER_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_SALT_ORE = FeatureUtils.register(Reference.UnlocalizedName.SALT_ORE + "_end",
            Feature.ORE, new OreConfiguration(END_SALT_ORE_KEY, SALT_ORE_GEN_VEIN_SIZE));

    private GrowthcraftConfiguredFeatures() {
        /* Prevent generation of default public constructor. */
    }

}
