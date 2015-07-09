package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final ItemBase Quasar = new ItemQuasar();
    public static final ItemBase QuasarEnder = new ItemQuasarEnder();
    public static Item.ToolMaterial WQUASAR = EnumHelper.addToolMaterial("WQUASAR", 3, 10000, 12.0F, 3.0F, 22);
    public static ItemArmor.ArmorMaterial AWQUASAR = EnumHelper.addArmorMaterial("AWQUASAR", 10000, new int[]{3, 8, 6, 3}, 25);
    public static final ItemBase MiniStar = new ItemMiniStar();
    public static Item QLegs;
    public static Item QChest;
    public static Item QHelm;
    public static Item QBoot;
    public static final ItemBase ProtQuasar = new ItemProtQuasar();
    public static Item QuasarPickaxe;
    public static Item QuasarSword;
    public static final ItemBase Rock = new ItemRock();
    public static final ItemBase MiniPlanet = new ItemMiniPlanet();
    public static final ItemBase DarkMatter = new ItemDarkMatter();



    public static void  init() {
        GameRegistry.registerItem(Quasar, "Quasar");
        GameRegistry.registerItem(QuasarEnder,"QuasarEnder" );
        GameRegistry.registerItem(MiniStar, "MiniStar");
        GameRegistry.registerItem(QLegs = new ItemQCArmor("WeakQuasarLegs", AWQUASAR, "WeakQuasar", 2), "WeakQuasarLegs");
        GameRegistry.registerItem(QChest = new ItemQCArmor("WeakQuasarChest", AWQUASAR, "WeakQuasar", 1), "WeakQuasarChest");
        GameRegistry.registerItem(QHelm = new ItemQCArmor("WeakQuasarHelm", AWQUASAR, "WeakQuasar", 0), "WeakQuasarHelm");
        GameRegistry.registerItem(QBoot = new ItemQCArmor("WeakQuasarBoots", AWQUASAR, "WeakQuasar", 3), "WeakQuasarBoots");
        GameRegistry.registerItem(ProtQuasar, "ProtQuasar");
        GameRegistry.registerItem(QuasarPickaxe = new ItemQCPickAxe("WeakQuasarPickaxe", WQUASAR), "WeakQuasarPick");
        GameRegistry.registerItem(QuasarSword = new ItemQCSword("WeakQuasarSword", WQUASAR), "WeakQuasarSword");
        GameRegistry.registerItem(Rock, "Rock");
        GameRegistry.registerItem(MiniPlanet, "MiniPlanet");
        GameRegistry.registerItem(DarkMatter, "DarkMatter");
    }
}
