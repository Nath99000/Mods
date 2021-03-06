package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockContainerBase extends BlockContainer implements ITileEntityProvider
{
    public BlockContainerBase(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }

    public BlockContainerBase()
    {
        this(Material.iron);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.Id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

                @Override
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister iconRegister)
        {
            blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
       }

                protected String getUnwrappedUnlocalizedName(String unlocalizedName)
       {
            return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
       }
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
