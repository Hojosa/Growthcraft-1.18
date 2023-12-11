package growthcraft.core.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftCoreLootTables extends BaseLootTableProvider{

	public GrowthcraftCoreLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apiary LootTables";
    }
}
