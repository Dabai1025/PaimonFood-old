package com.ldsdb.paimonfood;

import com.ldsdb.paimonfood.Food.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Group extends ItemGroup {
    public Group() {
        super("paimonfood_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Registry.FoodPaimon.get());
    }
}
