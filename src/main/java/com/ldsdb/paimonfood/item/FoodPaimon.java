package com.ldsdb.paimonfood.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodPaimon extends Item {
    private static final Food food = (new Food.Builder())
            .nutrition(2)
            .saturationMod(0.2F)
            .alwaysEat()
            .effect(new EffectInstance(Effects.SATURATION, 20, 1), 0.1F)
            .build();
    public FoodPaimon() {
        super(new Properties().food(food).tab(Group.GROUP));
    }
}

