package growthcraft.apples.datagen.providers;

import java.util.function.Consumer;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.init.GrowthcraftApplesItems;
import growthcraft.apples.shared.Reference;
import growthcraft.cellar.recipe.FermentationBarrelRecipe;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

public class GrowthcraftApplesRecipes extends RecipeProvider{

	public GrowthcraftApplesRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapeless(GrowthcraftApplesBlocks.APPLE_PLANK_BUTTON.get())
		.requires(GrowthcraftApplesBlocks.APPLE_PLANK.get().asItem())
		.group("wooden_button")
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_DOOR.get(), 3)
		.pattern("##")
		.pattern("##")
		.pattern("##")
		.define('#', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE_GATE.get(), 3)
		.pattern("121")
		.pattern("121")
		.define('1', Items.STICK)
		.define('2', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_FENCE.get(), 3)
		.pattern("212")
		.pattern("212")
		.define('1', Items.STICK)
		.define('2', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_PRESSURE_PLATE.get())
		.pattern("##")
		.define('#', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_SLAB.get(), 6)
		.pattern("###")
		.define('#', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_STAIRS.get(), 4)
		.pattern("#  ")
		.pattern("## ")
		.pattern("###")
		.define('#', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_PLANK_TRAPDOOR.get())
		.pattern("###")
		.pattern("###")
		.define('#', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
		ShapelessRecipeBuilder.shapeless(GrowthcraftApplesBlocks.APPLE_PLANK.get(), 4)
		.requires(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get().asItem())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get()))
		.save(consumer);
		
		ShapelessRecipeBuilder.shapeless(GrowthcraftApplesItems.APPLE_SEEDS.get())
		.requires(Items.APPLE)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.APPLE))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.APPLE_WOOD.get(), 3)
		.pattern("##")
		.pattern("##")
		.define('#', GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_WOOD_LOG.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftApplesBlocks.BEE_BOX_APPLE.get())
		.pattern("SPS")
		.pattern("PBP")
		.pattern("SPS")
		.define('B', GrowthcraftApplesBlocks.APPLE_PLANK_SLAB.get())
		.define('P', GrowthcraftApplesBlocks.APPLE_PLANK.get())
		.define('S', Tags.Items.RODS_WOODEN)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftApplesBlocks.APPLE_PLANK.get()))
		.save(consumer);
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apples Recipes";
    }
}
