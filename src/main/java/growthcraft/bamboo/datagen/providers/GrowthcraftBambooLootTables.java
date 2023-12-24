package growthcraft.bamboo.datagen.providers;

import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftBambooLootTables extends BaseLootTableProvider{

	public GrowthcraftBambooLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		GrowthcraftBambooBlocks.BLOCKS.getEntries().forEach(entry -> {
			if(entry.equals(GrowthcraftBambooBlocks.BAMBOO_PLANK_DOOR)) {
				addDoorTable(entry.get());
			}
			else if(entry.equals(GrowthcraftBambooBlocks.BAMBOO_PLANK_SLAB)){
				addSlabTable(entry.get());
			}
			else {
				addSimpleTable(entry.get());
			}
		});	
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Bamboo LootTables";
    }
}
