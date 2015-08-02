package com.nath99000.quasarcraft.entity;

import com.nath99000.quasarcraft.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityVeritas extends EntityMob implements IBossDisplayData{

    /** Random offset used in floating behaviour */
    private float heightOffset = 0.5F;
    /** ticks until heightOffset is randomized */
    private int heightOffsetUpdateTime;
    private int field_70846_g;
    private static final String __OBFID = "CL_00001682";

    public EntityVeritas(World p_i1731_1_)
    {
        super(p_i1731_1_);
        this.isImmuneToFire = true;
        this.experienceValue = 1500;
        this.getMaxHealth();
        this.getHealth();
    }

    @Override
    protected boolean canDespawn(){
        return false;
    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1500F);
    }
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte) 0));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.blaze.breathe";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.blaze.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.blaze.death";
    }

    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float p_70070_1_)
    {
        return 15728880;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float p_70013_1_)
    {
        return 1.0F;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (!this.worldObj.isRemote)
        {
            --this.heightOffsetUpdateTime;

            if (this.heightOffsetUpdateTime <= 0)
            {
                this.heightOffsetUpdateTime = 100;
                this.heightOffset = 0.5F + (float)this.rand.nextGaussian() * 3.0F;
            }

            if (this.getEntityToAttack() != null && this.getEntityToAttack().posY + (double)this.getEntityToAttack().getEyeHeight() > this.posY + (double)this.getEyeHeight() + (double)this.heightOffset)
            {
                this.motionY += (0.30000001192092896D - this.motionY) * 0.30000001192092896D;
            }
        }

        if (this.rand.nextInt(24) == 0)
        {
            this.worldObj.playSoundEffect(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, "fire.fire", 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F);
        }

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        super.onLivingUpdate();
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity p_70785_1_, float p_70785_2_)
    {
        if (this.attackTime <= 0 && p_70785_2_ < 2.0F && p_70785_1_.boundingBox.maxY > this.boundingBox.minY && p_70785_1_.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 20;
            this.attackEntityAsMob(p_70785_1_);
        }
        else if (p_70785_2_ < 30.0F)
        {
            double d0 = p_70785_1_.posX - this.posX;
            double d1 = p_70785_1_.boundingBox.minY + (double)(p_70785_1_.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
            double d2 = p_70785_1_.posZ - this.posZ;

            if (this.attackTime == 0)
            {
                ++this.field_70846_g;

                if (this.field_70846_g == 1)
                {
                    this.attackTime = 60;
                    this.func_70844_e(true);
                }
                else if (this.field_70846_g <= 4)
                {
                    this.attackTime = 6;
                }
                else
                {
                    this.attackTime = 100;
                    this.field_70846_g = 0;
                    this.func_70844_e(false);
                }

                if (this.field_70846_g > 1)
                {
                    float f1 = MathHelper.sqrt_float(p_70785_2_) * 0.5F;
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

                    for (int i = 0; i < 1; ++i)
                    {
                        EntityInterBall entitysmallfireball = new EntityInterBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                        entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball);
                        EntityInterBall entitysmallfireball1 = new EntityInterBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                        entitysmallfireball1.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball1);
                        EntityInterBall entitysmallfireball2 = new EntityInterBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                        entitysmallfireball2.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball2);
                        EntityInterBall entitysmallfireball3 = new EntityInterBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                        entitysmallfireball3.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball3);
                        EntityInterBall entitysmallfireball4 = new EntityInterBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                        entitysmallfireball4.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball4);
                    }
                }
            }

            this.rotationYaw = (float)(Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
            this.hasAttacked = true;
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float p_70069_1_) {}

    protected Item getDropItem()
    {
        return ModItems.Reality;
    }

    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */
    public boolean isBurning()
    {
        return false;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */

    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        Item item = this.getDropItem();

        if (item != null)
        {
            int j = this.rand.nextInt(3);

            if (p_70628_2_ > 0)
            {
                j += this.rand.nextInt(p_70628_2_ + 1);
            }

            for (int k = 0; k < j; ++k)
            {
                this.dropItem(item, 5-2);
            }
        }
    }
    protected void announce(EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10){
        if(this.isDead);{
            player.addChatComponentMessage(new ChatComponentTranslation("A player has slain the great lord VERITAS!"));
        }
    }

    public boolean func_70845_n()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void func_70844_e(boolean p_70844_1_)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (p_70844_1_)
        {
            b0 = (byte)(b0 | 1);
        }
        else
        {
            b0 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(b0));
    }
}