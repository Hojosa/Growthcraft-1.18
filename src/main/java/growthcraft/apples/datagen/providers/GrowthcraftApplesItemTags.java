package growthcraft.apples.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApplesItemTags extends ItemTagsProvider{
	
	public static final TagKey<Item> APPLE_WOOD_LOG = ItemTags.create(new ResourceLocation("growthcraft_apples", "apple_wood_logs"));

	public GrowthcraftApplesItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		tag(APPLE_WOOD_LOG)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get().asItem())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get().asItem());
		tag(ItemTags.WOODEN_BUTTONS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_BUTTON.get().asItem());
		tag(ItemTags.PLANKS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK.get().asItem());
		tag(ItemTags.DOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_DOOR.get().asItem());
		tag(ItemTags.WOODEN_SLABS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_SLAB.get().asItem());
		tag(ItemTags.LOGS)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get().asItem())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get().asItem());
		tag(ItemTags.WOODEN_STAIRS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_STAIRS.get().asItem());
		tag(ItemTags.WOODEN_FENCES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE.get().asItem());
		tag(Tags.Items.FENCE_GATES_WOODEN)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE_GATE.get().asItem());
		tag(ItemTags.WOODEN_PRESSURE_PLATES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_PRESSURE_PLATE.get().asItem());
		tag(ItemTags.WOODEN_TRAPDOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_TRAPDOOR.get().asItem());
		
	}

    @Override
    public String getName() {
        return "Growthcraft Apples Item Tags";
    }
}
