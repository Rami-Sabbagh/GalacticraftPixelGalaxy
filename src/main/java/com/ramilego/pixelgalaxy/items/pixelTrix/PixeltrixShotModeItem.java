package com.ramilego.pixelgalaxy.items.pixelTrix;

import java.util.List;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PixeltrixShotModeItem extends Item {

public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, final EntityPlayer par3EntityPlayer){

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(Items.arrow))
        {
            float f = 1.0F;

            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F)
            {

				public void onCollideWithPlayer(EntityPlayer entity){
					super.onCollideWithPlayer(entity);
					int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
					int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
					int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
					World world = this.worldObj;
					
				}

            	public void onUpdate(){
				     super.onUpdate();
				     int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
				     int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
				     int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
				     World world = this.worldObj;
				     Entity entity = (Entity)par3EntityPlayer;
				     
				     if (this.worldObj.getBlock(i, j, k) != Blocks.air || this.worldObj.getBlock(i, j-1, k) != Blocks.air ||
				     this.worldObj.getBlock(i, j+1, k) != Blocks.air ||
				     this.worldObj.getBlock(i+1, j, k) != Blocks.air || this.worldObj.getBlock(i-1, j, k) != Blocks.air
				     || this.worldObj.getBlock(i, j, k+1) != Blocks.air || this.worldObj.getBlock(i, j, k-1) != Blocks.air){
				       	
				       	this.kill();
				     }

            	}

            	};

                entityarrow.setIsCritical(true);
                entityarrow.setDamage(10.0);
                entityarrow.setKnockbackStrength(1);

                par1ItemStack.damageItem(1, par3EntityPlayer);
            	par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
            }
            World world = par2World;
            EntityPlayer entity = par3EntityPlayer;
			int i = (int)entity.posX;
			int j = (int)entity.posY;
			int k = (int)entity.posZ;
            
        }

        return par1ItemStack;
}
   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
   {
	   list.add("This shot mode is need some arrow");
	   list.add("same the bow but this can shot faster bow");
	   list.add("and take more damage with this!");
   }
   
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
}