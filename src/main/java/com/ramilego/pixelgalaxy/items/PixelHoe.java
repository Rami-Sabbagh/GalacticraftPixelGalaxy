package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.item.ItemHoe;

public class PixelHoe extends ItemHoe {

	public PixelHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}

}
