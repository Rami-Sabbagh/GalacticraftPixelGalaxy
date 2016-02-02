package com.ramilego.pixelgalaxy.world.gen;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;

import net.minecraft.world.World;
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
	
	public int H3OLakesPerChunk;
	public int LavaLakesPerChunk;
	
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
    	
    	this.CoalOreGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelCoalOre, 15, 5, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.blueStonegen = new WorldGenMinableMeta(PixelGalaxyBlocks.blueStoneOre, 8, 3, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.ironGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelIronOre, 8, 3, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.pixelizerGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerOre, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.diamondPixelGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerDiamondOre, 4, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.nitrogenGen = new WorldGenMinableMeta(PixelGalaxyBlocks.PixelNitrogen, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	
    	this.H3OLakesPerChunk = 1;
		this.LavaLakesPerChunk = 1;
    
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
		
		int var2;
		int var3;
		int var4;
		int var5;
		
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

			
		
		
	}

}
