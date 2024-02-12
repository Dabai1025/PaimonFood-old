package com.ldsdb.paimonfood.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tab {
    public static final String NAMETAB = "paimonfoodtab";

    public static final CreativeModeTab ITEM_TAB = new CreativeModeTab(NAMETAB) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.FOOD_PAIMON.get());
        }
    };
}
