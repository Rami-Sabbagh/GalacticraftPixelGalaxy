package com.ramilego.pixelgalaxy.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class OakPixelBlock extends BlockLog {
	public static final String[] woods = new String[] {"oak"};
	
	public OakPixelBlock() {
		super();
		
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.field_150167_a = new IIcon[woods.length]; //Sides Texture
        this.field_150166_b = new IIcon[woods.length]; //Top & Bottom Texture

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = icon.registerIcon(this.getTextureName() + "_" + woods[i]);
            this.field_150166_b[i] = icon.registerIcon(this.getTextureName() + "_" + woods[i] + "_top");
        }
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return PixelGalaxyItems.pixelWoodItem;
    }
	
	@Override
	public int quantityDropped(Random p_149745_1_){
		return 16;
	}
}
