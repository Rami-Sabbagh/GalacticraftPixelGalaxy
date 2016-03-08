package com.ramilego.pixelgalaxy.blocks.plants;

import java.util.Random;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class PixelRiceBlock extends BlockCrops 
{
	
    public PixelRiceBlock()
    {
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundTypeGrass);
        this.disableStats();
    }
        
    protected boolean canPlaceBlockOn(Block FarmlandPixel)
    {
        return FarmlandPixel == PixelGalaxyBlocks.FarmlandPixel;
    }
    
	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i()
    {
        return PixelGalaxyItems.pixelRiceSeed;
    }
	
	/**
	 * crop
	 */
	@Override
    protected Item func_149865_P()
    {
        return PixelGalaxyItems.pixelRice;
    }
	
}
