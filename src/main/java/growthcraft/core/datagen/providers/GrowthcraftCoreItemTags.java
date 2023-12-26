package growthcraft.core.datagen.providers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import growthcraft.apiary.init.GrowthcraftApiaryItems;
import growthcraft.apiary.init.GrowthcraftApiaryTags;
import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.init.GrowthcraftApplesTags;
import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import growthcraft.bamboo.init.GrowthcraftBambooTags;
import growthcraft.cellar.GrowthcraftCellar;
import growthcraft.cellar.init.GrowthcraftCellarItems;
import growthcraft.cellar.init.GrowthcraftCellarTags;
import growthcraft.core.init.GrowthcraftItems;
import growthcraft.core.init.GrowthcraftTags;
import growthcraft.core.shared.Reference;
import growthcraft.lib.item.GrowthcraftItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftCoreItemTags extends ItemTagsProvider{

	public GrowthcraftCoreItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		//GC Tags
		tag(GrowthcraftApiaryTags.Items.BEE)
		.add(GrowthcraftApiaryItems.BEE.get());
		tag(GrowthcraftApiaryTags.Items.HONEY_COMB)
		.add(GrowthcraftApiaryItems.HONEY_COMB_EMPTY.get())
		.add(GrowthcraftApiaryItems.HONEY_COMB_FULL.get())
		.add(Items.HONEYCOMB);
		tag(GrowthcraftApiaryTags.Items.BEES_WAX)
		.add(GrowthcraftApiaryItems.BEES_WAX.get());
		
		GrowthcraftApiaryItems.ITEMS.getEntries().forEach(item -> {
			if(item.getId().getPath().contains("bees_wax_")) {
				tag(GrowthcraftApiaryTags.Items.BEES_WAX).add(item.get());
				tag(((@NotNull GrowthcraftItem) item.get()).getDyeColor().getTag()).add(item.get());
			}
		});
		
		tag(GrowthcraftApplesTags.Items.APPLE_WOOD_LOG)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get().asItem())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get().asItem());
		
		tag(GrowthcraftBambooTags.Items.BAMBOO_WOOD_LOGS)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		tag(GrowthcraftBambooTags.Items.BAMBOO_WOOD)
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_STRIPPED.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		
		tag(GrowthcraftTags.Items.ROASTER_WRENCH)
		.add(GrowthcraftItems.WRENCH.get());
		tag(GrowthcraftTags.Items.SALT)
		.add(GrowthcraftItems.SALT.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_FRUITS)
		.add(GrowthcraftCellarItems.GRAPE_PURPLE.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_FRUITS)
		.add(GrowthcraftCellarItems.GRAPE_RED.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_FRUITS)
		.add(GrowthcraftCellarItems.GRAPE_WHITE.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_SEEDS)
		.add(GrowthcraftCellarItems.GRAPE_SEEDS_PURPLE.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_SEEDS)
		.add(GrowthcraftCellarItems.GRAPE_SEEDS_RED.get());
		tag(GrowthcraftCellarTags.Items.GRAPE_SEEDS)
		.add(GrowthcraftCellarItems.GRAPE_SEEDS_WHITE.get());
		
		//Vanilla Tags
		tag(ItemTags.WOODEN_BUTTONS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_BUTTON.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_BUTTON.get().asItem());
		tag(ItemTags.PLANKS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK.get().asItem());
		tag(ItemTags.WOODEN_DOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_DOOR.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_DOOR.get().asItem());
		tag(ItemTags.WOODEN_SLABS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_SLAB.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_SLAB.get().asItem());
		tag(ItemTags.LOGS)
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get().asItem())
		.add(GrowthcraftApplesBlocks.APPLE_WOOD_LOG_STRIPPED.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_WOOD_LOG_STRIPPED.get().asItem());
		tag(ItemTags.WOODEN_STAIRS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_STAIRS.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_STAIRS.get().asItem());
		tag(ItemTags.WOODEN_FENCES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_FENCE.get().asItem());
		tag(Tags.Items.FENCE_GATES_WOODEN)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE_GATE.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_FENCE_GATE.get().asItem());
		tag(ItemTags.WOODEN_PRESSURE_PLATES)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_PRESSURE_PLATE.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_PRESSURE_PLATE.get().asItem());
		tag(ItemTags.WOODEN_TRAPDOORS)
		.add(GrowthcraftApplesBlocks.APPLE_PLANK_TRAPDOOR.get().asItem())
		.add(GrowthcraftBambooBlocks.BAMBOO_PLANK_TRAPDOOR.get().asItem());
		tag(ItemTags.LEAVES)
		.add(GrowthcraftApplesBlocks.APPLE_TREE_LEAVES.get().asItem());
		
		//Forge Tags
		GrowthcraftCellarItems.ITEMS.getEntries().forEach(grain -> {
			if(grain.getId().getPath().contains("grain")) {
				tag(GrowthcraftCellarTags.Items.BARLEY)
				.add(grain.get());
				tag(GrowthcraftCellarTags.Items.GRAIN)
				.add(grain.get());
			}
		});
		tag(GrowthcraftTags.Items.DUSTS_SALT)
		.add(GrowthcraftItems.SALT.get());
	}

    @Override
    public String getName() {
        return "Growthcraft Core Item Tags";
    }
}
