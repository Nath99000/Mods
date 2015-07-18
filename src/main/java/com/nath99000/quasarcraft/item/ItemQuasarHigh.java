package com.nath99000.quasarcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemQuasarHigh extends ItemBase
{
    public ItemQuasarHigh()

    {
        super();
        this.setUnlocalizedName("QuasarHigh");
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Quite strong.");
        }
    }

}
