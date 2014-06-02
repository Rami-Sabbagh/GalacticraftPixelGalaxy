package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import micdoodle8.mods.galacticraft.api.block.IPlantableBlock;
import micdoodle8.mods.galacticraft.api.block.ITerraformableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class DirtBlock extends Block implements ITerraformableBlock, IPlantableBlock{

	public DirtBlock(int id, Material material) {
		super(id, material);
	}
	
	@Override
	public boolean isTerraformable(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public int requiredLiquidBlocksNearby() {
		return 1;
	}

	@Override
	public boolean isPlantable(int metadata) {
		return true;
	}
}
