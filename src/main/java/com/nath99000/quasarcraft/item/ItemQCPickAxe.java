package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemQCPickAxe extends ItemPickaxe {

    public ItemQCPickAxe(String QCPickAxe, ToolMaterial WQUASAR) {
        super(WQUASAR);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(QCPickAxe);
        this.setTextureName(Reference.Id + ":" + QCPickAxe);
    }

}
