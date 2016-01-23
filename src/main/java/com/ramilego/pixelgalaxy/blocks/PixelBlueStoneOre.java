package com.ramilego.pixelgalaxy.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class PixelBlueStoneOre extends Block {

	protected PixelBlueStoneOre(Material material) {
		super(material);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(0.3F);
        this.setLightLevel(0.3F);
        this.setStepSound(Block.soundTypeGlass);
	}
	
	@Override
	public Item getItemDropped(int BUB, Random IS, int GAY)
    {
		return PixelGalaxyItems.blueStoneIngot;
    }
	
	@Override
	public int quantityDropped(Random IS)
	{
		return 5;
	}

	@Override
    public MapColor getMapColor(int JEDGUY)
    {
        return MapColor.blueColor;
    }
	
}
