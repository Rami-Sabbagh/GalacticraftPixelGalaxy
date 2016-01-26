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
        else if (itemFuel == PixelGalaxyItems.pixelLavaBucket)
        {
            return 20000;
        }
        else if (itemFuel == PixelGalaxyItems.pixelWoodStickItem)
        {
            return 100;
        }
        else if (itemFuel == PixelGalaxyItems.woodPixelSword)
        {
            return 200;
        }
        else if (itemFuel == PixelGalaxyItems.woodPixelHoe)
        {
            return 200;
        }
        else if (itemFuel == PixelGalaxyItems.woodPixelPickaxe)
        {
            return 200;
        }
        else if (itemFuel == PixelGalaxyItems.woodPixelShovel)
        {
            return 200;
        }
        else if (itemFuel == PixelGalaxyItems.woodPixelAxe)
        {
            return 200;
        }
		return 0;
	}

}