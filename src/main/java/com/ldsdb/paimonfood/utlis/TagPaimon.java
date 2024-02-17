package com.ldsdb.paimonfood.utlis;


import com.ldsdb.paimonfood.PaimonFood;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagPaimon {
    public static class Blocks {
        public static final TagKey<Block> PAIMON = tag();

        private static TagKey<Block> tag(){
            return BlockTags.create(new ResourceLocation(PaimonFood.MODID, "paimon"));
        }
    }
}
