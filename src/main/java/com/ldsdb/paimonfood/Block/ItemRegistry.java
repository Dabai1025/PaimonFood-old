package com.ldsdb.paimonfood.Block;

import com.ldsdb.paimonfood.Utils;
import com.ldsdb.paimonfood.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> paimonBlock = ITEMS.register("paimon_block", () -> new BlockItem(BlockRegistry.paimonBlock.get(), new Item.Properties().tab(ModGroup.itemGroup)));

}