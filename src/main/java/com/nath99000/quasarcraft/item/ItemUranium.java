package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.Radiation.RadPoints;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemUranium extends ItemQCFood implements IFuelHandler
{
    public ItemUranium()

    {
        super(1, 0.1f);
        setAlwaysEdible();
        this.setUnlocalizedName("Uranium");
        setPotionEffect(Potion.poison.id, 5, 0, 1.0F);
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4) {
        {
            par3.add("Looks delicious!");
        }
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        player.addExperience(8);
    }

    @Override
    public int getBurnTime(ItemStack fuel) {
        return 2015;
    }
}
