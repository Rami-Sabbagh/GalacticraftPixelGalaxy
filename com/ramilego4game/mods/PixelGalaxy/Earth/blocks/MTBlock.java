package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MTBlock extends Block{
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
}
