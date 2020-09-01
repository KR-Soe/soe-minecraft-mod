package com.example.soeoeoe.entities.items.weapons;

import com.example.soeoeoe.Soeoeoe;
import com.example.soeoeoe.init.ModItems;
import com.example.soeoeoe.utils.handlers.IHasModel;
import net.minecraft.item.ItemAxe;

public class BravinAxe extends ItemAxe implements IHasModel {
	public BravinAxe(String name, ToolMaterial material) {
		super(material, 9.0F, -3.2F);
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
