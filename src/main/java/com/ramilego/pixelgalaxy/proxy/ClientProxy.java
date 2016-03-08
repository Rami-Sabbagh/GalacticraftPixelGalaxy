package com.ramilego.pixelgalaxy.proxy;

import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.entity.objs.EnderBlock;
import com.ramilego.pixelgalaxy.entity.objs.EntitySeedShot;
import com.ramilego.pixelgalaxy.entity.render.RenderEnderBlock;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}

	public static void registerHandlers()
	{
		
	}
	
	@Override
	public void registerRenderers(PixelGalaxyMod pixelGalaxyMod) 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySeedShot.class, new RenderSnowball(PixelGalaxyItems.pixeltrix_PlanterMode_BombSeed));
		pixelGalaxyMod.PixelOneSwingmanins.registerRenderers();
		pixelGalaxyMod.PixelHumanins.registerRenderers();
		pixelGalaxyMod.PixelCowins.registerRenderers();
		pixelGalaxyMod.PixelPigins.registerRenderers();

		addRenderer(EnderBlock.class, new RenderEnderBlock());
	}

	private void addRenderer(Class<? extends Entity> class1, Render renderer)
	  {
	    RenderingRegistry.registerEntityRenderingHandler(class1, renderer);
	  }
}
