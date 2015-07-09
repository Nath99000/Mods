package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBase extends Block
{
    public BlockBase(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabQC.QC_TAB);
    }

    public BlockBase()
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
}
