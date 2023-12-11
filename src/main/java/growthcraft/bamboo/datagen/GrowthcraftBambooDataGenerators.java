package growthcraft.bamboo.datagen;

import growthcraft.bamboo.datagen.providers.GrowthcraftBambooBlockTags;
import growthcraft.bamboo.datagen.providers.GrowthcraftBambooItemTags;
import growthcraft.bamboo.datagen.providers.GrowthcraftBambooLootTables;
import growthcraft.bamboo.datagen.providers.GrowthcraftBambooRecipes;
import growthcraft.bamboo.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftBambooDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftBambooBlockTags blockTags = new GrowthcraftBambooBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftBambooItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftBambooRecipes(generator));
			generator.addProvider(new GrowthcraftBambooLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}

}
