package com.ramilego.pixelgalaxy.fluids;

import com.ramilego.pixelgalaxy.fluids.blocks.PixelFluidH3OBlock;
import net.minecraftforge.fluids.Fluid;

public class PixelWaterH3O extends Fluid {
	public PixelWaterH3O(String fluidName) {
		super(fluidName);
		this.setIcons(PixelFluidH3OBlock.WaterH3OStill, PixelFluidH3OBlock.WaterH3OFlowing);
	}
}
