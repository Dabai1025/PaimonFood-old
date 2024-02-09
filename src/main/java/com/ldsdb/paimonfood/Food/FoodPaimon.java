package com.ldsdb.paimonfood.Food;

import com.ldsdb.paimonfood.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodPaimon extends Item
{
    private static final Food food = (new Food.Builder())
            .saturationMod(1)
            .effect(new EffectInstance(Effects.SATURATION, 20, 1), 0.5f)
            .nutrition(1)
            .build();
    public FoodPaimon() {
        super(new Properties().food(food).tab(ModGroup.itemGroup));
    }
}

