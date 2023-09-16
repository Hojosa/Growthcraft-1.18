package growthcraft.lib.client;

import java.util.Collection;

import growthcraft.lib.utils.ColorUtils;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.registries.RegistryObject;

public class BlockRendererUtils {

    public static void registerBlocks(ColorHandlerEvent.Block handler, BlockColor blockColor, Collection<RegistryObject<Block>> blocks) {
        if (blocks.isEmpty()) return;
        blocks.stream()
                .filter(RegistryObject::isPresent)
                .map(RegistryObject::get)
                .forEach(block -> handler.getBlockColors().register(blockColor, block));
    }

    public static void registerBlock(ColorHandlerEvent.Block handler, ColorUtils.GrowthcraftColor color, Block block) {
        handler.getBlockColors().register((blockstate, reader, pos, i) -> color.toIntValue(), block);
    }

}
