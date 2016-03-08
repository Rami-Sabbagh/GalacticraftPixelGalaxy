package com.ramilego.pixelgalaxy.items.pixelTrix;


import java.util.List;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.entity.objs.EntitySeedShot;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PixeltrixPlanterModeItem extends Item
{
	public PixeltrixPlanterModeItem()
	{}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity)
	{
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		if(true)
		{
			
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_PlanterMode_BombSeed, 1));
	
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(PixelGalaxyItems.pixeltrix_PlanterMode);
		}
		
		return itemstack;


	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
	{
	   list.add("This mode is planter");
	   list.add("it can use many seed to actack");
	}

	private void playSoundEffect(double posX, double posY, double posZ, String string, float f, float g) {
		
	}

}