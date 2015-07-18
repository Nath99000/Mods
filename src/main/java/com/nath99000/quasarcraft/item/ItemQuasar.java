package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;

public class ItemQuasar extends ItemBase
{
    public ItemQuasar()

    {
        super();
        this.setUnlocalizedName("Quasar");
    }

        public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
        {
            {
                par3.add("Still weak...");
            }
        }

    }

