package com.nath99000.quasarcraft.init;

import com.nath99000.quasarcraft.entity.EntityVeritas;
import com.nath99000.quasarcraft.entity.RenderMobEntity;
import com.nath99000.quasarcraft.entity.Veritas;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class EntityRender {
    public EntityRender(){

    }
    public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntityVeritas.class, new RenderMobEntity(new Veritas(), 0.5f));
    }
}
