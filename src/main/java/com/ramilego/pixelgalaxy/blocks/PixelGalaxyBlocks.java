package com.ramilego.pixelgalaxy.blocks;

import org.apache.logging.log4j.core.helpers.Strings;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
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
	
	//Glowing Block
	public static Block blueStoneOre;
	public static Block GlowingBlueStoneBlock;
	
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
	
	public static Block pixelWheat;
	public static Block pixelPotato;
	public static Block pixelCarrot;
	public static Block pixelBeetroot;
	public static Block pixelPumpkin;
	public static Block pixelPeaCrop;

	public static void registerBlocks(){
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
				.setBlockName("pixelPumpkin")
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
		
		pixelWheat = new PixelWheatBlock()
				.setBlockName("PixelRice")
				.setCreativeTab(PixelCreativeTab.PixelBlocksTab)
				.setBlockTextureName(Constants.TEXTURE_PREFIX + "PixelWheat");
				 
		GameRegistry.registerBlock(pixelWheat, pixelWheat.getUnlocalizedName());
		
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
				.setLightLevel(1.0F)
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
		
		GameRegistry.registerBlock(pixelGrassPath, "pixelGrassPath");
		GameRegistry.registerBlock(pixelCobblestoneStone, "pixelCobblestoneStone");
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
