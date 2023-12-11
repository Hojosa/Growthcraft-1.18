package growthcraft.milk.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftMilkLootTables extends BaseLootTableProvider{

	public GrowthcraftMilkLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Milk LootTables";
    }
}
