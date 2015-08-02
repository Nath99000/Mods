package com.nath99000.quasarcraft.entity;

import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMobEntity extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.Id + ":textures/entity/Veritas.png");

    public RenderMobEntity(ModelBase par1, float par2) {
        super(par1, par2);


    }

    protected ResourceLocation getEntityTexture(EntityVeritas par1){
        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity par1){
        return this.getEntityTexture((EntityVeritas)par1);
    }
}

