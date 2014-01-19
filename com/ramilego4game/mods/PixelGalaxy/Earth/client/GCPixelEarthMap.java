package com.ramilego4game.mods.PixelGalaxy.Earth.client;

import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

public class GCPixelEarthMap implements IMapObject{

	@Override
	public float getPlanetSize() {
		return 25f;
	}

	@Override
	public float getDistanceFromCenter() {
		return 1f;
	}

	@Override
	public float getPhaseShift() {
		return 2160f;
	}

	@Override
	public float getStretchValue() {
		return 1f;
	}

	@Override
	public ICelestialBodyRenderer getSlotRenderer() {
		return new GCPixelEarthSlotRender();
	}

	@Override
	public IGalaxy getParentGalaxy() {
		return GalacticraftPixelGalaxy.PixelGalaxy;
	}

}
