package com.ramilego4game.mods.PixelGalaxy.Earth.world.gen;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCChunkProvider;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCWorldChunkManager;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.GCWorldProvider;

public class GCPixelEarthWorldProvider extends GCWorldProvider{

	@Override
	public float getGravity() {
		return 1F;
	}

	@Override
	public double getMeteorFrequency() {
		return 0;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 0.8D;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier > 1;
	}

	@Override
	public float getFallDamageModifier() {
		return 0.15F;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 20.0F;
	}

	@Override
	public Class<? extends GCChunkProvider> getChunkProviderClass() {
		return GCPixelEarthChunkProvider.class;
	}

	@Override
	public Class<? extends GCWorldChunkManager> getWorldChunkManagerClass() {
		return GCPixelEarthWorldChunkManager.class;
	}

	@Override
	public String getDimensionName() {
		return "PixelEarth";
	}

}
