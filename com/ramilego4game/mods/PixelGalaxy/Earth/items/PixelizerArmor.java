package com.ramilego4game.mods.PixelGalaxy.Earth.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class PixelizerArmor extends ItemArmor{

	public PixelizerArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
		int layer) {
		if (stack.itemID == GalacticraftPixelEarth.PixelizerHelmet.itemID|| stack.itemID == GalacticraftPixelEarth.PixelizerChestplate.itemID|| stack.itemID == GalacticraftPixelEarth.PixelizerBoots.itemID) {
			return "minecraft:textures/model/armor/pixelizer_layer_1.png";
		}
		if (stack.itemID == GalacticraftPixelEarth.PixelizerLeggings.itemID) {
			return "minecraft:textures/model/armor/pixelizer_layer_2.png";
		} else {
			return null;
		}
	}
}
