package com.ramilego.pixelgalaxy.entity;

import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.*;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

@SuppressWarnings("unchecked")
public class PixelPig {

	public static int mobid = 0;
	public Object instance;

    public void load(){}

    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}

	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(PixelPig.EntitypixelPig.class, new RenderLiving(new ModelPig(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(Constants.TEXTURE_PREFIX + "textures/mobs/EntityPixelPig.png");}});
	}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
	}

   public static class EntitypixelPig extends EntityCreature 
	{
		World world = null;
	    public EntitypixelPig(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 5;
	        this.isImmuneToFire = false;
	        this.setSize(0.9F, 0.9F);
	        this.getNavigator().setAvoidsWater(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, PixelGalaxyItems.pixelCarrot, false));
	        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	    }
	    
	    protected void applyEntityAttributes()
	    {
	    	super.applyEntityAttributes();
	    	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }


	    @Override
    	public boolean isAIEnabled()
		{
			   return true;
    	}

	    /**
	     * Drop 0-2 items of this living's type
	     */
	    @Override
	    protected Item getDropItem()
	    {
	        return this.isBurning() ? PixelGalaxyItems.pixelCookedPorkchop : PixelGalaxyItems.pixelRewPorkchop;
	    }

	    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
	        int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

	        for (int k = 0; k < j; ++k)
	        {
	            if (this.isBurning())
	            {
	                this.dropItem(PixelGalaxyItems.pixelCookedPorkchop, 1);
	            }
	            else
	            {
	                this.dropItem(PixelGalaxyItems.pixelRewPorkchop, 1);
	            }
	        }
	    }
	    
	    //Flowing
	    public boolean isBreedingItem(ItemStack p_70877_1_)
	    {
	        return p_70877_1_ != null && p_70877_1_.getItem() == PixelGalaxyItems.pixelCarrot;
	    }
	    
	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    @Override
	    protected String getLivingSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    @Override
	    protected String getHurtSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    @Override
	    protected String getDeathSound()
	    {
	        return "mob.pig.death";
	    }

	    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
	    {
	        this.playSound("mob.pig.step", 0.15F, 1.0F);
	    }
	    
	    @Override
	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

	    @Override
		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			Entity entity = this;
			
		}

	    @Override
		public boolean interact(EntityPlayer entity){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
			return true;
		}

		public String getEntityName(){
			return "pixelPig";
		}

	}

}
