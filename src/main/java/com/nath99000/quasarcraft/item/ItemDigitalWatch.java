package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

import java.util.List;

public class ItemDigitalWatch extends ItemBase {

    public ItemDigitalWatch(){

        super();
        this.setUnlocalizedName("DigitalWatch");
        this.setMaxStackSize(1);
    }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (player.getCurrentEquippedItem() != null) {
            ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem.getItem() == ModItems.DigitalWatch) {
                player.addChatComponentMessage(new ChatComponentTranslation("Current Galactic Time: 949994"));
            }
        }
        return true;
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Useful!");
        }
    }
}