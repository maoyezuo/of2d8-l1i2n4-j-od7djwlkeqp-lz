package netty.test2;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import netty.ToString;

public class WebSocketHandler extends SimpleChannelInboundHandler{

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
	    WebSocketFrame frame = (WebSocketFrame)msg;  
	    ByteBuf buf = frame.content();  //真正的数据是放在buf里面的  
	    String aa = buf.toString(Charset.forName("utf-8"));  //将数据按照utf-8的方式转化为字符串  
	    System.out.println(aa);  
	    WebSocketFrame out = new TextWebSocketFrame(aa);  //创建一个websocket帧，将其发送给客户端  
	    ctx.pipeline().writeAndFlush(out).addListener(new ChannelFutureListener(){  
	        @Override  
	        public void operationComplete(ChannelFuture future) throws Exception {  
	            ctx.pipeline().close();  //从pipeline上面关闭的时候，会关闭底层的chanel，而且会从eventloop上面取消注册  
	        }  
	    });  
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		ToString.println("");
		
	}

}
