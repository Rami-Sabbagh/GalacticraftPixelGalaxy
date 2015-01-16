package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.item.ItemSword;

public class PixelSword extends ItemSword {

	public PixelSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}

}
