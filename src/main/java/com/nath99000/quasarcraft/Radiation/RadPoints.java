package com.nath99000.quasarcraft.Radiation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldSavedData;

import java.util.concurrent.atomic.AtomicInteger;

public class RadPoints extends WorldSavedData implements IRadpoints
    {
        static int currentRad = 0;
        public RadPoints(String par1Str)
        {
            super(par1Str);
            int currentRad = 0;
        }

        @Override
        public void readFromNBT(NBTTagCompound nbttagcompound)
        {
            int currentRad = nbttagcompound.getInteger("currentRad");

        }

        @Override
        public void writeToNBT(NBTTagCompound nbttagcompound)
        {
            nbttagcompound.setInteger("currentRad", currentRad);

        }
    }