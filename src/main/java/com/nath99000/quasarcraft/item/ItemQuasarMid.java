package com.nath99000.quasarcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Nathan on 11/7/2015.
 */
public class ItemQuasarMid extends ItemBase
{
    public ItemQuasarMid()

    {
        super();
        this.setUnlocalizedName("QuasarMid");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Somewhat stronger...");
        }
    }
}
