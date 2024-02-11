package com.ldsdb.paimonfood.tab;

import com.ldsdb.paimonfood.item.RegItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PaimonFoodTab {
    public static final String NAMETAB = "paimonfoodtab";

    public static final CreativeModeTab ITEM_TAB = new CreativeModeTab(NAMETAB) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegItem.PaimonFoodItem.get());
        }
    };
}
