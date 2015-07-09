package com.nath99000.quasarcraft.creativetab;

import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.item.ItemQuasar;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabQC
{
    public static final CreativeTabs QC_TAB = new CreativeTabs(Reference.Id.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Quasar;
        }
    };
}