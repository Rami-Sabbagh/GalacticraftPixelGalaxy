package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.item.ItemAxe;

public class PixelAxe extends ItemAxe {

	protected PixelAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}

}
