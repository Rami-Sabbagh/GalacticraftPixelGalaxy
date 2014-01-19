package com.ramilego4game.mods.PixelGalaxy.Galaxy;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="GalacticraftPixelGalaxy", name="GalacticraftPixelGalaxy", version="0.0.3", dependencies = "required-after:GalacticraftCore;")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class GalacticraftPixelGalaxy {
	
	public static String ASSET_DOMAIN = "galacticraftpixel";

	
    public static final IGalaxy PixelGalaxy = new GCPixelGalaxy(); //Used to add Galaxy
	
        // The instance of your mod that Forge uses.
        @Instance("GalacticraftPixelGalaxy")
        public static GalacticraftPixelGalaxy instance;
       
        // Says where the client and server 'proxy' code is loaded.
        public static GalaxyCommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
            GalacticraftRegistry.registerGalaxy(GalacticraftPixelGalaxy.PixelGalaxy);
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
