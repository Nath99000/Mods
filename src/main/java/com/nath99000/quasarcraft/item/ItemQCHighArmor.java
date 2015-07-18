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

public class ItemQCHighArmor extends ItemArmor {
    {
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }
    public String textureName;

    public ItemQCHighArmor(String QArmor, ArmorMaterial ASQUASAR, String AMQuasar, int type) {
        super(ASQUASAR, 0, type);
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
        if (itemStack.getItem().equals(ModItems.QSLegs))
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 2));
        if (itemStack.getItem().equals(ModItems.QSBoots))
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 2));
        if (itemStack.getItem().equals(ModItems.QSHelm))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 1));
        if (itemStack.getItem().equals(ModItems.QSHelm))
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0));
        if (itemStack.getItem().equals(ModItems.QSChest))
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40, 2));
        if (itemStack.getItem().equals(ModItems.QSHelm))
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0));


    }
}
