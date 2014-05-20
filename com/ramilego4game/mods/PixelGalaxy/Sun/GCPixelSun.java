package com.ramilego4game.mods.PixelGalaxy.Sun;

import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.api.world.IPlanet;
import net.minecraft.world.WorldProvider;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;
import com.ramilego4game.mods.PixelGalaxy.Sun.client.GCPixelSunMap;

public class GCPixelSun implements IPlanet{

	@Override
	public String getName() {
		return "PixelSun";
	}

	@Override
	public boolean isReachable() {
		return false;
	}

	@Override
	public IMapObject getMapObject() {
		return new GCPixelSunMap();
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
