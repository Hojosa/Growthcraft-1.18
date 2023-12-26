package growthcraft.cellar.datagen.providers;

import java.util.function.Consumer;

import growthcraft.cellar.init.GrowthcraftCellarBlocks;
import growthcraft.cellar.init.GrowthcraftCellarItems;
import growthcraft.cellar.shared.Reference;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

public class GrowthcraftCellarRecipes extends RecipeProvider{

	public GrowthcraftCellarRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapeless(GrowthcraftCellarBlocks.BREW_KETTLE.get())
		.requires(Blocks.CAULDRON)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.CAULDRON))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftCellarItems.BREW_KETTLE_LID.get())
		.pattern(" i ")
		.pattern("III")
		.define('I', Tags.Items.INGOTS_IRON)
		.define('i', Tags.Items.NUGGETS_IRON)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftCellarBlocks.CULTURE_JAR.get())
		.pattern("BAB")
		.pattern("B B")
		.pattern("BBB")
		.define('A', ItemTags.PLANKS)
		.define('B', Tags.Items.GLASS_PANES)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ItemTags.PLANKS).build()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftCellarBlocks.FERMENTATION_BARREL_OAK.get())
		.pattern("AAA")
		.pattern("BBB")
		.pattern("AAA")
		.define('A', Tags.Items.INGOTS_IRON)
		.define('B', Blocks.OAK_PLANKS)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.OAK_PLANKS))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftCellarBlocks.FRUIT_PRESS.get())
		.pattern("ABA")
		.pattern("CCC")
		.pattern("DDD")
		.define('A', Tags.Items.FENCES)
		.define('B', Blocks.PISTON)
		.define('C', Tags.Items.INGOTS_IRON)
		.define('D', ItemTags.PLANKS)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.PISTON))
		.save(consumer);
		
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.WHEAT), GrowthcraftCellarItems.GRAIN.get());
		
		ShapedRecipeBuilder.shaped(GrowthcraftCellarBlocks.ROASTER.get())
		.pattern(" I ")
		.pattern(" B ")
		.pattern("I I")
		.define('I', Tags.Items.INGOTS_IRON)
		.define('B', GrowthcraftCellarBlocks.BREW_KETTLE.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftCellarBlocks.BREW_KETTLE.get()))
		.save(consumer);
	}
	
    @Override
    public String getName() {
        return "Growthcraft Cellar Recipes";
    }
}
