package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemPGGB extends ItemQCFood

{
    private boolean isDrink = true;

    public ItemPGGB() {
        super(Reference.FOOD_AMBROSIA_HEAL, 0.6f);
        setAlwaysEdible();
        setPotionEffect(Potion.confusion.id, 10, 0, 1.0F);
        setUnlocalizedName("PGGB");
    }

    @Override
    public boolean hasEffect(ItemStack itemstack, int pass) {
        return true;
    }


    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("So long and thanks for all the fish!");
        }
    }

}



