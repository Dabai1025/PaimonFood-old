package com.ldsdb.paimonfood.Food;

import com.ldsdb.paimonfood.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> FoodPaimon = ITEMS.register("paimon", com.ldsdb.paimonfood.Food.FoodPaimon::new);
}
