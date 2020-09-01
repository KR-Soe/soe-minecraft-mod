package com.example.soeoeoe.entities.blocks;

import java.util.Random;

import com.example.soeoeoe.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BravinBlock extends BlockBase {
	public BravinBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 4);
		setResistance(6.0F);
	}
}

