package com.ramilego.pixelgalaxy.blocks;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlowingBlueStoneBlock extends NormalPixelBlock 
{

	protected GlowingBlueStoneBlock(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGlass);
	}

}
