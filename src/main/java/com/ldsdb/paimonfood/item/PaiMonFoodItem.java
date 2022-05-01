package com.ldsdb.paimonfood.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class PaiMonFoodItem extends Item {
    public PaiMonFoodItem() {
        super(new Properties().food(Food.FoodPaiMon).tab(CreativeModeTab.TAB_FOOD));
    }
}
