package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.quasarcraft;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemQuasarBlaze extends ItemBase {
    public ItemQuasarBlaze() {
        super();
        this.setUnlocalizedName("QuasarBlaze");
        this.setMaxDamage(50);
        this.maxStackSize = 1;
    }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {


        if(player.getCurrentEquippedItem() != null){
            ItemStack currentItem = player.getCurrentEquippedItem();
            if(currentItem.getItem() == ModItems.QuasarBlaze){
                player.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 100, 1)));
            }

        }
        return true;
    }

        public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
        {
            {
                par3.add("Quite hot to the touch");
            }
        }
    }


