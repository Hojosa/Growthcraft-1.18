package growthcraft.bamboo.datagen.providers;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class GrowthcraftBambooRecipes extends RecipeProvider{

	public GrowthcraftBambooRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Bamboo Recipes";
    }
}
