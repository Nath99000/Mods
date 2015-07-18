package com.nath99000.quasarcraft.block;

import com.nath99000.quasarcraft.creativetab.CreativeTabQC;
import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class SpiceOre extends BlockBase {
    public SpiceOre() {
        super();
        this.setBlockName("SpiceOre");
        this.setCreativeTab(CreativeTabQC.QC_TAB);
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);


    }
    @Override
    	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        		drops.add(new ItemStack(ModItems.Spice, world.rand.nextInt(6) + 1, 2));
        		drops.add(new ItemStack(ModItems.YSpice, world.rand.nextInt(5) + 1, 2));
        		drops.add(new ItemStack(ModItems.BSpice, world.rand.nextInt(4) + 1, 2));
        		drops.add(new ItemStack(ModItems.GSpice, world.rand.nextInt(3) + 1, 2));
        		drops.add(new ItemStack(ModItems.PSpice, world.rand.nextInt(2) + 1));
        		drops.add(new ItemStack(ModItems.XPSpice, world.rand.nextInt(1) + 1));
        		if (world.rand.nextFloat() < 0.5F)
            			drops.add(new ItemStack(ModItems.StarDust));
        		return drops;
        	}
}
