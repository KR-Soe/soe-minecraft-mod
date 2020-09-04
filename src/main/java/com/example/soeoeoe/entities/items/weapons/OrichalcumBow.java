package com.example.soeoeoe.entities.items.weapons;

import com.example.soeoeoe.Soeoeoe;
import com.example.soeoeoe.init.ModItems;
import com.example.soeoeoe.utils.handlers.IHasModel;
import net.minecraft.item.ItemBow;

public class OrichalcumBow extends ItemBow implements IHasModel{
	public OrichalcumBow(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Soeoeoe.TAB);
		setMaxDamage(420);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Soeoeoe.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public int getItemEnchantability() {
		return 10;
	}

}
