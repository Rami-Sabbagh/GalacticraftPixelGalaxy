package com.ramilego.pixelgalaxy.entity;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.entity.render.effect.FXEnder;
import com.ramilego.pixelgalaxy.packet.PacketEnderBlock;
import com.ramilego.pixelgalaxy.packet.PacketEnderTeleport;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;

public class MutantEnderman
  extends EntityMob
{
  public int currentAttackID;
  public int animTick;
  public int hasTargetTick;
  public int preTargetTick;
  public int hasTarget;
  public int teleX;
  public int teleY;
  public int teleZ;
  public int screamDelayTick;
  public int deathTick;
  public int[] heldBlock;
  public int[] heldBlockData;
  public int[] heldBlockTick;
  public boolean triggerThrowBlock;
  protected int blockFrenzy;
  protected IAttributeInstance moveSpeed;
  protected List screamEntities;
  protected List deathEntities;
  private int dirty;
  private long preTargetA;
  private long preTargetB;
  
  public MutantEnderman(World world)
  {
    super(world);
    this.experienceValue = 35;
    this.hasTargetTick = (this.preTargetTick = 0);
    this.hasTarget = 0;
    this.currentAttackID = 0;
    this.animTick = 0;
    this.blockFrenzy = 0;
    this.screamDelayTick = 0;
    this.deathTick = 0;
    this.dirty = -1;
    this.preTargetA = 0L;
    this.preTargetB = 0L;
    this.stepHeight = 1.4F;
    this.ignoreFrustumCheck = true;
    this.triggerThrowBlock = false;
    this.heldBlock = new int[5];
    this.heldBlockData = new int[5];
    this.heldBlockTick = new int[5];
    this.screamEntities = null;
    this.deathEntities = null;
    
    setSize(1.2F, 4.8F);
  }
  
  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(96.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
    this.moveSpeed = getEntityAttribute(SharedMonsterAttributes.movementSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
  }
  
  protected void entityInit()
  {
    super.entityInit();
    this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(17, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
  }
  
  public void setMeleeArm(int id)
  {
    this.dataWatcher.updateObject(17, Byte.valueOf((byte)id));
  }
  
  public void setThrownBlock(int index)
  {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)index));
  }
  
  public boolean getHasTarget()
  {
    return this.dataWatcher.getWatchableObjectByte(16) == 1;
  }
  
  public int getMeleeArm()
  {
    return this.dataWatcher.getWatchableObjectByte(17);
  }
  
  public int getThrownBlock()
  {
    return this.dataWatcher.getWatchableObjectByte(18);
  }
  
  protected boolean isAIEnabled()
  {
    return true;
  }
  
  public float getEyeHeight()
  {
    return this.height;
  }
  
  public int getMaxSpawnedInChunk()
  {
    return 1;
  }
  
  public void setAttackTarget(EntityLivingBase living)
  {
    super.setAttackTarget(living);
    this.dataWatcher.updateObject(16, Byte.valueOf((byte)(living == null ? 0 : 1)));
  }
  
  protected void updateTargetTick()
  {
    this.preTargetTick = this.hasTargetTick;
    if (getHasTarget()) {
      this.hasTarget = 20;
    }
    boolean emptyHanded = true;
    for (int i = 1; i < this.heldBlock.length; i++)
    {
      if (this.heldBlock[i] > 0) {
        emptyHanded = false;
      }
      if (this.hasTarget > 0)
      {
        if (this.heldBlock[i] > 0) {
          this.heldBlockTick[i] = Math.min(10, this.heldBlockTick[i] + 1);
        }
      }
      else {
        this.heldBlockTick[i] = Math.max(0, this.heldBlockTick[i] - 1);
      }
    }
    if (this.hasTarget > 0) {
      this.hasTargetTick = Math.min(10, this.hasTargetTick + 1);
    } else if (emptyHanded) {
      this.hasTargetTick = Math.max(0, this.hasTargetTick - 1);
    } else if (!this.worldObj.isRemote) {
      for (int i = 1; i < this.heldBlock.length; i++) {
        if ((this.heldBlock[i] != 0) && (this.heldBlockTick[i] == 0))
        {
          int x = MathHelper.floor_double(this.posX - 1.5D + this.rand.nextDouble() * 4.0D);
          int y = MathHelper.floor_double(this.posY - 0.5D + this.rand.nextDouble() * 2.5D);
          int z = MathHelper.floor_double(this.posZ - 1.5D + this.rand.nextDouble() * 4.0D);
          Block block = this.worldObj.getBlock(x, y, z);
          Block block1 = this.worldObj.getBlock(x, y - 1, z);
          if ((block == Blocks.air) && (block1 != Blocks.air) && (block1.renderAsNormalBlock()))
          {
            this.worldObj.setBlock(x, y, z, Block.getBlockById(this.heldBlock[i]), this.heldBlockData[i], 3);
            sendHoldBlock(i, 0, 0);
          }
          else if (this.rand.nextInt(50) == 0)
          {
            sendHoldBlock(i, 0, 0);
          }
        }
      }
    }
    this.hasTarget = Math.max(0, this.hasTarget - 1);
  }
  
  protected void updateScreamEntities()
  {
    this.screamDelayTick = Math.max(0, this.screamDelayTick - 1);
    if ((this.currentAttackID != 5) || (this.animTick < 40) || (this.animTick > 160)) {
      return;
    }
    if (this.animTick == 160)
    {
      this.screamEntities = null;
      return;
    }
    if (this.screamEntities == null)
    {
      this.screamEntities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(20.0D, 12.0D, 20.0D));
      List list = new ArrayList();
      list.addAll(this.screamEntities);
      this.screamEntities = list;
    }
    for (int i = 0; i < this.screamEntities.size(); i++)
    {
      Entity entity = (Entity)this.screamEntities.get(i);
      if (getDistanceSqToEntity(entity) > 400.0D)
      {
        this.screamEntities.remove(i);
        i--;
      }
      else
      {
        entity.rotationPitch += (this.rand.nextFloat() - 0.3F) * 6.0F;
      }
    }
  }
  
  public void onUpdate()
  {
    this.isJumping = false;
    super.onUpdate();
    if ((getAttackTarget() != null) && (!getAttackTarget().isEntityAlive())) {
      setAttackTarget(null);
    }
    if (this.currentAttackID != 0) {
      this.animTick += 1;
    }
    updateTargetTick();
    updateScreamEntities();
  }
  
  public void onLivingUpdate()
  {
    super.onLivingUpdate();
    double h = this.currentAttackID != 10 ? this.height : this.height + 1.0F;
    double w = this.currentAttackID != 10 ? this.width : this.width * 1.5F;
    boolean targetBlind = (getAttackTarget() != null) && (getAttackTarget().getActivePotionEffect(Potion.blindness) != null);
    if (!targetBlind) {
      for (int i = 0; i < 3; i++)
      {
        double x = this.posX + (this.rand.nextDouble() - 0.5D) * w;
        double y = this.posY + this.rand.nextDouble() * h - 0.25D;
        double z = this.posZ + (this.rand.nextDouble() - 0.5D) * w;
        this.worldObj.spawnParticle("portal", x, y, z, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D);
      }
    }
  }
  
  private void updateDirtyHands()
  {
    if (this.dirty >= 0) {
      this.dirty += 1;
    }
    if (this.dirty >= 8)
    {
      this.dirty = -1;
      for (int i = 1; i < this.heldBlock.length; i++) {
        if (this.heldBlock[i] > 0) {
          sendHoldBlock(i, this.heldBlock[i], this.heldBlockData[i]);
        }
      }
      if ((this.preTargetA != 0L) && (this.preTargetB != 0L))
      {
        List list = this.worldObj.loadedEntityList;
        for (int i = 0; i < list.size(); i++)
        {
          Entity entity = (Entity)list.get(i);
          if ((entity instanceof EntityLivingBase))
          {
            EntityLivingBase living = (EntityLivingBase)entity;
            if ((living.getPersistentID() != null) && 
              (living.getPersistentID().getLeastSignificantBits() == this.preTargetA) && 
              (living.getPersistentID().getMostSignificantBits() == this.preTargetB))
            {
              setRevengeTarget(living);
              break;
            }
          }
        }
        this.preTargetA = 0L;
        this.preTargetB = 0L;
      }
    }
  }
  
  protected void updateBlockFrenzy()
  {
    this.blockFrenzy = Math.max(0, this.blockFrenzy - 1);
    if ((getAttackTarget() != null) && (this.currentAttackID == 0))
    {
      if ((this.blockFrenzy == 0) && (this.rand.nextInt(600) == 0)) {
        this.blockFrenzy = (200 + this.rand.nextInt(80));
      }
      if ((this.blockFrenzy > 0) && (this.rand.nextInt(8) == 0))
      {
        int x = MathHelper.floor_double(this.posX - 2.5D + this.rand.nextDouble() * 5.0D);
        int y = MathHelper.floor_double(this.posY - 0.5D + this.rand.nextDouble() * 3.0D);
        int z = MathHelper.floor_double(this.posZ - 2.5D + this.rand.nextDouble() * 5.0D);
        int id = Block.getIdFromBlock(this.worldObj.getBlock(x, y, z));
        int index = getFavorableHand();
        if ((index != -1) && (carriableBlocks.contains(Integer.valueOf(id))))
        {
          sendHoldBlock(index, id, this.worldObj.getBlockMetadata(x, y, z));
          if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")) {
            this.worldObj.setBlock(x, y, z, Blocks.air, 0, 3);
          }
        }
      }
    }
  }
  
  protected void updateTeleport()
  {
    Entity entity = getAttackTarget();
    teleportByChance(entity == null ? 1600 : 800, entity);
    if (entity != null)
    {
      double d = getDistanceSqToEntity(entity);
      if (d > 1024.0D) {
        teleportByChance(10, entity);
      }
    }
  }
  
  
  public int getAvailableHand()
  {
    ArrayList<Integer> list = new ArrayList();
    for (int i = 1; i < this.heldBlock.length; i++) {
      if (this.heldBlock[i] == 0) {
        list.add(Integer.valueOf(i));
      }
    }
    if (list.isEmpty()) {
      return -1;
    }
    return ((Integer)list.get(this.rand.nextInt(list.size()))).intValue();
  }
  
  public int getFavorableHand()
  {
    ArrayList<Integer> outer = new ArrayList();
    ArrayList<Integer> inner = new ArrayList();
    for (int i = 1; i < this.heldBlock.length; i++) {
      if (this.heldBlock[i] == 0) {
        if (i <= 2) {
          outer.add(Integer.valueOf(i));
        } else {
          inner.add(Integer.valueOf(i));
        }
      }
    }
    if ((outer.isEmpty()) && (inner.isEmpty())) {
      return -1;
    }
    if (!outer.isEmpty()) {
      return ((Integer)outer.get(this.rand.nextInt(outer.size()))).intValue();
    }
    return ((Integer)inner.get(this.rand.nextInt(inner.size()))).intValue();
  }
  
  public boolean attackEntityAsMob(Entity entity)
  {
    if ((!this.worldObj.isRemote) && (this.currentAttackID == 0))
    {
      int i = getAvailableHand();
      if (!teleportByChance(6, entity)) {
        if (i != -1)
        {
          boolean allHandsFree = (this.heldBlock[1] == 0) && (this.heldBlock[2] == 0);
          if ((allHandsFree) && (this.rand.nextInt(10) == 0))
          {
            sendAttackPacket(6);
          }
          else if ((allHandsFree) && (this.rand.nextInt(7) == 0))
          {
            sendAttackPacket(7);
          }
          else
          {
            setMeleeArm(i);
            sendAttackPacket(1);
          }
        }
        else
        {
          this.triggerThrowBlock = true;
        }
      }
    }
    if (this.currentAttackID == 6)
    {
      boolean flag = super.attackEntityAsMob(entity);
      if ((!this.worldObj.isRemote) && (this.rand.nextInt(2) == 0))
      {
        double x = entity.posX + (this.rand.nextFloat() - 0.5F) * 24.0F;
        double z = entity.posZ + (this.rand.nextFloat() - 0.5F) * 24.0F;
        double y = entity.posY + this.rand.nextInt(5) + 4.0D;
        PixelGalaxyMod.teleportTo(this, x, y, z);
      }
      if (flag) {
        heal(2.0F);
      }
      return flag;
    }
    return true;
  }
  
  
  
  private void sendAttackPacket(int i) {
	
}

