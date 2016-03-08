package com.ramilego.pixelgalaxy.items.pixelTrix;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PixeltrixChangerSpeedMode extends Item {
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity)
	{
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);
		
		if(true)
		{
				if(true)
				{
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.PixeltrixitemChangerNormal, 1));
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_speedMode, 1));
					
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerSpeedMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerShotMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerSpringMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerFirerMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerPlanterMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerIlluminati);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerVoltMode);
					if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_changerEndermanDNA);
				}		
		}
			
			return itemstack;
	}

}
