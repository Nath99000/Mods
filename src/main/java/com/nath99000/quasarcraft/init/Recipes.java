package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.quasarcraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.nath99000.quasarcraft.item.ItemMiniStar;
import com.nath99000.quasarcraft.init.ModItems;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.Quasar), "BMB","MDM", "BMB", 'B', new ItemStack(Items.blaze_powder), 'M', new ItemStack(ModItems.MiniStar), 'D', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.MiniStar), "BGB", "GNG", "BGB", 'B', new ItemStack(Items.blaze_powder), 'G', new ItemStack(Items.glowstone_dust), 'N', new ItemStack(Items.gold_nugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarEnder, 16), "ESE", "SYS", "ESE", 'E', new ItemStack(Items.ender_pearl), 'S', new ItemStack(Items.ender_eye), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtQuasar,4), " Q ", "QYQ", " Q ", 'Q', new ItemStack(Items.quartz), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QHelm), "QQQ", "Q Q", "   ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QBoot), "   ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QChest), "Q Q", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QLegs), "QQQ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarPillar,8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.EnderQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.QuasarEnder));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.EnderQuasarPillar,8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.QuasarEnder));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Rock, 9), new ItemStack(Blocks.cobblestone));
        GameRegistry.addRecipe(new ItemStack(ModItems.MiniPlanet), "RDR", "CSC", "RDR", 'R', new ItemStack(Items.redstone), 'D', new ItemStack(Blocks.dirt), 'C', new ItemStack(Items.coal), 'S', new ItemStack(ModItems.Rock));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarSword), " Q ", " Q ", " O ", 'Q', new ItemStack(ModItems.Quasar), 'O', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarPickaxe), "QQQ", " O ", " O ", 'Q', new ItemStack(ModItems.Quasar), 'O', new ItemStack(Blocks.obsidian));
    }
}
