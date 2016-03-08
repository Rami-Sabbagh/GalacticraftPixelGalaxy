package com.ramilego.pixelgalaxy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.items.armors.ChainPixelArmor;
import com.ramilego.pixelgalaxy.items.armors.DiamondPixelArmor;
import com.ramilego.pixelgalaxy.items.armors.GoldPixelArmor;
import com.ramilego.pixelgalaxy.items.armors.IronPixelArmor;
import com.ramilego.pixelgalaxy.items.armors.LeatherPixelArmor;
import com.ramilego.pixelgalaxy.items.armors.PixelizerArmor;
import com.ramilego.pixelgalaxy.items.doors.PixelItemsIronDoor;
import com.ramilego.pixelgalaxy.items.doors.PixelItemsWoodDoor;
import com.ramilego.pixelgalaxy.items.drinkable.foods.AppleJuiceItem;
import com.ramilego.pixelgalaxy.items.drinkable.potions.AlcoholDrink;
import com.ramilego.pixelgalaxy.items.drinkable.potions.NitroogenDrink;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangeIlluminatiDNAMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerEndermanDNAModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerFirerMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerPlanterMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerShotmode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerSpeedMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerSpringMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixChangerVoltMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixEndermanDNAModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixFirerModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixIlluminatiDNAModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixPlanterModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixShotModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixSpeedModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixSpringModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixVoltModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.PixeltrixitemChangerNormalItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.UltimatePixeltrixChangerFirerMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.UltimatePixeltrixFirerModeItem;
import com.ramilego.pixelgalaxy.items.pixelTrix.UltimateToPixeltrixChangerFirerMode;
import com.ramilego.pixelgalaxy.items.pixelTrix.pixeltrix_PlanterMode_BombSeed;;

public class PixelGalaxyItems {
	
	public static Item pixelizerIngot;
	public static Item diamondPixel;
	public static Item ironPixelIngot;
	public static Item blueStoneIngot;
    public static Item pixelCharCoal;
    public static Item pixelCoal;
    public static Item pixelLeather;
    public static Item pixelChain;
    public static Item pixelgoldingot;
	 
    //Buckets
    public static Item pixelWaterH3OBucket;
    public static Item pixelLavaBucket;
    
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

	//Stonepixel Tool
	public static Item stonePixelSword;
	public static Item stonePixelHoe;
	public static Item stonePixelPickaxe;
	public static Item stonePixelShovel;
	public static Item stonePixelAxe;
	
	//Woodpixel tools
	public static Item woodPixelSword;
	public static Item woodPixelHoe;
	public static Item woodPixelPickaxe;
	public static Item woodPixelShovel;
	public static Item woodPixelAxe;
	
	//pixelGold tools
	public static Item pixelGoldSword;
	public static Item pixelGoldHoe;
	public static Item pixelGoldPickaxe;
	public static Item pixelGoldShovel;
	public static Item pixelGoldAxe;
	
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
	
	//Ironpixel armor
	public static Item ironPixelHelmet;
	public static Item ironPixelChestplate;
	public static Item ironPixelLeggings;
	public static Item ironPixelBoots;
	
	//ChainPixel Armor
	public static Item ChainPixelHelmet;
	public static Item ChainPixelChestplate;
	public static Item ChainPixelLeggings;
	public static Item ChainPixelBoots;
	
	//LeatherPixel Armor
	public static Item pixelleather_helmet;
	public static Item pixelleather_chestplate;
	public static Item pixelleather_leggings;
	public static Item pixelleather_boots;
	
	//GoldPixel Armor
	public static Item pixelgold_helmet;
	public static Item pixelgold_chestplate;
	public static Item pixelgold_leggings;
	public static Item pixelgold_boots;
	
	public static Item pixelWoodItem;
	public static Item pixelWoodStickItem;
	
