package growthcraft.milk.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.milk.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftMilkBlockTags extends BlockTagsProvider {

	public GrowthcraftMilkBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
	
	}

    @Override
    public String getName() {
        return "Growthcraft Milk Block Tags";
    }
}
