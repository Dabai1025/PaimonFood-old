package com.ldsdb.paimonfood.loot;

import com.google.gson.JsonObject;
import com.ldsdb.paimonfood.Utils;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class Fishing extends LootModifier {
    protected Fishing(ILootCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if (context.getRandom().nextFloat() < 0.1) {
            generatedLoot.clear();
            generatedLoot.add(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Utils.MOD_ID + ":paimon")), 1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<Fishing> {
        @Override
        public Fishing read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            return new Fishing(ailootcondition);
        }

        @Override
        public JsonObject write(Fishing instance) {
            return makeConditions(instance.conditions);
        }
    }
}
