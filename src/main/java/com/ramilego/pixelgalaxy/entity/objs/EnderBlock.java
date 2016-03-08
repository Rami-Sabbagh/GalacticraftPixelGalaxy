package com.ramilego.pixelgalaxy.entity.objs;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PacketEHandPos;
import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.entity.MutantEnderman;
import com.ramilego.pixelgalaxy.entity.PixelHuman;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class EnderBlock
  extends EntityThrowable
{
  private static final double grabbedDistance = 1.6D;
  
  public EnderBlock(World world)
  {
    super(world);
    setSize(1.0F, 1.0F);
  }
    
  public EnderBlock(World world, MutantEnderman enderman, int id)
  {
    super(world, enderman);
    setBlockID(enderman.heldBlock[id]);
    setBlockData(enderman.heldBlockData[id]);
    boolean outer = id <= 2;boolean right = (id & 0x1) == 1;
    EntityLivingBase living = enderman.getAttackTarget();
    Vec3 forward = PixelGalaxyMod.getDirVector(this.rotationYaw, outer ? 2.7F : 1.4F);
    Vec3 strafe = PixelGalaxyMod.getDirVector(this.rotationYaw + (right ? 90.0F : -90.0F), outer ? 2.2F : 2.0F);
    this.posX += forward.xCoord + strafe.xCoord;
    this.posY += (outer ? 2.8F : 1.1F) - enderman.getEyeHeight();
    this.posZ += forward.zCoord + strafe.zCoord;
    if (living != null) {
      setThrowableHeading(living.posX - this.posX, living.posY - this.posY, living.posZ - this.posZ, 1.4F, 1.0F);
    }
    setSize(1.0F, 1.0F);
  }
  
  public EnderBlock(World world, EntityPlayer player, Block block, int data)
  {
    super(world, player);
    setPosition(this.posX, this.posY, this.posZ);
    setBlockID(Block.getIdFromBlock(block));
    setBlockData(data);
    setGrabbed(true);
    setThrowerID(player);
    setSize(1.0F, 1.0F);
  }
  
  protected void entityInit()
  {
    super.entityInit();
    this.dataWatcher.addObject(16, Integer.valueOf(0));
    this.dataWatcher.addObject(17, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(19, Integer.valueOf(0));
  }
  
  private void setBlockID(int id)
  {
    this.dataWatcher.updateObject(16, Integer.valueOf(id));
  }
  
  private void setBlockData(int data)
  {
    this.dataWatcher.updateObject(17, Byte.valueOf((byte)data));
  }
  
  public void setGrabbed(boolean flag)
  {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)(flag ? 1 : 0)));
  }
  
  private void setThrowerID(EntityLivingBase living)
  {
    this.dataWatcher.updateObject(19, Integer.valueOf(living.getEntityId()));
  }
  
  public int getBlockID()
  {
    return this.dataWatcher.getWatchableObjectInt(16);
  }
  
  public int getBlockData()
  {
    return this.dataWatcher.getWatchableObjectByte(17);
  }
  
  public boolean getGrabbed()
  {
    return this.dataWatcher.getWatchableObjectByte(18) == 1;
  }
  
  public EntityLivingBase getThrowerID()
  {
    int id = this.dataWatcher.getWatchableObjectInt(19);
    return (EntityLivingBase)this.worldObj.getEntityByID(id);
  }
  
  protected float getGravityVelocity()
  {
    if (getGrabbed()) {
      return 0.0F;
    }
    if ((getThrower() != null) && ((getThrower() instanceof EntityPlayer))) {
      return 0.04F;
    }
    return 0.01F;
  }
  
  protected boolean canTriggerWalking()
  {
    return false;
  }
  
  public boolean canBeCollidedWith()
  {
    return (getGrabbed()) && (!this.isDead);
  }
  
  public boolean canBePushed()
  {
    return (getGrabbed()) && (!this.isDead);
  }
  
  public void onUpdate()
  {
    super.onUpdate();
    EntityLivingBase thrower = getThrower();
    if (getGrabbed())
    {
      if (thrower == null)
      {
        thrower = getThrowerID();
        if (thrower != null) {
          ReflectionHelper.setPrivateValue(EntityThrowable.class, this, thrower, PixelGalaxyMod.fThrower);
        }
      }
      if (thrower == null)
      {
        setGrabbed(false);
      }
      else
      {
        Vec3 vec = thrower.getLookVec();
        double x = thrower.posX + vec.xCoord * 1.6D - this.posX;
        double y = thrower.posY + thrower.getEyeHeight() + vec.yCoord * 1.6D - this.posY;
        double z = thrower.posZ + vec.zCoord * 1.6D - this.posZ;
        float offset = 0.6F;
        this.motionX = (x * offset);
        this.motionY = (y * offset);
        this.motionZ = (z * offset);
        moveEntity(this.motionX, this.motionY, this.motionZ);
        if (!this.worldObj.isRemote)
        {
          EntityPlayer player = (EntityPlayer)thrower;
          ItemStack stack = player.getCurrentEquippedItem();
          if ((stack == null) || (stack.getItem() != PixelGalaxyItems.pixeltrix_EndermanDNA)) {
            setGrabbed(false);
          }
        }
        else if ((thrower == Minecraft.getMinecraft().thePlayer) && (this.ticksExisted % 20 == 0))
        {
          sendPositionPacket();
        }
      }
    }
  }
  
  public Vec3 getLookVec(EntityLiving living)
  {
    float PI = 3.1415927F;
    float f1 = MathHelper.cos(-living.rotationYaw * 0.017453292F - PI);
    float f2 = MathHelper.sin(-living.rotationYaw * 0.017453292F - PI);
    float f3 = -MathHelper.cos(-living.rotationPitch * 0.017453292F);
    float f4 = MathHelper.sin(-living.rotationPitch * 0.017453292F);
    return Vec3.createVectorHelper(f2 * f3, f4, f1 * f3);
  }
  
  public boolean interactFirst(EntityPlayer player)
  {
    if ((!this.worldObj.isRemote) && (getGrabbed()) && (getThrower() == player))
    {
      if (player.isSneaking()) {
        return super.interactFirst(player);
      }
      setGrabbed(false);
      moveTowardsHeading(player);
      ItemStack stack = player.getCurrentEquippedItem();
      if ((stack != null) && (stack.getItem() == PixelGalaxyItems.pixeltrix_EndermanDNA)) {
        stack.damageItem(1, player);
      }
      PixelGalaxyMod.sendPacketToAll(player, new S0BPacketAnimation(player, 0));
    }
    return super.interactFirst(player);
  }
  
  public void moveTowardsHeading(EntityLivingBase living)
  {
    this.rotationYaw = living.rotationYaw;
    this.rotationPitch = living.rotationPitch;
    float f = 0.4F;float PI = 3.1415927F;
    this.motionX = (-MathHelper.sin(this.rotationYaw / 180.0F * PI) * MathHelper.cos(this.rotationPitch / 180.0F * PI) * f);
    this.motionY = (-MathHelper.sin(this.rotationPitch / 180.0F * PI) * f);
    this.motionZ = (MathHelper.cos(this.rotationYaw / 180.0F * PI) * MathHelper.cos(this.rotationPitch / 180.0F * PI) * f);
    setThrowableHeading(this.motionX, this.motionY, this.motionZ, 1.4F, 1.0F);
  }
  
  protected void onImpact(MovingObjectPosition mop)
  {
    if (getGrabbed()) {
      return;
    }
    EntityLivingBase thrower = getThrower();
    if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
    {
      Block block = this.worldObj.getBlock(mop.blockX, mop.blockY, mop.blockZ);
      if (block.getCollisionBoundingBoxFromPool(this.worldObj, mop.blockX, mop.blockY, mop.blockZ) == null) {
        return;
      }
    }
    List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(2.0D, 2.0D, 2.0D));
    list.remove(thrower);
    for (int i = 0; i < list.size(); i++)
    {
      Entity entity = (Entity)list.get(i);
      if (getDistanceSqToEntity(entity) <= 4.0D)
      {
        double x = entity.posX - this.posX;double z = entity.posZ - this.posZ;
        double d = Math.sqrt(x * x + z * z);
        entity.motionX = (x / d * 0.6000000238418579D);
        entity.motionY = 0.20000000298023224D;
        entity.motionZ = (z / d * 0.6000000238418579D);
        entity.attackEntityFrom(DamageSource.causeMobDamage(thrower), 6 + this.rand.nextInt(3));
      }
    }
    boolean hitEntity = mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY;
    if (hitEntity) {
      mop.entityHit.attackEntityFrom(DamageSource.causeMobDamage(thrower), 4.0F);
    }
    int x = MathHelper.floor_double(this.posX);
    int y = MathHelper.floor_double(this.posY);
    int z = MathHelper.floor_double(this.posZ);
    int id = getBlockID();int data = getBlockData();
    boolean grief = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
    if ((thrower != null) && ((thrower instanceof EntityPlayer))) {
      grief = true;
    }
    boolean play = true;
    if (id >= 0)
    {
      Block block = Block.getBlockById(id);
      boolean fail = false;
      if (block == Blocks.air)
      {
        fail = true;
      }
      else if (block.canPlaceBlockAt(this.worldObj, x, y, z))
      {
        if ((!this.worldObj.isRemote) && (grief) && (!hitEntity)) {
          this.worldObj.setBlock(x, y, z, block, data, 3);
        }
      }
      else if (block.canPlaceBlockAt(this.worldObj, x, y + 1, z))
      {
        if ((!this.worldObj.isRemote) && (grief) && (!hitEntity)) {
          this.worldObj.setBlock(x, y + 1, z, block, data, 3);
        }
        this.worldObj.playAuxSFX(2001, x, y + 1, z, id + (data << 12));
        play = false;
      }
      if ((!this.worldObj.isRemote) && (fail))
      {
        ItemStack stack = new ItemStack(block, 1, data);
        this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, stack));
      }
    }
    if (play) {
      this.worldObj.playAuxSFX(2001, x, y, z, id + (data << 12));
    }
    if (!hitEntity) {
      setDead();
    }
  }
  
  public void writeEntityToNBT(NBTTagCompound tagcompound)
  {
    super.writeEntityToNBT(tagcompound);
    tagcompound.setShort("blockID", (short)getBlockID());
    tagcompound.setShort("blockData", (short)getBlockData());
  }
  
  public void readEntityFromNBT(NBTTagCompound tagcompound)
  {
    super.readEntityFromNBT(tagcompound);
    setBlockID(tagcompound.getShort("blockID"));
    setBlockData(tagcompound.getShort("blockData"));
  }
  
  private void sendPositionPacket()
  {
    if (!PixelGalaxyMod.isEffectiveClient()) {
      return;
    }
    PixelGalaxyMod.wrapper.sendToServer(new PacketEHandPos(this));
  }
  
}
