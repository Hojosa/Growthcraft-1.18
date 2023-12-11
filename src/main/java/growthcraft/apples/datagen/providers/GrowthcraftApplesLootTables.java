package growthcraft.apples.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftApplesLootTables extends BaseLootTableProvider{

	public GrowthcraftApplesLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apples LootTables";
    }
}
