/**
 * 
 */
package netty.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

import ball.club.ClubImpl;
import ball.club.OriginalClubImpl;
import ball.team.Team;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import message.MessageId;
import netty.ToString;
import time.TimeImpl;
import user.info.User;
import user.login.Login;


/**
 * @author wangyu
 *
 */
public class MyBusinessLogicHandler extends SimpleChannelInboundHandler<String>  {
	private final static Logger logger = LoggerFactory.getLogger(MyBusinessLogicHandler.class);
	private int a;
	private User user;
	private Team team;
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg)throws Exception {
		a++;
//		if(0 == a%30){
			ToString.println(msg, ctx.channel().remoteAddress(),ctx.pipeline().channel().hashCode());
//		}
			
		JSONObject json = JSONObject.parseObject(msg);
		String msgid = json.getString("msgid");
		MessageId messageId = MessageId.valueOf(msgid);
		switch (messageId) {
		case login:
			Login.getInstance().login(json);
			break;
		case register:
			Login.getInstance().register(json);
			ctx.write(3);
			break;
		case createClub:
			ClubImpl.getInstance().creatClub(json);
			break;
		case getYMDTime:
			TimeImpl.getInstance().getTime();
			break;
			
			
		default:
			break;
		}
		
		
	}



	


}
