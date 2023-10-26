package growthcraft.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import growthcraft.core.init.GrowthcraftBlockEntities;
import growthcraft.core.init.GrowthcraftBlocks;
import growthcraft.core.init.GrowthcraftItems;
import growthcraft.core.init.GrowthcraftLootModifiers;
import growthcraft.core.init.config.GrowthcraftConfig;
import growthcraft.core.shared.Reference;
import growthcraft.lib.utils.FluidUtils;
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
public class Growthcraft {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public Growthcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetupEvent);
//        modEventBus.addListener(GrowthcraftCreativeModeTabs::registerCreativeModeTab);
//        modEventBus.addListener(this::buildCreativeTabContents);

        GrowthcraftConfig.loadConfig();

        GrowthcraftBlocks.BLOCKS.register(modEventBus);
        GrowthcraftItems.ITEMS.register(modEventBus);
        GrowthcraftBlockEntities.BLOCK_ENTITIES.register(modEventBus);

        GrowthcraftLootModifiers.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetupEvent(final FMLClientSetupEvent event) {
        // Do nothing for now ...
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Do Nothing
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do nothing
    }

//    public void buildCreativeTabContents(CreativeModeTabEvent.BuildContents event) {
//        if(event.getTab() == GrowthcraftCreativeModeTabs.GROWTHCRAFT_CREATIVE_TAB) {
//            GrowthcraftItems.ITEMS.getEntries().forEach(itemRegistryObject -> {
//                if (!GrowthcraftItems.excludeItemRegistry(itemRegistryObject.getId())) {
//                    event.accept(new ItemStack(itemRegistryObject.get()));
//                }
//            });
//        }
//    }

}
