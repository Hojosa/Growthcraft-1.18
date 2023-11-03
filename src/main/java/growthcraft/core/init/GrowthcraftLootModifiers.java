package growthcraft.core.init;

import growthcraft.apiary.shared.Reference.UnlocalizedName;
import growthcraft.core.loot.GlobalLootModifier;
import growthcraft.core.shared.Reference;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GrowthcraftLootModifiers {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, Reference.MODID);

    public static final RegistryObject<GlobalLootModifierSerializer<GlobalLootModifier>> GLOBAL_BLOCK_LOOT_MODIFIER =
            LOOT_MODIFIER_SERIALIZERS.register(UnlocalizedName.LOOT_SERIALIZER_BLOCK, GlobalLootModifier.Serializer::new);

    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
