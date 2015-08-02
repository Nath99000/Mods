package com.nath99000.quasarcraft.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Masamune extends ModelBase
{
  //fields
    ModelRenderer Handle;
    ModelRenderer Handguard;
    ModelRenderer Blade;
  
  public Masamune()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Handle = new ModelRenderer(this, 0, 0);
      Handle.addBox(0F, 0F, 0F, 1, 3, 1);
      Handle.setRotationPoint(0F, 21F, 0F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Handguard = new ModelRenderer(this, 0, 4);
      Handguard.addBox(0F, 0F, 0F, 3, 0, 3);
      Handguard.setRotationPoint(-1F, 21F, -1F);
      Handguard.setTextureSize(64, 32);
      Handguard.mirror = true;
      setRotation(Handguard, 0F, 0F, 0F);
      Blade = new ModelRenderer(this, 12, 0);
      Blade.addBox(0F, 0F, 0F, 0, 21, 1);
      Blade.setRotationPoint(0.5F, 1F, 0F);
      Blade.setTextureSize(64, 32);
      Blade.mirror = true;
      setRotation(Blade, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Handguard.render(f5);
    Blade.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
