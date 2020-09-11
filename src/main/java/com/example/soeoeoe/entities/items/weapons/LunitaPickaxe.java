package com.example.soeoeoe.entities.items.weapons;

import com.example.soeoeoe.Soeoeoe;
import com.example.soeoeoe.init.ModItems;
import com.example.soeoeoe.utils.handlers.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class LunitaPickaxe extends ItemPickaxe implements IHasModel{
	public LunitaPickaxe(String name, ToolMaterial material) {
		super(material);
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
