package growthcraft.core.world;

import growthcraft.core.init.config.GrowthcraftConfig;
import growthcraft.core.shared.Reference;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class GrowthcraftPlacedFeatures {	
	
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
    	if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_SALT_ORE_PLACED);
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_SALT_ORE_PLACED);
        } else {
        	event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SALT_ORE_PLACED);
        }
    }
	
	public static final Holder<PlacedFeature> SALT_ORE_PLACED = PlacementUtils.register(Reference.UnlocalizedName.SALT_ORE_PLACED,
			GrowthcraftConfiguredFeatures.SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
					HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax()))));
	
	public static final Holder<PlacedFeature> NETHER_SALT_ORE_PLACED = PlacementUtils.register(Reference.UnlocalizedName.SALT_ORE_PLACED + "_nether",
            		GrowthcraftConfiguredFeatures.NETHER_SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax()))));
//	
	public static final Holder<PlacedFeature> END_SALT_ORE_PLACED = PlacementUtils.register(Reference.UnlocalizedName.SALT_ORE_PLACED + "_end",
            		GrowthcraftConfiguredFeatures.END_SALT_ORE, GrowthcraftOrePlacement.commonOrePlacement(GrowthcraftConfig.getSaltOreGenSpreadAmount(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMin()), VerticalAnchor.absolute(GrowthcraftConfig.getSaltOreGenHeightMax()))));

    private GrowthcraftPlacedFeatures() {
        /* Prevent generation of default public constructor. */
    }

}
