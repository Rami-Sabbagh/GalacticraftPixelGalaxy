package com.ramilego.pixelgalaxy.blocks;

import org.apache.logging.log4j.core.helpers.Strings;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.blocks.plants.PixelBeetrootCrop;
import com.ramilego.pixelgalaxy.blocks.plants.PixelCarrotCrop;
import com.ramilego.pixelgalaxy.blocks.plants.PixelPeaCrop;
import com.ramilego.pixelgalaxy.blocks.plants.PixelPotatoCrop;
import com.ramilego.pixelgalaxy.blocks.plants.PixelRiceBlock;
import com.ramilego.pixelgalaxy.blocks.plants.PixelWheatBlock;
import com.ramilego.pixelgalaxy.blocks.doors.PixelIronDoor;
import com.ramilego.pixelgalaxy.blocks.doors.PixelWoodDoor;
import com.ramilego.pixelgalaxy.fluids.PixelLavaFluid;
import com.ramilego.pixelgalaxy.fluids.PixelWaterH3O;
import com.ramilego.pixelgalaxy.fluids.blocks.PixelFluidH3OBlock;
import com.ramilego.pixelgalaxy.fluids.blocks.PixelFluidLavaBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class PixelGalaxyBlocks {

	public static Block greenGrass;
	public static Block pixelGrassPath;
	public static Block pixelDirt;
	public static Block pixelStone;
	public static Block pixelCobblestoneStone;
	public static Block pixelCobblestoneStone_mossy;
	public static Block pixelObsidian;
	public static Block pixelSand;
	public static Block pixelRedSand;
	public static Block pixelIce;
	
	//Fluid Blocks
	public static Block PixelWaterH3OBLock;
	public static Block pixelLavaBlock;
	
	//Fluid
	public static Fluid PixelWaterH3OFluid;
	public static Fluid pixelLavaFluid;
	
	//Farmland
	public static Block FarmlandPixel;
	
	//Stem
	public static Block pixelPumpkinStem;
	
	//TallGrass
	public static Block pixelTallGrass;
	public static Block pixelflower_paeonia;
	public static Block pixelflower_tulip_pink;
	public static Block pixelflower_tulip_red;
	public static Block pixelflower_allium;
	public static Block pixelflower_blue_orchid;
	public static Block pixelflower_dandelion;
	public static Block pixelflower_houstonia;
	public static Block pixelflower_oxeye_daisy;
	public static Block pixelflower_rose;
	public static Block pixelflower_tulip_orange;
	
	//Glowing Block
	public static Block blueStoneOre;
	public static Block GlowingBlueStoneBlock;
	public static Block PixelTorch;
	public static Block PixelBlueStoneTorch;
	
	public static Block PixelNitrogen;
	public static Block intensePixelNitrogen;
	
	public static Block pixelLeaves;
	public static Block pixelOrangeLeaves;
	
	public static Block pixelOak;
	public static Block pixelLog;
	public static Block pixelWoodBlock;
	
	public static Block pixelizerOre;
	public static Block pixelizerBlock;
	public static Block pixelizerDiamondOre;
	public static Block pixelizerdiamondBlock;
	public static Block pixelIronOre;
	public static Block pixelIronBlock;
	public static Block pixelCoalOre;
	public static Block pixelCoalBlocks;
	public static Block pixelGoldOre;
	public static Block pixelGoldBlock;
	
	public static Block pixelRicePlant;
	public static Block pixelWheatPlant;
	public static Block pixelPotato;
	public static Block pixelCarrot;
	public static Block pixelBeetroot;
	public static Block pixelPumpkin;
	public static Block pixelPeaCrop;
	
	//GuiBlocks
	public static Block PixelCraftingTable;
	
	//Doors
	public static Block PixelWoodDoor;
	public static Block PixelIronDoor;

	public static void registerBlocks(){
		PixelIronDoor = new PixelIronDoor(Material.iron)
				.setBlockName("PixelIronDoor")
				.setLightOpacity(0)
				.setStepSound(Block.soundTypeMetal)
				.setHardness(5.0F)
				.setLightLevel(0.0F)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeldoor_iron");
		PixelIronDoor.setHarvestLevel("pickaxe", 1);
		
		PixelWoodDoor = new PixelWoodDoor(Material.wood)
				.setBlockName("PixelWoodDoor")
				.setLightOpacity(0)
				.setStepSound(Block.soundTypeWood)
				.setHardness(1.0F)
				.setLightLevel(0.0F)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeldoor_wood");
		
		GameRegistry.registerBlock(PixelIronDoor, "PixelIronDoor");
		GameRegistry.registerBlock(PixelWoodDoor, "PixelWoodDoor");
		
		PixelBlueStoneTorch = new PixelTorchBlock()
				.setHardness(0.1F)
				.setBlockName("PixelBlueStoneTorch")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setLightOpacity(0)
				.setStepSound(Block.soundTypeWood)
				.setHardness(0.0F)
				.setLightLevel(0.5F)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelbluestonetorch");
		
		PixelTorch = new PixelTorchBlock()
				.setHardness(0.1F)
				.setBlockName("PixelTorch")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setLightOpacity(0)
				.setStepSound(Block.soundTypeWood)
				.setHardness(0.0F)
				.setLightLevel(0.9375F)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeltorch");
		
		GameRegistry.registerBlock(PixelBlueStoneTorch, "PixelBlueStoneTorch");
		GameRegistry.registerBlock(PixelTorch, "PixelTorch");
		
		PixelCraftingTable = new PixelCraftingTableBlock()
				.setHardness(2.5F)
				.setBlockName("PixelCraftingTable")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setLightOpacity(0)
				.setStepSound(Block.soundTypeWood)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelCraftingTable");

		GameRegistry.registerBlock(PixelCraftingTable, "PixelCraftingTable");
		
		pixelIce = new PixelIceBlock(Material.ice)
				.setBlockName("pixelIce")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelice");
		
		GameRegistry.registerBlock(pixelIce, "pixelIce");
		
		pixelflower_allium = new PixelFlowerBlocks()
				.setBlockName("pixelflower_allium")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_allium");
		
		pixelflower_blue_orchid = new PixelFlowerBlocks()
				.setBlockName("pixelflower_blue_orchid")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_blue_orchid");
		
		pixelflower_dandelion = new PixelFlowerBlocks()
				.setBlockName("pixelflower_dandelion")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_dandelion");
		
		pixelflower_houstonia = new PixelFlowerBlocks()
				.setBlockName("pixelflower_houstonia")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_houstonia");
		
		pixelflower_oxeye_daisy = new PixelFlowerBlocks()
				.setBlockName("pixelflower_oxeye_daisy")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_oxeye_daisy");
		
		pixelflower_rose = new PixelFlowerBlocks()
				.setBlockName("pixelflower_rose")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_rose");
		
		pixelflower_tulip_orange = new PixelFlowerBlocks()
				.setBlockName("pixelflower_tulip_orange")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_tulip_orange");

		pixelflower_paeonia = new PixelFlowerBlocks()
				.setBlockName("pixelflower_paeonia")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_paeonia");
		
		pixelflower_tulip_pink = new PixelFlowerBlocks()
				.setBlockName("pixelflower_tulip_pink")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_tulip_pink");
				
		pixelflower_tulip_red = new PixelFlowerBlocks()
				.setBlockName("pixelflower_tulip_red")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelflower_tulip_red");
		
		GameRegistry.registerBlock(pixelflower_paeonia, "pixelflower_paeonia");
		GameRegistry.registerBlock(pixelflower_tulip_pink, "pixelflower_tulip_pink");
		GameRegistry.registerBlock(pixelflower_tulip_red, "pixelflower_tulip_red");
		GameRegistry.registerBlock(pixelflower_allium, "pixelflower_allium");
		GameRegistry.registerBlock(pixelflower_blue_orchid, "pixelflower_blue_orchid");
		GameRegistry.registerBlock(pixelflower_dandelion, "pixelflower_dandelion");
		GameRegistry.registerBlock(pixelflower_houstonia, "pixelflower_houstonia");
		GameRegistry.registerBlock(pixelflower_oxeye_daisy, "pixelflower_oxeye_daisy");
		GameRegistry.registerBlock(pixelflower_rose, "pixelflower_rose");
		GameRegistry.registerBlock(pixelflower_tulip_orange, "pixelflower_tulip_orange");
		
		pixelSand = new PixelGalavityBlocks()
				.setBlockName("pixelSand")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelsand");
		
		pixelRedSand = new PixelGalavityBlocks()
				.setBlockName("pixelRedSand")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelred_sand");
		
		GameRegistry.registerBlock(pixelSand, "pixelSand");
		GameRegistry.registerBlock(pixelRedSand, "pixelRedSand");
		
		PixelGalaxyBlocks.pixelLavaFluid = new PixelLavaFluid("pixelLavaBlock")
				.setBlock(PixelGalaxyBlocks.pixelLavaBlock);
		FluidRegistry.registerFluid(PixelGalaxyBlocks.pixelLavaFluid);
		
		PixelGalaxyBlocks.pixelLavaBlock = new PixelFluidLavaBlock("pixelLavaBlock", PixelGalaxyBlocks.pixelLavaFluid, Material.lava);
		GameRegistry.registerBlock(pixelLavaBlock, "pixelLavaBlock");
		
		pixelTallGrass = new PixelTallGrassBlocks()
				.setBlockName("pixelTallGrass")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeltallgrass");
		
		GameRegistry.registerBlock(pixelTallGrass, "pixelTallGrass");
		
		PixelGalaxyBlocks.PixelWaterH3OFluid = new PixelWaterH3O("PixelWaterH3OBLock").setBlock(PixelGalaxyBlocks.PixelWaterH3OBLock);
		FluidRegistry.registerFluid(PixelGalaxyBlocks.PixelWaterH3OFluid);
		
		PixelGalaxyBlocks.PixelWaterH3OBLock = new PixelFluidH3OBlock("PixelFluidH3O", PixelGalaxyBlocks.PixelWaterH3OFluid, Material.water);
		GameRegistry.registerBlock(PixelWaterH3OBLock, "PixelWaterH3OBLock");
		
		pixelPumpkinStem = new PixelStem(FarmlandPixel)
				.setBlockName("pixelPumpkinStem")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelpumpkin");
		
		pixelPumpkin = new PixelPumpkinBlock(Material.cactus)
				.setBlockName("pixelPumpkin")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelpumpkin");
		
		GameRegistry.registerBlock(pixelPumpkinStem, "pixelPumpkinStem");
		GameRegistry.registerBlock(pixelPumpkin, "pixelPumpkin");
		
		pixelPeaCrop = new PixelPeaCrop()
				.setBlockName("pixelPea")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "PixelPea");
		
		pixelBeetroot = new PixelBeetrootCrop()
				.setBlockName("pixelBeetroot")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "PixelBeetroots");
		
		pixelCarrot = new PixelCarrotCrop()
				.setBlockName("pixelCarrot")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelCarrots");
		
	    pixelPotato = new PixelPotatoCrop()
				.setBlockName("pixelPotato")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "Pixelpotatoes");
				 
	    GameRegistry.registerBlock(pixelPeaCrop, pixelPeaCrop.getUnlocalizedName());
		GameRegistry.registerBlock(pixelCarrot, pixelCarrot.getUnlocalizedName());
		GameRegistry.registerBlock(pixelPotato, pixelPotato.getUnlocalizedName());
		GameRegistry.registerBlock(pixelBeetroot, pixelBeetroot.getUnlocalizedName());
		
		pixelWheatPlant = new PixelWheatBlock()
				.setBlockName("pixelWheatPlant")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelwheat");
		
		pixelRicePlant = new PixelRiceBlock()
				.setBlockName("PixelRice")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelRice");
				 
		GameRegistry.registerBlock(pixelWheatPlant, pixelWheatPlant.getUnlocalizedName());
		GameRegistry.registerBlock(pixelRicePlant, pixelRicePlant.getUnlocalizedName());
		
		FarmlandPixel = new PixelFarmland(Material.ground)
				.setBlockName("FarmlandPixel")
				.setHardness(0.6f)
				.setStepSound(Block.soundTypeGravel)
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeldirt");
		
		GameRegistry.registerBlock(FarmlandPixel, "FarmlandPixel");
				
		
		//glowing block register
		GlowingBlueStoneBlock = new GlowingBlueStoneBlock(Material.rock)
				.setBlockName("GlowingBlueStoneBlock")
				.setLightLevel(2.0F)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "bluestoneBlock");

		
		blueStoneOre = new PixelBlueStoneOre(Material.rock)
				.setBlockName("blueStoneOre")
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "bluestone_pixelore");
		
		GameRegistry.registerBlock(blueStoneOre, "blueStoneOre");
		GameRegistry.registerBlock(GlowingBlueStoneBlock, "GlowingBlueStoneBlock");
		
		//Gas block
		PixelNitrogen = new PixelNitrogenBlock(Material.cloth)
				.setBlockName("PixelNitrogen")
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "Pixel_Nitrogen")
				.setResistance(0.5F)
				.setHardness(5.0F)
				.setStepSound(Block.soundTypeCloth);
		
		intensePixelNitrogen = new PixelIntenseNitrogenBlock(Material.cloth)
				.setBlockName("intensePixelNitrogen")
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "Pixel_IntenseNitrogen")
				.setResistance(0.5F)
				.setHardness(5.0F)
				.setStepSound(Block.soundTypeCloth);
		
		GameRegistry.registerBlock(PixelNitrogen, "PixelNitrogen");
		GameRegistry.registerBlock(intensePixelNitrogen, "intensePixelNitrogen");
		
		pixelizerOre = new NormalPixelBlock(Material.rock).setBlockName("pixelizerOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelizerOre").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypePiston);
		pixelizerOre.setHarvestLevel("pickaxe", 2);
		pixelizerBlock = new NormalPixelBlock(Material.rock).setBlockName("pixelizerBlock").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelizerBlock").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelizerBlock.setHarvestLevel("pickaxe", 0);
		
		pixelizerDiamondOre = new DiamondPixelBlock(Material.rock).setBlockName("pixelizerDiamondOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "diamond_pixelore").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypePiston);
		pixelizerDiamondOre.setHarvestLevel("pickaxe", 2);
		pixelizerdiamondBlock = new NormalPixelBlock(Material.rock).setBlockName("DiamondPixelBlock").setBlockTextureName(Constants.TEXTURE_PREFIX + "diamondBlock").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelizerdiamondBlock.setHarvestLevel("pickaxe", 0);
		
		pixelIronOre = new NormalPixelBlock(Material.rock).setBlockName("pixelIronOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "iron_pixelore").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelIronOre.setHarvestLevel("pickaxe", 1);
		pixelIronBlock = new NormalPixelBlock(Material.rock).setBlockName("pixelIronBlock").setBlockTextureName(Constants.TEXTURE_PREFIX + "Ironblock").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelIronBlock.setHarvestLevel("pickaxe", 0);
		
		pixelCoalOre = new PixelCoalBlock(Material.rock).setBlockName("pixelCoalOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelcoalore").setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelCoalOre.setHarvestLevel("pickaxe", 0);
		pixelCoalBlocks = new PixelCoalBlock(Material.rock).setBlockName("pixelCoalBlocks").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelcoalblock").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelCoalBlocks.setHarvestLevel("pickaxe", 0);
		
		pixelGoldOre = new NormalPixelBlock(Material.rock).setBlockName("pixelGoldOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelgold_ore").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelGoldOre.setHarvestLevel("pickaxe", 2);
		pixelGoldBlock = new NormalPixelBlock(Material.rock).setBlockName("pixelGoldBlock").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelgold_block").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelGoldBlock.setHarvestLevel("pickaxe", 0);
		
		GameRegistry.registerBlock(pixelGoldOre, "pixelGoldOre");
		GameRegistry.registerBlock(pixelGoldBlock, "pixelGoldBlock");
		GameRegistry.registerBlock(pixelCoalOre, "pixelCoalOre");
		GameRegistry.registerBlock(pixelCoalBlocks, "pixelCoalBlocks");
		GameRegistry.registerBlock(pixelIronBlock, "pixelIronBlock");
		GameRegistry.registerBlock(pixelIronOre, "pixelIronOre");
		GameRegistry.registerBlock(pixelizerdiamondBlock, "DiamondPixelBlock");
		GameRegistry.registerBlock(pixelizerBlock, "pixelizerBlock");
		GameRegistry.registerBlock(pixelizerOre, "pixelizerOre");
		GameRegistry.registerBlock(pixelizerDiamondOre, "DiamondPixelOre");
		
		pixelGrassPath = new PixelGrassPathBlock(Material.grass).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelgrasspath").setHardness(0.6f).setStepSound(Block.soundTypeGrass).setBlockName("pixelGrassPath");
		greenGrass = new GrassPixelBlock(Material.grass).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelgrass").setHardness(0.6f).setStepSound(Block.soundTypeGrass).setBlockName("greenGrass");
		pixelDirt = new PixelDirtBlock(Material.ground).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeldirt").setHardness(0.6f).setStepSound(Block.soundTypeGravel).setBlockName("pixelDirt");
		pixelStone = new StonePixelBlock(Material.rock).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelstone").setHardness(0.6f).setStepSound(Block.soundTypeStone).setBlockName("pixelStone");
		pixelCobblestoneStone =new NormalPixelBlock(Material.rock).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelCobblestoneStone").setHardness(0.6f).setStepSound(Block.soundTypeStone).setBlockName("pixelCobblestoneStone");
		pixelCobblestoneStone.setHarvestLevel("pickaxe", 0);
		pixelCobblestoneStone_mossy =new NormalPixelBlock(Material.rock).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelCobblestoneStone_mossy").setHardness(0.6f).setStepSound(Block.soundTypeStone).setBlockName("pixelCobblestoneStoneMossy");
		pixelCobblestoneStone_mossy.setHarvestLevel("pickaxe", 0);
		pixelObsidian =new NormalPixelBlock(Material.rock).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelobsidian").setResistance(2000.0F).setHardness(50.0F).setStepSound(Block.soundTypePiston).setBlockName("pixelObsidian");
		pixelObsidian.setHarvestLevel("pickaxe", 3);
		
		GameRegistry.registerBlock(pixelObsidian, "pixelObsidian");
		GameRegistry.registerBlock(pixelGrassPath, "pixelGrassPath");
		GameRegistry.registerBlock(pixelCobblestoneStone, "pixelCobblestoneStone");
		GameRegistry.registerBlock(pixelCobblestoneStone_mossy, "pixelCobblestoneStoneMossy");
		GameRegistry.registerBlock(greenGrass, "greenGrass");
		GameRegistry.registerBlock(pixelDirt, "pixelDirt");
		GameRegistry.registerBlock(pixelStone, "pixelStone");
		
		pixelLeaves = new LeavesPixelBlock().setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelleaves").setBlockName("pixelLeaves");
		pixelOrangeLeaves = new OrangeLeavesPixelBlock().setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelOrangeleaves").setBlockName("pixelOrangeLeaves");
		
		GameRegistry.registerBlock(pixelLeaves, "pixelLeaves");
		GameRegistry.registerBlock(pixelOrangeLeaves, "pixelOrangeLeaves");
		
		pixelOak = new OakPixelBlockOld(Material.wood).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeloak").setHardness(2.0f).setStepSound(Block.soundTypeWood).setBlockName("pixelOak");
		pixelLog = new OakPixelBlock().setBlockTextureName(Constants.TEXTURE_PREFIX + "pixellog").setBlockName("pixelLog");
		pixelWoodBlock = new WoodPixelBlock(Material.wood).setStepSound(Block.soundTypeWood).setBlockName("pixelWoodBlock");
		
		GameRegistry.registerBlock(pixelOak, "pixelOak");
		GameRegistry.registerBlock(pixelLog, "pixelLog");
		GameRegistry.registerBlock(pixelWoodBlock, ItemBlockMetaBlock.class, "pixelWoodBlock");
	}
}
