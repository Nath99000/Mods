package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import net.minecraft.block.material.Material;

public class DecoBlock extends ConnectedTextures
{
    public DecoBlock()
    {
        super(Material.iron, "DecoBlocks/DecoBlock", "QuasarCraft");
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setBlockName("DecoBlock");
        this.setHardness(15.0F);
        this.setResistance(200.0F);
        this.Falone=0;
        this.Fjust1=1;
        this.Fedge3=2;
        this.Fcorner=3;
        this.FinLine=4;
        this.Fsurrounded=5;
    }


}
