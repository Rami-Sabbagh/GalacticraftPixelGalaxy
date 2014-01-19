package com.ramilego4game.mods.PixelGalaxy.Sun.client;

import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

public class GCPixelSunSlotRender implements ICelestialBodyRenderer{

	@Override
	public ResourceLocation getPlanetSprite() {
		return new ResourceLocation(GalacticraftPixelGalaxy.ASSET_DOMAIN, "textures/gui/planets/pixelsun.png");
	}

	@Override
	public String getPlanetName() {
		return "PixelSun";
	}

	@Override
	public void renderSlot(int index, int x, int y, float slotHeight, Tessellator tessellator)
    {
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x - slotHeight * 0.9, y + slotHeight * 0.9, -90.0D, 0.0, 1.0);
        tessellator.addVertexWithUV(x + slotHeight * 0.9, y + slotHeight * 0.9, -90.0D, 1.0, 1.0);
        tessellator.addVertexWithUV(x + slotHeight * 0.9, y - slotHeight * 0.9, -90.0D, 1.0, 0.0);
        tessellator.addVertexWithUV(x - slotHeight * 0.9, y - slotHeight * 0.9, -90.0D, 0.0, 0.0);
        tessellator.draw();
    }
}
