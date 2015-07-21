package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.item.ItemStack;

public class ItemMineral extends ItemBase
{
    public ItemMineral(){
        super();
        this.setUnlocalizedName("Minerals");
    }
    @Override
    public boolean hasEffect(ItemStack itemstack, int pass) {
        return true;
    }
}
