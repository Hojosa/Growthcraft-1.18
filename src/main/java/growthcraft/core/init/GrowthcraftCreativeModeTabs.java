package growthcraft.core.init;

import net.minecraft.world.item.CreativeModeTab;

public class GrowthcraftCreativeModeTabs {

    public static CreativeModeTab GROWTHCRAFT_CREATIVE_TAB;

    private GrowthcraftCreativeModeTabs() {
        /* Prevent generation of default public constructor. */
    }

//    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
//        GROWTHCRAFT_CREATIVE_TAB = event.registerCreativeModeTab(new ResourceLocation(Reference.MODID, "tab"),
//                builder -> {
//                    builder
//                            .icon(() -> new ItemStack(GrowthcraftItems.CROWBAR_ORANGE.get()))
//                            .title(Component.translatable("item_group." + Reference.MODID + ".tab"));
//                }
//        );
//    }
}
