package growthcraft.cellar.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.cellar.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftCellarItemTags extends ItemTagsProvider{

	public GrowthcraftCellarItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		
	}

    @Override
    public String getName() {
        return "Growthcraft Cellar Item Tags";
    }
}
