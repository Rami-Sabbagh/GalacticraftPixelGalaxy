package com.ramilego4game.mods.PixelGalaxy.Earth.dimension;

import java.util.Random;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.ITeleportType;
import micdoodle8.mods.galacticraft.core.GCCoreConfigManager;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.entities.player.GCCorePlayerMP;
import micdoodle8.mods.galacticraft.core.network.GCCorePacketHandlerClient.EnumPacketClient;
import micdoodle8.mods.galacticraft.core.util.PacketUtil;
import micdoodle8.mods.galacticraft.mars.entities.GCMarsEntityLandingBalloons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class GCPixelEarthTeleportType implements ITeleportType
{
	@Override
	public boolean useParachute()
	{
		return true;
	}

	@Override
	public Vector3 getPlayerSpawnLocation(WorldServer world, EntityPlayerMP player)
	{
		if (player instanceof GCCorePlayerMP)
		{
			return new Vector3(((GCCorePlayerMP) player).getCoordsTeleportedFromX(), 250.0, ((GCCorePlayerMP) player).getCoordsTeleportedFromZ());
		}

		return null;
	}

	@Override
	public Vector3 getEntitySpawnLocation(WorldServer world, Entity entity)
	{
		return new Vector3(entity.posX, 250.0, entity.posZ);
	}

	@Override
	public Vector3 getParaChestSpawnLocation(WorldServer world, EntityPlayerMP player, Random rand)
	{
		final double x = (rand.nextDouble() * 2 - 1.0D) * 5.0D;
		final double z = (rand.nextDouble() * 2 - 1.0D) * 5.0D;

		return new Vector3(player.posX + x, 230.0D, player.posZ + z);
	}

	@Override
	public void onSpaceDimensionChanged(World newWorld, EntityPlayerMP player, boolean ridingAutoRocket)
	{
		
	}
}
