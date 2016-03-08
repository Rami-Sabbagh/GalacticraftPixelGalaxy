package com.ramilego.pixelgalaxy.world.gen.trees;

import java.util.Random;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;

import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPixelOrangeTree extends WorldGenerator {
	
	private final Block logBlock = PixelGalaxyBlocks.pixelLog;
	private final Block leaveBlock = PixelGalaxyBlocks.pixelOrangeLeaves;
	
	private final int minTreeHeight;
    private final boolean vinesGrow;
    private final int metaWood;
    private final int metaLeaves;
    
    public WorldGenPixelOrangeTree(boolean notify, ItemStack sapling)
    {
        this(notify, 4, 0, 0, false);
    }

    public WorldGenPixelOrangeTree(boolean notify, int minHeight, int woodMeta, int leavesMeta, boolean vines)
    {
        super(notify);
        this.minTreeHeight = minHeight;
        this.metaWood = woodMeta;
        this.metaLeaves = leavesMeta;
        this.vinesGrow = vines;
    }

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		int l = rand.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if (y >= 1 && y + l + 1 <= 256)
        {
            int i1;
            byte b0;
            int j1;
            int k1;
            int k2;

            for (i1 = y; i1 <= y + 1 + l; ++i1)
            {
                b0 = 1;

                if (i1 == y)
                {
                    b0 = 0;
                }

                if (i1 >= y + 1 + l - 2)
                {
                    b0 = 2;
                }

                b0 += 5;

                for (int l1 = x - b0; l1 <= x + b0 && flag; ++l1)
                {
                    for (j1 = z - b0; j1 <= z + b0 && flag; ++j1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            Block k1b = world.getBlock(l1, i1, j1);
                            k2 = world.getBlockMetadata(l1, i1, j1);

                            boolean isAir = world.isAirBlock(l1, i1, j1);

                            if (!isAir && k1b != Blocks.grass && k1b != Blocks.water && k1b != Blocks.flowing_water)
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                if (y < 256 - l - 1)
                {
                    b0 = 3;
                    byte b1 = 0;
                    int i2;
                    int j2;

                    for (j1 = y - b0 + l; j1 <= y + l; ++j1)
                    {
                        k1 = j1 - (y + l);
                        i2 = b1 + 1 - k1 / 2;

                        for (j2 = x - i2; j2 <= x + i2; ++j2)
                        {
                            k2 = j2 - x;

                            for (int l2 = z - i2; l2 <= z + i2; ++l2)
                            {
                                int i3 = l2 - z;

                                if (Math.abs(k2) != i2 || Math.abs(i3) != i2 || rand.nextInt(2) != 0 && k1 != 0)
                                {
                                    Block block = world.getBlock(j2, j1, l2);

                                    if (block == null || block.canBeReplacedByLeaves(world, j2, j1, l2))
                                    {
                                        this.setBlockAndNotifyAdequately(world, j2, j1, l2, this.leaveBlock, this.metaLeaves);
                                    }
                                }
                            }
                        }
                    }

                    for (j1 = 0; j1 < l; ++j1)
                    {
                        Block block = world.getBlock(x, y + j1, z);

                        if (block.isAir(world, x, y + j1, z) || block.isLeaves(world, x, y + j1, z))
                        {
                            this.setBlockAndNotifyAdequately(world, x, y + j1, z, this.logBlock, this.metaWood);

                            if (this.vinesGrow && j1 > 0)
                            {
                                if (rand.nextInt(3) > 0 && world.isAirBlock(x - 1, y + j1, z))
                                {
                                    this.setBlockAndNotifyAdequately(world, x - 1, y + j1, z, Blocks.vine, 8);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(x + 1, y + j1, z))
                                {
                                    this.setBlockAndNotifyAdequately(world, x + 1, y + j1, z, Blocks.vine, 2);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(x, y + j1, z - 1))
                                {
                                    this.setBlockAndNotifyAdequately(world, x, y + j1, z - 1, Blocks.vine, 1);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(x, y + j1, z + 1))
                                {
                                    this.setBlockAndNotifyAdequately(world, x, y + j1, z + 1, Blocks.vine, 4);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (j1 = y - 3 + l; j1 <= y + l; ++j1)
                        {
                            k1 = j1 - (y + l);
                            i2 = 2 - k1 / 2;

                            for (j2 = x - i2; j2 <= x + i2; ++j2)
                            {
                                for (k2 = z - i2; k2 <= z + i2; ++k2)
                                {
                                    Block block = world.getBlock(j2, j1, k2);
                                    if (block != null && block.isLeaves(world, j2, j1, k2))
                                    {
                                        if (rand.nextInt(4) == 0 && world.isAirBlock(j2 - 1, j1, k2))
                                        {
                                            this.growVines(world, j2 - 1, j1, k2, 8);
                                        }

                                        if (rand.nextInt(4) == 0 && world.isAirBlock(j2 + 1, j1, k2))
                                        {
                                            this.growVines(world, j2 + 1, j1, k2, 2);
                                        }

                                        if (rand.nextInt(4) == 0 && world.isAirBlock(j2, j1, k2 - 1))
                                        {
                                            this.growVines(world, j2, j1, k2 - 1, 1);
                                        }

                                        if (rand.nextInt(4) == 0 && world.isAirBlock(j2, j1, k2 + 1))
                                        {
                                            this.growVines(world, j2, j1, k2 + 1, 4);
                                        }
                                    }
                                }
                            }
                        }

                        if (rand.nextInt(5) == 0 && l > 5)
                        {
                            for (j1 = 0; j1 < 2; ++j1)
                            {
                                for (k1 = 0; k1 < 4; ++k1)
                                {
                                    if (rand.nextInt(4 - j1) == 0)
                                    {
                                        i2 = rand.nextInt(3);
                                        this.setBlockAndNotifyAdequately(world, x + Direction.offsetX[Direction.rotateOpposite[k1]], y + l - 5 + j1, z + Direction.offsetZ[Direction.rotateOpposite[k1]], Blocks.cocoa, i2 << 2 | k1);
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * Grows vines downward from the given block for a given length. Args:
     * World, x, starty, z, vine-length
     */
    private void growVines(World par1World, int x, int y, int z, int meta)
    {
        this.setBlockAndNotifyAdequately(par1World, x, y, z, Blocks.vine, meta);
        int i1 = 4;

        while (true)
        {
            --y;

            if (!par1World.isAirBlock(x, y, z) || i1 <= 0)
            {
                return;
            }

            this.setBlockAndNotifyAdequately(par1World, x, y, z, Blocks.vine, meta);
            --i1;
        }
    }

}
