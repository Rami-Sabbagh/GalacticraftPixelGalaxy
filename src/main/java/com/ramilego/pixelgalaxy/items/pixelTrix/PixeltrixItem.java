package com.ramilego.pixelgalaxy.items.pixelTrix;

import java.util.List;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PixeltrixItem extends Item {
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity)
	{
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);
		
		if(true)
		{
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerSpeedMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerShotMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerSpringMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerFirerMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerPlanterMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerVoltMode, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerIlluminati, 1));
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_changerEndermanDNA, 1));
			
		}

		if(true)
		{
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix);
		}
			
			return itemstack;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
	{
		list.add("The pixeltrix is a weapon in pixel universe.");
		list.add("it uesd with boss in war on greenPixel.");
	}

}
