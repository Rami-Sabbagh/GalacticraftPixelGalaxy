package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;

import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.GreenBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.MTBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.NormBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.world.biome.BiomeGenPEarth;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="GalacticraftPixelEarthID", name="GalacticraftPixelEarth", version="0.0.7", dependencies = "required-after:GalacticraftCore;")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class GalacticraftPixelEarth {
	
	//Config Varibles
	public static int dimearth = -45;
	public static int pemainid = 150;
	public static int pgrassid = 200;
	public static int pdirtid = 201;
	public static int pstoneid = 202;
	
	//Our PixelEarth
	public static GCPixelEarth pixelearth;
	
	
	
	//Creative Tab
	public static CreativeTabs tabPEarth = new CreativeTabs("tabPEarth") {
		public ItemStack getIconItemStack() {
			return new ItemStack(pixelGrass, 1, 0);
		}
	};
	
		//Blocks
		public final static Block pixelGrass = new MTBlock(200, Material.grass, "galacticraftpixel:pixelgrass").setHardness(0.6f).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("pixelgrass");
		public final static Block pixelDirt = new GreenBlock(201, Material.ground).setHardness(0.6f).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("pixeldirt").setTextureName("galacticraftpixel:pixeldirt");
		public final static Block pixelStone = new NormBlock(202, Material.rock).setHardness(0.6f).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pixelstone").setTextureName("galacticraftpixel:pixelstone");
		
		public static BiomeGenBase PEBiome = new BiomeGenPEarth(pemainid).setBiomeName("PEMain").setMinMaxHeight(-1F, 1F);
	
		
		
		
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
        	
        	/*pemainid = config.getBlock(Configuration.CATEGORY_GENERAL,"MainPixelEarthBiomeID", 150).getInt();
        	dimearth = config.getBlock(Configuration.CATEGORY_GENERAL,"PixelEarthDimID", -45).getInt();
        	pgrassid = config.getBlock(Configuration.CATEGORY_BLOCK,"PixelEarthGrassID", 200).getInt();
        	pdirtid = config.getBlock(Configuration.CATEGORY_BLOCK,"PixelDirtGrassID", 201).getInt();
        	pstoneid = config.getBlock(Configuration.CATEGORY_BLOCK,"PixelStoneGrassID", 202).getInt();*/
        	
        	config.save();
        	
        	
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                //proxy.registerRenderers();
        	
        	LanguageRegistry.instance().addStringLocalization("itemGroup.tabPEarth", "en_US", "PixelEarth");
        	GameRegistry.registerBlock(pixelGrass, "pixelgrass");
        	LanguageRegistry.addName(pixelGrass, "Pixel Grass");
        	GameRegistry.registerBlock(pixelDirt, "pixeldirt");
        	LanguageRegistry.addName(pixelDirt, "Pixel Dirt");
        	GameRegistry.registerBlock(pixelStone, "pixelstone");
        	LanguageRegistry.addName(pixelStone, "Pixel Stone");
        	
        	GalacticraftRegistry.registerCelestialBody(new GCPixelEarth());
        	//GalacticraftRegistry.registerTeleportType(GCPixelEarthWorldProvider.class, new GCPixelEarthTeleportType());
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}
