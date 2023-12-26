package growthcraft.cellar.datagen;

import growthcraft.cellar.datagen.providers.GrowthcraftCellarLootTables;
import growthcraft.cellar.datagen.providers.GrowthcraftCellarRecipes;
import growthcraft.cellar.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftCellarDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		
		if(event.includeServer()) {
			generator.addProvider(new GrowthcraftCellarRecipes(generator));
			generator.addProvider(new GrowthcraftCellarLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
