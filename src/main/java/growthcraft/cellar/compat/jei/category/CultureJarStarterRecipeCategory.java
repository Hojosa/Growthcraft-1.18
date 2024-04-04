package growthcraft.cellar.compat.jei.category;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.mojang.blaze3d.vertex.PoseStack;

import growthcraft.cellar.GrowthcraftCellar;
import growthcraft.cellar.compat.jei.JEIGrowthcraftCellarModPlugin;
import growthcraft.cellar.init.GrowthcraftCellarBlocks;
import growthcraft.cellar.recipe.BrewKettleRecipe;
import growthcraft.cellar.recipe.CultureJarStarterRecipe;
import growthcraft.cellar.shared.Reference;
import growthcraft.lib.utils.TextureHelper;
import growthcraft.lib.utils.TickUtils;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.item.ItemStack;

public class CultureJarStarterRecipeCategory implements IRecipeCategory<CultureJarStarterRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.CULTURE_JAR.concat("_starter"));

    private static final ResourceLocation TEXTURE = TextureHelper.getTextureGui(Reference.MODID, Reference.UnlocalizedName.CULTURE_JAR);

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic overlayHeated;
    private final IDrawableStatic overlayTank;

    @Override
    public RecipeType<CultureJarStarterRecipe> getRecipeType() {
        return JEIGrowthcraftCellarModPlugin.CULTURE_JAR_STARTER_RECIPE_TYPE;
    }

    public CultureJarStarterRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(
                TEXTURE, 10, 10, 160, 70
        );
        this.icon = guiHelper.createDrawableIngredient(
                VanillaTypes.ITEM_STACK,
                new ItemStack(GrowthcraftCellarBlocks.CULTURE_JAR.get())
        );

        this.overlayHeated = guiHelper.createDrawable(
                TEXTURE, 176, 28, 12, 13
        );

        this.overlayTank = guiHelper.createDrawable(
                TEXTURE, 176, 64, 12, 13
        );
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.growthcraft_cellar.category.culture_jar_starter");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CultureJarStarterRecipe recipe, IFocusGroup focuses) {
        // Input Item
        builder.addSlot(RecipeIngredientRole.OUTPUT, 84, 25)
                .addItemStack(recipe.getInputItemStack());

        builder.addSlot(RecipeIngredientRole.INPUT, 55, 8)
                .setFluidRenderer(4000, true, 16, 52)
                .addFluidStack(recipe.getInputFluidStack().getFluid(), recipe.getInputFluidStack().getAmount());

        builder.addInvisibleIngredients(RecipeIngredientRole.INPUT)
                .addFluidStack(recipe.getInputFluidStack().getFluid(), recipe.getInputFluidStack().getAmount());
    }

    @Override
    public void draw(CultureJarStarterRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, stack, mouseX, mouseY);
        Font font = Minecraft.getInstance().font;

        try {
            if (recipe.isHeatSourceRequired()) overlayHeated.draw(stack, 86, 47);
        } catch (Exception ex) {
            GrowthcraftCellar.LOGGER.error("Failure to draw heat texture for Culture Jar recipe with JEI integration.");
        }
        
        List<FormattedCharSequence> splitFont = font.split(FormattedText.of("Leave the item slot empty for creating a starter."), 50);
        AtomicInteger hight = new AtomicInteger(7);

        splitFont.forEach((f) -> {
        	font.draw(stack, f, 0, hight.get(), 0x404040);
        	hight.getAndAdd(9);
        });
    }
    
	@Override
	public Class<? extends CultureJarStarterRecipe> getRecipeClass() {
		return CultureJarStarterRecipe.class;
	}

	@Override
	public ResourceLocation getUid() {
		return JEIGrowthcraftCellarModPlugin.CULTURE_JAR_STARTER_RECIPE_TYPE.getUid();
	}
}
