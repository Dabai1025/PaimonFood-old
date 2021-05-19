package com.ldsdb.paimon;

import com.ldsdb.paimon.Food.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PaiMon.MOD_ID)
public class PaiMon
{
    public static final String MOD_ID = "paimon";

    private static final Logger LOGGER = LogManager.getLogger();

    public PaiMon() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
        Registry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello Teacon 2021");
    }
}
