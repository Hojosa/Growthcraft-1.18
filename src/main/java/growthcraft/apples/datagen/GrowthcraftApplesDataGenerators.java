package growthcraft.apples.datagen;

import growthcraft.apples.datagen.providers.GrowthcraftApplesLootTables;
import growthcraft.apples.datagen.providers.GrowthcraftApplesRecipes;
import growthcraft.apples.shared.Reference;
import net.minecraft.data.DataGenerator;
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

		if(event.includeServer()) {
			generator.addProvider(new GrowthcraftApplesRecipes(generator));
			generator.addProvider(new GrowthcraftApplesLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}
}
