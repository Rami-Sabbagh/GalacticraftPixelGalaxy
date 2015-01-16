package com.ramilego.pixelgalaxy.world.gen;

import net.minecraft.world.biome.BiomeGenBase;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;

public class WorldChunkManagerGreenPixel extends WorldChunkManagerSpace {

	@Override
	public BiomeGenBase getBiome() {
		return GreenPixelBiomes.greenFlat;
	}

}
