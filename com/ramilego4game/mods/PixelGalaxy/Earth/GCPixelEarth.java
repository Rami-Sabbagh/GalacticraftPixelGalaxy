package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.api.world.IPlanet;
import net.minecraft.world.WorldProvider;

import com.ramilego4game.mods.PixelGalaxy.Earth.client.GCPixelEarthMap;
import com.ramilego4game.mods.PixelGalaxy.Earth.world.gen.GCPixelEarthWorldProvider;
import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

public class GCPixelEarth implements IPlanet{

	@Override
	public String getName() {
		return "PixelEarth";
	}

	@Override
	public boolean isReachable() {
		return true;
	}

	@Override
	public IMapObject getMapObject() {
		return new GCPixelEarthMap();
	}

	@Override
	public boolean addToList() {
		return true;
	}

	@Override
	public boolean autoRegister() {
		return true;
	}

	@Override
	public Class<? extends WorldProvider> getWorldProvider() {
		return GCPixelEarthWorldProvider.class;
	}

	@Override
	public int getDimensionID() {
		return -1;
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
