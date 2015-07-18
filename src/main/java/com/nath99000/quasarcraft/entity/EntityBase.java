package com.nath99000.quasarcraft.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class EntityBase extends EntityLivingBase  //I will try to figure all this code out, because it's confusing as hell.
{
    public EntityBase(World par1)
    {
        super(par1);
    }
}
