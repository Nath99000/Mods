package com.nath99000.quasarcraft.block.TileEntity;

import com.nath99000.quasarcraft.reference.Reference;
import com.nath99000.quasarcraft.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class CrateTileEntity extends TileEntity {
int tick = 0;
    public static final String publicName = "CrateEntity";
    private String name = "CrateEntity";

    public String getName() {

        return name;

    }


    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {

            tick++;
            if (tick == 100) {

                this.worldObj.setWorldTime(1000);
                tick = 0;
                LogHelper.info("Pulse.");
            }
        }
    }
}