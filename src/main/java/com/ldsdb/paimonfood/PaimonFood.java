package com.ldsdb.paimonfood;

import com.ldsdb.paimonfood.Block.BlockRegistry;
import com.ldsdb.paimonfood.Block.ItemRegistry;
import com.ldsdb.paimonfood.Food.Registry;
import com.ldsdb.paimonfood.Sword.SwordRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class PaimonFood
{
    public PaimonFood() {
        MinecraftForge.EVENT_BUS.register(this);
        Registry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SwordRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
