package com.ramilego.pixelgalaxy.event;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.dimension.WorldProviderGreenPixel;
import com.ramilego.pixelgalaxy.world.gen.WorldGenPixelH3O;
import com.ramilego.pixelgalaxy.world.gen.WorldGenPixelLava;
import com.ramilego.pixelgalaxy.world.gen.WorldGenPixelTree;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import micdoodle8.mods.galacticraft.api.event.oxygen.GCCoreOxygenSuffocationEvent;
import micdoodle8.mods.galacticraft.api.event.wgen.GCCoreEventPopulate;
import micdoodle8.mods.galacticraft.core.event.EventWakePlayer;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import micdoodle8.mods.galacticraft.planets.mars.dimension.WorldProviderMars;
import micdoodle8.mods.galacticraft.planets.mars.world.gen.WorldGenEggs;

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
	
	private WorldGenerator pixelTreeGenerator;
	private WorldGenerator pixelH3OGenerator;
	private WorldGenerator pixelLavaGenerator;
	
	@SubscribeEvent
    public void onPlanetDecorated(GCCoreEventPopulate.Post event)
    {
        if (this.pixelTreeGenerator == null)
        {
            this.pixelTreeGenerator = new WorldGenPixelTree(true,4,0,0,false);//WorldGenEggs(MarsBlocks.rock);
        }
        if (this.pixelH3OGenerator == null)
        {
            this.pixelH3OGenerator = new WorldGenPixelH3O(PixelGalaxyBlocks.PixelWaterH3OBLock, PixelGalaxyBlocks.PixelWaterH3OBLock, 10);
        }
        if (this.pixelLavaGenerator == null)
        {
            this.pixelLavaGenerator = new WorldGenPixelLava(PixelGalaxyBlocks.pixelLavaBlock, PixelGalaxyBlocks.pixelLavaBlock, 1);
        }
        
        if (event.worldObj.provider instanceof WorldProviderGreenPixel)
        {
            int treesPerChunk = 2;
            int x;
            int y;
            int z;
            Block topBlock;

            for (int treeCount = 0; treeCount < treesPerChunk; ++treeCount)
            {
                x = event.chunkX + event.rand.nextInt(16) + 8;
                z = event.chunkZ + event.rand.nextInt(16) + 8;
                y = event.worldObj.getTopSolidOrLiquidBlock(x, z);
                
                this.pixelTreeGenerator.generate(event.worldObj, event.rand, x, y, z);
            }
            
        }
        
    }
}
