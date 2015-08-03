package com.ramilego.pixelgalaxy.blocks;

import java.util.List;
import java.util.Random;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class WoodPixelBlock extends NormalPixelBlock {	
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_0;
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_1;
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_2;
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_3;
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_4;
	@SideOnly(Side.CLIENT)
	public static IIcon Icon_5;

	public WoodPixelBlock(Material material) {
		super(material);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelwood");
	}
	
	@Override
	public int damageDropped(int meta) {
	    return meta;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.Icon_0 = icon.registerIcon(this.getTextureName() + "_0");
		this.Icon_1 = icon.registerIcon(this.getTextureName() + "_1");
		this.Icon_2 = icon.registerIcon(this.getTextureName() + "_2");
		this.Icon_3 = icon.registerIcon(this.getTextureName() + "_3");
		this.Icon_4 = icon.registerIcon(this.getTextureName() + "_4");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {	    
	    switch (meta){
	    	case 0:
	    		return this.Icon_0;
	    	case 1:
	    		return this.Icon_1;
	    	case 2:
	    		return this.Icon_2;
	    	case 3:
	    		return this.Icon_3;
	    	case 4:
	    		return this.Icon_4;
	    	default:
	    		return this.Icon_0;
	    }
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 5; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z)
    {
		int meta = world.getBlockMetadata(x, y, z); int hardness = meta*2 + 1;
		return hardness > 1 ? (float) hardness : 1.0f;
    }
	
	@Override
    public boolean isOpaqueCube()
    {
		return false;
    }

	@Override
    public boolean renderAsNormalBlock()
    {
        return true;
    }
	
	@Override
	public boolean isNormalCube(){
		return true;
	}
	
	@Override
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z){
		int thisMeta = world.getBlockMetadata(x, y, z);
		if (thisMeta > 3) { return true; } else { return false; }
	}
	
}