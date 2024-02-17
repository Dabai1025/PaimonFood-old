package com.ldsdb.paimonfood.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ItemPaimonFood {
    public static final FoodProperties PAIMONFOOD_ITEM = new FoodProperties.Builder().nutrition(2).alwaysEat()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 40), 1.0f).build();
}
