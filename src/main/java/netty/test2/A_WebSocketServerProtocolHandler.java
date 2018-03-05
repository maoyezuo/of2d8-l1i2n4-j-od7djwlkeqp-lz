package netty.test2;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

public class A_WebSocketServerProtocolHandler extends WebSocketServerProtocolHandler{
	public A_WebSocketServerProtocolHandler(String websocketPath) {
		super(websocketPath);
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, WebSocketFrame frame, List<Object> out) throws Exception {
		super.decode(ctx, frame, out);
	}

}
