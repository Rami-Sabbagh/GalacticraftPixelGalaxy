package com.ramilego.pixelgalaxy.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PixelWood extends PixelItem {
	
	public PixelWood(){
		super();
	}
	
	//@SideOnly(Side.SERVER)
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
		Block onBlock = world.getBlock(x, y, z);
		if (onBlock == PixelGalaxyBlocks.pixelWoodBlock) {
			int onMeta = world.getBlockMetadata(x, y, z);
			if (onMeta < 4) {
				world.setBlockMetadataWithNotify(x, y, z, ++onMeta, 1 + 2);
				--stack.stackSize;
				return true;
			}
		}
		return false;
	}
	
}
