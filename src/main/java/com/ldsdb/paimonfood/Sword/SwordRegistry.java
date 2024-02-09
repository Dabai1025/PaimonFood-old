package com.ldsdb.paimonfood.Sword;

import com.ldsdb.paimonfood.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SwordRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static RegistryObject<Item> paimonSword = ITEMS.register("paimon_sword", PaimonSword::new);

}
