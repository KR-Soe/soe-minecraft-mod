package com.example.soeoeoe.entities.blocks;

import java.util.Random;

import com.example.soeoeoe.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LunitaBlock extends BlockBase {
	public LunitaBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 4);
		setResistance(6.0F);
		setLightLevel(0.5F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.LUNITA_ORE;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int quantity = 1;
		return quantity;
	}
}

