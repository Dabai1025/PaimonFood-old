package com.ldsdb.paimonfood.item;


import com.ldsdb.paimonfood.PaimonFood;
import com.ldsdb.paimonfood.utlis.TagPaimon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ItemTier {
    public static final Tier PAIMON = TierSortingRegistry.registerTier(
            new ForgeTier(4, 300, 3f, 5f, 10,
                    TagPaimon.Blocks.PAIMON, () -> Ingredient.of(ModItemInit.PAIMONFOOD_ITEM.get())),
            new ResourceLocation(PaimonFood.MODID, "paimon"), List.of(Tiers.IRON), List.of());
}