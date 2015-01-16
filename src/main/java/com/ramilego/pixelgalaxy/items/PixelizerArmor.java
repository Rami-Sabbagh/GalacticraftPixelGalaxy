package com.ramilego.pixelgalaxy.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;

public class PixelizerArmor extends ItemArmor {

	public PixelizerArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == PixelGalaxyItems.pixelizerHelmet || stack.getItem() == PixelGalaxyItems.pixelizerChestplate || stack.getItem() == PixelGalaxyItems.pixelizerBoots)
		{
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelizer1.png";
		}else if(stack.getItem() == PixelGalaxyItems.pixelizerLeggings) {
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/pixelizer2.png";
		}else{
			return null;
		}
	}

}
