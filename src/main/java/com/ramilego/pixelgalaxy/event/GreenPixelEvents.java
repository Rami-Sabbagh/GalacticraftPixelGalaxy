package com.ramilego.pixelgalaxy.event;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import micdoodle8.mods.galacticraft.api.event.oxygen.GCCoreOxygenSuffocationEvent;
import micdoodle8.mods.galacticraft.core.event.EventWakePlayer;

public class GreenPixelEvents {
	@SubscribeEvent
	public void GCCoreOxygenSuffocationEvent(GCCoreOxygenSuffocationEvent.Pre event){	
		if (event.entityLiving.worldObj.provider.dimensionId == 10)
		{		
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void GCCoreEventWakePlayer(EventWakePlayer event){
		if (event.entityLiving.worldObj.provider.dimensionId == 10)
		{		
			event.entityPlayer.heal(5.0F);

            for (WorldServer worldServer : MinecraftServer.getServer().worldServers)
            {
                worldServer.setWorldTime(0);
            }
		}
	}
}
