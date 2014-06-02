package com.ramilego4game.mods.PixelGalaxy.Earth.event;

import micdoodle8.mods.galacticraft.api.event.oxygen.GCCoreOxygenSuffocationEvent;
import micdoodle8.mods.galacticraft.core.GCLog;
import micdoodle8.mods.galacticraft.core.event.GCCoreEventWakePlayer;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.ForgeSubscribe;

public class GCPixelEarthOxygenEvent{
	private static int oldX;
	private static int oldY;
	private static int oldZ;
	private static int newX;
	private static int newY;
	private static int newZ;
	
	@ForgeSubscribe
	public void GCCoreOxygenSuffocationEvent(GCCoreOxygenSuffocationEvent.Pre event){	
		if (event.entityLiving.worldObj.provider.dimensionId == -25)
		{		
			event.setCanceled(true);
		}
	}
	
	@ForgeSubscribe
	public void GCCoreEventWakePlayer(GCCoreEventWakePlayer event){
		if (event.entityLiving.worldObj.provider.dimensionId == -25)
		{		
			GCLog.info("Waking Player");
			event.result = EnumStatus.NOT_POSSIBLE_HERE;
			
			for (WorldServer worldServer : MinecraftServer.getServer().worldServers)
			{
				worldServer.setWorldTime(0);
			}
		}
	}
}
