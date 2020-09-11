package com.example.soeoeoe.entities.blocks;

import java.util.Random;

import com.example.soeoeoe.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LunitaBlock extends BlockBase {
	int minDropAmount = 1;
	int maxDropAmount = 2;

	public LunitaBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
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
		int quantity = this.minDropAmount + rand.nextInt(this.maxDropAmount - this.minDropAmount + 1);
		return quantity;
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
	    if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune)) {
	    	System.out.println("FORTUNE LVL !"+ fortune);
	        int i = random.nextInt(fortune + 2) - 1;
	        if (i < 0) {
	            i = 0;
	        }
	        return this.quantityDropped(random) * (i + 1);
	    } else {
	    	return this.quantityDropped(random);
	    }
	}

}

