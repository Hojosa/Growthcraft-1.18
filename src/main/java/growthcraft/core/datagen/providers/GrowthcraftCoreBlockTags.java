package growthcraft.core.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.core.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftCoreBlockTags extends BlockTagsProvider {

	public GrowthcraftCoreBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Core Block Tags";
    }
}
