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

public class ItemQCArmor extends ItemArmor {
    {
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }
    public String textureName;

    public ItemQCArmor(String QArmor, ArmorMaterial AWQUASAR, String AWQuasar, int type) {
        super(AWQUASAR, 0, type);
        this.textureName = AWQuasar;
        this.setUnlocalizedName(QArmor);
        this.setTextureName(Reference.Id + ":" + QArmor);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return Reference.Id + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem().equals(ModItems.QLegs))
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
        if (itemStack.getItem().equals(ModItems.QBoot))
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 40));
        if (itemStack.getItem().equals(ModItems.QHelm))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
        if (itemStack.getItem().equals(ModItems.QChest))
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40));


    }}

