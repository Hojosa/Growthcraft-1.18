package growthcraft.milk.datagen;

import growthcraft.milk.datagen.providers.GrowthcraftMilkBlockTags;
import growthcraft.milk.datagen.providers.GrowthcraftMilkItemTags;
import growthcraft.milk.datagen.providers.GrowthcraftMilkLootTables;
import growthcraft.milk.datagen.providers.GrowthcraftMilkRecipes;
import growthcraft.milk.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftMilkDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		if(event.includeServer()) {
			GrowthcraftMilkBlockTags blockTags = new GrowthcraftMilkBlockTags(generator, existingFileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new GrowthcraftMilkItemTags(generator, blockTags, existingFileHelper));
			generator.addProvider(new GrowthcraftMilkRecipes(generator));
			generator.addProvider(new GrowthcraftMilkLootTables(generator));
		}
		if(event.includeClient()) {
		}
	}

}
