package growthcraft.bamboo.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import growthcraft.bamboo.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftBambooBlockTags extends BlockTagsProvider {
	
	public static final TagKey<Block> BAMBOO_WOOD_LOGS = BlockTags.create(new ResourceLocation(Reference.MODID, "bamboo_wood_logs"));
	public static final TagKey<Block> BAMBOO_WOOD = BlockTags.create(new ResourceLocation(Reference.MODID, "bamboo_wood"));

	public GrowthcraftBambooBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		tag(BAMBOO_WOOD_LOGS)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get());
		tag(BAMBOO_WOOD)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_STRIPPED.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get());
		tag(BlockTags.BUTTONS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_BUTTON.get());
		tag(BlockTags.PLANKS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK.get());
		tag(BlockTags.DOORS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_DOOR.get());
		tag(BlockTags.SLABS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_SLAB.get());
		tag(BlockTags.LOGS)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get());
		tag(BlockTags.STAIRS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_STAIRS.get());
		tag(BlockTags.FENCES)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_FENCE.get());
		tag(BlockTags.FENCE_GATES)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_FENCE_GATE.get());
		tag(BlockTags.PRESSURE_PLATES)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_PRESSURE_PLATE.get());
		tag(BlockTags.TRAPDOORS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_TRAPDOOR.get());
	}

    @Override
    public String getName() {
        return "Growthcraft Bamboo Block Tags";
    }
}
