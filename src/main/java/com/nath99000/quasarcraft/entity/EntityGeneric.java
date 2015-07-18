package com.nath99000.quasarcraft.entity;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityGeneric extends EntityBase {
    public EntityGeneric(World par1) {
        super(par1);
        this.setJumping(false);
    }
        @Override
        public ItemStack getHeldItem () {
            return null;
        }

        @Override
        public ItemStack getEquipmentInSlot ( int p_71124_1_){
            return null;
        }

        @Override
        public void setCurrentItemOrArmor ( int p_70062_1_, ItemStack p_70062_2_){

        }

        @Override
        public ItemStack[] getLastActiveItems () {
            return new ItemStack[0];
        }
    }

