package com.ramilego.pixelgalaxy.world.gen;

public class BiomeGenGreenPixel extends GreenPixelBiomes {

	public BiomeGenGreenPixel(int par1)
    {
        super(par1);
        this.setBiomeName("greenFlat");
        this.setColor(16711680);
        this.setHeight(new Height(2.5F, 0.4F));
    }

}
