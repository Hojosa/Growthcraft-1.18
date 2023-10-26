package growthcraft.rice.init.client;

import growthcraft.lib.client.ItemRendererUtils;
import growthcraft.rice.init.GrowthcraftRiceFluids;
import growthcraft.rice.shared.Reference;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftRiceItemRenderers {

    @SubscribeEvent
    public static void registerItemRenders(ColorHandlerEvent.Item event) {
        ItemRendererUtils.registerItem(event, Reference.FluidColor.RICE_WATER.toItemColor(), GrowthcraftRiceFluids.RICE_WATER.get().getBucket());
        ItemRendererUtils.registerItem(event, Reference.FluidColor.RICE_WINE.toItemColor(), GrowthcraftRiceFluids.RICE_WINE.get().getBucket());
        ItemRendererUtils.registerItem(event, Reference.FluidColor.SAKE.toItemColor(), GrowthcraftRiceFluids.SAKE.get().getBucket());
    }

    private GrowthcraftRiceItemRenderers() {
        /* Prevent automatic public constructor */
    }

}
