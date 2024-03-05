package growthcraft.milk.compat.jei.category;

import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;

import growthcraft.lib.utils.TextureHelper;
import growthcraft.lib.utils.TickUtils;
import growthcraft.milk.compat.jei.JEIGrowthcraftMilkModPlugin;
import growthcraft.milk.init.GrowthcraftMilkBlocks;
import growthcraft.milk.recipe.CheesePressRecipe;
import growthcraft.milk.shared.Reference;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
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

public class CheesePressRecipeCategory implements IRecipeCategory<CheesePressRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.CHEESE_PRESS);

    private static final ResourceLocation TEXTURE = TextureHelper.getTextureGui(Reference.MODID, Reference.UnlocalizedName.CHEESE_PRESS);

    private final IDrawable background;
    private final IDrawable icon;

    public CheesePressRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(
                TEXTURE, 10, 10, 160, 70
        );

        this.icon = guiHelper.createDrawableIngredient(
                VanillaTypes.ITEM_STACK,
                new ItemStack(GrowthcraftMilkBlocks.CHEESE_PRESS.get())
        );
    }

    @Override
    public RecipeType<CheesePressRecipe> getRecipeType() {
        return JEIGrowthcraftMilkModPlugin.CHEESE_PRESS_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.growthcraft_milk.category.cheese_press");
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
    public void setRecipe(IRecipeLayoutBuilder builder, CheesePressRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 43, 25)
                .addItemStack(recipe.getInputItemStack());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 96, 25)
                .addItemStack(recipe.getResultItemStack());
    }

    @Override
    public void draw(CheesePressRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, stack, mouseX, mouseY);
        Font font = Minecraft.getInstance().font;

        font.draw(stack, "Pressing Time " + TickUtils.toHoursMinutesSeconds(recipe.getProcessingTime()), 0, 63, 0x404040);
        
        List<FormattedCharSequence> splitFont = font.split(FormattedText.of("Use the wrench to open and close the press."), 150);
        font.draw(stack, splitFont.get(0), 0, 1, 0x404040);
        font.draw(stack, splitFont.get(1), 0, 10, 0x404040);
    }
    
	@Override
	public Class<? extends CheesePressRecipe> getRecipeClass() {
		return CheesePressRecipe.class;
	}

	@Override
	public ResourceLocation getUid() {
		return UID;
	}
}
