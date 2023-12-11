package growthcraft.apples.datagen.providers;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class GrowthcraftApplesRecipes extends RecipeProvider{

	public GrowthcraftApplesRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Apples Recipes";
    }
}