public boolean teleportByChance(int chance, Entity entity)
  {
    if (this.currentAttackID != 0) {
      return false;
    }
    chance = Math.max(1, chance);
    if (this.rand.nextInt(chance) == 0)
    {
      if (entity == null) {
        return teleportRandomly();
      }
      return teleportToEntity(entity);
    }
    return false;
  }
  
  public boolean teleportRandomly()
  {
    if (this.currentAttackID != 0) {
      return false;
    }
    double radius = 24.0D;
    double x = this.posX + (this.rand.nextDouble() - 0.5D) * 2.0D * radius;
    double y = this.posY + this.rand.nextInt((int)radius * 2) - radius;
    double z = this.posZ + (this.rand.nextDouble() - 0.5D) * 2.0D * radius;
    return sendTeleportPacket(x, y, z);
  }
  
  public boolean teleportToEntity(Entity entity)
  {
    if (this.currentAttackID != 0) {
      return false;
    }
    double d = getDistanceSqToEntity(entity);
    double x = 0.0D;double y = 0.0D;double z = 0.0D;
    double radius = 16.0D;
    if (d < 100.0D)
    {
      x = entity.posX + (this.rand.nextDouble() - 0.5D) * 2.0D * radius;
      y = entity.posY + this.rand.nextDouble() * radius;
      z = entity.posZ + (this.rand.nextDouble() - 0.5D) * 2.0D * radius;
    }
    else
    {
      Vec3 vec = Vec3.createVectorHelper(this.posX - entity.posX, this.boundingBox.minY + this.height / 2.0D - entity.posY + entity.getEyeHeight(), this.posZ - entity.posZ);
      vec = vec.normalize();
      x = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec.xCoord * radius;
      y = this.posY + this.rand.nextInt(8) - vec.yCoord * radius;
      z = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec.zCoord * radius;
    }
    return sendTeleportPacket(x, y, z);
  }
  
  public void knockBack(Entity entity, float dmg, double d, double d1) {}
  
  public int maxDeathTick()
  {
    return 280;
  }
  
  public void readEntityFromNBT(NBTTagCompound tagcompound)
  {
    super.readEntityFromNBT(tagcompound);
    for (int i = 1; i < this.heldBlock.length; i++)
    {
      this.heldBlock[i] = tagcompound.getInteger("heldBlockID_" + i);
      this.heldBlockData[i] = tagcompound.getInteger("heldBlockData_" + i);
      this.dirty = 0;
    }
    if ((tagcompound.hasKey("targetA")) && (tagcompound.hasKey("targetB")))
    {
      this.preTargetA = tagcompound.getLong("targetA");
      this.preTargetB = tagcompound.getLong("targetB");
    }
  }
  
  protected float getSoundVolume()
  {
    return 1.0F;
  }
  
  public String getLivingSound()
  {
    return "MutantCreatures:mutantenderman.living";
  }
  
  public String getHurtSound()
  {
    return "MutantCreatures:mutantenderman.hit";
  }
  
  public String getDeathSound()
  {
    return null;
  }
  
  public int getTalkInterval()
  {
    return 200;
  }
  

  
  public void sendHoldBlock(int blockIndex, int blockId, int blockData)
  {
    if (PixelGalaxyMod.isEffectiveClient()) {
      return;
    }
    this.heldBlock[blockIndex] = blockId;
    this.heldBlockData[blockIndex] = blockData;
    this.heldBlockTick[blockIndex] = 0;
    PixelGalaxyMod.wrapper.sendToAll(new PacketEnderBlock(this, blockId, blockIndex, blockData));
  }
  
  public boolean sendTeleportPacket(double targetX, double targetY, double targetZ)
  {
    if ((PixelGalaxyMod.isEffectiveClient()) || (this.currentAttackID != 0)) {
      return false;
    }
    this.currentAttackID = 4;
    double oldX = this.posX;double oldY = this.posY;double oldZ = this.posZ;
    this.teleX = MathHelper.floor_double(targetX);
    this.teleY = MathHelper.floor_double(targetY);
    this.teleZ = MathHelper.floor_double(targetZ);
    this.posX = (this.teleX + 0.5D);
    this.posY = this.teleY;
    this.posZ = (this.teleZ + 0.5D);
    boolean success = false;
    if (this.worldObj.blockExists(this.teleX, this.teleY, this.teleZ))
    {
      boolean temp = false;
      while ((!temp) && (this.teleY > 0))
      {
        Block block = this.worldObj.getBlock(this.teleX, this.teleY - 1, this.teleZ);
        if ((block != Blocks.air) && (block.getMaterial().blocksMovement()))
        {
          temp = true;
        }
        else
        {
          this.posY -= 1.0D;
          this.teleY -= 1;
        }
      }
      if (temp)
      {
        setPosition(this.posX, this.posY, this.posZ);
        if ((this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty()) && (!this.worldObj.isAnyLiquid(this.boundingBox))) {
          success = true;
        }
      }
    }
    setPosition(oldX, oldY, oldZ);
    if (!success)
    {
      this.currentAttackID = 0;
      return false;
    }
    PixelGalaxyMod.wrapper.sendToAll(new PacketEnderTeleport(this, this.teleX, this.teleY, this.teleZ));
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void handleTeleport(int x, int y, int z)
  {
    this.currentAttackID = 4;
    this.animTick = 0;
    this.teleX = x;
    this.teleY = y;
    this.teleZ = z;
    spawnBigParticles();
  }
  
  @SideOnly(Side.CLIENT)
  public void spawnBigParticles()
  {
    spawnBigParticles(256, 1.8F);
  }
  
  @SideOnly(Side.CLIENT)
  public void spawnBigParticles(int temp, float speed)
  {
    EffectRenderer renderer = FMLClientHandler.instance().getClient().effectRenderer;
    if (this.currentAttackID == 4) {
      temp *= 2;
    }
    for (int i = 0; i < temp; i++)
    {
      float f = (this.rand.nextFloat() - 0.5F) * speed;
      float f1 = (this.rand.nextFloat() - 0.5F) * speed;
      float f2 = (this.rand.nextFloat() - 0.5F) * speed;
      boolean flag = i < temp / 2;
      if (this.currentAttackID != 4) {
        flag = true;
      }
      boolean death = this.currentAttackID != 10;
      double h = death ? this.height : this.height + 1.0F;
      double w = death ? this.width : this.width * 1.5F;
      double tempX = (flag ? this.posX : this.teleX) + (this.rand.nextDouble() - 0.5D) * w;
      double tempY = (flag ? this.posY : this.teleY) + (this.rand.nextDouble() - 0.5D) * h + (death ? 1.5F : 0.5F);
      double tempZ = (flag ? this.posZ : this.teleZ) + (this.rand.nextDouble() - 0.5D) * w;
      renderer.addEffect(new FXEnder(this.worldObj, tempX, tempY, tempZ, f, f1, f2, true));
    }
  }
  
  private static ArrayList<Integer> carriableBlocks = new ArrayList();
  
  static
  {
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.stone)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.grass)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.dirt)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.sand)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.gravel)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.yellow_flower)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.red_flower)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.brown_mushroom)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.red_mushroom)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.tnt)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.cactus)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.clay)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.pumpkin)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.melon_block)));
    carriableBlocks.add(Integer.valueOf(Block.getIdFromBlock(Blocks.mycelium)));
  }
}
