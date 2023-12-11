package growthcraft.cellar.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.cellar.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftCellarBlockTags extends BlockTagsProvider {

	public GrowthcraftCellarBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Cellar Block Tags";
    }
}
