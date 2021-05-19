package com.ldsdb.paimon.Food;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "paimon");
    public static final RegistryObject<Item> FoodPaiMon = ITEMS.register("paimon", FoodPaiMon::new);
}
