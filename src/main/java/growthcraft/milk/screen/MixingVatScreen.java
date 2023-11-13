package growthcraft.milk.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import growthcraft.lib.kaupenjoe.screen.renderer.FluidTankRenderer;
import growthcraft.milk.screen.container.MixingVatMenu;
import growthcraft.milk.shared.Reference;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.TooltipFlag;

import java.util.Optional;

public class MixingVatScreen extends AbstractContainerScreen<MixingVatMenu> {
    //TODO[5]: Implement MixingVatScreen
    //
    private static final ResourceLocation TEXTURE = new ResourceLocation(
                Reference.MODID, "textures/gui/mixing_vat_screen.png"
    );

    private FluidTankRenderer fluidTankRenderer0;
    private FluidTankRenderer fluidTankRenderer1;

    public MixingVatScreen(MixingVatMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void init() {
        super.init();
        assignFluidRender();
    }

    private void assignFluidRender() {
        fluidTankRenderer0 = new FluidTankRenderer(4000, true, 16, 38);
        fluidTankRenderer1 = new FluidTankRenderer(1000, true, 16, 10);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(poseStack, x, y, 0, 0, imageWidth, imageHeight);

        this.blit(poseStack,
                x + 99, y + 21,
                176, 43,
                13, menu.getProgressionScaled(29)
        );

        if(this.menu.isHeated()) {
            this.blit(poseStack,
                    x + 98, y + 56,
                    176, 28,
                    13, 13
            );
        }

        fluidTankRenderer0.render(poseStack, x + 49, y + 32, menu.getFluidStack(0));
        fluidTankRenderer1.render(poseStack, x + 49, y + 18, menu.getFluidStack(1));
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float delta) {
        renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, delta);
        // Render any tooltips for this mouse over location.
        renderTooltip(poseStack, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        // Screen Title
        this.font.draw(poseStack, this.title, (float) this.titleLabelX, (float) this.titleLabelY, 4210752);
        // Inventory Title
        this.font.draw(poseStack, this.playerInventoryTitle, (float) this.inventoryLabelX, (float) this.inventoryLabelY, 4210752);

        // FluidTank Tooltips
        renderFluidTankTooltips(poseStack, mouseX, mouseY, x, y);
    }

    private void renderFluidTankTooltips(PoseStack poseStack, int mouseX, int mouseY, int x, int y) {

        // FluidTank0
        if(isMouseAboveArea(mouseX, mouseY, x + 49, y + 32, 16, 38, fluidTankRenderer0.getWidth(), fluidTankRenderer0.getHeight())) {
            renderTooltip(
                    poseStack,
                    fluidTankRenderer0.getTooltip(menu.getFluidStack(0), TooltipFlag.Default.NORMAL),
                    Optional.empty(),
                    mouseX - x,
                    mouseY - y
            );
        }

        if(isMouseAboveArea(mouseX, mouseY, x + 49, y + 18, 16, 10, fluidTankRenderer1.getWidth(), fluidTankRenderer1.getHeight())) {
            renderTooltip(
                    poseStack,
                    fluidTankRenderer1.getTooltip(menu.getFluidStack(1), TooltipFlag.Default.NORMAL),
                    Optional.empty(),
                    mouseX - x,
                    mouseY - y
            );
        }

    }

    private boolean isMouseAboveArea(int mouseX, int mouseY, int baseX, int baseY, int offsetX, int offsetY, int width, int height) {
        return (mouseX >= baseX && mouseX <= (baseX + offsetX)) && (mouseY >= baseY && mouseY <= (baseY + offsetY));
    }
}
