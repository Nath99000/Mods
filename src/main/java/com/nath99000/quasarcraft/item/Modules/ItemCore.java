package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemCore extends ItemBase{
    public ItemCore(){
        super();
        this.setUnlocalizedName("Core");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("832-097");
        }
    }
}
