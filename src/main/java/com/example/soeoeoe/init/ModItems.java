package com.example.soeoeoe.init;

import java.util.ArrayList;
import java.util.List;
import com.example.soeoeoe.entities.items.ItemBase;
import com.example.soeoeoe.entities.items.armor.BaseArmor;
import com.example.soeoeoe.utils.handlers.Settings;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item LUNITA_ORE = new ItemBase("lunita_ore");
	public static final Item BRAVIN_INGOT = new ItemBase("bravin_ingot");
	
	
	//armor-material
	public static final ArmorMaterial ARMOR_MATERIAL_BRAVIN_INGOT = EnumHelper.addArmorMaterial(
		"armor_material_bravin_ingot", 
		Settings.MODID + ":bravin_armor", 
		14, 
		new int[] {3, 5, 7, 4}, 
		10, 
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 
		0.0F
	);
	
	//armor
	public static final Item BRAVIN_CHESTPLATE = new BaseArmor(
		"bravin_chestplate", 
		ARMOR_MATERIAL_BRAVIN_INGOT, 
		1, 
		EntityEquipmentSlot.CHEST
	);
	
	public static final Item BRAVIN_HELMET = new BaseArmor(
		"bravin_helmet", 
		ARMOR_MATERIAL_BRAVIN_INGOT, 
		1, 
		EntityEquipmentSlot.HEAD
	);
	
	public static final Item BRAVIN_LEGS = new BaseArmor(
		"bravin_legs", 
		ARMOR_MATERIAL_BRAVIN_INGOT, 
		1, 
		EntityEquipmentSlot.LEGS
	);
	
	public static final Item BRAVIN_FEETS = new BaseArmor(
		"bravin_feets", 
		ARMOR_MATERIAL_BRAVIN_INGOT, 
		1, 
		EntityEquipmentSlot.FEET
	);
}
