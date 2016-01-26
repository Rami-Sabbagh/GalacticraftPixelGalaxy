package com.ramilego.pixelgalaxy.fluids.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PixelFluidH3OBlock extends BlockFluidClassic {
	public static IIcon WaterH3OStill;
	public static IIcon WaterH3OFlowing;

	public PixelFluidH3OBlock(String name, Fluid fluid, Material par2Material) {
		super(fluid, par2Material);
		this.setQuantaPerBlock(8);
		this.setRenderPass(1);
		this.needsRandomTick = true;
		this.stack = new FluidStack(fluid, FluidContainerRegistry.BUCKET_VOLUME);
		this.setBlockName(name);
		this.setCreativeTab(PixelCreativeTab.PixelBlocksTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return par1 != 0 && par1 != 1 ? PixelFluidH3OBlock.WaterH3OStill : PixelFluidH3OBlock.WaterH3OFlowing;
	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
			return false;
		}
		return super.canDisplace(world, x, y, z);
	}

	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
			return false;
		}
		return super.displaceIfPossible(world, x, y, z);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		PixelFluidH3OBlock.WaterH3OStill = par1IconRegister.registerIcon(Constants.TEXTURE_PREFIX + "H3O_flow");
		PixelFluidH3OBlock.WaterH3OFlowing = par1IconRegister.registerIcon(Constants.TEXTURE_PREFIX + "H3O_still");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		super.randomDisplayTick(world, x, y, z, rand);

		if (rand.nextInt(64) == 0) {
			final int l = world.getBlockMetadata(x, y, z);

			if (l > 0 && l < 8) {
				world.playSound(x + 0.5F, y + 0.5F, z + 0.5F, "liquid.water", rand.nextFloat() * 0.25F + 0.75F, rand.nextFloat() * 1.0F + 0.5F, false);
			}
		}

		if (rand.nextInt(10) == 0) {
			final int l = world.getBlockMetadata(x, y, z);

			if (l <= 0 || l >= 8) {
				world.spawnParticle("suspended", x + rand.nextFloat(), y + rand.nextFloat(), z + rand.nextFloat(), 0.0D, 0.0D, 0.0D);
			}
		}

		if (rand.nextInt(10) == 0 && World.doesBlockHaveSolidTopSurface(world, x, y - 1, z) && !world.getBlock(x, y - 2, z).getMaterial().blocksMovement()) {
			final double d5 = x + rand.nextFloat();
			final double d6 = y - 1.05D;
			final double d7 = z + rand.nextFloat();
		}
	}
	
	public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        this.func_149805_n(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
    }
	
	private void func_149805_n(World p_149805_1_, int p_149805_2_, int p_149805_3_, int p_149805_4_)
    {
        if (p_149805_1_.getBlock(p_149805_2_, p_149805_3_, p_149805_4_) == this)
        {
            if (this.blockMaterial == Material.lava)
            {
                boolean flag = false;

                if (flag || p_149805_1_.getBlock(p_149805_2_, p_149805_3_, p_149805_4_ - 1).getMaterial() == Material.water)
                {
                    flag = true;
                }

                if (flag || p_149805_1_.getBlock(p_149805_2_, p_149805_3_, p_149805_4_ + 1).getMaterial() == Material.water)
                {
                    flag = true;
                }

                if (flag || p_149805_1_.getBlock(p_149805_2_ - 1, p_149805_3_, p_149805_4_).getMaterial() == Material.water)
                {
                    flag = true;
                }

                if (flag || p_149805_1_.getBlock(p_149805_2_ + 1, p_149805_3_, p_149805_4_).getMaterial() == Material.water)
                {
                    flag = true;
                }

                if (flag || p_149805_1_.getBlock(p_149805_2_, p_149805_3_ + 1, p_149805_4_).getMaterial() == Material.water)
                {
                    flag = true;
                }

                if (flag)
                {
                    int l = p_149805_1_.getBlockMetadata(p_149805_2_, p_149805_3_, p_149805_4_);

                    if (l == 0)
                    {
                        p_149805_1_.setBlock(p_149805_2_, p_149805_3_, p_149805_4_, PixelGalaxyBlocks.pixelObsidian);
                    }
                    else if (l <= 4)
                    {
                        p_149805_1_.setBlock(p_149805_2_, p_149805_3_, p_149805_4_, PixelGalaxyBlocks.pixelCobblestoneStone);
                    }

                    this.func_149799_m(p_149805_1_, p_149805_2_, p_149805_3_, p_149805_4_);
                }
            }
        }
    }
	
	  protected void func_149799_m(World p_149799_1_, int p_149799_2_, int p_149799_3_, int p_149799_4_)
	    {
	        p_149799_1_.playSoundEffect((double)((float)p_149799_2_ + 0.5F), (double)((float)p_149799_3_ + 0.5F), (double)((float)p_149799_4_ + 0.5F), "random.fizz", 0.5F, 2.6F + (p_149799_1_.rand.nextFloat() - p_149799_1_.rand.nextFloat()) * 0.8F);

	        for (int l = 0; l < 8; ++l)
	        {
	            p_149799_1_.spawnParticle("largesmoke", (double)p_149799_2_ + Math.random(), (double)p_149799_3_ + 1.2D, (double)p_149799_4_ + Math.random(), 0.0D, 0.0D, 0.0D);
	        }
	    }
}

