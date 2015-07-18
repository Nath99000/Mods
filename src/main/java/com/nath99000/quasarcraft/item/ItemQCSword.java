package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemQCSword extends ItemSword {

    public ItemQCSword(String QCSword, ToolMaterial WQUASAR) {
        super(WQUASAR);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(QCSword);
        this.setTextureName(Reference.Id + ":" + QCSword);
    }


}

