package growthcraft.bamboo.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.bamboo.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftBambooBlockTags extends BlockTagsProvider {

	public GrowthcraftBambooBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Bamboo Block Tags";
    }
}
