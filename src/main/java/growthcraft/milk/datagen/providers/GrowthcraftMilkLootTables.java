package growthcraft.milk.datagen.providers;

import growthcraft.core.datagen.providers.BaseLootTableProvider;
import growthcraft.milk.init.GrowthcraftMilkBlockEntities;
import growthcraft.milk.init.GrowthcraftMilkBlocks;
import net.minecraft.data.DataGenerator;

public class GrowthcraftMilkLootTables extends BaseLootTableProvider{

	public GrowthcraftMilkLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		addStandardTable(GrowthcraftMilkBlocks.CHEESE_PRESS.get(), GrowthcraftMilkBlockEntities.CHEESE_PRESS_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftMilkBlocks.CHURN.get(), GrowthcraftMilkBlockEntities.CHURN_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftMilkBlocks.MIXING_VAT.get(), GrowthcraftMilkBlockEntities.MIXING_VAT_BLOCK_ENTITY.get());
		addEntityTableFluidInputOutputDouble(GrowthcraftMilkBlocks.PANCHEON.get(), GrowthcraftMilkBlockEntities.PANCHEON_BLOCK_ENTITY.get());
	}
	
    @Override
    public String getName() {
        return "Growthcraft Milk LootTables";
    }
}
