package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.GreenBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.MTBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.NormBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.dimension.GCPixelEarthTeleportType;
import com.ramilego4game.mods.PixelGalaxy.Earth.dimension.GCPixelEarthWorldProvider;
import com.ramilego4game.mods.PixelGalaxy.Earth.items.NormItem;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="GalacticraftPixelEarthID", name="GalacticraftPixelEarth", version="0.0.8", dependencies = "required-after:GalacticraftCore;")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class GalacticraftPixelEarth {
	
	//Our PixelEarth
	public static GCPixelEarth pixelearth;
	
	
	
	//Creative Tab
	public static CreativeTabs tabPEarth = new CreativeTabs("tabPEarth") {
		public ItemStack getIconItemStack() {
			return new ItemStack(pixelGrass, 1, 0);
		}
	};
	
		//Blocks
		public final static Block pixelBedrock = new NormBlock(200, Material.rock).setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pixelbedrock").setTextureName("galacticraftpixel:pixelbedrock");
		public final static Block pixelGrass = new MTBlock(201, Material.grass, "galacticraftpixel:pixelgrass").setHardness(0.6f).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("pixelgrass");
		public final static Block pixelDirt = new GreenBlock(202, Material.ground).setHardness(0.6f).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("pixeldirt").setTextureName("galacticraftpixel:pixeldirt");
		public final static Block pixelStone = new NormBlock(203, Material.rock).setHardness(0.6f).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pixelstone").setTextureName("galacticraftpixel:pixelstone");
		public final static Block pixelBrick = new NormBlock(204, Material.rock).setHardness(1f).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pixelbrick").setTextureName("galacticraftpixel:pixelbrick");
		public final static Block pixelizerOre = new NormBlock(205, Material.rock).setHardness(0.6f).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pixelizerore").setTextureName("galacticraftpixel:pixelizer_ore");
		
		//Items
		public final static Item pixelizerIngot = new NormItem(4500).setUnlocalizedName("pixelizeringot").setTextureName("galacticraftpixel:pixelizer_ingot");
		
        // The instance of your mod that Forge uses.
        @Instance("GalacticraftPixelEarthID")
        public static GalacticraftPixelEarth instance;
       
        // Says where the client and server 'proxy' code is loaded.
        public static PixelEarthCommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        	
        	config.load();
        	
        	//biomePEMID = config.getBlock("MainPixelEarthBiomeID", 180).getInt();
        	//pixelEarthID = config.getBlock(Configuration.CATEGORY_GENERAL,"pixelEarthDimID", -45).getInt();
        	
        	config.save();
        	
        	GalacticraftPixelEarth.pixelearth = new GCPixelEarth();
        	GalacticraftRegistry.registerCelestialBody(GalacticraftPixelEarth.pixelearth);
        	GalacticraftRegistry.registerTeleportType(GCPixelEarthWorldProvider.class, new GCPixelEarthTeleportType());
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                //proxy.registerRenderers();
        	MinecraftForge.setBlockHarvestLevel(pixelBrick, "pickaxe", 3);
        	
        	
        	LanguageRegistry.instance().addStringLocalization("itemGroup.tabPEarth", "en_US", "PixelEarth");
        	
        	GameRegistry.registerBlock(pixelBedrock, "pixelbedrock");
        	LanguageRegistry.addName(pixelBedrock, "Pixel Bedrock");
        	GameRegistry.registerBlock(pixelGrass, "pixelgrass");
        	LanguageRegistry.addName(pixelGrass, "Pixel Grass");
        	GameRegistry.registerBlock(pixelDirt, "pixeldirt");
        	LanguageRegistry.addName(pixelDirt, "Pixel Dirt");
        	GameRegistry.registerBlock(pixelStone, "pixelstone");
        	LanguageRegistry.addName(pixelStone, "Pixel Stone");
        	GameRegistry.registerBlock(pixelBrick, "pixelbrick");
        	LanguageRegistry.addName(pixelBrick, "Pixel Brick");
        	GameRegistry.registerBlock(pixelizerOre, "pixelizerore");
        	LanguageRegistry.addName(pixelizerOre, "Pixelizer Ore");
        	
        	
        	LanguageRegistry.addName(pixelizerIngot, "Pixelizer Ingot");
        	
        	
        	LanguageRegistry.instance().addStringLocalization("gui.choosePlanet.desc.pixelearth", "en_US", "Habitable#No Oxygen#Gravity: 100%");
			LanguageRegistry.instance().addStringLocalization("dimension.PixelEarth.name", "en_US", "PixelEarth");
			
			//ItemStacks
			ItemStack pixelizerstack = new ItemStack(pixelizerIngot,3);
			
			//Smelting Recipes
			GameRegistry.addSmelting(pixelizerOre.blockID, pixelizerstack, 3.5f);
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}