package com.ldsdb.paimonfood;

import com.ldsdb.paimonfood.block.ModBlockInit;
import com.ldsdb.paimonfood.item.ModItemInit;
import com.ldsdb.paimonfood.tab.TabPaimonFood;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PaimonFood.MODID)
public class PaimonFood
{
    public static final String MODID = "paimonfood";

    public PaimonFood()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlockInit.BLOCKS.register(modEventBus);
        ModItemInit.ITEMS.register(modEventBus);
        TabPaimonFood.CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
//        TODO
    }
}
