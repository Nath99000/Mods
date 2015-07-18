package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemSOL extends ItemBase
{
    public ItemSOL()

    {
        super();
        this.setUnlocalizedName("SOL");
        this.maxStackSize = 42;
    }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {


        if(player.getCurrentEquippedItem() != null){
            ItemStack currentItem = player.getCurrentEquippedItem();
            if(currentItem.getItem() == ModItems.SOL){
                player.addPotionEffect((new PotionEffect(Potion.heal.getId(), 1, 1)));
            }

        }
        return true;
    }

    @Override
    public boolean hasEffect(ItemStack itemstack, int pass) {
        return true;
    }



    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Forty-two.");
        }
    }



}

