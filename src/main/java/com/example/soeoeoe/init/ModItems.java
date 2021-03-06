package com.example.soeoeoe.init;

import java.util.ArrayList;
import java.util.List;
import com.example.soeoeoe.entities.items.ItemBase;
import com.example.soeoeoe.entities.items.armor.BaseArmor;
import com.example.soeoeoe.entities.items.weapons.LunitaAxe;
import com.example.soeoeoe.entities.items.weapons.LunitaHoe;
import com.example.soeoeoe.entities.items.weapons.LunitaPickaxe;
import com.example.soeoeoe.entities.items.weapons.LunitaSpade;
import com.example.soeoeoe.entities.items.weapons.LunitaSword;

import com.example.soeoeoe.entities.items.weapons.OrichalcumAxe;
import com.example.soeoeoe.entities.items.weapons.OrichalcumBow;
import com.example.soeoeoe.entities.items.weapons.OrichalcumHoe;
import com.example.soeoeoe.entities.items.weapons.OrichalcumPickaxe;
import com.example.soeoeoe.entities.items.weapons.OrichalcumSpade;
import com.example.soeoeoe.entities.items.weapons.OrichalcumSword;
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
	public static final Item IRON_SRICK = new ItemBase("iron_stick");
	public static final Item ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot");
	
	//----- TOOL_MATERIALS -----
	//args are -> (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial TOOL_MATERIAL_ORICHALCUM_INGOT = EnumHelper.addToolMaterial(
		"tool_material_orichalcum_ingot", 
		4, 
		300,
		12.0F, 
		2.5F,
		9
	); 
	
	public static final ToolMaterial TOOL_MATERIAL_LUNITA = EnumHelper.addToolMaterial(
		"tool_material_lunita",
		9,
		1956,
		17.0F,
		5.0F,
		10
	);
	
	//----- ARMOR_MATERIALS -------
	//args are -> (name, textureName, durability, reductionAmounts[boots, legs, chest, head], enchantability, soundOnEquip, toughness)	
	public static final ArmorMaterial ARMOR_MATERIAL_ORICHALCUM_INGOT = EnumHelper.addArmorMaterial(
		"armor_material_orichalcum_ingot",
		Settings.MODID + ":orichalcum_armor",
		18,
		new int[] {3, 5, 7, 2}, 
		6, 
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 
		1.0F
	);
	
	public static final ArmorMaterial ARMOR_MATERIAL_LUNITA = EnumHelper.addArmorMaterial(
		"armor_material_lunita_ore",
		Settings.MODID + ":lunita_armor",
		25,
		new int[] {4, 7, 9, 4}, 
		8, 
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 
		1.5F
	);
	
	// ------- ARMOR ------	
	public static final Item ORICHALCUM_CHESTPLATE = new BaseArmor("orichalcum_chestplate", ARMOR_MATERIAL_ORICHALCUM_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item ORICHALCUM_HELMET = new BaseArmor("orichalcum_helmet", ARMOR_MATERIAL_ORICHALCUM_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item ORICHALCUM_LEGS = new BaseArmor("orichalcum_legs", ARMOR_MATERIAL_ORICHALCUM_INGOT, 1, EntityEquipmentSlot.LEGS);
	public static final Item ORICHALCUM_FEETS = new BaseArmor("orichalcum_feets", ARMOR_MATERIAL_ORICHALCUM_INGOT, 1, EntityEquipmentSlot.FEET);
	
	public static final Item LUNITA_CHESTPLATE = new BaseArmor("lunita_chestplate", ARMOR_MATERIAL_LUNITA, 1, EntityEquipmentSlot.CHEST);
	public static final Item LUNITA_HELMET = new BaseArmor("lunita_helmet", ARMOR_MATERIAL_LUNITA, 1, EntityEquipmentSlot.HEAD);
	public static final Item LUNITA_LEGS = new BaseArmor("lunita_legs", ARMOR_MATERIAL_LUNITA, 1, EntityEquipmentSlot.LEGS);
	public static final Item LUNITA_FEETS = new BaseArmor("lunita_feets", ARMOR_MATERIAL_LUNITA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ORICHALCUM_BOW = new OrichalcumBow("orichalcum_bow");
	public static final Item ORICHALCUM_AXE = new OrichalcumAxe("orichalcum_axe", TOOL_MATERIAL_ORICHALCUM_INGOT);
	public static final Item ORICHALCUM_PICKAXE = new OrichalcumPickaxe("orichalcum_pickaxe", TOOL_MATERIAL_ORICHALCUM_INGOT);
	public static final Item ORICHALCUM_HOE = new OrichalcumHoe("orichalcum_hoe", TOOL_MATERIAL_ORICHALCUM_INGOT);
	public static final Item ORICHALCUM_SPADE = new OrichalcumSpade("orichalcum_spade", TOOL_MATERIAL_ORICHALCUM_INGOT);
	public static final Item ORICHALCUM_SWORD = new OrichalcumSword("orichalcum_sword", TOOL_MATERIAL_ORICHALCUM_INGOT);
	
	public static final Item LUNITA_AXE = new LunitaAxe("lunita_axe", TOOL_MATERIAL_LUNITA);
	public static final Item LUNITA_PICKAXE = new LunitaPickaxe("lunita_pickaxe", TOOL_MATERIAL_LUNITA);
	public static final Item LUNITA_HOE = new LunitaHoe("lunita_hoe", TOOL_MATERIAL_LUNITA);
	public static final Item LUNITA_SPADE = new LunitaSpade("lunita_spade", TOOL_MATERIAL_LUNITA);
	public static final Item LUNITA_SWORD = new LunitaSword("lunita_sword", TOOL_MATERIAL_LUNITA);

}
