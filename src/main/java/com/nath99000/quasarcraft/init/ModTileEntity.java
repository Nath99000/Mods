package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.block.TileEntity.CrateTileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntity {
    public void RegisterTileEntity(){

    }


    public static void init(){
    GameRegistry.registerTileEntity(CrateTileEntity.class, CrateTileEntity.publicName);
    }

}
