package com.ramilego.pixelgalaxy;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.dimension.TeleportTypeGreenPixel;
import com.ramilego.pixelgalaxy.dimension.WorldProviderGreenPixel;
import com.ramilego.pixelgalaxy.event.GreenPixelEvents;
import com.ramilego.pixelgalaxy.items.PixelFuelHader;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;
import com.ramilego.pixelgalaxy.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.*;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:GalacticraftCore;")
public class PixelGalaxyMod {
	
	@SidedProxy(clientSide = "com.ramilego.pixelgalaxy.proxy.ClientProxy", serverSide = "com.ramilego.pixelgalaxy.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Constants.modID)
	public static PixelGalaxyMod instance;
	
	public static SolarSystem lostPixel;
	public static Planet greenPixel;
	
	public static int mobid = 0;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new GreenPixelEvents());
		
		PixelGalaxyBlocks.registerBlocks();
		PixelGalaxyItems.registerItems();
		PixelCreativeTab.registerTabs();
		
		PixelRecipes.registerCraftingRecipes();
		PixelRecipes.registerSmeltingRecipes();
		
		GameRegistry.registerFuelHandler(new PixelFuelHader());
		
		proxy.registerRenderers(this);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{

	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event){
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		PixelGalaxyMod.lostPixel = new SolarSystem("lostpixel","milkyWay").setMapPosition(new Vector3(0.25F,0.25F));
		Star pixelSun = (Star) new Star("pixel").setParentSolarSystem(PixelGalaxyMod.lostPixel).setTierRequired(-1);
		pixelSun.setBodyIcon(new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/celestialbodies/pixelsun.png"));
        PixelGalaxyMod.lostPixel.setMainStar(pixelSun);
        
        PixelGalaxyMod.greenPixel = new Planet("greenpixel").setParentSolarSystem(PixelGalaxyMod.lostPixel);//GalacticraftCore.solarSystemSol
        PixelGalaxyMod.greenPixel.setTierRequired(3).setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(0.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
        PixelGalaxyMod.greenPixel.setBodyIcon(new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/celestialbodies/greenPixel.png"));
        PixelGalaxyMod.greenPixel.atmosphereComponent(IAtmosphericGas.NITROGEN).atmosphereComponent(IAtmosphericGas.OXYGEN).atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.WATER);
        PixelGalaxyMod.greenPixel.setDimensionInfo(10, WorldProviderGreenPixel.class);
        
        GalaxyRegistry.registerSolarSystem(lostPixel);
        GalaxyRegistry.registerPlanet(greenPixel);
        GalacticraftRegistry.registerTeleportType(WorldProviderGreenPixel.class, new TeleportTypeGreenPixel());
        GalacticraftRegistry.registerRocketGui(WorldProviderGreenPixel.class, new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/greenRocketGui.png"));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		this.proxy.postInit(event);
	}
}
