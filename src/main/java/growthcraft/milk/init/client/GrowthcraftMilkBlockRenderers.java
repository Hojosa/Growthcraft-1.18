package growthcraft.milk.init.client;

import growthcraft.lib.client.BlockRendererUtils;
import growthcraft.milk.init.GrowthcraftMilkBlocks;
import growthcraft.milk.init.GrowthcraftMilkFluids;
import growthcraft.milk.shared.Reference;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftMilkBlockRenderers {

    public static void setRenderLayers() {
        setFluidRenderLayers();
        setBlockRenderLayers();
    }
    
	private static void setBlockRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkBlocks.THISTLE_CROP.get(), RenderType.cutout());	
	}

    private static void setFluidRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.BUTTER_MILK.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.BUTTER_MILK.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CHEESE_BASE.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CHEESE_BASE.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CONDENSED_MILK.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CONDENSED_MILK.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CREAM.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CREAM.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CULTURED_MILK.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.CULTURED_MILK.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.KUMIS.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.KUMIS.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.MILK.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.MILK.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.RENNET.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.RENNET.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.SKIM_MILK.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.SKIM_MILK.get().getFlowing(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.WHEY.get().getSource(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GrowthcraftMilkFluids.WHEY.get().getFlowing(), RenderType.translucent());
    }

    @SubscribeEvent
    public static void registerBlockRenders(ColorHandlerEvent.Block event) {
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.APPENZELLER_CHEESE, GrowthcraftMilkBlocks.APPENZELLER_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.APPENZELLER_CHEESE, GrowthcraftMilkBlocks.APPENZELLER_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.ASIAGO_CHEESE, GrowthcraftMilkBlocks.ASIAGO_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.ASIAGO_CHEESE, GrowthcraftMilkBlocks.ASIAGO_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.CASU_MARZU_CHEESE, GrowthcraftMilkBlocks.CASU_MARZU_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.CASU_MARZU_CHEESE, GrowthcraftMilkBlocks.CASU_MARZU_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.CHEDDAR_CHEESE, GrowthcraftMilkBlocks.CHEDDAR_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.CHEDDAR_CHEESE, GrowthcraftMilkBlocks.CHEDDAR_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.EMMENTALER_CHEESE, GrowthcraftMilkBlocks.EMMENTALER_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.EMMENTALER_CHEESE, GrowthcraftMilkBlocks.EMMENTALER_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.GORGONZOLA_CHEESE, GrowthcraftMilkBlocks.GORGONZOLA_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.GORGONZOLA_CHEESE, GrowthcraftMilkBlocks.GORGONZOLA_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.GOUDA_CHEESE, GrowthcraftMilkBlocks.GOUDA_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.GOUDA_CHEESE, GrowthcraftMilkBlocks.GOUDA_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.MONTEREY_CHEESE, GrowthcraftMilkBlocks.MONTEREY_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.MONTEREY_CHEESE, GrowthcraftMilkBlocks.MONTEREY_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.PARMESAN_CHEESE, GrowthcraftMilkBlocks.PARMESAN_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.PARMESAN_CHEESE, GrowthcraftMilkBlocks.PARMESAN_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.PROVOLONE_CHEESE, GrowthcraftMilkBlocks.PROVOLONE_CHEESE.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.PROVOLONE_CHEESE, GrowthcraftMilkBlocks.PROVOLONE_CHEESE_CURDS.get() );
        BlockRendererUtils.registerBlock(event, Reference.ItemColor.RICOTTA_CHEESE, GrowthcraftMilkBlocks.RICOTTA_CHEESE_CURDS.get() );
    }


    private GrowthcraftMilkBlockRenderers() {
        /* Prevent default public constructor */
    }
}
