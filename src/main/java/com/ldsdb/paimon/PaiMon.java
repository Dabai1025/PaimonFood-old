package com.ldsdb.paimon;

import com.ldsdb.paimon.Block.BlockRegistry;
import com.ldsdb.paimon.Block.ItemRegistry;
import com.ldsdb.paimon.Food.Registry;
import com.ldsdb.paimon.Sword.SwordRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class PaiMon
{
    public PaiMon() {
        MinecraftForge.EVENT_BUS.register(this);
        Registry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SwordRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
