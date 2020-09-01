package com.example.soeoeoe.init;

import java.util.ArrayList;
import java.util.List;

import com.example.soeoeoe.entities.blocks.BravinBlock;
import com.example.soeoeoe.entities.blocks.LunitaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LUNITA_BLOCK = new LunitaBlock("lunita_block", Material.ROCK);
	public static final Block BRAVIN_BLOCK = new BravinBlock("bravin_block", Material.IRON); 
	
}