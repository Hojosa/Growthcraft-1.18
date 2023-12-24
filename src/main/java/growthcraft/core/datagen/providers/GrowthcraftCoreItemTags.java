package growthcraft.core.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.core.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftCoreItemTags extends ItemTagsProvider{

	public GrowthcraftCoreItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		
	}

    @Override
    public String getName() {
        return "Growthcraft Core Item Tags";
    }
}
