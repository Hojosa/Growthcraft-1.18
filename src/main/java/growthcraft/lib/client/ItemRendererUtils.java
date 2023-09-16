package growthcraft.lib.client;

import java.util.Collection;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.registries.RegistryObject;

public class ItemRendererUtils {

    public static void registerItems(ColorHandlerEvent.Item handler, ItemColor itemColor, Collection<RegistryObject<Item>> items) {
        if (items.isEmpty()) return;
        items.stream()
                .filter(RegistryObject::isPresent)
                .map(RegistryObject::get)
                .forEach(item -> handler.getItemColors().register(itemColor, item));
    }

    public static void registerItem(ColorHandlerEvent.Item handler, ItemColor itemColor, Item item) {
       handler.getItemColors().register(itemColor, item);
    }

}
