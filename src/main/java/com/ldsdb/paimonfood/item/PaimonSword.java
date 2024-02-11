package com.ldsdb.paimonfood.item;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class PaimonSword extends SwordItem {
    public PaimonSword() {
        super(ItemTier.PAIMON, 3, -2.4F, new Item.Properties().tab(Group.GROUP));
    }
}
