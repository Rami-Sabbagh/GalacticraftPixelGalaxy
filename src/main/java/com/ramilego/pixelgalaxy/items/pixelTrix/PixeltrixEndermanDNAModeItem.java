/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Thank you this DNA from MutantCreatures mod^^
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

package com.ramilego.pixelgalaxy.items.pixelTrix;

import com.google.common.collect.Multimap;
import com.ramilego.pixelgalaxy.entity.objs.EnderBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

public class PixeltrixEndermanDNAModeItem extends Item
{
  public PixeltrixEndermanDNAModeItem()
  {
    setMaxStackSize(1);
  }
  
  public Multimap getItemAttributeModifiers()
  {
    Multimap multimap = super.getItemAttributeModifiers();
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 6.0D, 0));
    return multimap;
  }
  
  public boolean hitEntity(ItemStack stack, EntityLivingBase living, EntityLivingBase player)
  {
    stack.damageItem(1, player);
    return true;
  }
  
  public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int side, float f, float f1, float f2)
  {
    if (player.isSneaking()) {
      return false;
    }
    if (!world.isRemote)
    {
      if (!world.canMineBlock(player, i, j, k)) {
        return false;
      }
      if (!player.canPlayerEdit(i, j, k, side, stack)) {
        return false;
      }
      Block block = world.getBlock(i, j, k);
      if (prohibitedBlocks.contains(block)) {
        return false;
      }
      if ((block instanceof BlockContainer)) {
        return false;
      }
      int data = world.getBlockMetadata(i, j, k);
      world.setBlock(i, j, k, Blocks.air, 0, 3);
      world.spawnEntityInWorld(new EnderBlock(world, player, block, data));
    }
    return true;
  }
  
  public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
  {
    if (!player.isSneaking()) {
      return stack;
    }
    MovingObjectPosition mop = getMOPFromPlayer(world, player, 128.0F);
    if (mop == null) {
      return stack;
    }
    if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
    {
      int x = mop.blockX;int y = mop.blockY;int z = mop.blockZ;
      x += net.minecraft.util.Facing.offsetsXForSide[mop.sideHit];
      y += net.minecraft.util.Facing.offsetsYForSide[mop.sideHit];
      z += net.minecraft.util.Facing.offsetsZForSide[mop.sideHit];
      Block block = world.getBlock(x, y - 1, z);
      if ((block != Blocks.air) || (!block.getMaterial().isSolid()))
      {
        Block block1 = world.getBlock(mop.blockX, mop.blockY + 1, mop.blockZ);
        Block block2 = world.getBlock(mop.blockX, mop.blockY + 2, mop.blockZ);
        Block block3 = world.getBlock(mop.blockX, mop.blockY + 3, mop.blockZ);
        if (block1 == Blocks.air)
        {
          x = mop.blockX;
          y = mop.blockY + 1;
          z = mop.blockZ;
        }
        else if (block2 == Blocks.air)
        {
          x = mop.blockX;
          y = mop.blockY + 2;
          z = mop.blockZ;
        }
        else if (block3 == Blocks.air)
        {
          x = mop.blockX;
          y = mop.blockY + 3;
          z = mop.blockZ;
        }
      }
      if (!world.isRemote) {
        world.playSoundEffect(player.posX, player.posY + player.height / 2.0D, player.posZ, "mob.endermen.portal", 1.0F, 1.0F);
      }
      player.setPosition(x + 0.5D, y, z + 0.5D);
      player.fallDistance = 0.0F;
      if (!world.isRemote)
      {
        float r = 2.0F;
        List list = world.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.expand(r, r, r));
        for (int i = 0; i < list.size(); i++)
        {
          Entity entity = (Entity)list.get(i);
          if ((entity instanceof EntityLiving))
          {
            EntityLivingBase living = (EntityLiving)entity;
            living.attackEntityFrom(DamageSource.causePlayerDamage(player), 4.0F);
            if ((living instanceof EntityPlayer)) {
              living.addPotionEffect(new PotionEffect(Potion.blindness.id, 100));
            }
            double mx = entity.posX - player.posX;
            double mz = entity.posZ - player.posZ;
            double signX = mx / Math.abs(mx);double signZ = mz / Math.abs(mz);
            living.motionX = ((r * signX * 2.0D - mx) * 0.20000000298023224D);
            living.motionY = 0.20000000298023224D;
            living.motionZ = ((r * signZ * 2.0D - mz) * 0.20000000298023224D);
          }
        }
        world.playSoundEffect(player.posX, player.posY + player.height / 2.0D, player.posZ, "mob.endermen.portal", 1.0F, 1.0F);
      }
      stack.damageItem(4, player);
    }
    return stack;
  }
  
  public MovingObjectPosition getMOPFromPlayer(World world, EntityPlayer player, float maxDist)
  {
    float f = 1.0F;
    float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
    float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
    double d0 = player.prevPosX + (player.posX - player.prevPosX) * f;
    double d1 = player.prevPosY + (player.posY - player.prevPosY) * f + 1.62D - player.yOffset;
    double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * f;
    Vec3 vec3 = Vec3.createVectorHelper(d0, d1, d2);
    float f3 = MathHelper.cos(-f2 * 0.017453292F - 3.1415927F);
    float f4 = MathHelper.sin(-f2 * 0.017453292F - 3.1415927F);
    float f5 = -MathHelper.cos(-f1 * 0.017453292F);
    float f6 = MathHelper.sin(-f1 * 0.017453292F);
    float f7 = f4 * f5;
    float f8 = f3 * f5;
    double d3 = maxDist;
    Vec3 vec31 = vec3.addVector(f7 * d3, f6 * d3, f8 * d3);
    return world.func_147447_a(vec3, vec31, false, true, false);
  }
  
  private static final ArrayList<Block> prohibitedBlocks = new ArrayList();
  
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
  {
    list.add("This mode is get power from MutantEnderman DNA");
    list.add("Thank you MutantCreatures mod for this DNA");
  }
  
  static
  {
    prohibitedBlocks.add(Blocks.bedrock);
    prohibitedBlocks.add(Blocks.obsidian);
    prohibitedBlocks.add(Blocks.redstone_wire);
    prohibitedBlocks.add(Blocks.tripwire);
    prohibitedBlocks.add(Blocks.iron_bars);
    prohibitedBlocks.add(Blocks.rail);
    prohibitedBlocks.add(Blocks.detector_rail);
    prohibitedBlocks.add(Blocks.golden_rail);
    prohibitedBlocks.add(Blocks.powered_repeater);
    prohibitedBlocks.add(Blocks.powered_comparator);
    prohibitedBlocks.add(Blocks.daylight_detector);
    prohibitedBlocks.add(Blocks.vine);
    prohibitedBlocks.add(Blocks.wheat);
    prohibitedBlocks.add(Blocks.pumpkin_stem);
    prohibitedBlocks.add(Blocks.melon_stem);
    prohibitedBlocks.add(Blocks.waterlily);
    prohibitedBlocks.add(Blocks.carrots);
    prohibitedBlocks.add(Blocks.potatoes);
    prohibitedBlocks.add(Blocks.cocoa);
  }
}
