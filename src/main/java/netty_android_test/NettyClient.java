package netty_android_test;

import java.io.IOException;

import com.alibaba.fastjson.JSONObject;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * 
* Title: NettyClient
* Description: Netty客户端 
* Version:1.0.0  
* @author Administrator
* @date 2017-8-31
 */
public class NettyClient {

    public static String host = "127.0.0.1";  //ip地址
    public static int port = 6789;          //端口
    /// 通过nio方式来接收连接和处理连接   
    private static EventLoopGroup group = new NioEventLoopGroup(); 
    private static  Bootstrap b = new Bootstrap();
    private static Channel ch;

    /**
     * Netty创建全部都是实现自AbstractBootstrap。
     * 客户端的是Bootstrap，服务端的则是    ServerBootstrap。
     **/
    public static void main(String[] args) throws InterruptedException, IOException { 
            System.out.println("客户端成功启动...");
            b.group(group);
            b.channel(NioSocketChannel.class);
            b.handler(new NettyClientFilter());
            // 连接服务端
            ch = b.connect(host, port).sync().channel();
//            star();
            star2();
    }

   

	public static void star() throws IOException{
        String str="Hello Netty";
        ch.writeAndFlush(str+ "\r\n");
        System.out.println("客户端发送数据:"+str);
   }
    
	
	 private static void star2() {
		String s = "";
		JSONObject json = new JSONObject();
		json.put("msgid", MessageId.login );
		json.put("msg", "日日日日日日");
		json.put("numc", 1);
		
		s = json.toString();
//			ToString.println(s);
	    int total = 4 + 4 + s.getBytes().length;
	    ByteBuf byteBuf = Unpooled.buffer(total);
	    byteBuf.writeInt(total);
		byteBuf.writeInt(s.getBytes().length);
		byteBuf.writeBytes(s.getBytes());
//			ToString.println(8,new String(byteBuf.array()),8);
		 ch.writeAndFlush(new String(byteBuf.array()));
	}

}