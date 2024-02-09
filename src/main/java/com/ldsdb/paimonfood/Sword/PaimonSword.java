package com.ldsdb.paimonfood.Sword;

import com.ldsdb.paimonfood.group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class PaimonSword extends SwordItem {
    public PaimonSword() {
        super(ItemTier.PAIMON, 3, -2.4F, new Item.Properties().tab(ModGroup.itemGroup));
    }
}
