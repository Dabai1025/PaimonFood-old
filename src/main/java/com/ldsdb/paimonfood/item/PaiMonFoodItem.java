package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.tab.PaiMonFoodTab;
import net.minecraft.world.item.Item;


public class PaiMonFoodItem extends Item {
    public PaiMonFoodItem() {
        super(new Properties().food(Food.FoodPaiMon).tab(PaiMonFoodTab.ITEM_TAB));
    }
}
