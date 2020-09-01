package com.example.soeoeoe.entities.blocks;


import com.example.soeoeoe.Soeoeoe;
import com.example.soeoeoe.init.BlockInit;
import com.example.soeoeoe.init.ModItems;
import com.example.soeoeoe.utils.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Soeoeoe.TAB);
		
		BlockInit.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Soeoeoe.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}