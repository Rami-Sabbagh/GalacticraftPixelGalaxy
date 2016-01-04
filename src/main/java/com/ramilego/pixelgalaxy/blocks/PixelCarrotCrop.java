package com.ramilego.pixelgalaxy.blocks;

import java.util.ArrayList;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class PixelCarrotCrop extends BlockCrops 
{
	@SideOnly(Side.CLIENT)
    private IIcon[] field_149869_a;
    private static final String __OBFID = "CL_00000286";
    
    @Override
    protected boolean canPlaceBlockOn(Block FarmlandPixel)
    {
        return FarmlandPixel == PixelGalaxyBlocks.FarmlandPixel;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 7)
        {
            if (p_149691_2_ == 6)
            {
                p_149691_2_ = 5;
            }

            return this.field_149869_a[p_149691_2_ >> 1];
        }
        else
        {
            return this.field_149869_a[3];
        }
    }

    @Override
    protected Item func_149866_i()
    {
        return PixelGalaxyItems.pixelCarrot;
    }

    @Override
    protected Item func_149865_P()
    {
        return PixelGalaxyItems.pixelCarrot;
    }

    @Override
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
    }

    /**Will Fix**/
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
        if (metadata >= 7 && world.rand.nextInt(50000000) == 0)
            ret.add(new ItemStack(Items.poisonous_potato));
        return ret;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149869_a = new IIcon[4];

        for (int i = 0; i < this.field_149869_a.length; ++i)
        {
            this.field_149869_a[i] = p_149651_1_.registerIcon(this.getTextureName() + "_stage_" + i);
        }
    }

}
