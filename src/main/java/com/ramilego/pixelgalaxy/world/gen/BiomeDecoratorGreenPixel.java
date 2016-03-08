package com.ramilego.pixelgalaxy.world.gen;

import java.util.Random;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;

import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;

public class BiomeDecoratorGreenPixel extends BiomeDecoratorSpace { 
	
	/*private WorldGenerator dirtGen;
    private WorldGenerator deshGen;
    private WorldGenerator tinGen;
    private WorldGenerator copperGen;
    private WorldGenerator ironGen;
    private WorldGenerator iceGen;*/
	private WorldGenerator pixelizerGen;
	private WorldGenerator diamondPixelGen;
	private WorldGenerator ironGen;
	private WorldGenerator nitrogenGen;
	private WorldGenerator blueStonegen;
	private WorldGenerator CoalOreGen;
	private WorldGenerator goldGen;
	
	public int H3OLakesPerChunk;
	public int LavaLakesPerChunk;
	
	//tallgrass
	public int TallgrassPerChunk;
	public int pixelflower_paeoniaPerChunk;
	public int pixelflower_tulip_pinkPerChuck;
	public int pixelflower_tulip_redPerChunk;
	public int pixelflower_alliumPerChunk;
	public int pixelflower_blue_orchidPerChunk;
	public int pixelflower_dandelionPerChunk;
	public int pixelflower_houstoniaPerChunk;
	public int pixelflower_oxeye_daisyPerChunk;
	public int pixelflower_rosePerChunk;
	public int pixelflower_tulip_orangePerChunk;
	
    private World currentWorld;

    public BiomeDecoratorGreenPixel()
    {
        /*this.copperGen = new WorldGenMinableMeta(MarsBlocks.marsBlock, 4, 0, true, MarsBlocks.marsBlock, 9);
        this.tinGen = new WorldGenMinableMeta(MarsBlocks.marsBlock, 4, 1, true, MarsBlocks.marsBlock, 9);
        this.deshGen = new WorldGenMinableMeta(MarsBlocks.marsBlock, 6, 2, true, MarsBlocks.marsBlock, 9);
        this.ironGen = new WorldGenMinableMeta(MarsBlocks.marsBlock, 8, 3, true, MarsBlocks.marsBlock, 9);
        this.dirtGen = new WorldGenMinableMeta(MarsBlocks.marsBlock, 32, 6, true, MarsBlocks.marsBlock, 9);
        this.iceGen = new WorldGenMinableMeta(Blocks.ice, 18, 0, true, MarsBlocks.marsBlock, 6); */
    	
    	//WorldGenMinableMeta(Block OreBlock, int numberOfBlocks, int OreMeta, boolean usingMetaData, Block StoneBlock, int StoneMeta);
    	
    	this.goldGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelGoldOre, 8, 3, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.CoalOreGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelCoalOre, 15, 5, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.blueStonegen = new WorldGenMinableMeta(PixelGalaxyBlocks.blueStoneOre, 8, 3, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.ironGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelIronOre, 8, 3, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.pixelizerGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerOre, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.diamondPixelGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerDiamondOre, 4, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.nitrogenGen = new WorldGenMinableMeta(PixelGalaxyBlocks.PixelNitrogen, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	
    	this.H3OLakesPerChunk = 1;
		this.LavaLakesPerChunk = 1;
		
		//tallgrass Gen
		this.TallgrassPerChunk = 30;
		this.pixelflower_paeoniaPerChunk = 1;
		this.pixelflower_tulip_pinkPerChuck = 1;
		this.pixelflower_tulip_redPerChunk = 1;
		this.pixelflower_alliumPerChunk = 1;
		this.pixelflower_blue_orchidPerChunk = 1;
		this.pixelflower_dandelionPerChunk = 1;
		this.pixelflower_houstoniaPerChunk = 1;
		this.pixelflower_oxeye_daisyPerChunk = 1;
		this.pixelflower_rosePerChunk = 1;
		this.pixelflower_tulip_orangePerChunk = 1;
    }
    
    public void decorateChunk(World world, Random rand, BiomeGenBase biome, int x, int z)
    {
        if (this.currentWorld != null)
        {
            throw new RuntimeException("Already decorating!!");
        }
        else
        {
            this.currentWorld = world;
            this.rand = rand;
            this.chunkX = x;
            this.chunkZ = z;
        }
    }
    
	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}

	@Override
	protected void decorate() {
		/*this.generateOre(4, this.iceGen, 60, 120);
        this.generateOre(20, this.dirtGen, 0, 200);
        this.generateOre(15, this.deshGen, 20, 64);
        this.generateOre(26, this.copperGen, 0, 60);
        this.generateOre(23, this.tinGen, 0, 60);
        this.generateOre(20, this.ironGen, 0, 64);*/
		
		//generateOre(int amountPerChunk, WorldGenerator worldGenerator, int minY, int maxY);
		
		this.generateOre(15, this.CoalOreGen, 0, 100);
		this.generateOre(15, this.pixelizerGen, 20, 64);
		this.generateOre(8, this.diamondPixelGen, 2, 10);
		this.generateOre(10, this.ironGen, 0, 64);
		this.generateOre(10, this.nitrogenGen, 0, 64);
		this.generateOre(10, this.blueStonegen, 0, 18);
		this.generateOre(10, this.goldGen, 0, 64);
		
		int var2;
		int var3;
		int var4;
		int var5;
		int x;
        int y;
        int z;
        int i;

        
		for (var2 = 0; var2 < this.H3OLakesPerChunk; ++var2) {
			var3 = this.chunkX + this.rand.nextInt(16) + 8;
			var4 = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(112) + 8) + 8);
			var5 = this.chunkZ + this.rand.nextInt(16) + 8;
		new WorldGenPixelH3O(PixelGalaxyBlocks.PixelWaterH3OBLock, PixelGalaxyBlocks.PixelWaterH3OBLock, 3).generate(this.currentWorld, this.rand, var3, var4, var5);
		}
		
		for (var2 = 0; var2 < this.LavaLakesPerChunk; ++var2) {
			var3 = this.chunkX + this.rand.nextInt(16) + 8;
			var4 = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(112) + 8) + 8);
			var5 = this.chunkZ + this.rand.nextInt(16) + 8;
		new WorldGenPixelLava(PixelGalaxyBlocks.pixelLavaBlock, PixelGalaxyBlocks.pixelLavaBlock, 3).generate(this.currentWorld, this.rand, var3, var4, var5);
		}	
	
		//tallGrass
		for (i = 0; this.getGen(EventType.GRASS) && i < this.TallgrassPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelTallGrass, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_paeoniaPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_paeonia, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_tulip_pinkPerChuck; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_tulip_pink, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_tulip_redPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_tulip_red, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_alliumPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_allium, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_blue_orchidPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_blue_orchid, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_dandelionPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_dandelion, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_houstoniaPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_houstonia, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_oxeye_daisyPerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_oxeye_daisy, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_rosePerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_rose, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
		for (i = 0; this.getGen(EventType.GRASS) && i < this.pixelflower_tulip_orangePerChunk; ++i)
        {
            x = this.chunkX + this.rand.nextInt(16) + 8;
            y = this.rand.nextInt(256);
            z = this.chunkZ + this.rand.nextInt(16) + 8;
            new WorldGenPixelFlower(PixelGalaxyBlocks.pixelflower_tulip_orange, 0).generate(this.currentWorld, this.rand, x, y, z);
        }
	}	
	
	private boolean getGen(EventType event)
    {
        return TerrainGen.decorate(this.currentWorld, this.rand, this.chunkX, this.chunkZ, event);
    }

}
