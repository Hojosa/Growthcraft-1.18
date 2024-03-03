package growthcraft.apiary.datagen;

import growthcraft.apiary.datagen.providers.GrowthcraftApiaryLootTables;
import growthcraft.apiary.datagen.providers.GrowthcraftApiaryRecipes;
import growthcraft.apiary.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftApiaryDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		
		if(event.includeServer()) {
			generator.addProvider(new GrowthcraftApiaryRecipes(generator));
			generator.addProvider(new GrowthcraftApiaryLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
