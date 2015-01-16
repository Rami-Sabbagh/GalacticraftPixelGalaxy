package com.ramilego.pixelgalaxy.blocks;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NormalPixelBlock extends Block {

	protected NormalPixelBlock(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
	}

}
