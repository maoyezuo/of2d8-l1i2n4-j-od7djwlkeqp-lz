/**
 * 
 */
package netty.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

import ball.favorite.IFavorite;
import ball.match.IMatch;
import ball.transfer.ITransfer;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import message.MessageId;
import netty.ToString;
import user.info.User;
import user.login.Login;


/**
 * @author wangyu
 *
 */
public class MyBusinessLogicHandler extends SimpleChannelInboundHandler<String>  {
	private final static Logger logger = LoggerFactory.getLogger(MyBusinessLogicHandler.class);
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg)throws Exception {
//		if(0 == a%30){
//			ToString.println(msg, ctx.channel().remoteAddress(),ctx.pipeline().channel().hashCode());
//		}
		JSONObject jsonRequest = JSONObject.parseObject(msg);
		ToString.println(msg);
//		String msgid = json.getString("msgid");
		int messageId = jsonRequest.getIntValue("msgid");
//		MessageId messageId = MessageId.valueOf(msgid);
		JSONObject jsonResponse = new JSONObject();
		boolean is_login_register = true;
		if(is_login_register) {
			switch (messageId) {
			case MessageId.LOGIN_REQUEST:
				Login.getInstance().login(ctx.channel(), jsonRequest, jsonResponse);
				break;
			case MessageId.REGISTER_REQUEST:
				Login.getInstance().register(ctx.channel(), jsonRequest, jsonResponse);
				break;
			default:
				is_login_register = false;
				break;
			}
		}
		if(!is_login_register) {
			User user = Login.get(ctx.channel());
			if(null == user) {
				jsonResponse.put("err_code", ErrorCodeGame.SYSTEM_ERROR);
				send(ctx.channel(), jsonResponse.toString());
				return;
			}
			switch (messageId) {	
			case MessageId.HEART_REQUEST:
				Login.getInstance().heartResponse(user);
				break;
			case MessageId.FAVORITE_PLAYER_REQUEST:
				IFavorite.getInstance().favoritePlayerList(user, jsonRequest, jsonResponse);
				break;
			case MessageId.TODAY_MATCH_LIST_REQUEST:
				IMatch.getInstance().todayMatchList(user, jsonRequest, jsonResponse);
				break;
			case MessageId.TRANSFER_TOP3_REQUEST:
				ITransfer.getInstance().top3(user, jsonRequest, jsonResponse);
				break;	
			case MessageId.TRANSFER_SEARCH_REQUEST:
				ITransfer.getInstance().searchPlayer(user, jsonRequest, jsonResponse);
				break;	
			case MessageId.TRANSFER_LATEST_REQUEST:
				break;	
			case MessageId.PLAYER_INFO_REQUEST:
				break;	
			case MessageId.MY_POKECT_REQUEST:
				break;	
			case MessageId.TRANSFER_BORROW_REQUEST:
				break;	
			case MessageId.SETTING_REQUEST:
				break;	
				
			default:
				break;
			}
		}
		send(ctx.channel(), jsonResponse.toString());
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		super.channelRegistered(ctx);
	}

	public static void send(Channel channel, String content){
        int total = 4 + 4 + content.getBytes().length;
        ByteBuf byteBuf = Unpooled.buffer(total);
        byteBuf.writeInt(total);
        byteBuf.writeInt(content.getBytes().length);
        byteBuf.writeBytes(content.getBytes());
        channel.writeAndFlush(new String(byteBuf.array()));
    }
	



	


}