	public static Item pixelWheat;
	public static Item pixelWheatBread;
	public static Item pixelRice;
	public static Item pixelRiceBread;
	
	
	//Seeds
	public static Item pixelPumkinSeed;
	public static Item pixelRiceSeed;
	public static Item pixelPeaSeed;
	public static Item pixelWheatSeed;
	
	//Food
	public static Item pixelPotato;
	public static Item pixelCarrot;
	public static Item pixelBeetroot;
	public static Item pixelApple;
	public static Item pixelOrange;
	public static Item pixelPea;
	public static Item pixelBakedPotato;
	/**
	 * Meats
	 */
	public static Item pixelRewPorkchop;
	public static Item pixelCookedPorkchop;
	public static Item pixelbeefraw;
	public static Item pixelbeefcooked;
	
	//Soup or Stew
	public static Item pixelbowl;
	public static Item pixelbeetrootsoup;
	public static Item pixelPeaStew;
	public static Item pixelPotatoSoup;
	public static Item pixelCarrotSoup;
	
	//Drinkable
	public static Item pixelBottle;
	public static Item pixelNitrogenDrink;
	public static Item pixelAlcoholDrink;
	public static Item pixelAppleJuice;
	public static Item pixelOrangeJuice;
	
	//doors
	public static Item pixelDoorWood;
	public static Item pixelDoorIron;

//PixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrix
	public static Item pixeltrix;
	public static Item PixeltrixitemChangerNormal;
	
	public static Item pixeltrix_shotMode;
	public static Item pixeltrix_changerShotMode;
	
	public static Item pixeltrix_speedMode;
	public static Item pixeltrix_changerSpeedMode;
	
	public static Item pixeltrix_springMode;
	public static Item pixeltrix_changerSpringMode;
	
	public static Item pixeltrix_firerMode;
	public static Item pixeltrix_changerFirerMode;
	public static Item pixeltrix_firerMode_ultimate;
	public static Item pixeltrix_changerFirerMode_ultimate;
	public static Item pixeltrix_tochangerFirerMode_ultimate;
	
	public static Item pixeltrix_PlanterMode;
	public static Item pixeltrix_changerPlanterMode;
	public static Item pixeltrix_PlanterMode_BombSeed;
	
	public static Item pixeltrix_changerIlluminati;
	public static Item pixeltrix_Illuminati;
	
	public static Item pixeltrix_EndermanDNA;
	public static Item pixeltrix_changerEndermanDNA;
	
	public static Item pixeltrix_voltMode;
	public static Item pixeltrix_changerVoltMode;
//PixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrixPixeltrix
	
