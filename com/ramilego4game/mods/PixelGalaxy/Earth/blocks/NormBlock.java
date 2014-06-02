package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import micdoodle8.mods.galacticraft.api.block.IPartialSealableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class NormBlock extends Block implements IPartialSealableBlock{

	public NormBlock(int id, Material material) {
		super(id, material);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}

	@Override
	public boolean isSealed(World world, int x, int y, int z,ForgeDirection direction) {
		return true;
	}

}
