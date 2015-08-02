package com.nath99000.quasarcraft.proxy.RenderProxies;

import com.nath99000.quasarcraft.block.TileEntity.TileEntityStatue;
import com.nath99000.quasarcraft.entity.EntityVeritas;
import com.nath99000.quasarcraft.entity.RenderMobEntity;
import com.nath99000.quasarcraft.entity.Veritas;
import com.nath99000.quasarcraft.init.StatueRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RClientProxy extends RServerProxy{
    public void registerRenderThings(){
        RenderingRegistry.registerEntityRenderingHandler(EntityVeritas.class, new RenderMobEntity(new Veritas(), 0.5f));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, new StatueRenderer());
    }
}
