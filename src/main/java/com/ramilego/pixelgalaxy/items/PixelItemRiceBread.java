package com.ramilego.pixelgalaxy.items;

import com.ramilego.pixelgalaxy.PixelCreativeTab;

import net.minecraft.client.main.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PixelItemRiceBread extends ItemFood
{
	private PotionEffect[] effects;
	
	public PixelItemRiceBread(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
	    super(healAmount, saturationModifier, wolvesFavorite);
	    this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	    this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	        
	    for (int i = 0; i < effects.length; i ++) {
	        if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
	            player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
	    }
	}
}
