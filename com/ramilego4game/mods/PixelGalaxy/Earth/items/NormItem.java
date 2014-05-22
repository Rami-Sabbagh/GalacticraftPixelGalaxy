package com.ramilego4game.mods.PixelGalaxy.Earth.items;

import net.minecraft.item.Item;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class NormItem extends Item {

	public NormItem(int id) {
		super(id);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
		setMaxStackSize(64);
	}

}
