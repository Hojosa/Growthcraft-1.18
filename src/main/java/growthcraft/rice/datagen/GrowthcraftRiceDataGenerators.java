package growthcraft.rice.datagen;

import growthcraft.rice.datagen.providers.GrowthcraftRiceBlockTags;
import growthcraft.rice.datagen.providers.GrowthcraftRiceItemTags;
import growthcraft.rice.datagen.providers.GrowthcraftRiceLootTables;
import growthcraft.rice.datagen.providers.GrowthcraftRiceRecipes;
import growthcraft.rice.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftRiceDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftRiceBlockTags blockTags = new GrowthcraftRiceBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftRiceItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftRiceRecipes(generator));
			generator.addProvider(new GrowthcraftRiceLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
