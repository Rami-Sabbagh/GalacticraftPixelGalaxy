package com.ramilego.pixelgalaxy.world.gen;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.BiomeGenBase;

public class GreenPixelBiomes extends BiomeGenBase {
	
	public static final BiomeGenBase greenFlat = new BiomeGenGreenPixel(137).setBiomeName("greenFlat");
	
	@SuppressWarnings("unchecked")
	GreenPixelBiomes(int var1)
    {
        super(var1);
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 10, 4, 4));
        this.rainfall = 0F;
    }

    @Override
    public GreenPixelBiomes setColor(int var1)
    {
        return (GreenPixelBiomes) super.setColor(var1);
    }

    @Override
    public float getSpawningChance()
    {
        return 0.01F;
    }
}
