package com.ramilego4game.mods.PixelGalaxy.Sun;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalaxyCommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="GalacticraftPixelSunID", name="GalacticraftPixelSun", version="0.0.7", dependencies = "required-after:GalacticraftCore;")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class GalacticraftPixelSun {
	
	public static GCPixelSun pixelsun;
	
        // The instance of your mod that Forge uses.
        @Instance("GalacticraftPixelSunID")
        public static GalacticraftPixelSun instance;
       
        // Says where the client and server 'proxy' code is loaded.
        public static GalaxyCommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	GalacticraftPixelSun.pixelsun = new GCPixelSun();
        	GalacticraftRegistry.registerCelestialBody(GalacticraftPixelSun.pixelsun);
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                //proxy.registerRenderers();
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}
