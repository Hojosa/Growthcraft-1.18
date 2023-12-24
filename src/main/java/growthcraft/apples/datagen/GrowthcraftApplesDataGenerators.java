package growthcraft.apples.datagen;

import growthcraft.apples.datagen.providers.GrowthcraftApplesBlockTags;
import growthcraft.apples.datagen.providers.GrowthcraftApplesItemTags;
import growthcraft.apples.datagen.providers.GrowthcraftApplesLootTables;
import growthcraft.apples.datagen.providers.GrowthcraftApplesRecipes;
import growthcraft.apples.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftApplesDataGenerators {
	
	private GrowthcraftApplesDataGenerators() {
	}
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftApplesBlockTags blockTags = new GrowthcraftApplesBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftApplesItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftApplesRecipes(generator));
			generator.addProvider(new GrowthcraftApplesLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
