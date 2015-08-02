package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHellRod extends ItemBase{
    public ItemHellRod(){
        super();
        this.setUnlocalizedName("HellRod");
        this.setMaxDamage(25);
    }
    //entityplayer.removePotionEffect(Id);
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {


        if(player.getCurrentEquippedItem() != null){
            ItemStack currentItem = player.getCurrentEquippedItem();
            if(currentItem.getItem() == ModItems.HellRod){
                player.removePotionEffect(20);
                par1ItemStack.damageItem(1, player);
                player.setFire(5);
            }

        }
        return true;
    }
}
