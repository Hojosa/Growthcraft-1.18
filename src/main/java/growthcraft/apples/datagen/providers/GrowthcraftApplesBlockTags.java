package growthcraft.apples.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.apples.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApplesBlockTags extends BlockTagsProvider {

	public GrowthcraftApplesBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Apples Block Tags";
    }
}
