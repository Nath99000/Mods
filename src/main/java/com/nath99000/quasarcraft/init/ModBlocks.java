package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockBase MiniQuasarBlock = new MiniQuasarBlock();
    public static final BlockBase EnderQuasarBlock = new EnderQuasarBlock();
    public static final BlockBase MiniQuasarPillar = new MiniQuasarPillar();
    public static final BlockBase EnderQuasarPillar = new EnderQuasarPillar();

    public static void init()
    {
        GameRegistry.registerBlock(MiniQuasarBlock, "MiniQuasarBlock");
        GameRegistry.registerBlock(EnderQuasarBlock, "EnderQuasarBlock");
        GameRegistry.registerBlock(MiniQuasarPillar, "MiniQuasarPillar");
        GameRegistry.registerBlock(EnderQuasarPillar, "EnderQuasarPillar");
    }
}
