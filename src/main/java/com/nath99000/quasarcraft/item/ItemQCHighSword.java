package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemQCHighSword extends ItemSword{

        public ItemQCHighSword(String QCHighSword, ToolMaterial SQUASAR) {
            super(SQUASAR);
            this.setCreativeTab(CreativeTabQC.QC_TAB);
            this.setUnlocalizedName(QCHighSword);
            this.setTextureName(Reference.Id + ":" + QCHighSword);
        }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (player.getCurrentEquippedItem() != null) {
            ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem.getItem() == ModItems.SQuasarSword) {
                player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 100, 3)));
                player.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 100, 3)));
                player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 100, 3)));
            }

        }
        return true;
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("KATANA-DESU!!!!");
        }
    }
}