	static ToolMaterial woodPixelToolMaterial = EnumHelper.addToolMaterial("stonePixelToolMaterial", 0, 59, 2.0f, 0.0f, 15);
	static ToolMaterial stonePixelToolMaterial = EnumHelper.addToolMaterial("stonePixelToolMaterial", 1, 131, 4.0f, 1.0f, 5);
	static ToolMaterial ironPixelToolMaterial = EnumHelper.addToolMaterial("ironPixelToolMaterial", 2, 250, 6.0f, 2.0f, 14);
	static ToolMaterial diamondPixelToolMaterial = EnumHelper.addToolMaterial("diamondPixelToolMaterial", 3, 1561, 3.0f, 4.0f, 10);
	static ToolMaterial pixelizerToolMaterial = EnumHelper.addToolMaterial("pixelizerToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ToolMaterial GoldToolMaterial = EnumHelper.addToolMaterial("GoldToolMaterial", 0, 32, 12.0f, 0.0f, 22);
	static ArmorMaterial pixelizerArmorMaterial = EnumHelper.addArmorMaterial("pixelizerArmorMaterial", 44, new int[]{4, 9, 7, 4}, 15);
	static ArmorMaterial diamondPixelMaterial = EnumHelper.addArmorMaterial("diamondPixelMaterial", 33, new int[]{3, 8, 6, 3}, 10);
	static ArmorMaterial ironPixelMaterial = EnumHelper.addArmorMaterial("ironPixelMaterial", 15, new int[]{2, 6, 5, 2}, 9);
	static ArmorMaterial ChainPixelMaterial = EnumHelper.addArmorMaterial("ChainPixelMaterial", 15, new int[]{2, 5, 4, 1}, 12);
	static ArmorMaterial LeatherPixelMaterial = EnumHelper.addArmorMaterial("LeatherPixelMaterial", 10, new int[]{2, 3, 2, 1}, 8);
	static ArmorMaterial GoldPixelMaterial = EnumHelper.addArmorMaterial("GoldPixelMaterial", 7, new int[]{2, 5, 3, 1}, 25);
	
	
	public static void registerItems(){

/*5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555*/
	 	//EnderDNA
		pixeltrix_EndermanDNA = new PixeltrixEndermanDNAModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_EndermanDNA")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemEndermanDNA");
		
		pixeltrix_changerEndermanDNA = new PixeltrixChangerEndermanDNAModeItem()
				.setUnlocalizedName("pixeltrix_changerEndermanDNA")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerEndermanDNA");
		
		GameRegistry.registerItem(pixeltrix_EndermanDNA, "pixeltrix_EndermanDNA");
		GameRegistry.registerItem(pixeltrix_changerEndermanDNA, "pixeltrix_changerEndermanDNA");
		
		//Illuminati DNA
		pixeltrix_Illuminati = new PixeltrixIlluminatiDNAModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_Illuminati")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemIlluminati");
		
		GameRegistry.registerItem(pixeltrix_Illuminati, "pixeltrix_Illuminati");
		
