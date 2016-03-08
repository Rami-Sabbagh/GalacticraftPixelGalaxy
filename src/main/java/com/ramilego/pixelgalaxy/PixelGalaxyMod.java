package com.ramilego.pixelgalaxy;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.dimension.TeleportTypeGreenPixel;
import com.ramilego.pixelgalaxy.dimension.WorldProviderGreenPixel;
import com.ramilego.pixelgalaxy.entity.MutantEnderman;
import com.ramilego.pixelgalaxy.entity.PixelCow;
import com.ramilego.pixelgalaxy.entity.PixelHuman;
import com.ramilego.pixelgalaxy.entity.PixelHuman.EntityhumanPixel;
import com.ramilego.pixelgalaxy.entity.PixelOneSwingman;
import com.ramilego.pixelgalaxy.entity.PixelPig;
import com.ramilego.pixelgalaxy.entity.objs.EnderBlock;
import com.ramilego.pixelgalaxy.entity.objs.EntitySeedShot;
import com.ramilego.pixelgalaxy.event.GreenPixelEvents;
import com.ramilego.pixelgalaxy.items.PixelFuelHader;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;
import com.ramilego.pixelgalaxy.proxy.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.*;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:GalacticraftCore;")
public class PixelGalaxyMod {
	
	@SidedProxy(clientSide = "com.ramilego.pixelgalaxy.proxy.ClientProxy", serverSide = "com.ramilego.pixelgalaxy.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Constants.modID)
	public static PixelGalaxyMod instance;
	
	public PixelHuman PixelHumanins = new PixelHuman();
	public PixelOneSwingman PixelOneSwingmanins = new PixelOneSwingman();
	public PixelCow PixelCowins = new PixelCow();
	public PixelPig PixelPigins = new PixelPig();
	
	public static SolarSystem lostPixel;
	public static Planet greenPixel;
	
	public static int mobid = 0;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new GreenPixelEvents());
		
		int seedentityID = 0;
		EntityRegistry.registerModEntity(EntitySeedShot.class, "EntitySeedShot", ++seedentityID, instance, 80, 10, true);
		
		PixelGalaxyBlocks.registerBlocks();
		PixelGalaxyItems.registerItems();
		PixelCreativeTab.registerTabs();
		
		PixelRecipes.registerCraftingRecipes();
		PixelRecipes.registerSmeltingRecipes();
		
		GameRegistry.registerFuelHandler(new PixelFuelHader());
		
		proxy.registerRenderers(this);
		
		PixelOneSwingmanins.instance = this.instance;
		PixelHumanins.instance = this.instance;
		PixelCowins.instance = this.instance;
		PixelPigins.instance = this.instance;

		PixelOneSwingmanins.preInit(event);
		PixelHumanins.preInit(event);
		PixelCowins.preInit(event);
		PixelPigins.preInit(event);
		
		EntityRegistry.registerModEntity(EnderBlock.class, "EnderBlock", 11, this, 64, 100, true);
		
		int PixelOneSwing = EntityRegistry.findGlobalUniqueEntityId();
		mobid = PixelOneSwing;
		EntityRegistry.registerGlobalEntityID(PixelOneSwingman.EntityPixelOneSwingman.class, "PixelOneSwingman", PixelOneSwing);
		EntityRegistry.registerModEntity(PixelOneSwingman.EntityPixelOneSwingman.class, "PixelOneSwingman", PixelOneSwing, instance, 64, 1, true);			
		
		int PixelHuman = EntityRegistry.findGlobalUniqueEntityId();
		mobid = PixelHuman;
		EntityRegistry.registerGlobalEntityID(PixelHuman.EntityhumanPixel.class, "humanPixel", PixelHuman);
		EntityRegistry.registerModEntity(PixelHuman.EntityhumanPixel.class, "humanPixel", PixelHuman, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(PixelHuman), new EntityList.EntityEggInfo(PixelHuman, (0 << 16) + (51 << 8) + 255, (0 << 16) + (255 << 8) + 255));
	
		int PixelCow = EntityRegistry.findGlobalUniqueEntityId();
		mobid = PixelCow;
		EntityRegistry.registerGlobalEntityID(PixelCow.EntitypixelCow.class, "pixelCow", PixelCow);
		EntityRegistry.registerModEntity(PixelCow.EntitypixelCow.class, "pixelCow", PixelCow, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(PixelCow), new EntityList.EntityEggInfo(PixelCow, (102 << 16) + (51 << 8) + 0, (153 << 16) + (153 << 8) + 153));
	
		int PixelPig = EntityRegistry.findGlobalUniqueEntityId();
		mobid = PixelPig;
		EntityRegistry.registerGlobalEntityID(PixelPig.EntitypixelPig.class, "pixelPig", PixelPig);
		EntityRegistry.registerModEntity(PixelPig.EntitypixelPig.class, "pixelPig", PixelPig, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(PixelPig), new EntityList.EntityEggInfo(PixelPig, (255 << 16) + (204 << 8) + 204, (255 << 16) + (102 << 8) + 102));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
			
