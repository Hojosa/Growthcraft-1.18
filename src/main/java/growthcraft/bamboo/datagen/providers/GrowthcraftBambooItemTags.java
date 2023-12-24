package growthcraft.bamboo.datagen.providers;

import org.jetbrains.annotations.Nullable;

import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import growthcraft.bamboo.shared.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftBambooItemTags extends ItemTagsProvider{
	
	public static final TagKey<Item> BAMBOO_WOOD_LOGS = ItemTags.create(new ResourceLocation(Reference.MODID, "bamboo_wood_logs"));
	public static final TagKey<Item> BAMBOO_WOOD = ItemTags.create(new ResourceLocation(Reference.MODID, "bamboo_wood"));

	public GrowthcraftBambooItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		tag(BAMBOO_WOOD_LOGS)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		tag(BAMBOO_WOOD)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_STRIPPED.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		tag(ItemTags.BUTTONS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_BUTTON.get().asItem());
		tag(ItemTags.PLANKS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK.get().asItem());
		tag(ItemTags.DOORS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_DOOR.get().asItem());
		tag(ItemTags.SLABS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_SLAB.get().asItem());
		tag(ItemTags.LOGS)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		tag(ItemTags.STAIRS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_STAIRS.get().asItem());
		tag(ItemTags.FENCES)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_FENCE.get().asItem());
		tag(ItemTags.TRAPDOORS)
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_TRAPDOOR.get().asItem());
		
	}

    @Override
    public String getName() {
        return "Growthcraft Bamboo Item Tags";
    }
}
