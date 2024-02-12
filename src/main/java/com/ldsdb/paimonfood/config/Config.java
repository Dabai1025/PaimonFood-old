package com.ldsdb.paimonfood.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_FISHING_LOOT_MODIFIER;
    public static final ForgeConfigSpec SPEC;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("general");
        ENABLE_FISHING_LOOT_MODIFIER = builder
                .comment("Is paimon a fish?")
                .define("enableFishingLootModifier", true);
        builder.pop();

        SPEC = builder.build();
    }
}
