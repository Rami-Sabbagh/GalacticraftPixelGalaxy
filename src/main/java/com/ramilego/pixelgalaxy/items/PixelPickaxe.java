package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class PixelPickaxe extends ItemPickaxe {

	public PixelPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}

}
