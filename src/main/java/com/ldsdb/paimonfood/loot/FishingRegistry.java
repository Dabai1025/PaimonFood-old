package com.ldsdb.paimonfood.loot;

import com.ldsdb.paimonfood.Utils;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FishingRegistry {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, Utils.MOD_ID);
    public static final RegistryObject<Fishing.Serializer> fishing = GLM.register("fishing", Fishing.Serializer::new);
}