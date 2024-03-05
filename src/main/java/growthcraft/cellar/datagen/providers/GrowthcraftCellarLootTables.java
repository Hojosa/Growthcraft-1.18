package growthcraft.cellar.datagen.providers;

import growthcraft.cellar.init.GrowthcraftCellarBlockEntities;
import growthcraft.cellar.init.GrowthcraftCellarBlocks;
import growthcraft.core.datagen.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

public class GrowthcraftCellarLootTables extends BaseLootTableProvider{

	public GrowthcraftCellarLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		addEntityTableInventoryFluidInputOutput(GrowthcraftCellarBlocks.BREW_KETTLE.get(), GrowthcraftCellarBlockEntities.BREW_KETTLE_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftCellarBlocks.CULTURE_JAR.get(), GrowthcraftCellarBlockEntities.CULTURE_JAR_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftCellarBlocks.FERMENTATION_BARREL_OAK.get(), GrowthcraftCellarBlockEntities.FERMENTATION_BARREL_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftCellarBlocks.FRUIT_PRESS.get(), GrowthcraftCellarBlockEntities.FRUIT_PRESS_BLOCK_ENTITY.get());
		addEntityTableInventoryFluidInput(GrowthcraftCellarBlocks.FRUIT_PRESS_PISTON.get(), GrowthcraftCellarBlockEntities.FRUIT_PRESS_BLOCK_ENTITY.get());
		addStandardTable(GrowthcraftCellarBlocks.ROASTER.get(), GrowthcraftCellarBlockEntities.ROASTER_BLOCK_ENTITY.get());
	}
	
    @Override
    public String getName() {
        return "Growthcraft Cellar LootTables";
    }
}
