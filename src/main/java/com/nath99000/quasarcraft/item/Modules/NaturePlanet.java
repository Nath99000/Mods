package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.block.BlockBase;
import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class NaturePlanet extends BlockBase{
    public NaturePlanet(){
        super();
        this.setBlockName("NaturePlanet");
        this.setHarvestLevel("pickaxe", 2015);
        this.setHardness(95.0f);
        this.setResistance(200.0f);
    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Items.porkchop, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.beef, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.wheat_seeds, world.rand.nextInt(4) + 1, 3));
        drops.add(new ItemStack(Items.melon, world.rand.nextInt(3) + 1, 3));
        drops.add(new ItemStack(Items.pumpkin_seeds, world.rand.nextInt(1) + 1, 3));
        drops.add(new ItemStack(Items.chicken, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.gunpowder, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.bone, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.rotten_flesh, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.spider_eye, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.ender_pearl, world.rand.nextInt(2) + 1, 3));
        if (world.rand.nextFloat() < 0.5F)
            drops.add(new ItemStack(Items.spawn_egg, 4));
        return drops;
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Natural");
        }
    }
}
