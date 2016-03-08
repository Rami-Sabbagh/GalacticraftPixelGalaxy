package com.ramilego.pixelgalaxy.packet;

import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.entity.MutantEnderman;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.world.World;

public class PacketEnderBlock
  implements IMessage
{
  private int entityId;
  private short blockId;
  private byte blockIndex;
  private byte blockData;
  
  public PacketEnderBlock() {}
  
  public PacketEnderBlock(MutantEnderman enderman, int bId, int index, int data)
  {
    this.entityId = enderman.getEntityId();
    this.blockId = ((short)bId);
    this.blockIndex = ((byte)index);
    this.blockData = ((byte)data);
  }
  
  public void toBytes(ByteBuf buffer)
  {
    buffer.writeInt(this.entityId);
    buffer.writeShort(this.blockId);
    buffer.writeByte(this.blockIndex);
    buffer.writeByte(this.blockData);
  }
  
  public void fromBytes(ByteBuf buffer)
  {
    this.entityId = buffer.readInt();
    this.blockId = buffer.readShort();
    this.blockIndex = buffer.readByte();
    this.blockData = buffer.readByte();
  }
  
  public static class Handler
    implements IMessageHandler<PacketEnderBlock, IMessage>
  {
    public IMessage onMessage(PacketEnderBlock packet, MessageContext ctx)
    {
      World world = PixelGalaxyMod.proxy.getWorldClient();
      MutantEnderman enderman = (MutantEnderman)world.getEntityByID(packet.entityId);
      if ((enderman != null) && (packet.blockIndex > 0) && (packet.blockId != -1) && (packet.blockData != -1))
      {
        enderman.heldBlock[packet.blockIndex] = packet.blockId;
        enderman.heldBlockData[packet.blockIndex] = packet.blockData;
        enderman.heldBlockTick[packet.blockIndex] = 0;
      }
      return null;
    }
  }
}
