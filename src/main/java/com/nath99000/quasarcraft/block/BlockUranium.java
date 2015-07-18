package com.nath99000.quasarcraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockUranium extends BlockBase {
    public BlockUranium() {
        super();
        this.setBlockName("UraniumBlock");
        this.setLightLevel(0.3F);
        this.setHardness(15.0F);
        this.setResistance(200.0F);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity instanceof EntityLiving) {
            ((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.poison.id, 2, 0));
        }
    }
}

