package com.ramilego.pixelgalaxy;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PixelCreativeTab {
	public static CreativeTabs PixelBlocksTab = new CreativeTabs("PixelBlocksTab"){@Override public Item getTabIconItem() {return Item.getItemFromBlock(PixelGalaxyBlocks.greenGrass);}};
	public static CreativeTabs PixelItemsTab = new CreativeTabs("PixelItemsTab"){@Override public Item getTabIconItem() {return PixelGalaxyItems.pixelizerPickaxe;}};
	
	
	public static void registerTabs(){
		
	}
}
