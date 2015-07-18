package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemQCMidArmor extends ItemArmor {
    {
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }
    public String textureName;

    public ItemQCMidArmor(String QArmor, ArmorMaterial AMQUASAR, String AMQuasar, int type) {
        super(AMQUASAR, 0, type);
        this.textureName = AMQuasar;
        this.setUnlocalizedName(QArmor);
        this.setTextureName(Reference.Id + ":" + QArmor);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return Reference.Id + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (itemStack.getItem().equals(ModItems.QMLegs))
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 1));
        if (itemStack.getItem().equals(ModItems.QMBoot))
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 1));
        if (itemStack.getItem().equals(ModItems.QMHelm))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 1));
        if (itemStack.getItem().equals(ModItems.QMHelm))
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0));
        if (itemStack.getItem().equals(ModItems.QMChest))
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40, 1));


    }}

