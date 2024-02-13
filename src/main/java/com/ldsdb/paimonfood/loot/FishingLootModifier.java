package com.ldsdb.paimonfood.loot;

import com.google.gson.JsonObject;
import com.ldsdb.paimonfood.config.Config;
import com.ldsdb.paimonfood.util.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class FishingLootModifier extends LootModifier {
    protected FishingLootModifier(LootItemCondition[] conditionsIn) {
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
        public FishingLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            return new FishingLootModifier(ailootcondition);
        }

        @Override
        public JsonObject write(FishingLootModifier instance) {
            return makeConditions(instance.conditions);
        }
    }
}
