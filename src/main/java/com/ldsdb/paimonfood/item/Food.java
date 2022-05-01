package com.ldsdb.paimonfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Food {
    public static final FoodProperties FoodPaiMon = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8F).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.SATURATION, 100, 2), 0.8F)
            .build();
}
