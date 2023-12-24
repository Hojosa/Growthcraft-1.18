package growthcraft.apiary.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.apiary.init.GrowthcraftApiaryBlocks;
import growthcraft.apiary.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApiaryBlockTags extends BlockTagsProvider {

	public GrowthcraftApiaryBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		GrowthcraftApiaryBlocks.BLOCKS.getEntries().forEach(block -> tag(BlockTags.BEEHIVES).add(block.get()));
	}

    @Override
    public String getName() {
        return "Growthcraft Apiary Block Tags";
    }
}
