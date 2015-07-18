package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class UraniumOre extends BlockBase{
    public UraniumOre() {
        super();
        this.setBlockName("UraniumOre");
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);


    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(ModItems.Uranium, world.rand.nextInt(2) + 1, 2));
        if (world.rand.nextFloat() < 0.5F)
            drops.add(new ItemStack(ModItems.Uranium));
        return drops;
    }
}
