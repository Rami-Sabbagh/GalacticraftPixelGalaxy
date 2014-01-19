package com.ramilego4game.mods.PixelGalaxy.Sun.client;

import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

public class GCPixelSunMap implements IMapObject{

	@Override
	public float getPlanetSize() {
		return 108f;
	}

	@Override
	public float getDistanceFromCenter() {
		return 0;
	}

	@Override
	public float getPhaseShift() {
		return 0;
	}

	@Override
	public float getStretchValue() {
		return 0;
	}

	@Override
	public ICelestialBodyRenderer getSlotRenderer() {
		return new GCPixelSunSlotRender();
	}

	@Override
	public IGalaxy getParentGalaxy() {
		return GalacticraftPixelGalaxy.PixelGalaxy;
	}

}
