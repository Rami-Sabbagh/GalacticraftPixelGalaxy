package com.ramilego4game.mods.PixelGalaxy.Earth;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="GalacticraftPixelEarth", name="GalacticraftPixelEarth", version="0.0.2", dependencies = "required-after:GalacticraftCore;")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class GalacticraftPixelEarth {
	
	public static GCPixelEarth pixelearth;
	
        // The instance of your mod that Forge uses.
        @Instance("GalacticraftPixelEarth")
        public static GalacticraftPixelEarth instance;
       
        // Says where the client and server 'proxy' code is loaded.
        public static PixelEarthCommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	GalacticraftPixelEarth.pixelearth = new GCPixelEarth();
        	GalacticraftRegistry.registerCelestialBody(GalacticraftPixelEarth.pixelearth);
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
