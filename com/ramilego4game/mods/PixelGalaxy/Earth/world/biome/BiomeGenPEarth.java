package com.ramilego4game.mods.PixelGalaxy.Earth.world.biome;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenPEarth extends BiomeGenBase{

	public BiomeGenPEarth(int id) {
		super(id);
		
		this.topBlock = (byte)GalacticraftPixelEarth.pixelGrass.blockID;
		this.fillerBlock = (byte)GalacticraftPixelEarth.pixelDirt.blockID;
	}

}
