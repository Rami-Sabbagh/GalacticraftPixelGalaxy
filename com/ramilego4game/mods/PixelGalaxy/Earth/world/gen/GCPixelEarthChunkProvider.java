package com.ramilego4game.mods.PixelGalaxy.Earth.world.gen;

import java.util.ArrayList;
import java.util.List;

import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCBiomeDecoratorBase;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCChunkProvider;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCCoreMapGenBaseMeta;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class GCPixelEarthChunkProvider extends GCChunkProvider{

	public GCPixelEarthChunkProvider(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
	}

	@Override
	protected GCBiomeDecoratorBase getBiomeGenerator() {
		return new GCPixelEarthBiomeDecoratorBase();
	}

	@Override
	protected BiomeGenBase[] getBiomesForGeneration() {
		return null; // TODO Create Biome
	}

	@Override
	protected int getSeaLevel() {
		return 64;
	}

	@Override
	protected List<GCCoreMapGenBaseMeta> getWorldGenerators() {
		final List wg = new ArrayList();
		return wg;
	}

	@Override
	protected SpawnListEntry[] getMonsters() {
		return null;
	}

	@Override
	protected SpawnListEntry[] getCreatures() {
		return null;
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		final short grassBlockID = (short) GalacticraftPixelEarth.pixelGrass.blockID;
		final byte grassBlockMeta = 5;
		return new BlockMetaPair(grassBlockID,grassBlockMeta);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		final short dirtBlockID = (short) GalacticraftPixelEarth.pixelDirt.blockID;
		final byte dirtBlockMeta = 3;
		return new BlockMetaPair(dirtBlockID,dirtBlockMeta);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		final short stoneBlockID = (short) GalacticraftPixelEarth.pixelStone.blockID;
		final byte stoneBlockMeta = 4;
		return new BlockMetaPair(stoneBlockID,stoneBlockMeta);
	}

	@Override
	public double getHeightModifier() {
		return 15D;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		return 7D;
	}

	@Override
	public double getMountainHeightModifier() {
		return 10D;
	}

	@Override
	public double getValleyHeightModifier() {
		return 4D;
	}

	@Override
	public int getCraterProbability() {
		return 0;
	}

}
