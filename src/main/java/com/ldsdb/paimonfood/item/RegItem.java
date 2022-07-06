package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.Utils;
import com.ldsdb.paimonfood.tool.PaimonSword;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> PaiMonFoodItem = ITEMS.register("paimonfood_item", PaiMonFoodItem::new);
    public static final DeferredRegister<Item> ITEMS_SWORD = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> PaiMonSward = ITEMS_SWORD.register("paimon_sword", ()->{
        return new PaimonSword();
    });
}
