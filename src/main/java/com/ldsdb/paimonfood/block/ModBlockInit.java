package com.ldsdb.paimonfood.block;

import com.ldsdb.paimonfood.PaimonFood;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PaimonFood.MODID);
    public static final RegistryObject<Block> PAIMON_BLOCK = ModBlockInit.BLOCKS.register("paimonfood_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

}
