package com.ramilego.pixelgalaxy.entity.render.effect;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class FXEnder
  extends EntityFX
{
  private float fullScale;
  private boolean up;
  
  public FXEnder(World world, double x, double y, double z, double xx, double yy, double zz, boolean moveUp)
  {
    super(world, x, y, z, 0.0D, 0.0D, 0.0D);
    this.particleMaxAge = ((int)(Math.random() * 15.0D) + 10);
    this.motionX *= 0.10000000149011612D;
    this.motionY *= 0.10000000149011612D;
    this.motionZ *= 0.10000000149011612D;
    this.motionX += xx;
    this.motionY += yy;
    this.motionZ += zz;
    this.fullScale = (this.particleScale = this.rand.nextFloat() * 0.4F + 2.4F);
    this.particleRed = (this.particleGreen = this.particleBlue = this.rand.nextFloat() * 0.6F + 0.4F);
    this.particleGreen *= 0.3F;
    this.particleRed *= 0.9F;
    this.noClip = true;
    this.up = moveUp;
    setParticleTextureIndex((int)(Math.random() * 8.0D));
  }
  
  public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    float scale = 1.0F - (this.particleAge + par2) / this.particleMaxAge;
    scale *= scale;
    scale = 1.0F - scale;
    this.particleScale = (this.fullScale * scale);
    super.renderParticle(par1Tessellator, par2, par3, par4, par5, par6, par7);
  }
  
  public int getBrightnessForRender(float par1)
  {
    int i = super.getBrightnessForRender(par1);
    float f = this.particleAge / this.particleMaxAge;
    f = f * f * f * f;
    int i1 = i & 0xFF;
    int i2 = i >> 16 & 0xFF;
    i2 += (int)(f * 15.0F * 16.0F);
    if (i2 > 240) {
      i2 = 240;
    }
    return i1 | i2 << 16;
  }
  
  public float getBrightness(float par1)
  {
    float f = super.getBrightness(par1);
    float f1 = this.particleAge / this.particleMaxAge;
    f1 = f1 * f1 * f1 * f1;
    return f * (1.0F - f1) + f1;
  }
  
  public void onUpdate()
  {
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    if (this.particleAge++ >= this.particleMaxAge) {
      setDead();
    }
    if (this.up) {
      this.motionY += 0.002D;
    }
    moveEntity(this.motionX, this.motionY, this.motionZ);
    if (this.posY == this.prevPosY)
    {
      this.motionX *= 1.1D;
      this.motionZ *= 1.1D;
    }
    this.motionX *= 0.9D;
    this.motionY *= 0.9D;
    this.motionZ *= 0.9D;
  }
}
