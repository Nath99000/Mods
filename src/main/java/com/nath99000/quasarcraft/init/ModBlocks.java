package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final BlockBase MiniQuasarBlock = new MiniQuasarBlock();
    public static final BlockBase EnderQuasarBlock = new EnderQuasarBlock();
    public static final BlockBase MiniQuasarPillar = new MiniQuasarPillar();
    public static final BlockBase EnderQuasarPillar = new EnderQuasarPillar();
    public static final BlockBase BlazeQuasarBlock = new BlazeQuasarBlock();
    public static final BlockBase BlazeQuasarPillar = new BlazeQuasarPillar();
    public static final BlockBase MidQuasarBlock = new MidQuasarBlock();
    public static final BlockBase MidQuasarPillar = new MidQuasarPillar();
   // public static Fluid Galaxis;
    //public static final BlockBase AdvancedCrafter = new AdvancedCrafter();
    //public static final ConnectedTextures DecoBlock = new DecoBlock();
    public static final BlockBase SpatialFrame = new SpatialFrame();
    public static final BlockBase SpiceOre = new SpiceOre();
    public static final BlockBase UraniumOre = new UraniumOre();
    public static final BlockBase UraniumBlock = new BlockUranium();







    public static void init()
    {
        GameRegistry.registerBlock(MiniQuasarBlock, "MiniQuasarBlock");
        GameRegistry.registerBlock(EnderQuasarBlock, "EnderQuasarBlock");
        GameRegistry.registerBlock(MiniQuasarPillar, "MiniQuasarPillar");
        GameRegistry.registerBlock(EnderQuasarPillar, "EnderQuasarPillar");
        GameRegistry.registerBlock(BlazeQuasarBlock, "BlazeQuasarBlock");
        GameRegistry.registerBlock(BlazeQuasarPillar, "BlazeQuasarPillar");
        GameRegistry.registerBlock(MidQuasarBlock, "MidQuasarBlock");
        GameRegistry.registerBlock(MidQuasarPillar, "MidQuasarPillar");
      //  FluidRegistry.registerFluid(Galaxis);
        //GameRegistry.registerBlock(AdvancedCrafter, "AdvancedCrafter");
        //GameRegistry.registerBlock(DecoBlock, "DecoBlock");
        GameRegistry.registerBlock(SpatialFrame, "SpatialFrame");
        GameRegistry.registerBlock(SpiceOre, "SpiceOre");
        GameRegistry.registerBlock(UraniumOre, "UraniumOre");
        GameRegistry.registerBlock(UraniumBlock, "UraniumBlock");

    }
}
