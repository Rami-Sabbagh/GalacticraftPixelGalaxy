package com.ramilego4game.mods.PixelGalaxy.Earth.client;

import com.ramilego4game.mods.PixelGalaxy.Galaxy.GalacticraftPixelGalaxy;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;

public class GCPixelEarthSlotRender implements ICelestialBodyRenderer{

	@Override
	public ResourceLocation getPlanetSprite() {
		return new ResourceLocation(GalacticraftPixelGalaxy.ASSET_DOMAIN, "textures/gui/planets/pixelearth.png");
	}

	@Override
	public String getPlanetName() {
		return "PixelEarth";
	}

	@Override
	public void renderSlot(int index, int x, int y, float slotHeight, Tessellator tessellator)
    {
		tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x - slotHeight / 2 * 1.3, y + slotHeight / 2 * 1.3, -90.0D, 0.35D, 0.65D);
        tessellator.addVertexWithUV(x + slotHeight / 2 * 1.3, y + slotHeight / 2 * 1.3, -90.0D, 0.65D, 0.65D);
        tessellator.addVertexWithUV(x + slotHeight / 2 * 1.3, y - slotHeight / 2 * 1.3, -90.0D, 0.65D, 0.35D);
        tessellator.addVertexWithUV(x - slotHeight / 2 * 1.3, y - slotHeight / 2 * 1.3, -90.0D, 0.35D, 0.35D);
        tessellator.draw();
    }

}
