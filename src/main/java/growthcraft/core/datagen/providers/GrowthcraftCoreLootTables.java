package growthcraft.core.datagen.providers;

import growthcraft.core.init.GrowthcraftBlocks;
import net.minecraft.data.DataGenerator;

public class GrowthcraftCoreLootTables extends BaseLootTableProvider{

	public GrowthcraftCoreLootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected void addTables() {
		GrowthcraftBlocks.BLOCKS.getEntries().forEach(block -> {
			if(block.getId().getPath().contains("salt_ore")){
		}
			else lootTables.put(block.get(), createSimpleTable(block.get().getRegistryName().getPath(), GrowthcraftBlocks.ROPE_LINEN.get()));
		});
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Core LootTables";
    }
}
