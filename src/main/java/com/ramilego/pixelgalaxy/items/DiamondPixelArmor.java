package com.ramilego.pixelgalaxy.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;

public class DiamondPixelArmor extends ItemArmor {

	public DiamondPixelArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == PixelGalaxyItems.diamondPixelHelmet || stack.getItem() == PixelGalaxyItems.diamondPixelChestplate || stack.getItem() == PixelGalaxyItems.diamondPixelBoots)
		{
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/DiamondPixel1.png";
		}else if(stack.getItem() == PixelGalaxyItems.pixelizerLeggings) {
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/DiamondPixel2.png";
		}else{
			return null;
		}
	}

}

