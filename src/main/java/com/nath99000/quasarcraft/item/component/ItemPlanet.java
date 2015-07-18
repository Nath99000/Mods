package com.nath99000.quasarcraft.item.component;

import com.nath99000.quasarcraft.item.ItemBase;
import com.nath99000.quasarcraft.lib.NBTTags;
import com.nath99000.quasarcraft.utility.NBTHelper;
import com.nath99000.quasarcraft.utility.NBTHelper2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPlanet extends ItemBase {
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack is, EntityPlayer player, List list, boolean flag) {
        if (NBTHelper2.getTagList(is, NBTTags.INVENTORY_ARRAY).tagCount() == 0) {
            list.add("\u00a7e" + "Empty");
        } else {
            list.add("Quality: " + "\u00a7e" + NBTHelper.getInt(is, NBTTags.Mob));
            list.add("Speed: " + "\u00a7e" + NBTHelper.getInt(is, NBTTags.Resource));
            list.add("");
            list.add("Items used: " + "\u00a7e" + NBTHelper2.getTagList(is, NBTTags.INVENTORY_ARRAY).tagCount());
        }

    }
}