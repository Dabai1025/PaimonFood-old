package com.ldsdb.paimon;

import com.ldsdb.paimon.Food.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Group extends ItemGroup {
    public Group() {
        super("paimon_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Registry.FoodPaiMon.get());
    }
}
