package growthcraft.bamboo.init.client;

import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftBambooBlockRenderers {
	
	 public static void setRenderLayers() {
	        setBlockRenderLayers();
	    }

	private static void setBlockRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftBambooBlocks.BAMBOO_PLANK_DOOR.get(), RenderType.cutout());	
	}
}
