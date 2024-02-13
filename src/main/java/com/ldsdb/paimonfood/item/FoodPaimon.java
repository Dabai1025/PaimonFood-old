package com.ldsdb.paimonfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class FoodPaimon extends Item {
    public static final FoodProperties FOOD_PAIMON = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.2F)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 20, 1), 0.1F)
            .build();
    public FoodPaimon() {
        super(new Properties().food(FoodPaimon.FOOD_PAIMON).tab(Tab.ITEM_TAB));
    }
}