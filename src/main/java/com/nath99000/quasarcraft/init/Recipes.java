package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.item.ItemProtMQuasar;
import com.nath99000.quasarcraft.item.ItemQuasarBlaze;
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
        //Initial release
        GameRegistry.addRecipe(new ItemStack(ModItems.Quasar), "BMB","MDM", "BMB", 'B', new ItemStack(Items.blaze_powder), 'M', new ItemStack(ModItems.MiniStar), 'D', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.MiniStar), "BGB", "GNG", "BGB", 'B', new ItemStack(Items.blaze_powder), 'G', new ItemStack(Items.glowstone_dust), 'N', new ItemStack(Items.gold_nugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarEnder, 16), "ESE", "SYS", "ESE", 'E', new ItemStack(Items.ender_pearl), 'S', new ItemStack(Items.ender_eye), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtQuasar,4), " Q ", "QYQ", " Q ", 'Q', new ItemStack(Items.diamond), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QHelm), "QQQ", "Q Q", "   ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QBoot), "   ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QChest), "Q Q", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QLegs), "QQQ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarPillar,8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.EnderQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.QuasarEnder));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.EnderQuasarPillar, 8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.QuasarEnder));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Rock, 9), new ItemStack(Blocks.cobblestone));
        GameRegistry.addRecipe(new ItemStack(ModItems.MiniPlanet), "RDR", "CSC", "RDR", 'R', new ItemStack(Items.redstone), 'D', new ItemStack(Blocks.dirt), 'C', new ItemStack(Items.coal), 'S', new ItemStack(ModItems.Rock));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarSword), " Q ", " Q ", " O ", 'Q', new ItemStack(ModItems.Quasar), 'O', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarPickaxe), "QQQ", " O ", " O ", 'Q', new ItemStack(ModItems.Quasar), 'O', new ItemStack(Blocks.obsidian));
        //1.1 release
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StarDust), new ItemStack(ModItems.MiniStar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NebulousGas), new ItemStack(ModItems.StarDust), new ItemStack(Items.glass_bottle));
        GameRegistry.addRecipe(new ItemStack(ModItems.Nebula), "SSS", "SGS", "SSS", 'S', new ItemStack(ModItems.QuasiSun), 'G', new ItemStack(ModItems.NebulousGas));
        GameRegistry.addRecipe(new ItemStack(ModItems.BlazeEssence), "BCB", "CNC", "BCB", 'B', new ItemStack(Items.blaze_powder), 'C', new ItemStack(Items.fire_charge), 'N', new ItemStack(ModItems.Nebula));
        GameRegistry.addRecipe(new ItemStack(ModItems.SolarSystem), "PPP", "PSP", "PPP", 'P', new ItemStack(ModItems.MiniPlanet), 'S', new ItemStack(ModItems.SphereSun));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasiSun), "BGB", "GNG", "BGB", 'B', new ItemStack(Items.blaze_rod), 'G', new ItemStack(Blocks.glowstone), 'N', new ItemStack(ModItems.MiniStar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlazeQuasarBlock), "NNN", "NBN", "NNN", 'N', new ItemStack(Blocks.nether_brick), 'B', new ItemStack(ModItems.QuasarBlaze));
        GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust, 2), "RRR", "RBR", "RRR", 'R', new ItemStack(Items.redstone), 'B', new ItemStack(ModItems.BlazeEssence));
        GameRegistry.addRecipe(new ItemStack(Items.blaze_powder, 2), "GGG", "GBG", "GGG", 'G', new ItemStack(Items.gunpowder), 'B', new ItemStack(ModItems.BlazeEssence));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.BlazeEssence));
        GameRegistry.addRecipe(new ItemStack(ModItems.CelestialSphere), "RGR", "G G", "RGR", 'R', new ItemStack(Blocks.end_stone), 'G', new ItemStack(Blocks.glass));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SphereSun), new ItemStack(ModItems.CelestialSphere), new ItemStack(ModItems.QuasiSun));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarMid), "SNS", "NQN", "SNS", 'S', new ItemStack(ModItems.SolarSystem), 'N', new ItemStack(ModItems.Nebula), 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtMQuasar), " G ", "GYG", " G ", 'G', new ItemStack(Items.gold_ingot), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addSmelting(Items.egg, new ItemStack(ModItems.FriedEgg), 0.1f);
        GameRegistry.addRecipe(new ItemStack(ModItems.Spice), " S ", " G ", " S ", 'S', new ItemStack(Items.nether_star), 'G', new ItemStack(Items.glowstone_dust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.YSpice), new ItemStack(ModItems.Spice), new ItemStack(ModItems.Spice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BSpice), new ItemStack(ModItems.YSpice), new ItemStack(ModItems.YSpice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GSpice), new ItemStack(ModItems.BSpice), new ItemStack(ModItems.BSpice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PSpice), new ItemStack(ModItems.GSpice), new ItemStack(ModItems.GSpice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.XPSpice), new ItemStack(ModItems.PSpice), new ItemStack(ModItems.PSpice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Lemon), new ItemStack(Items.apple), new ItemStack(ModItems.StarDust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PGGB), new ItemStack(Items.glass_bottle), new ItemStack(Items.gold_ingot), new ItemStack(ModItems.Lemon), new ItemStack(ModItems.YSpice));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TrailMix, 7), new ItemStack(ModItems.Spice), new ItemStack(ModItems.YSpice), new ItemStack(ModItems.BSpice), new ItemStack(ModItems.GSpice), new ItemStack(ModItems.PSpice), new ItemStack(ModItems.XPSpice), new ItemStack(Items.sugar, 3));
        //all of this was added on a one hour plane trip. just fyi.
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtMQuasar), " Q ", "QYQ", " Q ", 'Q', new ItemStack(Items.quartz), 'Y', new ItemStack(ModItems.QuasarMid));
        GameRegistry.addRecipe(new ItemStack(ModItems.QMBoot), "   ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtMQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QMLegs), "QQQ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtMQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QMChest), "Q Q", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.ProtMQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QMHelm), "QQQ", "Q Q", "   ", 'Q', new ItemStack(ModItems.ProtMQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.MQuasarPickaxe), "QQQ", " B ", " B ", 'Q', new ItemStack(ModItems.QuasarMid), 'B', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.MQuasarSword), " Q ", " Q ", " B ", 'Q', new ItemStack(ModItems.QuasarMid), 'B', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.Bacon, 4), "PPP", "PSP", "PPP", 'P', new ItemStack(Items.cooked_porkchop), 'S', new ItemStack(ModItems.StarDust));
        //1.2 release
        GameRegistry.addRecipe(new ItemStack(ModItems.Galaxy), "SNS", "NQN", "SNS", 'S', new ItemStack(ModItems.QuasiSun), 'N', new ItemStack(ModItems.Nebula), 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarHigh), "NGN", "GQG", "NGN", 'N', new ItemStack(ModItems.Nebula), 'G', new ItemStack(ModItems.Galaxy), 'Q', new ItemStack(ModItems.QuasarMid));
        GameRegistry.addSmelting(Blocks.redstone_block, new ItemStack(ModItems.RedCrystal), 0.1F);
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtSQuasar), " G ", "GYG", " G ", 'G', new ItemStack(Items.iron_ingot), 'Y', new ItemStack(ModItems.QuasarHigh));
    }
}
