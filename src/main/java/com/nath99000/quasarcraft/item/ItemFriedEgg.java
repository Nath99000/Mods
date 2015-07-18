package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemFriedEgg extends ItemQCFood
{
    private boolean isDrink = false;

    public ItemFriedEgg() {
        super(4, 0.6f);
        setUnlocalizedName("FriedEgg");
    }
}
