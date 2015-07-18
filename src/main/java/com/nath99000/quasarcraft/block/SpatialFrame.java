package com.nath99000.quasarcraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpatialFrame extends BlockBase {

    public SpatialFrame() {
        super();
        this.setBlockName("SpatialFrame");
        this.setLightLevel(0.8F);
        this.setHardness(10.0F);
        this.setResistance(200.0F);

    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
    public int getRenderBlockPass()
    {
        return 1;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
}

