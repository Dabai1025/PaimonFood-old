package com.ldsdb.paimonfood.item;

import com.ldsdb.paimonfood.tab.PaimonFoodTab;
import net.minecraft.world.item.Item;


public class PaimonFoodItem extends Item {
    public PaimonFoodItem() {
        super(new Properties().food(Food.FoodPaimon).tab(PaimonFoodTab.ITEM_TAB));
    }
}
