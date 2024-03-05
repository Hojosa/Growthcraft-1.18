package growthcraft.apples.datagen.providers;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftApplesLootTables extends BaseLootTableProvider{

	public GrowthcraftApplesLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		GrowthcraftApplesBlocks.BLOCKS.getEntries().forEach(entry -> {
			if(entry.equals(GrowthcraftApplesBlocks.APPLE_PLANK_DOOR)) {
				addDoorTable(entry.get());
			}
			else if(entry.equals(GrowthcraftApplesBlocks.APPLE_PLANK_SLAB)){
				addSlabTable(entry.get());
			}
			else if (entry.equals(GrowthcraftApplesBlocks.APPLE_TREE_LEAVES)){
			}
			else {
				addSimpleTable(entry.get());
			}
		});		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apples LootTables";
    }
}
