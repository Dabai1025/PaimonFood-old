package com.ldsdb.paimonfood.tab;

import com.ldsdb.paimonfood.PaimonFood;
import com.ldsdb.paimonfood.item.ModItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabPaimonFood {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaimonFood.MODID);
    public static final RegistryObject<CreativeModeTab> PAIMONFOOD_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemInit.PAIMONFOOD_ITEM.get())).title(Component.translatable("creativetab.paimonfood_tab"))
            .icon(() -> ModItemInit.PAIMONFOOD_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItemInit.PAIMONFOOD_ITEM.get());
                output.accept(ModItemInit.PAIMONFOOD_BLOCK.get());
                output.accept(ModItemInit.PAIMON_SWORD.get());
            }).build());
}
