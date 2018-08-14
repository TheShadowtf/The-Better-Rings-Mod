package com.xSowl.betterrings.network.handler;

import com.xSowl.betterrings.network.base.XUPacketBase;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class PacketHandler extends SimpleChannelInboundHandler<XUPacketBase>
{
    protected void channelRead0(final ChannelHandlerContext ctx, final XUPacketBase msg) throws Exception {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
            msg.doStuffServer(ctx);
        }
    }
}


