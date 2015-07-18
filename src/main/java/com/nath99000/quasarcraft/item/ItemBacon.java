package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import java.util.List;

public class ItemBacon extends ItemQCFood

    {
        private boolean isDrink = true;

        public ItemBacon() {
        super(5, 0.6f);
        setAlwaysEdible();
        setUnlocalizedName("Bacon");
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Bacon!");
        }
    }
}
