package com.nath99000.quasarcraft.item.Modules;

import com.nath99000.quasarcraft.block.BlockBase;
import com.nath99000.quasarcraft.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class MiningPlanet extends BlockBase {
    public MiningPlanet() {
        super();
        this.setBlockName("MiningPlanet");
        this.setHarvestLevel("pickaxe", 2015);
        this.setHardness(95.0f);
        this.setResistance(200.0f);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Items.coal, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(ModItems.Spice, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(ModItems.Uranium, world.rand.nextInt(4) + 1, 3));
        drops.add(new ItemStack(Blocks.lapis_ore, world.rand.nextInt(3) + 1, 3));
        drops.add(new ItemStack(ModItems.YSpice, world.rand.nextInt(1) + 1, 3));
        drops.add(new ItemStack(ModItems.StarDust, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.quartz, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.glowstone_dust, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Blocks.iron_ore, world.rand.nextInt(6) + 1, 3));
        drops.add(new ItemStack(Items.redstone, world.rand.nextInt(6) + 3, 5));
        drops.add(new ItemStack(Items.emerald, world.rand.nextInt(2) + 1, 3));
        if (world.rand.nextFloat() < 0.5F)
            drops.add(new ItemStack(Items.diamond, 4));
        return drops;
    }
}

