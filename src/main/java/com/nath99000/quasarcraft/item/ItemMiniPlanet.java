package com.nath99000.quasarcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;

public class ItemMiniPlanet extends ItemBase
{
    public ItemMiniPlanet()

    {
        super();
        this.setUnlocalizedName("MiniPlanet");
    }


        public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
        {
            {
                par3.add("Maybe it could be changed somehow...");
            }
        }

}
