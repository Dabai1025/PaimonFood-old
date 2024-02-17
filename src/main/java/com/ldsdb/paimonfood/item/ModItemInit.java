package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.PaimonFood;
import com.ldsdb.paimonfood.block.ModBlockInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PaimonFood.MODID);
    public static final RegistryObject<Item> PAIMONFOOD_BLOCK = ModItemInit.ITEMS.register("paimonfood_block",
            () -> new BlockItem(ModBlockInit.PAIMON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PAIMONFOOD_ITEM = ITEMS.register("paimonfood_item",
            () -> new Item(new Item.Properties().food(ItemPaimonFood.PAIMONFOOD_ITEM)));
    public static final RegistryObject<Item> PAIMON_SWORD = ITEMS.register("paimon_sword",
            () -> new SwordItem(ItemTier.PAIMON, 8, 2.0f, new  Item.Properties()));
}
