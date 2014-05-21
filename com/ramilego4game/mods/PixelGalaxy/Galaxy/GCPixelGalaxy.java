package com.ramilego4game.mods.PixelGalaxy.Galaxy;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import net.minecraft.util.StatCollector;

public class GCPixelGalaxy implements IGalaxy
{

	@Override
	public String getGalaxyName() {
		return "PixelGalaxy";
	}

	@Override
	public int getXCoord() {
		return 1;
	}

	@Override
	public int getYCoord() {
		return 1;
	}

	@Override
	public Vector3 getRGBRingColors() {
		return new Vector3(256.0D / 256.0D, 256.0D / 256.0D, 50.0D / 256.0D);
	}
	
}
