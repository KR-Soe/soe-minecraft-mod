package com.example.soeoeoe.entities.items;

import com.example.soeoeoe.Soeoeoe;
import com.example.soeoeoe.init.ModItems;
import com.example.soeoeoe.utils.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Soeoeoe.TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Soeoeoe.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
