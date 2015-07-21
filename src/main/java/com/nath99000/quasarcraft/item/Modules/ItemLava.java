package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemLava extends ItemBase {
    public ItemLava() {
        super();
        this.setUnlocalizedName("Lava");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Ow... Ow, Ow, OW!");
        }
    }
}
