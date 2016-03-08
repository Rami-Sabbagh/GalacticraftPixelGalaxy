package com.ramilego.pixelgalaxy.items.armors;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

public class LeatherPixelArmor extends ItemArmor {

	public LeatherPixelArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == PixelGalaxyItems.pixelleather_helmet || stack.getItem() == PixelGalaxyItems.pixelleather_chestplate || stack.getItem() == PixelGalaxyItems.pixelleather_boots)
		{
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelleather_layer_1.png";
		}else if(stack.getItem() == PixelGalaxyItems.pixelleather_leggings) {
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelleather_layer_2.png";
		}else{
			return null;
		}
	}

}

