package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import java.util.List;

/**
 * Created by Nathan on 15/7/2015.
 */
public class ItemTrailMix extends ItemQCFood
{

    private boolean isDrink = false;

    public ItemTrailMix() {
        super(10, 1.0f);
        setAlwaysEdible();
        setPotionEffect(Potion.regeneration.id, 20, 0, 1.0F);
        setUnlocalizedName("TrailMix");
    }



}
