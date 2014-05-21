package com.ramilego4game.mods.PixelGalaxy.Earth.world.gen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureStart;
import cpw.mods.fml.common.FMLLog;

public class GCPixelEarthMapGenVillage extends MapGenStructure
{
	public static List<BiomeGenBase> villageSpawnBiomes = Arrays.asList(new BiomeGenBase[] { GCPixelEarthBiomeGenBase.moonFlat });
	private final int terrainType;
	private static boolean initialized;

	static
	{
		try
		{
			GCPixelEarthMapGenVillage.initiateStructures();
		}
		catch (Throwable e)
		{
			;
		}
	}

	public static void initiateStructures() throws Throwable
	{
		if (!GCPixelEarthMapGenVillage.initialized)
		{
			MapGenStructureIO.func_143034_b(GCPixelEarthStructureVillageStart.class, "MoonVillage");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageField.class, "MoonField1");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageField2.class, "MoonField2");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageHouse.class, "MoonHouse");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageRoadPiece.class, "MoonRoadPiece");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillagePathGen.class, "MoonPath");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageTorch.class, "MoonTorch");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageStartPiece.class, "MoonWell");
			MapGenStructureIO.func_143031_a(GCPixelEarthComponentVillageWoodHut.class, "MoonWoodHut");
		}

		GCPixelEarthMapGenVillage.initialized = true;
	}

	public GCPixelEarthMapGenVillage()
	{
		this.terrainType = 0;
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int i, int j)
	{
		final byte numChunks = 32;
		final byte offsetChunks = 8;
		final int oldi = i;
		final int oldj = j;

		if (i < 0)
		{
			i -= numChunks - 1;
		}

		if (j < 0)
		{
			j -= numChunks - 1;
		}

		int randX = i / numChunks;
		int randZ = j / numChunks;
		final Random var7 = this.worldObj.setRandomSeed(i, j, 10387312);
		randX *= numChunks;
		randZ *= numChunks;
		randX += var7.nextInt(numChunks - offsetChunks);
		randZ += var7.nextInt(numChunks - offsetChunks);

		if (oldi == randX && oldj == randZ)
		{
			return true;
		}

		return false;
	}

	@Override
	protected StructureStart getStructureStart(int par1, int par2)
	{
		FMLLog.info("Generating Moon Village at x" + par1 * 16 + " z" + par2 * 16);
		return new GCPixelEarthStructureVillageStart(this.worldObj, this.rand, par1, par2, this.terrainType);
	}

	@Override
	public String func_143025_a()
	{
		return "MoonVillage";
	}
}
