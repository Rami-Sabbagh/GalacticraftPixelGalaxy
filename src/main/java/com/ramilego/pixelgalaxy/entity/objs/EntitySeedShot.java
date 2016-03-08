package com.ramilego.pixelgalaxy.entity.objs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class EntitySeedShot extends EntityThrowable
{

public EntitySeedShot(World par1World, double par2, double par4, double par6)
{
super(par1World, par2, par4, par6);
}
public EntitySeedShot(World par1World, EntityLivingBase par2EntityLivingBase)
{
super(par1World, par2EntityLivingBase);
}public EntitySeedShot(World par1World)
{
super(par1World);
}


	@Override
	protected void onImpact(MovingObjectPosition mop)
	{

		if(mop.typeOfHit == MovingObjectType.BLOCK)
		{
			this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 2.0F, true, true);
		}
		if (mop.entityHit != null)
        {
            this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 2.0F, true, true);         
        }
		if (!this.worldObj.isRemote)
		{
			this.setDead();
		}
	}
}