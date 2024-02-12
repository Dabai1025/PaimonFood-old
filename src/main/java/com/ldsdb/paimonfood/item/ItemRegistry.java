package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    public static final RegistryObject<Item> FOOD_PAIMON = ITEMS.register("paimon", FoodPaimon::new);
    public static RegistryObject<Item> PAIMON_SWORD = ITEMS.register("paimon_sword", PaimonSword::new);
}