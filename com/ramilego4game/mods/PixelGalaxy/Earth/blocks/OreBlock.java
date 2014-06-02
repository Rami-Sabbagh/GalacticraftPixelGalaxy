package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import micdoodle8.mods.galacticraft.api.block.IDetectableResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class OreBlock extends Block implements IDetectableResource{

	public OreBlock(int id, Material material) {
		super(id, material);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}

	@Override
	public boolean isValueable(int metadata) {
		switch (metadata)
		{
		case 0:
			return true;
		case 1:
			return true;
		case 2:
			return true;
		default:
			return false;
		}
	}
	
	
}
