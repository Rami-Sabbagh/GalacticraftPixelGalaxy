package com.ramilego.pixelgalaxy.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class PixelPumpkinBlock extends Block implements IGrowable {
	public PixelPumpkinBlock(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
		this.setHardness(2.5F);
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
		topIcon = icon.registerIcon(this.getTextureName() + "_top");
		bottomIcon = icon.registerIcon(this.getTextureName() + "_bottom");
		sideIcon = icon.registerIcon(this.getTextureName() + "_side");
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
        return Item.getItemFromBlock(PixelGalaxyBlocks.pixelPumpkin);
    }
	
	private void decreaseItemDamage(ItemStack currentEquippedItem, int i, EntityPlayer player) {
		
	}

	@Override
	public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }

	@Override
    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return true;
    }

	@Override
	public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_,
			int p_149853_5_) 
	{
		
	}
		
}