package com.ramilego.pixelgalaxy.blocks;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PixelIntenseNitrogenBlock extends Block {
	
	protected PixelIntenseNitrogenBlock(Material material) 
	{
		super(Material.cloth);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
	}

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityPlayer)
        {
            entity.motionY = 0.16F;
            entity.fallDistance = 0.0F;

            if (((EntityPlayer)entity).capabilities.isFlying)
            {
                return;
            }
        }
        if (entity instanceof EntityItem)
        {
            entity.motionY = 0.32F;
            entity.fallDistance = 0.0F;
        }
        else
        {
            entity.motionY = 0.12F;
            entity.fallDistance = 0.0F;
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int var2, int var3, int var4)
    {
        return null;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
        return super.shouldSideBeRendered(world, x, y, z, 1 - side);
    }
}
