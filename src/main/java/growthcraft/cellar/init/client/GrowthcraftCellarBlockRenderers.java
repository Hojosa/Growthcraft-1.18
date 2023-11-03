package growthcraft.cellar.init.client;

import growthcraft.cellar.init.GrowthcraftCellarBlocks;
import growthcraft.cellar.init.GrowthcraftCellarFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class GrowthcraftCellarBlockRenderers {

    public static void setRenderLayers() {
        setFluidRenderLayers();
        setBlockRenderLayers();
    }
    
    private static void setBlockRenderLayers() {
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.PURPLE_GRAPE_VINE.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.PURPLE_GRAPE_VINE_FRUIT.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.PURPLE_GRAPE_VINE_LEAVES.get(), RenderType.translucent());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.WHITE_GRAPE_VINE.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.WHITE_GRAPE_VINE_FRUIT.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.WHITE_GRAPE_VINE_LEAVES.get(), RenderType.translucent());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.HOPS_VINE.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.RED_GRAPE_VINE.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.RED_GRAPE_VINE_FRUIT.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarBlocks.RED_GRAPE_VINE_LEAVES.get(), RenderType.translucent());
    }

    private static void setFluidRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_ALE_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_ALE_FLUID.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_LAGER_FLUID.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.AMBER_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_LAGER_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.BROWN_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_LAGER_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.COPPER_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DARK_LAGER_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DARK_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DARK_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DARK_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DEEP_AMBER_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DEEP_AMBER_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DEEP_COPPER_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.DEEP_COPPER_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.GOLDEN_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.GOLDEN_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.HOPPED_GOLDEN_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.IPA_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.IPA_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.OLD_PORT_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.OLD_PORT_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_GOLDEN_WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_GOLDEN_WORT_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_LAGER_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PALE_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PILSNER_LAGER_FLUID.get().getSource(), RenderType.translucent());	
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PILSNER_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PURPLE_GRAPE_JUICE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.PURPLE_GRAPE_WINE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.RED_GRAPE_JUICE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.RED_GRAPE_JUICE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.RED_GRAPE_WINE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.RED_GRAPE_WINE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.STOUT_ALE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.STOUT_ALE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.VIENNA_LAGER_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.VIENNA_LAGER_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WHITE_GRAPE_JUICE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WHITE_GRAPE_WINE_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WHITE_GRAPE_WINE_FLUID.get().getFlowing(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WORT_FLUID.get().getSource(), RenderType.translucent());
	    ItemBlockRenderTypes.setRenderLayer(GrowthcraftCellarFluids.WORT_FLUID.get().getFlowing(), RenderType.translucent());
    }

    private GrowthcraftCellarBlockRenderers() {
        /* Prevent default public constructor */
    }
}
