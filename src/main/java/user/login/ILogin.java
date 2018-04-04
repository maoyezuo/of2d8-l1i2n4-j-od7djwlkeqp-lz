package user.login;

import com.alibaba.fastjson.JSONObject;

import io.netty.channel.Channel;
import user.info.User;

public interface ILogin {
	
	void login(Channel channel, JSONObject jsonRequest, JSONObject jsonResponse);
	
	void register(Channel channel, JSONObject json, JSONObject jsonResponse);
	
	void heartResponse(User user);

}
