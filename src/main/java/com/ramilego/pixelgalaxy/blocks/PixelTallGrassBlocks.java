package com.ramilego.pixelgalaxy.blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class PixelTallGrassBlocks extends BlockBush implements IShearable
{
    private static final String __OBFID = "CL_00000224";

    protected PixelTallGrassBlocks()
    {
        super(Material.vine);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }

    /**
     * is the block grass, dirt or farmland
     */
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == PixelGalaxyBlocks.greenGrass || p_149854_1_ == PixelGalaxyBlocks.pixelDirt;
    }

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
        {
            super.harvestBlock(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
        }
    }

    @Override 
    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z) { return true; }
    
    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune)
    {
        return new ArrayList<ItemStack>(Arrays.asList(new ItemStack(PixelGalaxyBlocks.pixelTallGrass, 1, world.getBlockMetadata(x, y, z))));
    }
    
    private Item itemDropped = null;
    private int quantityDropped = 0;
    
    	@Override
    	public Item getItemDropped(int metadata, Random random, int fortune)
    	{
    		int drop = random.nextInt(2);
            
                if (drop == 0)
                {
                  itemDropped = PixelGalaxyItems.pixelRiceSeed;
                }
                if (drop == 1)
                {
                  itemDropped = PixelGalaxyItems.pixelWheatSeed;
                }
                if (drop == 2)
                {
                  itemDropped = null;
                }
                
            return itemDropped;
    	}
    
}