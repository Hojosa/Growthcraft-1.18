package growthcraft.core.init.client;

import growthcraft.core.init.GrowthcraftBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftBlockRenderers {
	
	 public static void setRenderLayers() {
	        setBlockRenderLayers();
	    }

	private static void setBlockRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftBlocks.SALT_ORE.get(), RenderType.cutoutMipped());	
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftBlocks.SALT_ORE_DEEPSLATE.get(), RenderType.cutoutMipped());	
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftBlocks.SALT_ORE_NETHER.get(), RenderType.cutoutMipped());	
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftBlocks.SALT_ORE_END.get(), RenderType.cutoutMipped());	
	}
}
