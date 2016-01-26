package com.ramilego.pixelgalaxy.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PixelSoupItem extends ItemFood
{
    private static final String __OBFID = "CL_00001778";
    private PotionEffect[] effects;
    
    public PixelSoupItem(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects)
    {
        super(healAmount, saturationModifier, wolvesFavorite);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
        return new ItemStack(PixelGalaxyItems.pixelbowl);
    }
}