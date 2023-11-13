package growthcraft.rice.init.client;

import growthcraft.rice.init.GrowthcraftRiceBlocks;
import growthcraft.rice.init.GrowthcraftRiceFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftRiceBlockRenderers {

    public static void setRenderLayers() {
        setFluidRenderLayers();
        setBlockRenderLayers();
    }
    
	private static void setBlockRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftRiceBlocks.RICE_CROP.get(), RenderType.cutout());	
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
