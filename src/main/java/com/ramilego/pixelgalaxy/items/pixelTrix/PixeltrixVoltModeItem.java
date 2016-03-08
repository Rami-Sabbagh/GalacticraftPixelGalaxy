package com.ramilego.pixelgalaxy.items.pixelTrix;

import java.util.List;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class PixeltrixVoltModeItem extends Item
{  
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
  {
    par2List.add("This Volt Mode is lighting!!!");
    par2List.add("Thank you lightningstick mod");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    if ((par3EntityPlayer.capabilities.isCreativeMode) || (par3EntityPlayer.inventory.hasItem(PixelGalaxyItems.pixeltrix_voltMode)))
    {
      float f = 1.0F;
      
      float f1 = par3EntityPlayer.prevRotationPitch + (par3EntityPlayer.rotationPitch - par3EntityPlayer.prevRotationPitch) * f;
      float f2 = par3EntityPlayer.prevRotationYaw + (par3EntityPlayer.rotationYaw - par3EntityPlayer.prevRotationYaw) * f;
      
      double d = f;
      
      double d1 = par3EntityPlayer.prevPosX + (par3EntityPlayer.posX - par3EntityPlayer.prevPosX) * d;
      double d2 = par3EntityPlayer.prevPosY + (par3EntityPlayer.posY - par3EntityPlayer.prevPosY) * d + 1.62D - par3EntityPlayer.yOffset;
      double d3 = par3EntityPlayer.prevPosZ + (par3EntityPlayer.posZ - par3EntityPlayer.prevPosZ) * d;
      
      Vec3 vec1 = Vec3.createVectorHelper(d1, d2, d3);
      
      float f11 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
      float f12 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
      float f13 = -MathHelper.cos(-f1 * 0.01745329F);
      float f14 = MathHelper.sin(-f1 * 0.01745329F);
      
      float f15 = f12 * f13;
      float f16 = f14;
      float f17 = f11 * f13;
      
      double d11 = 5000.0D;
      
      Vec3 vec2 = vec1.addVector(f15 * d11, f16 * d11, f17 * d11);
      
      MovingObjectPosition position = par2World.func_147447_a(vec1, vec2, false, true, true);
      if ((position != null) && (position.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK))
      {
        int x = position.blockX;
        int y = position.blockY;
        int z = position.blockZ;
        
        EntityLightningBolt lightning = new EntityLightningBolt(par2World, x, y, z);
        
        par2World.spawnEntityInWorld(lightning);
        if ((par3EntityPlayer.capabilities.isCreativeMode) || (par3EntityPlayer.inventory.hasItem(PixelGalaxyItems.pixeltrix_voltMode)))
        {
        }
        return par1ItemStack;
      }
      return par1ItemStack;
    }
    return par1ItemStack;
  }
}
