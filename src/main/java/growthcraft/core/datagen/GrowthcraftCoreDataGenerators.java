package growthcraft.core.datagen;

import growthcraft.core.datagen.providers.GrowthcraftCoreBlockTags;
import growthcraft.core.datagen.providers.GrowthcraftCoreItemTags;
import growthcraft.core.datagen.providers.GrowthcraftCoreLootTables;
import growthcraft.core.datagen.providers.GrowthcraftCoreRecipes;
import growthcraft.core.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftCoreDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftCoreBlockTags blockTags = new GrowthcraftCoreBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftCoreItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftCoreRecipes(generator));
			generator.addProvider(new GrowthcraftCoreLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}

}
