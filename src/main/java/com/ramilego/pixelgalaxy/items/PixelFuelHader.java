package com.ramilego.pixelgalaxy.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class PixelFuelHader implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
        Item itemFuel = fuel.getItem();
        if (itemFuel == PixelGalaxyItems.pixelCharCoal)
        {
            return 1600;
        }
        else if (itemFuel == PixelGalaxyItems.pixelCoal)
        {
            return 1600;
        }
        else if (itemFuel == PixelGalaxyItems.pixelWoodItem)
        {
            return 300;
        }
		return 0;
	}

}