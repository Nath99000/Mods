package com.nath99000.quasarcraft.world;

import com.nath99000.quasarcraft.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class QCWorldGen implements IWorldGenerator
{

    private WorldGenerator gen_Spice;	//Generate spice ore
    private WorldGenerator gen_Uranium;


    public QCWorldGen() {
    this.gen_Spice = new WorldGenMinable(ModBlocks.SpiceOre, 3);
    this.gen_Uranium = new WorldGenMinable(ModBlocks.UraniumOre, 3);

}

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0: //Overworld
                this.runGenerator(this.gen_Spice, world, random, chunkX * 16, chunkZ * 16, 20, 0, 64);
                this.runGenerator(this.gen_Uranium, world, random, chunkX * 16, chunkZ * 16, 20, 0, 64);

                break;
            case -1: //Nether

                break;
            case 1: //End

                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z + rand.nextInt(16);
            generator.generate(world, rand, x, y, z);
        }
    }
}


