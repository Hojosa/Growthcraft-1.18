package growthcraft.lib.item;

import java.awt.Color;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import growthcraft.core.shared.Reference;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;

public class GrowthcraftBucketItem extends BucketItem {

    private final int color;

    public GrowthcraftBucketItem(Supplier<? extends Fluid> supplier, Color color) {
        super(supplier,
                new Item.Properties().stacksTo(1).tab(Reference.ITEM_GROUP));

        this.color = color.getRGB();
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @Nullable net.minecraft.nbt.CompoundTag nbt) {
        if (this instanceof BucketItem)
            return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
        else
            return super.initCapabilities(stack, nbt);
    }

    public int getColor() {
        return this.color;
    }

    public int getColor(int i) {
        return i == 0 ? this.color : 0xFFFFFF;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(Items.BUCKET);
    }
}