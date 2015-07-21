package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.item.ItemStack;

public class ItemMonolith extends ItemBase
{
    public ItemMonolith(){
        super();
        this.setUnlocalizedName("Monolith");
    }
    @Override
    public boolean hasEffect(ItemStack itemstack, int pass) {
        return true;
    }
}
