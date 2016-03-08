package com.ramilego.pixelgalaxy;

import com.ramilego.pixelgalaxy.entity.objs.EnderBlock;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;


public class PacketEHandPos
  implements IMessage
{
  private int entityId;
  private int posX;
  private int posY;
  private int posZ;
  
  public PacketEHandPos() {}
  
  public PacketEHandPos(EnderBlock eblock)
  {
    this.entityId = eblock.getEntityId();
    this.posX = ((int)(eblock.posX * 10000.0D));
    this.posY = ((int)(eblock.posY * 10000.0D));
    this.posZ = ((int)(eblock.posZ * 10000.0D));
  }
  
  public void toBytes(ByteBuf buffer)
  {
    buffer.writeInt(this.entityId);
    buffer.writeInt(this.posX);
    buffer.writeInt(this.posY);
    buffer.writeInt(this.posZ);
  }
  
  public void fromBytes(ByteBuf buffer)
  {
    this.entityId = buffer.readInt();
    this.posX = buffer.readInt();
    this.posY = buffer.readInt();
    this.posZ = buffer.readInt();
  }
  
  public static class Handler
    implements IMessageHandler<PacketEHandPos, IMessage>
  {
    public IMessage onMessage(PacketEHandPos packet, MessageContext ctx)
    {
      double x = packet.posX / 10000.0D;double y = packet.posY / 10000.0D;double z = packet.posZ / 10000.0D;
      Entity entity = null;
      WorldServer[] worlds = FMLCommonHandler.instance().getMinecraftServerInstance().worldServers;
      for (int i = 0; i < worlds.length; i++)
      {
        entity = worlds[i].getEntityByID(packet.entityId);
        if (entity != null) {
          break;
        }
      }
      if (entity != null) {
        entity.setPosition(x, y, z);
      }
      return null;
    }
  }
}
