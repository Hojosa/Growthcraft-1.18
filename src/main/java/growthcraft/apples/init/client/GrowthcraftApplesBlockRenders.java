package growthcraft.apples.init.client;

import growthcraft.apples.init.GrowthcraftApplesFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftApplesBlockRenders {
    public static void setRenderLayers() {
        // No longer programmatically set for blocks. Use "render_type": "cutout|translucent" in block model json.
        setFluidRenderLayers();
    }

    private static void setFluidRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApplesFluids.APPLE_CIDER_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApplesFluids.APPLE_CIDER_FLUID.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApplesFluids.APPLE_JUICE_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftApplesFluids.APPLE_JUICE_FLUID.get().getFlowing(), RenderType.translucent());
    }

    private GrowthcraftApplesBlockRenders() {
        /* Prevent default public constructor */
    }
}
