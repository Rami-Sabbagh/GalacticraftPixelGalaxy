package com.ramilego.pixelgalaxy.fluids;

import com.ramilego.pixelgalaxy.fluids.blocks.PixelFluidH3OBlock;
import net.minecraftforge.fluids.Fluid;

public class PixelLavaFluid extends Fluid {
	public PixelLavaFluid(String fluidName) {
		super(fluidName);
		this.setIcons(PixelFluidH3OBlock.WaterH3OStill, PixelFluidH3OBlock.WaterH3OFlowing);
		this.setViscosity(6000);
		this.setLuminosity(15);
	}
}
