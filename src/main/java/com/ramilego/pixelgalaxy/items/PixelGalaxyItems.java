package com.ramilego.pixelgalaxy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.ramilego.pixelgalaxy.Constants;;

public class PixelGalaxyItems {
	
	public static Item pixelizerIngot;
	public static Item diamondPixel;
	public static Item ironPixelIngot;
	
	//pixelizer tools
	public static Item pixelizerSword;
	public static Item pixelizerHoe;
	public static Item pixelizerPickaxe;
	public static Item pixelizerShovel;
	public static Item pixelizerAxe;
	
	//diamondPixel tools
	public static Item diamondPixelSword;
	public static Item diamondPixelHoe;
	public static Item diamondPixelPickaxe;
	public static Item diamondPixelShovel;
	public static Item diamondPixelAxe;
	
	//ironPixel tools
	public static Item ironPixelSword;
	public static Item ironPixelHoe;
	public static Item ironPixelPickaxe;
	public static Item ironPixelShovel;
	public static Item ironPixelAxe;
	
	//pixelizer Armors
	public static Item pixelizerHelmet;
	public static Item pixelizerChestplate;
	public static Item pixelizerLeggings;
	public static Item pixelizerBoots;
	
	//diamondpixel armor
	public static Item diamondPixelHelmet;
	public static Item diamondPixelChestplate;
	public static Item diamondPixelLeggings;
	public static Item diamondPixelBoots;
	
	public static Item pixelWoodItem;
	public static Item pixelWoodStickItem;
	
