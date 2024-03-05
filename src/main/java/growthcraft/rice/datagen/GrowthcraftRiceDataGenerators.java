package growthcraft.rice.datagen;

import growthcraft.rice.datagen.providers.GrowthcraftRiceLootTables;
import growthcraft.rice.datagen.providers.GrowthcraftRiceRecipes;
import growthcraft.rice.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftRiceDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		
		if(event.includeServer()) {
			generator.addProvider(new GrowthcraftRiceRecipes(generator));
			generator.addProvider(new GrowthcraftRiceLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
