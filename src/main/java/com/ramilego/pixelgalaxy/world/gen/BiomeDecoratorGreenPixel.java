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
    	
    	this.pixelizerGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerOre, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
    	this.diamondPixelGen = new WorldGenMinableMeta(PixelGalaxyBlocks.pixelizerDiamondOre, 6, 1, false, PixelGalaxyBlocks.pixelStone, 1);
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
		
		this.generateOre(15, this.pixelizerGen, 20, 64);
		this.generateOre(15, this.diamondPixelGen, 3, 10);
	}

}
