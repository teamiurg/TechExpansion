package com.collabmods.techexpansion;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TechExpansionCrafting {
	public static void init() {
		GameRegistry.addSmelting(TechExpansionBlocks.copperOre, new ItemStack(Items.bed), 1.0F);
		GameRegistry.addSmelting(TechExpansionBlocks.tinOre, new ItemStack(Items.apple), 1.0F);
		GameRegistry.addRecipe(new ItemStack(TechExpansionBlocks.copperBlock), new Object[] {
				"ccc",
				"ccc",
				"ccc", 'c', Items.bed 	
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionBlocks.tinBlock), new Object[] {
				"ttt",
				"ttt",
				"ttt", 't', Items.apple
		});
	}
}
