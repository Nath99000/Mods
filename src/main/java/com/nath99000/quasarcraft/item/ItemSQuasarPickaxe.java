package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemSQuasarPickaxe extends ItemPickaxe {
    public ItemSQuasarPickaxe(String SQuasarPickaxe, ToolMaterial SQuasar) {
        super(SQuasar);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(SQuasarPickaxe);
        this.setTextureName(Reference.Id + ":" + SQuasarPickaxe);
    }
}