package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.block.TileEntity.CrateTileEntity;
import com.nath99000.quasarcraft.block.TileEntity.TileEntityStatue;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStatue extends BlockBase implements ITileEntityProvider{
    public BlockStatue(){
        super();
        this.setBlockName("Statue");
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {return new TileEntityStatue();}

    @Override
    public boolean hasTileEntity(int metadata) {return true;}

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }
}