		PixelGalaxyMod.lostPixel = new SolarSystem("lostpixel","milkyWay").setMapPosition(new Vector3(0.25F,0.25F));
		Star pixelSun = (Star) new Star("pixel").setParentSolarSystem(PixelGalaxyMod.lostPixel).setTierRequired(-1);
		pixelSun.setBodyIcon(new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/celestialbodies/pixelsun.png"));
        PixelGalaxyMod.lostPixel.setMainStar(pixelSun);
        
        PixelGalaxyMod.greenPixel = new Planet("greenpixel").setParentSolarSystem(PixelGalaxyMod.lostPixel);//GalacticraftCore.solarSystemSol
        PixelGalaxyMod.greenPixel.setTierRequired(3).setRingColorRGB(0.1F, 0.9F, 0.6F).setPhaseShift(0.0F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
        PixelGalaxyMod.greenPixel.setBodyIcon(new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/celestialbodies/greenPixel.png"));
        PixelGalaxyMod.greenPixel.atmosphereComponent(IAtmosphericGas.NITROGEN).atmosphereComponent(IAtmosphericGas.OXYGEN).atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.WATER);
        PixelGalaxyMod.greenPixel.setDimensionInfo(10, WorldProviderGreenPixel.class);
        
        wrapper = NetworkRegistry.INSTANCE.newSimpleChannel("PixelGalaxyMod");
        
        wrapper.registerMessage(PacketEHandPos.Handler.class, PacketEHandPos.class, 9, Side.SERVER);
        
        GalaxyRegistry.registerSolarSystem(lostPixel);
        GalaxyRegistry.registerPlanet(greenPixel);
        GalacticraftRegistry.registerTeleportType(WorldProviderGreenPixel.class, new TeleportTypeGreenPixel());
        GalacticraftRegistry.registerRocketGui(WorldProviderGreenPixel.class, new ResourceLocation(Constants.ASSET_PREFIX, "textures/gui/greenRocketGui.png"));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		this.proxy.postInit(event);
	}

/*----------------------------------------------------------------------------------------------------------------------*/
//Entity Zone
		
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		PixelHumanins.load();
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event){
		PixelHumanins.serverLoad(event);
	}
	
/**********************************************************************************************************************/
//pixeltrix zone
	public static void sendPacketToAll(EntityPlayer player, Packet packet)
	  {
	    if (isEffectiveClient()) {
	      return;
	    }
	    ((EntityPlayerMP)player).mcServer.getConfigurationManager().sendPacketToAllPlayers(packet);
	  }
	
	public static boolean isEffectiveClient()
	  {
	    return FMLCommonHandler.instance().getEffectiveSide().isClient();
	  }
	
	  public static SimpleNetworkWrapper wrapper;
	  public static final String[] fThrower = { "field_70192_c", "g", "thrower" };
	  
	  public static Vec3 getDirVector(float rotation, float scale)
	  {
	    float rad = rotation * 0.017453292F;
	    return Vec3.createVectorHelper(-MathHelper.sin(rad) * scale, 0.0D, MathHelper.cos(rad) * scale);
	  }
	  
	  public static boolean teleportTo(EntityLivingBase living, double x, double y, double z)
	  {
	    return teleportTo(living, x, y, z, true);
	  }
	  
	  public static boolean teleportTo(EntityLivingBase living, double x, double y, double z, boolean changeY)
	  {
	    double oldX = living.posX;double oldY = living.posY;double oldZ = living.posZ;
	    int teleX = MathHelper.floor_double(x);
	    int teleY = MathHelper.floor_double(y);
	    int teleZ = MathHelper.floor_double(z);
	    boolean success = false;
	    if (living.worldObj.blockExists(teleX, teleY, teleZ))
	    {
	      boolean temp = false;
	      while ((!temp) && (teleY > 0))
	      {
	        Block block = living.worldObj.getBlock(teleX, teleY - 1, teleZ);
	        if ((block != Blocks.air) && (block.getMaterial().blocksMovement())) {
	          temp = true;
	        } else if (changeY) {
	          teleY--;
	        }
	      }
	      if ((temp) || (!changeY))
	      {
	        living.setPosition(x, teleY, z);
	        if ((living.worldObj.getCollidingBoundingBoxes(living, living.boundingBox).isEmpty()) && (!living.worldObj.isAnyLiquid(living.boundingBox))) {
	          success = true;
	        }
	      }
	    }
	    if (!success)
	    {
	      living.setPosition(oldX, oldY, oldZ);
	      return false;
	    }
	    return true;
	  }

	public static void teleportTo(MutantEnderman living, double x, double y, double z) {

		
	}
	
	
}
