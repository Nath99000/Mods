package com.nath99000.quasarcraft.block;


import com.nath99000.quasarcraft.block.BlockBase;
import com.nath99000.quasarcraft.block.TileEntity.CrateTileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Crate extends BlockBase implements ITileEntityProvider {
    public Crate() {
        super();
        this.setBlockName("Crate");
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {return new CrateTileEntity();}
    @Override
    public boolean hasTileEntity(int metadata) {return true;}
}
