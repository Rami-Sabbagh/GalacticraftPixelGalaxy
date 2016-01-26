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

public class GrassPixelBlock extends Block implements IGrowable {
	public GrassPixelBlock(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
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
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, PixelGalaxyBlocks.pixelDirt);
            }
            else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                    Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);

                    if (p_149674_1_.getBlock(i1, j1, k1) == PixelGalaxyBlocks.pixelDirt && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        p_149674_1_.setBlock(i1, j1, k1, PixelGalaxyBlocks.greenGrass);
                    }
                }
            }
        }
    }
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
	  if(!world.isRemote){
	   if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.pixelizerHoe){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.FarmlandPixel);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.diamondPixelHoe){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.FarmlandPixel);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.ironPixelHoe){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.FarmlandPixel);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.stonePixelHoe){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.FarmlandPixel);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.woodPixelHoe){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.FarmlandPixel);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.ironPixelShovel){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.pixelGrassPath);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.woodPixelShovel){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.pixelGrassPath);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.stonePixelShovel){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.pixelGrassPath);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.pixelizerShovel){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.pixelGrassPath);
		    return true;
	   }
	   else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == PixelGalaxyItems.diamondPixelShovel){
		    world.setBlock(x, y, z, PixelGalaxyBlocks.pixelGrassPath);
		    return true;
	   }
	
	  }
	  return false;
    }
    
    
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(PixelGalaxyBlocks.pixelDirt);
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