		pixeltrix_changerIlluminati = new PixeltrixChangeIlluminatiDNAMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerIlluminati")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerIlluminatiDNA");
		
		GameRegistry.registerItem(pixeltrix_changerIlluminati, "pixeltrix_changerIlluminati");
		
		//Planter
		pixeltrix_changerPlanterMode = new PixeltrixChangerPlanterMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerPlanterMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerPlanter");
		
		pixeltrix_PlanterMode = new PixeltrixPlanterModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_PlanterMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemPlanter");
		
		GameRegistry.registerItem(pixeltrix_changerPlanterMode, "pixeltrix_changerPlanterMode");
		GameRegistry.registerItem(pixeltrix_PlanterMode, "pixeltrix_PlanterMode");
		
		//voltmode
		pixeltrix_changerVoltMode = new PixeltrixChangerVoltMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerVoltMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerVolt");
		
		pixeltrix_voltMode = new PixeltrixVoltModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_voltMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemVolt");
		
		GameRegistry.registerItem(pixeltrix_changerVoltMode, "pixeltrix_changerVoltMode");
		GameRegistry.registerItem(pixeltrix_voltMode, "pixeltrix_voltMode");
		
		//firerMode
		pixeltrix_firerMode = new PixeltrixFirerModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_firerMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemFirer");
		
		pixeltrix_changerFirerMode = new PixeltrixChangerFirerMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerFirerMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerFirer");
		
		pixeltrix_firerMode_ultimate = new UltimatePixeltrixFirerModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_firerMode_ultimate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemFirer_ultimate");
		
		pixeltrix_changerFirerMode_ultimate = new UltimatePixeltrixChangerFirerMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerFirerMode_ultimate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerFirer_ultimate");
		
		pixeltrix_tochangerFirerMode_ultimate = new UltimateToPixeltrixChangerFirerMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_tochangerFirerMode_ultimate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/ToPixeltrixitemChangerFirer_ultimate");
		
		
		//springmode
		pixeltrix_changerSpringMode = new PixeltrixChangerSpringMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerSpringMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerSpring");
		
		pixeltrix_springMode = new PixeltrixSpringModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_springMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/Pixeltrixitemspring");
		
		
		//speedmode
		pixeltrix_changerSpeedMode = new PixeltrixChangerSpeedMode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerSpeedMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerSpeed");
		pixeltrix_speedMode = new PixeltrixSpeedModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_speedMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemSpeed");
		
		
		//shotmode
		pixeltrix_changerShotMode = new PixeltrixChangerShotmode()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_changerShotMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerShot");
		pixeltrix_shotMode = new PixeltrixShotModeItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix_shotMode")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/Pixeltrixitemshot");
		
		
		//normal
		pixeltrix = new PixeltrixItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("pixeltrix")
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/Pixeltrixitem");
		PixeltrixitemChangerNormal = new PixeltrixitemChangerNormalItem()
				.setMaxStackSize(1)
				.setUnlocalizedName("PixeltrixitemChangerNormal")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixeltrix/PixeltrixitemChangerNormal");
		
		GameRegistry.registerItem(pixeltrix_tochangerFirerMode_ultimate, "pixeltrix_tochangerFirerMode_ultimate");
		GameRegistry.registerItem(pixeltrix_changerFirerMode_ultimate, "pixeltrix_changerFirerMode_ultimate");
		GameRegistry.registerItem(pixeltrix_firerMode_ultimate, "pixeltrix_firerMode_ultimate");
		GameRegistry.registerItem(pixeltrix_changerFirerMode, "pixeltrix_changerFirerMode");
		GameRegistry.registerItem(pixeltrix_firerMode, "pixeltrix_firerMode");
		
		GameRegistry.registerItem(pixeltrix_changerShotMode, "pixeltrix_changerShotMode");
		GameRegistry.registerItem(pixeltrix_shotMode, "pixeltrix_shotMode");
		
		GameRegistry.registerItem(pixeltrix_changerSpringMode, "pixeltrix_changerSpringMode");
		GameRegistry.registerItem(pixeltrix_springMode, "pixeltrix_springMode");
		
		GameRegistry.registerItem(pixeltrix_changerSpeedMode, "pixeltrix_changerSpeedMode");
		GameRegistry.registerItem(pixeltrix_speedMode, "pixeltrix_speedMode");
		
		GameRegistry.registerItem(PixeltrixitemChangerNormal, "PixeltrixitemChangerNormal");
		GameRegistry.registerItem(pixeltrix, "pixeltrix");
		
