package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemQCMidPickaxe extends ItemPickaxe {

    public ItemQCMidPickaxe(String QCMidPickaxe, ToolMaterial MQuasar) {
        super(MQuasar);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName(QCMidPickaxe);
        this.setTextureName(Reference.Id + ":" + QCMidPickaxe);
    }

}
