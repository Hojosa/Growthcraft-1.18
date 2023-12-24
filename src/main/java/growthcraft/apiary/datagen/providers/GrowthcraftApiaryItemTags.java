package growthcraft.apiary.datagen.providers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import growthcraft.apiary.init.GrowthcraftApiaryItems;
import growthcraft.apiary.shared.Reference;
import growthcraft.lib.item.GrowthcraftItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GrowthcraftApiaryItemTags extends ItemTagsProvider{
	
	public static final TagKey<Item> BEE = ItemTags.create(new ResourceLocation(Reference.MODID, "bee"));
	public static final TagKey<Item> BEES_WAX = ItemTags.create(new ResourceLocation(Reference.MODID, "bees_wax"));
	public static final TagKey<Item> HONEY_COMB = ItemTags.create(new ResourceLocation(Reference.MODID, "honey_comb"));

	public GrowthcraftApiaryItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, Reference.MODID, existingFileHelper);
	}
	
	@Override 
	protected void addTags() {
		tag(BEE)
		.add(GrowthcraftApiaryItems.BEE.get());
		tag(HONEY_COMB)
		.add(GrowthcraftApiaryItems.HONEY_COMB_EMPTY.get())
		.add(GrowthcraftApiaryItems.HONEY_COMB_FULL.get())
		.add(Items.HONEYCOMB);
		tag(BEES_WAX)
		.add(GrowthcraftApiaryItems.BEES_WAX.get());
		
		GrowthcraftApiaryItems.ITEMS.getEntries().forEach(item -> {
			if(item.getId().getPath().contains("bees_wax_")) {
				tag(BEES_WAX).add(item.get());
				tag(((@NotNull GrowthcraftItem) item.get()).getDyeColor().getTag()).add(item.get());
			}
		});
	}

    @Override
    public String getName() {
        return "Growthcraft Apiary Item Tags";
    }
}