	static ToolMaterial ironPixelToolMaterial = EnumHelper.addToolMaterial("ironPixelToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ToolMaterial diamondPixelToolMaterial = EnumHelper.addToolMaterial("diamondPixelToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ToolMaterial pixelizerToolMaterial = EnumHelper.addToolMaterial("pixelizerToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ArmorMaterial pixelizerArmorMaterial = EnumHelper.addArmorMaterial("pixelizerArmorMaterial", 44, new int[]{4, 9, 7, 4}, 15);
	static ArmorMaterial diamondPixelMaterial = EnumHelper.addArmorMaterial("diamondPixelMaterial", 44, new int[]{4, 9, 7, 4}, 15);
	
	public static void registerItems(){
		
		pixelWoodItem = new PixelWood().setUnlocalizedName("pixelWoodItem").setTextureName(Constants.TEXTURE_PREFIX + "pixelWoodItem");
		pixelWoodStickItem = new PixelWood().setUnlocalizedName("pixelWoodStick").setTextureName(Constants.TEXTURE_PREFIX + "pixelWoodStickItem");
		
		GameRegistry.registerItem(pixelWoodStickItem, "pixelWoodStick");
		GameRegistry.registerItem(pixelWoodItem, "pixelWoodItem");
		
		pixelizerIngot = new PixelItem().setUnlocalizedName("pixelizerIngot").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerIngot");
		diamondPixel = new PixelItem().setUnlocalizedName("diamondPixel").setTextureName(Constants.TEXTURE_PREFIX + "diamondpixel");
		ironPixelIngot = new PixelItem().setUnlocalizedName("ironPixelIngot").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelIngot");
		
		GameRegistry.registerItem(ironPixelIngot, "ironPixelIngot");
		GameRegistry.registerItem(diamondPixel, "diamondPixel");
		GameRegistry.registerItem(pixelizerIngot, "pixelizerIngot");
		
		pixelizerSword = new PixelSword(pixelizerToolMaterial).setUnlocalizedName("pixelizerSword").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerSword");
		pixelizerHoe = new PixelHoe(pixelizerToolMaterial).setUnlocalizedName("pixelizerHoe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHoe");
		pixelizerPickaxe = new PixelPickaxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerPickaxe");
		pixelizerShovel = new PixelShovel(pixelizerToolMaterial).setUnlocalizedName("pixelizerShovel").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerShovel");
		pixelizerAxe = new PixelAxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerAxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerAxe");
		
		diamondPixelSword = new PixelSword(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelSword");
		diamondPixelHoe = new PixelHoe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelHoe");
		diamondPixelPickaxe = new PixelPickaxe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelPickaxe");
		diamondPixelShovel = new PixelShovel(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelShovel");
		diamondPixelAxe = new PixelAxe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelAxe");
		
		ironPixelSword = new PixelSword(ironPixelToolMaterial).setUnlocalizedName("ironPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelSword");
		ironPixelHoe = new PixelHoe(ironPixelToolMaterial).setUnlocalizedName("ironPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelHoe");
		ironPixelPickaxe = new PixelPickaxe(ironPixelToolMaterial).setUnlocalizedName("ironPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelpickaxe");
		ironPixelShovel = new PixelShovel(ironPixelToolMaterial).setUnlocalizedName("ironPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelShovel");
		ironPixelAxe = new PixelAxe(ironPixelToolMaterial).setUnlocalizedName("ironPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelAxe");
		
		GameRegistry.registerItem(ironPixelSword, "ironPixelSword");
		GameRegistry.registerItem(ironPixelHoe, "ironPixelHoe");
		GameRegistry.registerItem(ironPixelPickaxe, "ironPixelPickaxe");
		GameRegistry.registerItem(ironPixelShovel, "ironPixelShovel");
		GameRegistry.registerItem(ironPixelAxe, "ironPixelAxe");
		GameRegistry.registerItem(pixelizerSword, "pixelizerSword");
		GameRegistry.registerItem(pixelizerHoe, "pixelizerHoe");
		GameRegistry.registerItem(pixelizerPickaxe, "pixelizerPickaxe");
		GameRegistry.registerItem(pixelizerShovel, "pixelizerShovel");
		GameRegistry.registerItem(pixelizerAxe, "pixelizerAxe");
		GameRegistry.registerItem(diamondPixelSword, "diamondPixelSword");
		GameRegistry.registerItem(diamondPixelHoe, "diamondPixelHoe");
		GameRegistry.registerItem(diamondPixelPickaxe, "diamondPixelPickaxe");
		GameRegistry.registerItem(diamondPixelShovel, "diamondPixelShovel");
		GameRegistry.registerItem(diamondPixelAxe, "diamondPixelAxe");
		
		pixelizerHelmet = new PixelizerArmor(pixelizerArmorMaterial, 3, 0).setUnlocalizedName("pixelizerHelmet").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHelmet");
		pixelizerChestplate = new PixelizerArmor(pixelizerArmorMaterial, 3, 1).setUnlocalizedName("pixelizerChestplate").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerChestplate");
		pixelizerLeggings = new PixelizerArmor(pixelizerArmorMaterial, 3, 2).setUnlocalizedName("pixelizerLeggings").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerLeggings");
		pixelizerBoots = new PixelizerArmor(pixelizerArmorMaterial, 3, 3).setUnlocalizedName("pixelizerBoots").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerBoots");
		
		diamondPixelHelmet = new DiamondPixelArmor(diamondPixelMaterial, 3, 0).setUnlocalizedName("diamondPixelHelmet").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelHelmet");
		diamondPixelChestplate = new DiamondPixelArmor(diamondPixelMaterial, 3, 1).setUnlocalizedName("diamondPixelChestplate").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelChestplate");
		diamondPixelLeggings = new DiamondPixelArmor(diamondPixelMaterial, 3, 2).setUnlocalizedName("diamondPixelLeggings").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelLeggings");
		diamondPixelBoots = new DiamondPixelArmor(diamondPixelMaterial, 3, 3).setUnlocalizedName("diamondPixelBoots").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelBoots");
		
		GameRegistry.registerItem(diamondPixelHelmet, "diamondPixelHelmet");
		GameRegistry.registerItem(diamondPixelChestplate, "diamondPixelChestplate");
		GameRegistry.registerItem(diamondPixelLeggings, "diamondPixelLeggings");
		GameRegistry.registerItem(diamondPixelBoots, "diamondPixelBoots");
		
		GameRegistry.registerItem(pixelizerHelmet, "pixelizerHelmet");
		GameRegistry.registerItem(pixelizerChestplate, "pixelizerChestplate");
		GameRegistry.registerItem(pixelizerLeggings, "pixelizerLeggings");
		GameRegistry.registerItem(pixelizerBoots, "pixelizerBoots");
	}
}
