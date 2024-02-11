package com.ldsdb.paimonfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Food {
    public static final FoodProperties FoodPaimon = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.2F).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.SATURATION, 20, 1), 0.1F)
            .build();
}
