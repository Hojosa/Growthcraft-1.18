package growthcraft.apiary.datagen;

import growthcraft.apiary.datagen.providers.GrowthcraftApiaryBlockTags;
import growthcraft.apiary.datagen.providers.GrowthcraftApiaryItemTags;
import growthcraft.apiary.datagen.providers.GrowthcraftApiaryLootTables;
import growthcraft.apiary.datagen.providers.GrowthcraftApiaryRecipes;
import growthcraft.apiary.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftApiaryDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftApiaryBlockTags blockTags = new GrowthcraftApiaryBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftApiaryItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftApiaryRecipes(generator));
			generator.addProvider(new GrowthcraftApiaryLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
