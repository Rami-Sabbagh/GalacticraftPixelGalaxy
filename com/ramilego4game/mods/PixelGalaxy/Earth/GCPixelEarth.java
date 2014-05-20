package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.api.world.IPlanet;
import net.minecraft.world.WorldProvider;

import com.ramilego4game.mods.PixelGalaxy.Earth.client.GCPixelEarthMap;
import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

public class GCPixelEarth implements IPlanet{
	private final IMapObject pearth = new GCPixelEarthMap();

	@Override
	public String getName() {
		return "PixelEarth";
	}

	@Override
	public boolean isReachable() {
		return false;
	}

	@Override
	public IMapObject getMapObject() {
		return this.pearth;
	}

	@Override
	public boolean addToList() {
		return false;
	}

	@Override
	public boolean autoRegister() {
		return false;
	}

	@Override
	public Class<? extends WorldProvider> getWorldProvider() {
		return null;
	}
	

	@Override
	public int getDimensionID() {
		return GalacticraftPixelEarth.dimearth;
	}

	@Override
	public IGalaxy getParentGalaxy() {
		return GalacticraftPixelGalaxy.PixelGalaxy;
	}

	@Override
	public boolean forceStaticLoad() {
		return false;
	}

}
