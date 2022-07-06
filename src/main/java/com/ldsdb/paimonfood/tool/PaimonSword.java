package com.ldsdb.paimonfood.tool;

import com.ldsdb.paimonfood.tab.PaiMonFoodTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class PaimonSword extends SwordItem {
    public PaimonSword(){
        super(ToolTier.paimonTier, 4, -1.6F, new Item.Properties().tab(PaiMonFoodTab.ITEM_TAB));
    }
}
