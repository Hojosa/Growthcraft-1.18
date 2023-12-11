package growthcraft.milk.datagen.providers;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class GrowthcraftMilkRecipes extends RecipeProvider{

	public GrowthcraftMilkRecipes(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
	}
	
    @Override
    public String getName() {
        return "Growthcraft Milk Recipes";
    }
}
