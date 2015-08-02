package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemChorusFruit extends ItemQCFood{
    public ItemChorusFruit(){
        super(4, 0.6f);
        this.setUnlocalizedName("ChorusFruit");
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        world.createExplosion(player, player.posX, player.posY - 1, player.posZ, 5.0f, false);
    }
}
