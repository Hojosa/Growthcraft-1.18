package growthcraft.core.datagen.providers;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class GrowthcraftCoreRecipes extends RecipeProvider{

	public GrowthcraftCoreRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Core Recipes";
    }
}
