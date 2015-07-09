package com.nath99000.quasarcraft.item;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.reference.Reference;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item
{
            public ItemBase()
            {
                super();
                this.setCreativeTab(CreativeTabQC.QC_TAB);
            }

            @Override
    public String getUnlocalizedName()
            {
                return String.format("item.%s%s", Reference.Id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
            }

            @Override
    public String getUnlocalizedName(ItemStack itemStack)
            {
                return String.format("item.%s%s", Reference.Id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
            }

            @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
            {
                itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
            }

            protected String getUnwrappedUnlocalizedName(String unlocalizedName)
            {
                return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
            }
        }
