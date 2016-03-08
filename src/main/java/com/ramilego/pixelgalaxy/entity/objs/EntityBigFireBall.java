package com.ramilego.pixelgalaxy.entity.objs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBigFireBall extends EntityFireball
{
    private static final String __OBFID = "CL_00001721";

    public EntityBigFireBall(World p_i1770_1_)
    {
        super(p_i1770_1_);
        this.setSize(0.2001F, 0.2001F);
    }

    public EntityBigFireBall(World p_i1771_1_, EntityLivingBase p_i1771_2_, double p_i1771_3_, double p_i1771_5_, double p_i1771_7_)
    {
        super(p_i1771_1_, p_i1771_2_, p_i1771_3_, p_i1771_5_, p_i1771_7_);
        this.setSize(0.2001F, 0.2001F);
    }

    public EntityBigFireBall(World p_i1772_1_, double p_i1772_2_, double p_i1772_4_, double p_i1772_6_, double p_i1772_8_, double p_i1772_10_, double p_i1772_12_)
    {
        super(p_i1772_1_, p_i1772_2_, p_i1772_4_, p_i1772_6_, p_i1772_8_, p_i1772_10_, p_i1772_12_);
        this.setSize(0.2001F, 0.2001F);
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70227_1_)
    {
        if (!this.worldObj.isRemote)
        {
            if (p_70227_1_.entityHit != null)
            {
                if (!p_70227_1_.entityHit.isImmuneToFire() && p_70227_1_.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 50.0F))
                {
                    p_70227_1_.entityHit.setFire(1);
                }
            }
            else
            {
                int i = p_70227_1_.blockX;
                int j = p_70227_1_.blockY;
                int k = p_70227_1_.blockZ;

                switch (p_70227_1_.sideHit)
                {
                    case 0:
                        --j;
                        break;
                    case 1:
                        ++j;
                        break;
                    case 2:
                        --k;
                        break;
                    case 3:
                        ++k;
                        break;
                    case 4:
                        --i;
                        break;
                    case 5:
                        ++i;
                }
                
				EntityLightningBolt lightning = new EntityLightningBolt(worldObj, i, j, k);

                if (this.worldObj.isAirBlock(i, j, k))
                {
                	worldObj.spawnEntityInWorld(lightning);
                }
            }

            this.setDead();
        }
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        return false;
    }
}