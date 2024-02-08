package com.ldsdb.paimon.Sword;

import com.ldsdb.paimon.group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class PaiMonSword extends SwordItem {
    public PaiMonSword() {
        super(ItemTier.PAIMON, 3, -2.4F, new Item.Properties().tab(ModGroup.itemGroup));
    }
}
