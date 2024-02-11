package com.ldsdb.paimonfood.loot;

import com.google.gson.JsonObject;
import com.ldsdb.paimonfood.config.Config;
import com.ldsdb.paimonfood.util.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class FishingLootModifier extends LootModifier {
    protected FishingLootModifier(ILootCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if (context.getRandom().nextFloat() < 0.1 && Config.ENABLE_FISHING_LOOT_MODIFIER.get()) {
            generatedLoot.clear();
            generatedLoot.add(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Reference.MOD_ID + ":paimon")), 1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<FishingLootModifier> {
        @Override
        public FishingLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            return new FishingLootModifier(ailootcondition);
        }

        @Override
        public JsonObject write(FishingLootModifier instance) {
            return makeConditions(instance.conditions);
        }
    }
}
