package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.Utils;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> PaimonFoodItem = ITEMS.register("paimonfood_item", PaimonFoodItem::new);
    public static final RegistryObject<Item> PAIMON_SWORD = ITEMS.register("paimon_sword", PaimonSword::new);
}