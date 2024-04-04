package growthcraft.rice.datagen.providers;

import java.util.function.Consumer;

import growthcraft.rice.init.GrowthcraftRiceItems;
import growthcraft.rice.shared.Reference;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class GrowthcraftRiceRecipes extends RecipeProvider{

	public GrowthcraftRiceRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(GrowthcraftRiceItems.CULTIVATOR.get())
		.pattern("iIi")
		.pattern("iSi")
		.pattern(" S ")
		.define('i', Tags.Items.NUGGETS_IRON)
		.define('I', Tags.Items.INGOTS_IRON)
		.define('S', Tags.Items.RODS_WOODEN)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftRiceItems.KNIFE.get())
		.pattern("  I")
		.pattern(" I ")
		.pattern("S  ")
		.define('I', Tags.Items.INGOTS_IRON)
		.define('S', Tags.Items.RODS_WOODEN)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(GrowthcraftRiceItems.RICE_STALK.get()), GrowthcraftRiceItems.RICE.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftRiceItems.RICE_STALK.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftRiceItems.SUSHI_ROLL.get())
		.pattern("F")
		.pattern("R")
		.pattern("K")
		.define('F', ItemTags.FISHES)
		.define('R', GrowthcraftRiceItems.RICE_COOKED.get())
		.define('K', Items.KELP)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftRiceItems.RICE_COOKED.get()))
		.save(consumer);
		
		
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Rice Recipes";
    }
}
