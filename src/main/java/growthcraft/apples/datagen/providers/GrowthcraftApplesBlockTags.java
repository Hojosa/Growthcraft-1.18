package growthcraft.apples.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApplesBlockTags extends BlockTagsProvider {
	
	public static final TagKey<Block> APPLE_WOOD_LOG = BlockTags.create(new ResourceLocation("growthcraft_apples", "apple_wood_logs"));

	public GrowthcraftApplesBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		tag(APPLE_WOOD_LOG)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get());
		tag(BlockTags.WOODEN_BUTTONS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_BUTTON.get());
		tag(BlockTags.PLANKS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK.get());
		tag(BlockTags.DOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_DOOR.get());
		tag(BlockTags.WOODEN_SLABS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_SLAB.get());
		tag(BlockTags.LOGS)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get());
		tag(BlockTags.WOODEN_STAIRS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_STAIRS.get());
		tag(BlockTags.WOODEN_FENCES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE.get());
		tag(BlockTags.FENCE_GATES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE_GATE.get());
		tag(BlockTags.WOODEN_PRESSURE_PLATES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_PRESSURE_PLATE.get());
		tag(BlockTags.WOODEN_TRAPDOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_TRAPDOOR.get());
		tag(BlockTags.LEAVES)
		.add(GrowthcraftApplesBlocks.APPLE_TREE_LEAVES.get());
	
	}

    @Override
    public String getName() {
        return "Growthcraft Apples Block Tags";
    }
}
