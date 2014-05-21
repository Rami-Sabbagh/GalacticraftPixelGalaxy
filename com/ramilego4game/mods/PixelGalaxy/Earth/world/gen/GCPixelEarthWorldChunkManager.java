package com.ramilego4game.mods.PixelGalaxy.Earth.world.gen;

import static net.minecraft.world.biome.BiomeGenBase.forest;
import static net.minecraft.world.biome.BiomeGenBase.forestHills;
import static net.minecraft.world.biome.BiomeGenBase.jungle;
import static net.minecraft.world.biome.BiomeGenBase.jungleHills;
import static net.minecraft.world.biome.BiomeGenBase.plains;
import static net.minecraft.world.biome.BiomeGenBase.taiga;
import static net.minecraft.world.biome.BiomeGenBase.taigaHills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import net.minecraft.world.biome.BiomeGenBase;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCWorldChunkManager;

public class GCPixelEarthWorldChunkManager extends GCWorldChunkManager{
	private static ArrayList<BiomeGenBase> PEABiomes = new ArrayList<BiomeGenBase>(Arrays.asList(GalacticraftPixelEarth.PEBiome));
	
	@Override
	public BiomeGenBase getPlanetBiomeGenAt(int par1, int par2) {
		return GalacticraftPixelEarth.PEBiome;
	}

	@Override
	public List<BiomeGenBase> getBiomeList() {
		return PEABiomes;
	}

}
