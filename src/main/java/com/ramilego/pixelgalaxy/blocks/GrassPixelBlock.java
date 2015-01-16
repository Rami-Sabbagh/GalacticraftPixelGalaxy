package com.ramilego.pixelgalaxy.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class GrassPixelBlock extends Block {

	private String TN;

	public GrassPixelBlock(Material material,String texturen) {
		super(material);
		setCreativeTab(PixelCreativeTab.PixelBlocksTab);
		TN = texturen;
	}
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		topIcon = icon.registerIcon(TN + "_top");
		bottomIcon = icon.registerIcon(TN + "_bottom");
		sideIcon = icon.registerIcon(TN + "_side");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
		if(side == 0){
			return bottomIcon;
		}else if(side == 1){
			return topIcon;
		}else{
			return sideIcon;
		}
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(PixelGalaxyBlocks.pixelDirt);
    }
}
