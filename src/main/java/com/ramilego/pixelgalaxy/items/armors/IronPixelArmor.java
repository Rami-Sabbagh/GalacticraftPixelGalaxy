package com.ramilego.pixelgalaxy.items.armors;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

public class IronPixelArmor extends ItemArmor {

	public IronPixelArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(PixelCreativeTab.PixelItemsTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == PixelGalaxyItems.ironPixelHelmet || stack.getItem() == PixelGalaxyItems.ironPixelChestplate || stack.getItem() == PixelGalaxyItems.ironPixelBoots)
		{
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/IronPixel1.png";
		}else if(stack.getItem() == PixelGalaxyItems.ironPixelLeggings) {
			return Constants.TEXTURE_PREFIX + "/textures/model/armor/IronPixel2.png";
		}else{
			return null;
		}
	}

}

