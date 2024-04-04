package growthcraft.cellar.compat.jei.category;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.mojang.blaze3d.vertex.PoseStack;

import growthcraft.cellar.compat.jei.JEIGrowthcraftCellarModPlugin;
import growthcraft.cellar.init.GrowthcraftCellarBlocks;
import growthcraft.cellar.recipe.FruitPressRecipe;
import growthcraft.cellar.shared.Reference;
import growthcraft.lib.utils.TextureHelper;
import growthcraft.lib.utils.TickUtils;
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

public class FruitPressRecipeCategory implements IRecipeCategory<FruitPressRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Reference.MODID, Reference.UnlocalizedName.FRUIT_PRESS);

    private static final ResourceLocation TEXTURE = TextureHelper.getTextureGui(Reference.MODID, Reference.UnlocalizedName.FRUIT_PRESS);

    private final IDrawable background;
    private final IDrawable icon;

    public FruitPressRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(
                TEXTURE, 10, 10, 160, 70
        );

        this.icon = guiHelper.createDrawableIngredient(
                VanillaTypes.ITEM_STACK,
                new ItemStack(GrowthcraftCellarBlocks.FRUIT_PRESS.get())
        );
    }

    @Override
    public RecipeType<FruitPressRecipe> getRecipeType() {
        return JEIGrowthcraftCellarModPlugin.FRUIT_PRESS_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.growthcraft_cellar.category.fruit_press");
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
    public void setRecipe(IRecipeLayoutBuilder builder, FruitPressRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 42, 43)
                .addItemStack(recipe.getIngredientItemStack());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 62, 7)
                .setFluidRenderer(4000, true, 50, 52)
                .addFluidStack(recipe.getResultingFluid().getFluid(), recipe.getResultingFluid().getAmount());
    }

    @Override
    public void draw(FruitPressRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, stack, mouseX, mouseY);
        Font font = Minecraft.getInstance().font;



        font.draw(stack, "(" + TickUtils.toHoursMinutesSeconds(recipe.getProcessingTime()) + ")", 0, 55, 0x404040);

        stack.scale(0.8F, 0.8F, 0.8F);
        
        List<FormattedCharSequence> splitFont = font.split(FormattedText.of("Watch for drainage particles until completed."), 60);
        AtomicInteger hight = new AtomicInteger(7);

        splitFont.forEach((f) -> {
        	font.draw(stack, f, 144, hight.get(), 0x404040);
        	hight.getAndAdd(9);
        });
    }
    
	@Override
	public Class<? extends FruitPressRecipe> getRecipeClass() {
		return FruitPressRecipe.class;
	}

	@Override
	public ResourceLocation getUid() {
		return JEIGrowthcraftCellarModPlugin.FRUIT_PRESS_RECIPE_TYPE.getUid();
	}
}
