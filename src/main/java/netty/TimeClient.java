/**
 * 
 */
package netty;

import java.io.IOException;

import com.alibaba.fastjson.JSONObject;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import message.MessageId;


public class TimeClient {
	static Channel fffff;
    public static void main(String[] args) throws Exception {
//        String host = args[0];
//        int port = Integer.parseInt(args[1]);
    	String host = "127.0.0.1";
        int port = 18080;
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        
        try {
            Bootstrap b = new Bootstrap(); // (1)
            b.group(workerGroup); // (2)
            b.channel(NioSocketChannel.class); // (3)
            b.option(ChannelOption.SO_KEEPALIVE, true); // (4)
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new TimeClientHandler());
                }
            });
            
            // Start the client.
            ChannelFuture f = b.connect(host, port).sync(); // (5)
            fffff  =f.channel();
            star();
            
            // Wait until the connection is closed.
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
    
    
    public static void star() throws IOException {
        String str="Hello Netty";
//        ch.writeAndFlush(str+ "\r\n");
        System.out.println("客户端发送数据:"+str);
        sends();
    }


    private static void sends() throws IOException {
        String s = "";
        JSONObject json = new JSONObject();
        json.put("msgid", MessageId.LOGIN_REQUEST );
        json.put("msg", "日日日日日日");
        json.put("numc", 1);

        s = json.toString();
//		ToString.println(s);
        int total = 4 + 4 + s.getBytes().length;
        ByteBuf byteBuf = Unpooled.buffer(total);
        byteBuf.writeInt(total);
        byteBuf.writeInt(s.getBytes().length);
        byteBuf.writeBytes(s.getBytes());
//		ToString.println(8,new String(byteBuf.array()),8);
//        fffff.writeAndFlush(byteBuf.array());
        fffff.write(byteBuf.array());
//        out.write(byteBuf.array());
    }
}