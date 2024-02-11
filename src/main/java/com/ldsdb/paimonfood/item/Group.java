package com.ldsdb.paimonfood.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Group extends ItemGroup {
    public static final ItemGroup GROUP = new Group();

    public Group() {
        super("paimonfood_group");
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.FOOD_PAIMON.get());
    }
}
