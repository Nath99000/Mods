package com.nath99000.quasarcraft.proxy;

import com.nath99000.quasarcraft.block.TileEntity.TileEntityStatue;
import com.nath99000.quasarcraft.init.StatueRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

public class Clientproxy extends Commonproxy
{
public void RegisterRenderThings(){
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, new StatueRenderer());
}
}


