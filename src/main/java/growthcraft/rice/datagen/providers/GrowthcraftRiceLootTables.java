package growthcraft.rice.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftRiceLootTables extends BaseLootTableProvider{

	public GrowthcraftRiceLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Rice LootTables";
    }
}
