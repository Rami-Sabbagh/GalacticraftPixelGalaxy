package com.ramilego.pixelgalaxy.blocks;

import static net.minecraftforge.common.util.ForgeDirection.UP;

import java.util.ArrayList;
import java.util.Random;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockStem;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PixelStem extends BlockStem implements IGrowable
{
	    @SideOnly(Side.CLIENT)
	    private IIcon field_149876_b;
		private Block field_149877_a;
	    private static final String __OBFID = "CL_00000316";

	    protected PixelStem(Block p_i45430_1_)
	    {
	    	super(p_i45430_1_);
	        this.setTickRandomly(true);
	        float f = 0.125F;
	        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
	    }

	    /**
	     * is the block grass, dirt or farmland
	     */
	    @Override
	    protected boolean canPlaceBlockOn(Block p_149854_1_)
	    {
	        return p_149854_1_ == PixelGalaxyBlocks.FarmlandPixel;
	    }


	    @Override
	    public void func_149874_m(World p_149874_1_, int p_149874_2_, int p_149874_3_, int p_149874_4_)
	    {
	        int l = p_149874_1_.getBlockMetadata(p_149874_2_, p_149874_3_, p_149874_4_) + MathHelper.getRandomIntegerInRange(p_149874_1_.rand, 2, 5);

	        if (l > 7)
	        {
	            l = 7;
	        }

	        p_149874_1_.setBlockMetadataWithNotify(p_149874_2_, p_149874_3_, p_149874_4_, l, 2);
	    }


	    /**
	     * Returns the color this block should be rendered. Used by leaves.
	     */
	    @Override
	    @SideOnly(Side.CLIENT)
	    public int getRenderColor(int p_149741_1_)
	    {
	        int j = p_149741_1_ * 32;
	        int k = 255 - p_149741_1_ * 8;
	        int l = p_149741_1_ * 4;
	        return j << 16 | k << 8 | l;
	    }

	    /**
	     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
	     * when first determining what to render.
	     */
	    @Override
	    @SideOnly(Side.CLIENT)
	    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
	    {
	        return this.getRenderColor(p_149720_1_.getBlockMetadata(p_149720_2_, p_149720_3_, p_149720_4_));
	    }

	    /**
	     * Sets the block's bounds for rendering it as an item
	     */
	    @Override
	    public void setBlockBoundsForItemRender()
	    {
	        float f = 0.125F;
	        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
	    }

	    /**
	     * Updates the blocks bounds based on its current state. Args: world, x, y, z
	     */
	    @Override
	    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	    {
	        this.maxY = (double)((float)(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) * 2 + 2) / 16.0F);
	        float f = 0.125F;
	        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)this.maxY, 0.5F + f);
	    }

	    /**
	     * The type of render function that is called for this block
	     */
	    @Override
	    public int getRenderType()
	    {
	        return 19;
	    }


	    /**
	     * Drops the block items with a specified chance of dropping the specified items
	     */
	    @Override
	    @SuppressWarnings("unused")
	    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	    {
	        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);

	        if (false && !p_149690_1_.isRemote)
	        {
	            Item item = null;

	            if (this.field_149877_a == PixelGalaxyBlocks.pixelPumpkin)
	            {
	                item = PixelGalaxyItems.pixelPumkinSeed;
	            }

	            for (int j1 = 0; j1 < 3; ++j1)
	            {
	                if (p_149690_1_.rand.nextInt(15) <= p_149690_5_)
	                {
	                    this.dropBlockAsItem(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, new ItemStack(item));
	                }
	            }
	        }
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return null;
	    }

	    /**
	     * Returns the quantity of items to drop on block destruction.
	     */
	    @Override
	    public int quantityDropped(Random p_149745_1_)
	    {
	        return 1;
	    }

	    @Override
	    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
	    {
	        return p_149851_1_.getBlockMetadata(p_149851_2_, p_149851_3_, p_149851_4_) != 7;
	    }

	    @Override
	    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
	    {
	        return true;
	    }

	    /**
	     * Gets an item for the block being called on. Args: world, x, y, z
	     */
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	    {
	        return this.field_149877_a == PixelGalaxyBlocks.pixelPumpkin ? PixelGalaxyItems.pixelPumkinSeed : (this.field_149877_a == Blocks.melon_block ? Items.melon_seeds : Item.getItemById(0));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_stem" + "_disconnected");
	        this.field_149876_b = p_149651_1_.registerIcon(this.getTextureName() + "_stem" + "_connected");
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public IIcon getStemIcon()
	    {
	        return this.field_149876_b;
	    }

	    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
	    {
	        this.func_149874_m(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_);
	    }


	    @Override
	    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune)
	    {
	        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

	        Item item = null;
	        item = field_149877_a == PixelGalaxyBlocks.pixelPumpkin ? PixelGalaxyItems.pixelPumkinSeed : item;

	        for (int i = 0; item != null && i < 3; i++)
	        {
	            if (world.rand.nextInt(15) <= meta)
	                ret.add(new ItemStack(item));
	        }

	        return ret;
	    }
}