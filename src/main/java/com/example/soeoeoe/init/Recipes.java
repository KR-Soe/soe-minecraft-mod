package com.example.soeoeoe.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addSmelting(BlockInit.BRAVIN_BLOCK, new ItemStack(ModItems.BRAVIN_INGOT, 1), 1.5f);
	}
}