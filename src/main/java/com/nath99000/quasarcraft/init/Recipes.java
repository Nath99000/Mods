package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.entity.ModEntity;
import com.nath99000.quasarcraft.item.ItemProtMQuasar;
import com.nath99000.quasarcraft.item.ItemQuasarBlaze;
import com.nath99000.quasarcraft.quasarcraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.nath99000.quasarcraft.item.ItemMiniStar;
import com.nath99000.quasarcraft.init.ModItems;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Recipes {
    public static HashMap entityEggs = new LinkedHashMap();

    public static void init() {
        //Initial release
        GameRegistry.addRecipe(new ItemStack(ModItems.Quasar), "BMB", "MDM", "BMB", 'B', new ItemStack(Items.blaze_powder), 'M', new ItemStack(ModItems.MiniStar), 'D', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.MiniStar), "BGB", "GNG", "BGB", 'B', new ItemStack(Items.blaze_powder), 'G', new ItemStack(Items.glowstone_dust), 'N', new ItemStack(Items.gold_nugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.QuasarEnder, 16), "ESE", "SYS", "ESE", 'E', new ItemStack(Items.ender_pearl), 'S', new ItemStack(Items.ender_eye), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.ProtQuasar, 4), " Q ", "QYQ", " Q ", 'Q', new ItemStack(Items.diamond), 'Y', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QHelm), "QQQ", "Q Q", "   ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QBoot), "   ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QChest), "Q Q", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QLegs), "QQQ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtQuasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.Quasar));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.MiniQuasarPillar, 8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.Quasar));
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
        GameRegistry.addRecipe(new ItemStack(ModItems.DigitalWatch), " C ", "RDR", "L L", 'C', new ItemStack(Items.clock), 'R', new ItemStack(Items.repeater), 'D', new ItemStack(Items.redstone), 'L', new ItemStack(Items.leather));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.EEDust, 2), new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust));
        GameRegistry.addSmelting(Blocks.stone, new ItemStack(ModItems.Lava), 0.1F);
        GameRegistry.addSmelting(Blocks.leaves, new ItemStack(ModItems.Water, 3), 0.1F);
        GameRegistry.addSmelting(Blocks.leaves2, new ItemStack(ModItems.Water, 3), 0.1F);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(Items.emerald), new ItemStack(ModItems.EEDust));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald), new ItemStack(Items.diamond), new ItemStack(ModItems.EEDust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Monolith), new ItemStack(Blocks.obsidian), new ItemStack(Items.diamond), new ItemStack(ModItems.StarDust));
        GameRegistry.addRecipe(new ItemStack(ModItems.QSBoots), "   ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtSQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QSLegs), "QQQ", "Q Q", "Q Q", 'Q', new ItemStack(ModItems.ProtSQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QSChest), "Q Q", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.ProtSQuasar));
        GameRegistry.addRecipe(new ItemStack(ModItems.QSHelm), "   ", "QQQ", "Q Q", 'Q', new ItemStack(ModItems.ProtSQuasar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Minerals), new ItemStack(Items.emerald), new ItemStack(ModItems.RedCrystal), new ItemStack(ModItems.Uranium), new ItemStack(Blocks.iron_ore), new ItemStack(Blocks.gold_ore), new ItemStack(Blocks.lapis_ore), new ItemStack(Items.coal), new ItemStack(Items.diamond), new ItemStack(Blocks.stone));
        GameRegistry.addRecipe(new ItemStack(ModItems.Village), "SPS", "LCL", "CCC", 'S', new ItemStack(Blocks.oak_stairs), 'P', new ItemStack(Blocks.planks), 'L', new ItemStack(Blocks.log), 'C', new ItemStack(Blocks.cobblestone));
        GameRegistry.addRecipe(new ItemStack(ModItems.Miner), "IPI", "RQL", "III", 'I', new ItemStack(Items.iron_ingot), 'P', new ItemStack(Blocks.sticky_piston), 'R', new ItemStack(Items.repeater), 'Q', new ItemStack(ModItems.QuasarPickaxe), 'L', new ItemStack(Blocks.lever), 'I', new ItemStack(Items.iron_ingot));
        GameRegistry.addRecipe(new ItemStack(Blocks.end_portal_frame), "BSB", "SES", "BSB", 'B', new ItemStack(Blocks.obsidian), 'S', new ItemStack(Blocks.end_stone), 'E', new ItemStack(Items.ender_eye));
        GameRegistry.addRecipe(new ItemStack(Blocks.end_portal), "EPE", "P P", "EPE", 'E', new ItemStack(Items.ender_eye), 'P', new ItemStack(Blocks.end_portal_frame));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Mobs), new ItemStack(Items.porkchop), new ItemStack(Items.gunpowder), new ItemStack(Items.ender_pearl), new ItemStack(Items.beef), new ItemStack(Blocks.wool), new ItemStack(Items.rotten_flesh), new ItemStack(Items.feather), new ItemStack(Items.bone), new ItemStack(Items.spider_eye));
        GameRegistry.addSmelting(Items.coal, new ItemStack(ModItems.Carbon), 0.2F);
        GameRegistry.addRecipe(new ItemStack(ModItems.Nature), "GSG", "SWS", "GSG", 'G', new ItemStack(Blocks.grass), 'S', new ItemStack(Items.wheat_seeds), 'W', new ItemStack(ModItems.Water));
        GameRegistry.addRecipe(new ItemStack(ModItems.CropCircle), "WWW", "W W", "WWW", 'W', new ItemStack(Items.wheat));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.NaturePlanet), new ItemStack(ModItems.Monolith), new ItemStack(ModItems.Village), new ItemStack(ModItems.Mobs), new ItemStack(ModItems.Nature), new ItemStack(ModItems.Water), new ItemStack(ModItems.Rock), new ItemStack(ModItems.CropCircle), new ItemStack(ModItems.MiniPlanet), new ItemStack(ModItems.Water));
        GameRegistry.addRecipe(new ItemStack(ModItems.Core), "DED", "EGE", "DED", 'D', new ItemStack(Items.diamond), 'E', new ItemStack(Blocks.end_stone), 'G', new ItemStack(ModItems.Galaxy));
        GameRegistry.addRecipe(new ItemStack(ModItems.ToolRetriever), "IIC", "  B", "  B", 'I', new ItemStack(Blocks.end_stone), 'C', new ItemStack(ModItems.Core), 'B', new ItemStack(ModItems.Rod));
        GameRegistry.addRecipe(new ItemStack(ModItems.SQuasarSword), " Q ", " Q ", " E ", 'Q', new ItemStack(ModItems.QuasarHigh), 'E', new ItemStack(ModItems.Rod));
        GameRegistry.addRecipe(new ItemStack(ModItems.SQuasarPickaxe), "QQQ", " E ", " E ", 'Q', new ItemStack(ModItems.QuasarHigh), 'E', new ItemStack(ModItems.Rod));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.end_stone, 2), new ItemStack(Blocks.end_stone), new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.EEDust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.MiningPlanet), new ItemStack(ModItems.Minerals), new ItemStack(ModItems.Miner), new ItemStack(ModItems.Lava), new ItemStack(ModItems.Lava), new ItemStack(ModItems.Carbon), new ItemStack(ModItems.Rock), new ItemStack(ModItems.Nature), new ItemStack(ModItems.MiniPlanet), new ItemStack(ModItems.Water));
        GameRegistry.addRecipe(new ItemStack(ModItems.Rod), " E ", " B ", " B ", 'E', new ItemStack(Blocks.end_stone), 'B', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.HighQuasarBlock), "QQQ", "QQQ", "QQQ", 'Q', new ItemStack(ModItems.QuasarHigh));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.HighQuasarPillar, 8), "SSS", "SQS", "SSS", 'S', new ItemStack(Blocks.stone), 'Q', new ItemStack(ModItems.QuasarHigh));
        GameRegistry.addRecipe(new ItemStack(ModItems.DarkMatter), "NDN", "DND", "NDN", 'N', new ItemStack(ModItems.NebulousGas), 'D', new ItemStack(Items.diamond));
        //1.3 release
        GameRegistry.addRecipe(new ItemStack(ModItems.Universe), "GGG", "GQG", "GGG", 'G', new ItemStack(ModItems.Galaxy), 'Q', new ItemStack(ModItems.QuasarHigh));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DeadQuasar), new ItemStack(ModItems.QuasarHigh), new ItemStack(ModItems.Universe));
        //this is the recipe for veritas's spawn egg, as long as there are no other entities registered under this Id.the dynamic entity variable will eventually be changed to a config variable, so that it will work no matter what entities are registered.
        GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 94547), "GGG", "UEU", "GGG", 'U', new ItemStack(ModItems.Universe), 'G', new ItemStack(ModItems.Galaxy), 'E', new ItemStack(Blocks.dragon_egg));
        Blocks.dragon_egg.setCreativeTab(CreativeTabQC.QC_TAB);
        GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg), "ENE", "NGN", "ENE", 'E', new ItemStack(Blocks.obsidian), 'N', new ItemStack(Items.nether_star), 'G', new ItemStack(Items.egg));
        GameRegistry.addRecipe(new ItemStack(ModItems.HellRod), " GB", " OG", "G  ", 'B', new ItemStack(ModItems.QuasarBlaze), 'G', new ItemStack(Items.gold_ingot), 'O', new ItemStack(ModItems.Rod));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.QuasarXR), new ItemStack(ModItems.DeadQuasar), new ItemStack(ModItems.Reality));
        GameRegistry.addRecipe(new ItemStack(ModItems.RealityBow), " OR", "U R", " OR", 'O', new ItemStack(ModItems.Rod), 'R', new ItemStack(ModItems.Reality), 'U', new ItemStack(ModItems.Universe));
        GameRegistry.addRecipe(new ItemStack(ModItems.XRSword), " X ", " X ", " R ", 'X', new ItemStack(ModItems.QuasarXR), 'R', new ItemStack(ModItems.Rod));
        GameRegistry.addRecipe(new ItemStack(ModItems.XRBoots), "   ", "X X", "X X", 'X', new ItemStack(ModItems.QuasarXR));
        GameRegistry.addRecipe(new ItemStack(ModItems.XRChest), "X X", "XXX", "XXX", 'X', new ItemStack(ModItems.QuasarXR));
        GameRegistry.addRecipe(new ItemStack(ModItems.XRLegs), "XXX", "X X", "X X", 'X', new ItemStack(ModItems.QuasarXR));
        GameRegistry.addRecipe(new ItemStack(ModItems.XRHelm), "XXX", "X X", "   ", 'X', new ItemStack(ModItems.QuasarXR));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.EnderDust), new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ChorusFrut), new ItemStack(Items.apple), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust), new ItemStack(ModItems.EnderDust));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.XRBlock), "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.QuasarXR));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Reality), "materialRealityThreadFALSE"));
    }
}
