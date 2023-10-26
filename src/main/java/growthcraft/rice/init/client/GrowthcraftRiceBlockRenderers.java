package growthcraft.rice.init.client;

import growthcraft.rice.init.GrowthcraftRiceFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftRiceBlockRenderers {

    public static void setRenderLayers() {
        setFluidRenderLayers();
    }

    private static void setFluidRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.RICE_WATER.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.RICE_WATER.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.RICE_WINE.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.RICE_WINE.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.SAKE.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceFluids.SAKE.get().getFlowing(), RenderType.translucent());
    }

    private GrowthcraftRiceBlockRenderers() {
        /* Prevent default public constructor */
    }
}
