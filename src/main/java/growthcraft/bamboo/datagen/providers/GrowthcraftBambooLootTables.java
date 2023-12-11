package growthcraft.bamboo.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftBambooLootTables extends BaseLootTableProvider{

	public GrowthcraftBambooLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Bamboo LootTables";
    }
}
