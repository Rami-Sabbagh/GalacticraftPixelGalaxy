package com.ramilego.pixelgalaxy.entity.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import com.ramilego.pixelgalaxy.entity.objs.EnderBlock;

@SideOnly(Side.CLIENT)
public class RenderEnderBlock
  extends Render
{
  public RenderEnderBlock()
  {
    this.shadowSize = 0.5F;
  }
  
  public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
  {
    EnderBlock enderBlock = (EnderBlock)entity;
    int id = enderBlock.getBlockID();int data = enderBlock.getBlockData();
    Block block = Block.getBlockById(id);
    GL11.glEnable(32826);
    GL11.glPushMatrix();
    GL11.glTranslatef((float)d, (float)d1, (float)d2);
    float tick = enderBlock.ticksExisted + f1;
    GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef((enderBlock.ticksExisted + f1) * 20.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef((enderBlock.ticksExisted + f1) * 12.0F, 0.0F, 0.0F, -1.0F);
    float scale = 0.75F;
    GL11.glScalef(-scale, -scale, scale);
    bindEntityTexture(enderBlock);
    int var4 = enderBlock.getBrightnessForRender(f1);
    int var5 = var4 % 65536;
    int var6 = var4 / 65536;
    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, var5, var6);
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    this.field_147909_c.renderBlockAsItem(block, data, 1.0F);
    GL11.glDisable(3042);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glPopMatrix();
    GL11.glDisable(32826);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    return TextureMap.locationBlocksTexture;
  }
}
