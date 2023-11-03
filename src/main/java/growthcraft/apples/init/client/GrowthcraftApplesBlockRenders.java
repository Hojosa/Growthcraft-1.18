package growthcraft.apples.init.client;

import growthcraft.apples.init.GrowthcraftApplesBlocks;
import growthcraft.apples.init.GrowthcraftApplesFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftApplesBlockRenders {
    public static void setRenderLayers() {
        setFluidRenderLayers();
        setBlockRenderLayers();
    }
    
    private static void setBlockRenderLayers() {
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftApplesBlocks.APPLE_TREE_SAPLING.get(), RenderType.cutout());
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
