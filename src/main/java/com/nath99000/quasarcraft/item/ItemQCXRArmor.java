package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemQCXRArmor extends ItemArmor{
    {
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }
    public String textureName;

    public ItemQCXRArmor(String QArmor, ItemArmor.ArmorMaterial AXRQUASAR, String AXRQuasar, int type) {
        super(AXRQUASAR, 0, type);
        this.textureName = AXRQuasar;
        this.setUnlocalizedName(QArmor);
        this.setTextureName(Reference.Id + ":" + QArmor);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return Reference.Id + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 0));
        if (!itemStack.isItemEnchanted()) {
            itemStack.addEnchantment(Enchantment.blastProtection, 3);
        }
        if (itemStack.getItem().equals(ModItems.XRLegs))
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 3));
        if (itemStack.getItem().equals(ModItems.XRBoots))
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 3));
        if (itemStack.getItem().equals(ModItems.XRHelm))
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 0));
        if (itemStack.getItem().equals(ModItems.XRHelm))
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0));
        if (itemStack.getItem().equals(ModItems.XRChest))
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40, 3));
        if (itemStack.getItem().equals(ModItems.XRHelm))
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0));
    }
}
