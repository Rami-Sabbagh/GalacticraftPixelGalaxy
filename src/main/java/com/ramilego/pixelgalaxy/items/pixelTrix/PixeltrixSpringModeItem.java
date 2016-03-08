package com.ramilego.pixelgalaxy.items.pixelTrix;

import java.util.List;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PixeltrixSpringModeItem extends Item {

public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

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
			if(entity instanceof EntityLivingBase) ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(8, 5, 8));
		}
	}
		
		return itemstack;
}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
	{
	   list.add("This spring mode is will make you like the grasshopper!");
	   list.add("Hold it and jump!!!");
	}
   
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.none;
    }
}
