package com.ramilego.pixelgalaxy.blocks.doors;

import java.util.Random;

import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PixelWoodDoor extends BlockDoor {
	
	public PixelWoodDoor(Material material)
    {
        super(material);
    }

	private Item itemDropped = null;
    private int quantityDropped = 1;
    
    	@Override
    	public Item getItemDropped(int metadata, Random random, int fortune)
    	{
    		int drop = random.nextInt(1);
            
                if (drop == 0)
                {
                  itemDropped = PixelGalaxyItems.pixelDoorWood;
                }
                
            return itemDropped;
    	}
}