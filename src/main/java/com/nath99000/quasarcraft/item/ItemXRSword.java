package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ItemXRSword extends ItemSword {

    public ItemXRSword(String XRSwordname, Item.ToolMaterial XRQUASAR) {
        super(XRQUASAR);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(XRSwordname);
        this.setTextureName(Reference.Id + ":" + XRSwordname);
    }

    public static int Ench = 1;
    public static int EnchID = 16;
    public static int EnchLvl = 4;
    public static Enchantment EnchString = (Enchantment.sharpness);

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (player.getCurrentEquippedItem() != null) {
            ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem.getItem() == ModItems.XRSword) {
                player.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 50, 4)));
                player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 50, 4)));
                player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 50, 4)));
                if (!par1ItemStack.isItemEnchanted()) {
                    par1ItemStack.addEnchantment(EnchString, EnchLvl);
                    player.addExperience(-5);
                }
            }
        }
        return true;
    }

    public void EnchInt() {
        if (Ench == 1) {
            int EnchID = 16;
            int EnchLvl = 3;
            Enchantment EnchString = (Enchantment.sharpness);
        }
        if (Ench == 2) {
            int EnchId = 17;
            int EnchLvl = 3;
            Enchantment EnchString = (Enchantment.smite);
        }
        if (Ench == 3) {
            int EnchID = 18;
            int EnchLvl = 3;
            Enchantment EnchString = (Enchantment.baneOfArthropods);
        }
        if (Ench == 4) {
            int EnchID = 19;
            int EnchLvl = 3;
            Enchantment EnchString = (Enchantment.knockback);
        }
        if (Ench == 5) {
            int EnchID = 20;
            int EnchLvl = 1;
            Enchantment EnchString = (Enchantment.fireAspect);
        }
        if (Ench == 6) {
            int EnchID = 21;
            int EnchLvl = 4;
            Enchantment EnchString = (Enchantment.looting);
        }
        if (Ench == 7) {
            int EnchID = 34;
            int EnchLvl = 4;
            Enchantment EnchString = (Enchantment.unbreaking);
        }
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4) {
        {
            par3.add("Plasma blade!");
        }
    }
}

