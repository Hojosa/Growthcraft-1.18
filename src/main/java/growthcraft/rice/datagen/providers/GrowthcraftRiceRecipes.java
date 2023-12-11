package growthcraft.rice.datagen.providers;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class GrowthcraftRiceRecipes extends RecipeProvider{

	public GrowthcraftRiceRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Rice Recipes";
    }
}
