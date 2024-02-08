package com.ldsdb.paimon.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PaiMonBlock extends Block {
    public PaiMonBlock() {
        super(Properties.of(Material.STONE).strength(5));
    }
}
