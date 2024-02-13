package com.ldsdb.paimonfood.loot;

import com.ldsdb.paimonfood.util.Reference;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LootModifierRegistry {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, Reference.MOD_ID);
    public static final RegistryObject<FishingLootModifier.Serializer> FISHING = GLM.register("fishing", FishingLootModifier.Serializer::new);
}