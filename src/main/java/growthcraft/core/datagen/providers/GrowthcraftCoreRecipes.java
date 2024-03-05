package growthcraft.core.datagen.providers;

import java.util.function.Consumer;

import growthcraft.core.init.GrowthcraftBlocks;
import growthcraft.core.init.GrowthcraftItems;
import growthcraft.core.shared.Reference;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

public class GrowthcraftCoreRecipes extends RecipeProvider{

	public GrowthcraftCoreRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_BLACK.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.BLACK_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_BLUE.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.BLUE_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_BROWN.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.BROWN_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_CYAN.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.CYAN_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_GRAY.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.GRAY_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_GREEN.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.GREEN_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_LIGHT_BLUE.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.LIGHT_BLUE_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_LIGHT_GRAY.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.LIGHT_GRAY_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_LIME.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.LIME_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_MAGENTA.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.MAGENTA_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_ORANGE.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.ORANGE_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_PINK.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.PINK_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_PURPLE.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.PURPLE_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_RED.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.RED_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_WHITE.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.WHITE_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.CROWBAR_YELLOW.get())
		.pattern("  A")
		.pattern("CBC")
		.pattern("A  ")
		.define('A', Tags.Items.NUGGETS_IRON)
		.define('B', Tags.Items.INGOTS_IRON)
		.define('C', Items.YELLOW_CARPET)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.ROPE_LINEN.get(), 8)
		.pattern("AAA")
		.pattern("ABA")
		.pattern("AAA")
		.define('A', Items.STRING)
		.define('B', Items.LEAD)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LEAD))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.ROPE_LINEN.get(), 8)
		.pattern("AAA")
		.pattern("ABA")
		.pattern("AAA")
		.define('A', Items.STRING)
		.define('B', GrowthcraftItems.ROPE_LINEN.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LEAD))
		.save(consumer, new ResourceLocation(Reference.MODID,"rope_linen_lengthen"));
		
		ShapedRecipeBuilder.shaped(GrowthcraftBlocks.SALT_BLOCK.get())
		.pattern("###")
		.pattern("###")
		.pattern("###")
		.define('#', GrowthcraftItems.SALT.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftItems.SALT.get()))
		.save(consumer);
		
		ShapelessRecipeBuilder.shapeless(GrowthcraftItems.SALT.get(),9)
		.requires(GrowthcraftBlocks.SALT_BLOCK.get())
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftItems.SALT.get()))
		.save(consumer);
		
		ShapedRecipeBuilder.shaped(GrowthcraftItems.WRENCH.get())
		.pattern(" BB")
		.pattern(" AB")
		.pattern("A  ")
		.define('A', Tags.Items.INGOTS_IRON)
		.define('B', Tags.Items.NUGGETS_IRON)
		.group(Reference.MODID)
		.unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(GrowthcraftItems.SALT.get()))
		.save(consumer);
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Core Recipes";
    }
}
