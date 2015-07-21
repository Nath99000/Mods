package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemRetriever extends ItemPickaxe {

    public ItemRetriever(String ToolRetriever, ToolMaterial Retriever) {
        super(Retriever);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setUnlocalizedName("ToolRetriever");
        this.setTextureName(Reference.Id + ":" + ToolRetriever);
    }

}
