package com.nath99000.quasarcraft.item.Spice;

import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemGSpice extends ItemBase
{
    public ItemGSpice()

    {
        super();
        this.setUnlocalizedName("GSpice");
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Expensive!");
        }
    }
    @Override
    public boolean hasEffect(ItemStack itemstack, int pass) {
        return true;
    }


}

