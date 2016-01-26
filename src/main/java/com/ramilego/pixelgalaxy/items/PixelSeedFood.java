package com.ramilego.pixelgalaxy.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeedFood;

public class PixelSeedFood extends ItemSeedFood
{

	private Block field_150908_b;
	/** Block ID of the soil this seed food should be planted on. */
	private Block soilId;
	private static final String __OBFID = "CL_00000060";

	public PixelSeedFood(int p_i45351_1_, float p_i45351_2_, Block p_i45351_3_, Block p_i45351_4_) {
		super(p_i45351_1_, p_i45351_2_, p_i45351_3_, p_i45351_4_);
		this.field_150908_b = p_i45351_3_;
        this.soilId = p_i45351_4_;
	}
	
}
