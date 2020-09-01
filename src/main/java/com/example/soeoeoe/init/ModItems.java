package com.example.soeoeoe.init;

import java.util.ArrayList;
import java.util.List;
import com.example.soeoeoe.entities.items.ItemBase;
import com.example.soeoeoe.entities.items.armor.BaseArmor;
import com.example.soeoeoe.entities.items.weapons.BravinAxe;
import com.example.soeoeoe.entities.items.weapons.BravinHoe;
import com.example.soeoeoe.entities.items.weapons.BravinPickaxe;
import com.example.soeoeoe.entities.items.weapons.BravinSpade;
import com.example.soeoeoe.entities.items.weapons.BravinSword;
import com.example.soeoeoe.utils.handlers.Settings;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item LUNITA_ORE = new ItemBase("lunita_ore");
	public static final Item BRAVIN_INGOT = new ItemBase("bravin_ingot");
	
	//----- TOOL_MATERIALS -----
	//args are -> (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial TOOL_MATERIAL_BRAVIN_INGOT = EnumHelper.addToolMaterial(
			"tool_material_bravin_ingot", 
			4, 
			400,
			12.0F, 
			3.0F,
			14
		); 
	
	//----- ARMOR_MATERIALS -------
	//args are -> (name, textureName, durability, reductionAmounts[boots, legs, chest, head], enchantability, soundOnEquip, toughness)	
	public static final ArmorMaterial ARMOR_MATERIAL_BRAVIN_INGOT = EnumHelper.addArmorMaterial(
		"armor_material_bravin_ingot",
		Settings.MODID + ":bravin_armor",
		14,
		new int[] {3, 5, 7, 4}, 
		9, 
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 
		1.0F
	);
	
	// ------- ARMOR ------
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
	
	public static final Item BRAVIN_AXE = new BravinAxe("bravin_axe", TOOL_MATERIAL_BRAVIN_INGOT);
	public static final Item BRAVIN_PICKAXE = new BravinPickaxe("bravin_pickaxe", TOOL_MATERIAL_BRAVIN_INGOT);
	public static final Item BRAVIN_HOE = new BravinHoe("bravin_hoe", TOOL_MATERIAL_BRAVIN_INGOT);
	public static final Item BRAVIN_SPADE = new BravinSpade("bravin_spade", TOOL_MATERIAL_BRAVIN_INGOT);
	public static final Item BRAVIN_SWORD = new BravinSword("bravin_sword", TOOL_MATERIAL_BRAVIN_INGOT);

}
