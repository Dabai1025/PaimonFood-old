package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.tab.PaimonFoodTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class PaimonSword extends SwordItem {
    public PaimonSword() {
        super(ItemTier.PAIMON, 3, -2.4F, new Item.Properties().tab(PaimonFoodTab.ITEM_TAB));
    }
}