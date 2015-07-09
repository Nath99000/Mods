package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemQCSword extends ItemSword {

    public ItemQCSword(String QCSword, ToolMaterial WQUASAR) {
        super(WQUASAR);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(QCSword);
        this.setTextureName(Reference.Id + ":" + QCSword);
    }

}

