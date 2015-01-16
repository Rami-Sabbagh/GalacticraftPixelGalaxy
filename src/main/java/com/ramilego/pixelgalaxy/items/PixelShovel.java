package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.item.ItemSpade;

public class PixelShovel extends ItemSpade {

	public PixelShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}

}
