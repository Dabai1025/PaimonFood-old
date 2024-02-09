package com.ldsdb.paimonfood.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PaimonBlock extends Block {
    public PaimonBlock() {
        super(Properties.of(Material.STONE).strength(5));
    }
}
