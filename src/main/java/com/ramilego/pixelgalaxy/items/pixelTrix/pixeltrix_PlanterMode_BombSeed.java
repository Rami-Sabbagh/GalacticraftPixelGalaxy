package com.ramilego.pixelgalaxy.items.pixelTrix;


import com.ramilego.pixelgalaxy.entity.objs.EntitySeedShot;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class pixeltrix_PlanterMode_BombSeed extends Item
{
public pixeltrix_PlanterMode_BombSeed()
{
}

@Override
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{

if (!par2World.isRemote)
{
	
par2World.spawnEntityInWorld(new EntitySeedShot(par2World, par3EntityPlayer));
 --par1ItemStack.stackSize;
}
if(true)
{
	if(par3EntityPlayer instanceof EntityPlayer)((EntityPlayer)par3EntityPlayer).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixeltrix_PlanterMode, 1));

}return par1ItemStack;
}


}