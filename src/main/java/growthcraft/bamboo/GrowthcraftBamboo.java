package growthcraft.bamboo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import growthcraft.bamboo.init.GrowthcraftBambooBlockEntities;
import growthcraft.bamboo.init.GrowthcraftBambooBlocks;
import growthcraft.bamboo.init.GrowthcraftBambooItems;
import growthcraft.bamboo.init.GrowthcraftBambooTags;
import growthcraft.bamboo.init.client.GrowthcraftBambooBlockRenderers;
import growthcraft.bamboo.init.config.GrowthcraftBambooConfig;
import growthcraft.bamboo.shared.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Reference.MODID)
@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowthcraftBamboo {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public GrowthcraftBamboo() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetupEvent);

        // Config
        GrowthcraftBambooConfig.loadConfig();

        // Blocks, Items, Fluids, Block Entities, Containers
        GrowthcraftBambooBlocks.BLOCKS.register(modEventBus);
        GrowthcraftBambooItems.ITEMS.register(modEventBus);
        GrowthcraftBambooBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        GrowthcraftBambooTags.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetupEvent(final FMLClientSetupEvent event) {
    	GrowthcraftBambooBlockRenderers.setRenderLayers();
    }

    private void setup(final FMLCommonSetupEvent event) {
    	event.enqueueWork(() -> {
    	GrowthcraftBambooBlocks.registerStrippable();
    	});
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Growthcraft Bamboo starting up ...");
    }

}
