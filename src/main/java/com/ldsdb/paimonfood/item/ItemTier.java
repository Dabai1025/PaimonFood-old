package com.ldsdb.paimonfood.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemTier {
    public static final ForgeTier PAIMON = new ForgeTier(3, 500, 10.0F, 15.0F, 30,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.DIAMOND));
}