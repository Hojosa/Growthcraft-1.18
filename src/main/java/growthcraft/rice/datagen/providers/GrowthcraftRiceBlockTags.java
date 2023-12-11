package growthcraft.rice.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.rice.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftRiceBlockTags extends BlockTagsProvider {

	public GrowthcraftRiceBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Rice Block Tags";
    }
}
