package com.example.soeoeoe.world;

import java.util.Random;

import com.example.soeoeoe.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0) {
			generateOverWorld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverWorld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int commonOreChances = 20;
		int rareOreChances = 13;
		int legendaryOreChances = 7; 
		generateOres(BlockInit.ORICHALCUM_BLOCK.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 6, 80, random.nextInt(5) + 2, commonOreChances);
		generateOres(BlockInit.LUNITA_BLOCK.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 6, 14, random.nextInt(4) + 1, rareOreChances);
	}
	
	private void generateOres(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos position = new BlockPos(
				x + random.nextInt(16), 
				minY + random.nextInt(deltaY), 
				z + random.nextInt(16)
			);
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, position);
			System.out.println("generated "+ ore + " vet " + "with "+ size +" ores");
		}
	}

}
