package com.ldsdb.paimon.Block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "paimon");
    public static final RegistryObject<Block> paimonBlock = BLOCKS.register("paimon_block", PaiMonBlock::new);
}
