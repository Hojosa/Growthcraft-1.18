package growthcraft.apiary.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.apiary.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApiaryBlockTags extends BlockTagsProvider {

	public GrowthcraftApiaryBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Apiary Block Tags";
    }
}