/*5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555*/
		
		pixeltrix_PlanterMode_BombSeed = new pixeltrix_PlanterMode_BombSeed()
				.setMaxStackSize(100)
				.setUnlocalizedName("pixeltrix_PlanterMode_BombSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "PlanterShotmode");
		
		GameRegistry.registerItem(pixeltrix_PlanterMode_BombSeed, "pixeltrix_PlanterMode_BombSeed");
		
		pixelDoorIron = new PixelItemsIronDoor(Material.iron)
				.setUnlocalizedName("pixelDoorIron")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelDoorIron");

		pixelDoorWood = new PixelItemsWoodDoor(Material.wood)
				.setUnlocalizedName("pixelDoorWood")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelDoorWood");
		
		GameRegistry.registerItem(pixelDoorIron, "pixelDoorIron");
		GameRegistry.registerItem(pixelDoorWood, "pixelWoodDoor");
		
		pixelOrangeJuice = (Item)(new AppleJuiceItem(3, 0.3F, true));
		pixelOrangeJuice = ((AppleJuiceItem)pixelOrangeJuice)
				.setUnlocalizedName("pixelOrangeJuice")
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "OrangeJuice")
				.setMaxStackSize(64);
		
		pixelAppleJuice = (Item)(new AppleJuiceItem(6, 0.3F, true));
		pixelAppleJuice = ((AppleJuiceItem)pixelAppleJuice)
				.setUnlocalizedName("pixelAppleJuice")
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "AppleJuice")
				.setMaxStackSize(64);
		
		pixelAlcoholDrink = (Item)(new AlcoholDrink(2, 0.3F, true));
		pixelAlcoholDrink = ((AlcoholDrink)pixelAlcoholDrink)
				.setUnlocalizedName("pixelAlcoholDrink")
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelAlcholBottle")
				.setPotionEffect(PotionHelper.sugarEffect)
				.setMaxStackSize(64);
		
		pixelNitrogenDrink = (Item)(new NitroogenDrink(-2, 0.3F, true));
		pixelNitrogenDrink = ((NitroogenDrink)pixelNitrogenDrink)
				.setUnlocalizedName("pixelNitrogenDrink")
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelNitrogenBottle")
				.setPotionEffect(PotionHelper.sugarEffect)
				.setMaxStackSize(64);
				
		Item.itemRegistry.addObject(424, "pixelOrangeJuice", pixelOrangeJuice);
		Item.itemRegistry.addObject(424, "pixelAppleJuice", pixelAppleJuice);
		Item.itemRegistry.addObject(424, "pixelNitrogenDrink", pixelNitrogenDrink);
		Item.itemRegistry.addObject(424, "pixelAlcoholDrink", pixelAlcoholDrink);
			
			pixelGoldSword = new PixelSword(GoldToolMaterial)
				.setUnlocalizedName("pixelGoldSword")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_sword");
			pixelGoldHoe = new PixelHoe(GoldToolMaterial)
				.setUnlocalizedName("pixelGoldHoe")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_hoe");
			pixelGoldPickaxe = new PixelPickaxe(GoldToolMaterial)
				.setUnlocalizedName("pixelGoldPickaxe")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_pickaxe");
			pixelGoldShovel = new PixelShovel(GoldToolMaterial)
				.setUnlocalizedName("pixelGoldShovel")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_shovel");
			pixelGoldAxe = new PixelAxe(GoldToolMaterial)
				.setUnlocalizedName("pixelGoldAxe")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_axe");
		
		GameRegistry.registerItem(pixelGoldSword, "pixelGoldSword");
		GameRegistry.registerItem(pixelGoldHoe, "pixelGoldHoe");
		GameRegistry.registerItem(pixelGoldPickaxe, "pixelGoldPickaxe");
		GameRegistry.registerItem(pixelGoldShovel, "pixelGoldShovel");
		GameRegistry.registerItem(pixelGoldAxe, "pixelGoldAxe");
		
		pixelgoldingot = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelgoldingot")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgoldingot");
		
		GameRegistry.registerItem(pixelgoldingot, "pixelgoldingot");
		
		pixelgold_helmet = new GoldPixelArmor(GoldPixelMaterial, 3, 0)
				.setUnlocalizedName("pixelgold_helmet")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_helmet");
		pixelgold_chestplate = new GoldPixelArmor(GoldPixelMaterial, 3, 1)
				.setUnlocalizedName("pixelgold_chestplate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_chestplate");
		pixelgold_leggings = new GoldPixelArmor(GoldPixelMaterial, 3, 2)
				.setUnlocalizedName("pixelgold_leggings")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_leggings");
		pixelgold_boots = new GoldPixelArmor(GoldPixelMaterial, 3, 3)
				.setUnlocalizedName("pixelgold_boots")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelgold_boots");
		
		GameRegistry.registerItem(pixelgold_helmet, "pixelgold_helmet");
		GameRegistry.registerItem(pixelgold_chestplate, "pixelgold_chestplate");
		GameRegistry.registerItem(pixelgold_leggings, "pixelgold_leggings");
		GameRegistry.registerItem(pixelgold_boots, "pixelgold_boots");
		
		pixelleather_helmet = new LeatherPixelArmor(LeatherPixelMaterial, 3, 0)
				.setUnlocalizedName("pixelleather_helmet")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelleather_helmet");
		pixelleather_chestplate = new LeatherPixelArmor(LeatherPixelMaterial, 3, 1)
				.setUnlocalizedName("pixelleather_chestplate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelleather_chestplate");
		pixelleather_leggings = new LeatherPixelArmor(LeatherPixelMaterial, 3, 2)
				.setUnlocalizedName("pixelleather_leggings")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelleather_leggings");
		pixelleather_boots = new LeatherPixelArmor(LeatherPixelMaterial, 3, 3)
				.setUnlocalizedName("pixelleather_boots")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelleather_boots");
		
		GameRegistry.registerItem(pixelleather_helmet, "pixelleather_helmet");
		GameRegistry.registerItem(pixelleather_chestplate, "pixelleather_chestplate");
		GameRegistry.registerItem(pixelleather_leggings, "pixelleather_leggings");
		GameRegistry.registerItem(pixelleather_boots, "pixelleather_boots");		
		
		ChainPixelHelmet = new ChainPixelArmor(ChainPixelMaterial, 3, 0)
				.setUnlocalizedName("ChainPixelHelmet")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelchainmail_helmet");
		ChainPixelChestplate = new ChainPixelArmor(ChainPixelMaterial, 3, 1)
				.setUnlocalizedName("ChainPixelChestplate")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelchainmail_chestplate");
		ChainPixelLeggings = new ChainPixelArmor(ChainPixelMaterial, 3, 2)
				.setUnlocalizedName("ChainPixelLeggings")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelchainmail_leggings");
		ChainPixelBoots = new ChainPixelArmor(ChainPixelMaterial, 3, 3)
				.setUnlocalizedName("ChainPixelBoots")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelchainmail_boots");
		
		GameRegistry.registerItem(ChainPixelHelmet, "ChainPixelHelmet");
		GameRegistry.registerItem(ChainPixelChestplate, "ChainPixelChestplate");
		GameRegistry.registerItem(ChainPixelLeggings, "ChainPixelLeggings");
		GameRegistry.registerItem(ChainPixelBoots, "ChainPixelBoots");
		
		pixelChain = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelChain")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelChain");
		
		pixelLeather = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelLeather")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelleather");
		
		pixelbeefraw = new PixelItemRiceBread("pixelbeefraw", 3, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelbeefraw")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeefraw");
		
		pixelbeefcooked = new PixelItemRiceBread("pixelbeefcooked", 8, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelbeefcooked")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeefcooked");
		
		pixelRewPorkchop = new PixelItemRiceBread("pixelRewPorkchop", 3, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRewPorkchop")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelporkchopraw");
		
		pixelCookedPorkchop = new PixelItemRiceBread("pixelCookedPorkchop", 8, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelCookedPorkchop")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelporkchopcooked");
		
		GameRegistry.registerItem(pixelChain, "pixelChain");
		GameRegistry.registerItem(pixelLeather, "pixelLeather");
		GameRegistry.registerItem(pixelbeefraw, "pixelbeefraw");
		GameRegistry.registerItem(pixelbeefcooked, "pixelbeefcooked");
		GameRegistry.registerItem(pixelRewPorkchop, "pixelRewPorkchop");
		GameRegistry.registerItem(pixelCookedPorkchop, "pixelCookedPorkchop");
		
		pixelBakedPotato = new PixelItemRiceBread("pixelBakedPotato", 6, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelBakedPotato")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelBakedPotato");
		
		pixelPotatoSoup = new PixelSoupItem("pixelPotatoSoup", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPotatoSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelpotatosoup");
		
		pixelCarrotSoup = new PixelSoupItem("pixelCarrotSoup", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelCarrotSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCarrotSoup");
		
		GameRegistry.registerItem(pixelPotatoSoup, "pixelPotatoSoup");
		GameRegistry.registerItem(pixelCarrotSoup, "pixelCarrotSoup");
		GameRegistry.registerItem(pixelBakedPotato, "pixelBakedPotato");
		
		pixelBottle = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelBottle")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelBottle");
			
		GameRegistry.registerItem(pixelBottle, "pixelBottle");
		
		pixelPeaSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelPeaCrop, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPeaSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelseedspea");
		
		pixelPea = new PixelItemRiceBread("pixelPea", 6, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPea")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelPea");
		
		pixelPeaStew = new PixelSoupItem("pixelPeaStew", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPeaStew")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelPeaStew");
		
		GameRegistry.registerItem(pixelPeaSeed, "pixelPeaSeed");
		GameRegistry.registerItem(pixelPea, "pixelPea");
		GameRegistry.registerItem(pixelPeaStew, "pixelPeaStew");
		
		pixelLavaBucket = new PixelLavaBucket("pixelLavaBucket");
		GameRegistry.registerItem(pixelLavaBucket, "pixelLavaBucket");
		FluidContainerRegistry.registerFluidContainer(PixelGalaxyBlocks.pixelLavaFluid, new ItemStack(PixelGalaxyItems.pixelLavaBucket), new ItemStack(Items.bucket));
				
		pixelWaterH3OBucket = new PixelWaterH3OBucket("pixelWaterH3OBucket");
		GameRegistry.registerItem(pixelWaterH3OBucket, "pixelWaterH3OBucket");
		FluidContainerRegistry.registerFluidContainer(PixelGalaxyBlocks.PixelWaterH3OFluid, new ItemStack(PixelGalaxyItems.pixelWaterH3OBucket), new ItemStack(Items.bucket));
		
		pixelCoal= new PixelWoodCoal()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelCoal")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCoal");
		
		pixelCharCoal = new PixelWoodCoal()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelCharCoal")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelcharcoal");
		
		GameRegistry.registerItem(pixelCoal, "pixelCoal");
		GameRegistry.registerItem(pixelCharCoal, "pixelCharCoal");
		
		pixelbeetrootsoup = new PixelSoupItem("PixelBeetRootSoup", 10, 0.8f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("PixelBeetRootSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeetrootsoup");
		
		pixelbowl = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("Pixelbowl")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbowl");
		
		GameRegistry.registerItem(pixelbeetrootsoup, "PixelBeetRootSoup");
		GameRegistry.registerItem(pixelbowl, "pixelbowl");
		
		pixelOrange = new PixelItemRiceBread("pixelOrange", 2, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelOrange")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelOrange");
		
		pixelApple = new PixelItemRiceBread("pixelApple", 6, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelApple")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelApple");
		
		GameRegistry.registerItem(pixelOrange, "pixelOrange");
		GameRegistry.registerItem(pixelApple, "pixelApple");
		
		pixelBeetroot = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelBeetroot, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelBeetroot")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeetroot");
		
		pixelCarrot = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelCarrot, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelCarrot")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCarrot");
		
		pixelPotato = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelPotato, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPotato")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelPotato");
		
		GameRegistry.registerItem(pixelCarrot, "pixelCarrot");
		GameRegistry.registerItem(pixelPotato, "pixelPotato");
		GameRegistry.registerItem(pixelBeetroot, "pixelBeetroot");
		
		pixelRiceBread = new PixelItemRiceBread("pixelRiceBread", 5, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRiceBread")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelRiceBread");
		
		pixelWheatBread = new PixelItemRiceBread("pixelWheatBread", 4, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelWheatBread")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelWheatBread");
		
		GameRegistry.registerItem(pixelRiceBread, "pixelRiceBread");
		GameRegistry.registerItem(pixelWheatBread, "pixelWheatBread");
		
		blueStoneIngot = new Item()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("blueStoneIngot")
				.setTextureName(Constants.TEXTURE_PREFIX + "bluestone");
		
		GameRegistry.registerItem(blueStoneIngot, "blueStoneIngot");
		
		pixelRiceSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelRicePlant, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRiceSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelRiceSeeds");

		pixelWheatSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelWheatPlant, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelWheatSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelWheatSeed");
		
		pixelPumkinSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelPumpkinStem, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPumkinSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelseeds_pumpkin");
		
		GameRegistry.registerItem(pixelWheatSeed, "pixelWheatSeed");
		GameRegistry.registerItem(pixelRiceSeed, "pixelRiceSeed");
		GameRegistry.registerItem(pixelPumkinSeed, "pixelPumkinSeed");
		
		pixelWheat = new Item()
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelWheat")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelWheat");
		
		pixelRice = new Item()
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRice")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelRice");
		
		GameRegistry.registerItem(pixelWheat, "pixelWheat");
		GameRegistry.registerItem(pixelRice, "pixelRice");
		
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
		
		stonePixelSword = new PixelSword(stonePixelToolMaterial).setUnlocalizedName("stonePixelSword").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelSword");
		stonePixelHoe = new PixelHoe(stonePixelToolMaterial).setUnlocalizedName("stonePixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelHoe");
		stonePixelPickaxe = new PixelPickaxe(stonePixelToolMaterial).setUnlocalizedName("stonePixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelPickaxe");
		stonePixelShovel = new PixelShovel(stonePixelToolMaterial).setUnlocalizedName("stonePixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelShovel");
		stonePixelAxe = new PixelAxe(stonePixelToolMaterial).setUnlocalizedName("stonePixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelAxe");
		
		woodPixelSword = new PixelSword(woodPixelToolMaterial).setUnlocalizedName("woodPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelSword");
		woodPixelHoe = new PixelHoe(woodPixelToolMaterial).setUnlocalizedName("woodPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelHoe");
		woodPixelPickaxe = new PixelPickaxe(woodPixelToolMaterial).setUnlocalizedName("woodPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelPickaxe");
		woodPixelShovel = new PixelShovel(woodPixelToolMaterial).setUnlocalizedName("woodPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelShovel");
		woodPixelAxe = new PixelAxe(woodPixelToolMaterial).setUnlocalizedName("woodPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelAxe");
		
		GameRegistry.registerItem(woodPixelSword, "woodPixelSword");
		GameRegistry.registerItem(woodPixelHoe, "woodPixelHoe");
		GameRegistry.registerItem(woodPixelPickaxe, "woodPixelPickaxe");
		GameRegistry.registerItem(woodPixelShovel, "woodPixelShovel");
		GameRegistry.registerItem(woodPixelAxe, "woodPixelAxe");
		
		GameRegistry.registerItem(stonePixelSword, "stonePixelSword");
		GameRegistry.registerItem(stonePixelHoe, "stonePixelHoe");
		GameRegistry.registerItem(stonePixelPickaxe, "stonePixelPickaxe");
		GameRegistry.registerItem(stonePixelShovel, "stonePixelShovel");
		GameRegistry.registerItem(stonePixelAxe, "stonePixelAxe");
		
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
		
		ironPixelHelmet = new IronPixelArmor(ironPixelMaterial, 3, 0).setUnlocalizedName("ironPixelHelmet").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelHelmet");
		ironPixelChestplate = new IronPixelArmor(ironPixelMaterial, 3, 1).setUnlocalizedName("ironPixelChestplate").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelChestplate");
		ironPixelLeggings = new IronPixelArmor(ironPixelMaterial, 3, 2).setUnlocalizedName("ironPixelLeggings").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelLeggings");
		ironPixelBoots = new IronPixelArmor(ironPixelMaterial, 3, 3).setUnlocalizedName("ironPixelBoots").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelBoots");
		
		GameRegistry.registerItem(ironPixelHelmet, "ironPixelHelmet");
		GameRegistry.registerItem(ironPixelChestplate, "ironPixelChestplate");
		GameRegistry.registerItem(ironPixelLeggings, "ironPixelLeggings");
		GameRegistry.registerItem(ironPixelBoots, "ironPixelBoots");
		
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