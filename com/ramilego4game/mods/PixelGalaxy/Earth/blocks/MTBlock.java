package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import micdoodle8.mods.galacticraft.api.block.IPartialSealableBlock;
import micdoodle8.mods.galacticraft.api.block.IPlantableBlock;
import micdoodle8.mods.galacticraft.api.block.ITerraformableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MTBlock extends Block implements ITerraformableBlock, IPlantableBlock, IPartialSealableBlock{
	private String TN;

	public MTBlock(int id, Material material,String texturen) {
		super(id, material);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
		TN = texturen;
	}
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		topIcon = icon.registerIcon(TN + "_top");
		bottomIcon = icon.registerIcon(TN + "_bottom");
		sideIcon = icon.registerIcon(TN + "_side");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		if(side == 0){
			return bottomIcon;
		}else if(side == 1){
			return topIcon;
		}else{
			return sideIcon;
		}
	}

	@Override
	public boolean isTerraformable(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public int requiredLiquidBlocksNearby() {
		return 0;
	}

	@Override
	public boolean isPlantable(int metadata) {
		if (metadata >= 5 && metadata <= 13)
		{
			return true;
		}

		return false;
	}

	@Override
	public boolean isSealed(World world, int x, int y, int z,ForgeDirection direction) {
		return true;
	}
}
