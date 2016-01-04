package com.ramilego.pixelgalaxy.blocks;

import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PixelDirtBlock extends Block {

	protected PixelDirtBlock(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
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
	  }
	  return false;
    }

}
