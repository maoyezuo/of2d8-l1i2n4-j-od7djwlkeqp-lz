package user.info;

import java.util.List;

import ball.info.ClubInfo;
import ball.player.PlayerInfo;
import dao.pojo.TUser;
import io.netty.channel.Channel;
import user.login.Login;

public class User {
	private ClubInfo club;
	private boolean isLogin;
	private TUser tUser;
	private Channel channel;
	private long lastHeartTime;
	private List<PlayerInfo> favoritePlayersList;
	
	public void offline() {
		if(null != channel) {
			channel.close();
			channel = null;
		}
		Login.removeByUuid(getUuid());
	}
	
	public ClubInfo getClub() {
		return club;
	}
	public void setClub(ClubInfo club) {
		this.club = club;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	public TUser gettUser() {
		return tUser;
	}
	public void settUser(TUser tUser) {
		this.tUser = tUser;
	}
	public String getUuid() {
		return tUser.getUuid();
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public List<PlayerInfo> getFavoritePlayersList() {
		return favoritePlayersList;
	}
	public void setFavoritePlayersList(List<PlayerInfo> favoritePlayersList) {
		this.favoritePlayersList = favoritePlayersList;
	}
	public long getLastHeartTime() {
		return lastHeartTime;
	}
	public void setLastHeartTime(long lastHeartTime) {
		this.lastHeartTime = lastHeartTime;
	}
	
	
	
}
