package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemSword;

public class ItemTinSword extends ItemSword{
	
	public ItemTinSword(String unlocalizedName, ToolMaterial material) {
			super(material);
			this.setUnlocalizedName(unlocalizedName);
			this.setTextureName("techExpansion:tin_sword");
			this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}