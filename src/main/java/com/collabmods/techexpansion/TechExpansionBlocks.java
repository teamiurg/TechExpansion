package com.collabmods.techexpansion;

import com.collabmods.techexpansion.blocks.CopperBlock;
import com.collabmods.techexpansion.blocks.CopperOre;
import com.collabmods.techexpansion.blocks.TinBlock;
import com.collabmods.techexpansion.blocks.TinOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class TechExpansionBlocks {
	public static Block copperOre;
	public static Block tinOre;
	public static Block copperBlock;
	public static Block tinBlock;
	
	public static final void init() {
		GameRegistry.registerBlock(copperOre = new CopperOre("copperOre", Material.iron), "copperOre");
		GameRegistry.registerBlock(tinOre = new TinOre("tinOre", Material.iron), "tinOre");
		GameRegistry.registerBlock(copperBlock = new CopperBlock("copperBlock", Material.iron), "copperBlock");
		GameRegistry.registerBlock(tinBlock = new TinBlock("tinBlock", Material.iron), "tinBlock");
	}
}
