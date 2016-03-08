package com.ramilego.pixelgalaxy.items.pixelTrix;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import java.util.List;
import java.util.Random;

import com.ramilego.pixelgalaxy.entity.objs.EntityBigFireBall;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryNamespaced;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class UltimatePixeltrixFirerModeItem extends Item
{  

    public int getItemEnchantability()
    {
      return 0;
    }
    
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
      return 0;
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
      return 1.0F;
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
    {
      list.add("This mode Can Shoot Fire!!!");
      list.add("Thank you FireBalls For Players Mod");
    }
    
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
      if (!world.isRemote)
      {
        Vec3 v3 = player.getLook(1.0F);
        
        EntityBigFireBall smallfireball = new EntityBigFireBall(world, player.posX, player.posY + player.eyeHeight, player.posZ, v3.xCoord, v3.yCoord, v3.zCoord);
        
        smallfireball.shootingEntity = player;
        
        
        world.spawnEntityInWorld(smallfireball);
      }
      return itemStack;
    }
    
    public boolean hitEntity(ItemStack item, EntityLivingBase hitEntity, EntityLivingBase attackingEntity)
    {
      hitEntity.setFire(4);return true;
    }

 }