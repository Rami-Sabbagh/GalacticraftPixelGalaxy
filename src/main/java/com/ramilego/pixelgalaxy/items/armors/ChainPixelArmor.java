package com.ramilego.pixelgalaxy.items.armors;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

public class ChainPixelArmor extends ItemArmor {

	public ChainPixelArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == PixelGalaxyItems.ChainPixelHelmet || stack.getItem() == PixelGalaxyItems.ChainPixelChestplate || stack.getItem() == PixelGalaxyItems.ChainPixelBoots)
		{
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelchainmaillayer1.png";
		}else if(stack.getItem() == PixelGalaxyItems.ChainPixelLeggings) {
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelchainmaillayer2.png";
		}else{
			return null;
		}
	}

}

