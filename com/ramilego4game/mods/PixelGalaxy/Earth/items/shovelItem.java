package com.ramilego4game.mods.PixelGalaxy.Earth.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class shovelItem extends ItemTool{
	
	public static final Block[] blocksEffectiveAgainst = new Block[] {GalacticraftPixelEarth.pixelGrass,GalacticraftPixelEarth.pixelDirt,Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};
	
	public shovelItem(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, 1.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}
	
	/**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
}
