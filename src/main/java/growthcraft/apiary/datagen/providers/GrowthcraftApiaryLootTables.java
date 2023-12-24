package growthcraft.apiary.datagen.providers;

import growthcraft.apiary.init.GrowthcraftApiaryBlocks;
import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftApiaryLootTables extends BaseLootTableProvider{

	public GrowthcraftApiaryLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		GrowthcraftApiaryBlocks.BLOCKS.getEntries().forEach(block -> addSimpleTable(block.get()));
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apiary LootTables";
    }
}
