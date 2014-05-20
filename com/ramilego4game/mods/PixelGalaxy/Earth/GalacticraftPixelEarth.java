package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;

import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.GreenBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.MTBlock;
import com.ramilego4game.mods.PixelGalaxy.Earth.blocks.NormBlock;

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
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}
