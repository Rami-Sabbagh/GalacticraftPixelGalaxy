package com.ramilego.pixelgalaxy.packet;

import com.ramilego.pixelgalaxy.PixelGalaxyMod;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.world.World;

public class PacketEnderTeleport
  implements IMessage
{
  private int entityId;
  private int teleX;
  private int teleY;
  private int teleZ;
  
  public PacketEnderTeleport() {}
  
  public PacketEnderTeleport(com.ramilego.pixelgalaxy.entity.MutantEnderman enderman, int x, int y, int z)
  {
    this.entityId = enderman.getEntityId();
    this.teleX = x;
    this.teleY = y;
    this.teleZ = z;
  }
  
  public void toBytes(ByteBuf buffer)
  {
    buffer.writeInt(this.entityId);
    buffer.writeInt(this.teleX);
    buffer.writeInt(this.teleY);
    buffer.writeInt(this.teleZ);
  }
  
  public void fromBytes(ByteBuf buffer)
  {
    this.entityId = buffer.readInt();
    this.teleX = buffer.readInt();
    this.teleY = buffer.readInt();
    this.teleZ = buffer.readInt();
  }
  
  public static class Handler
    implements IMessageHandler<PacketEnderTeleport, IMessage>
  {
    public IMessage onMessage(PacketEnderTeleport packet, MessageContext ctx)
    {
      World world = PixelGalaxyMod.proxy.getWorldClient();
      com.ramilego.pixelgalaxy.entity.MutantEnderman enderman = (com.ramilego.pixelgalaxy.entity.MutantEnderman)world.getEntityByID(packet.entityId);
      if (enderman != null) {
        enderman.handleTeleport(packet.teleX, packet.teleY, packet.teleZ);
      }
      return null;
    }
  }
}
