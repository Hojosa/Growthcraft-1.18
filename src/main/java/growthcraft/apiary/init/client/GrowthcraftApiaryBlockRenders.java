package growthcraft.apiary.init.client;

import growthcraft.apiary.init.GrowthcraftApiaryFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftApiaryBlockRenders {

    public static void setRenderLayers() {
        setFluidRenderLayers();
    }

    private static void setFluidRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_MEAD_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_MEAD_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_FLUID.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_MEAD_MUST_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApiaryFluids.HONEY_MEAD_MUST_FLUID.get().getFlowing(), RenderType.translucent());
    }

    private GrowthcraftApiaryBlockRenders() {
        /* Prevent default public constructor */
    }
}
