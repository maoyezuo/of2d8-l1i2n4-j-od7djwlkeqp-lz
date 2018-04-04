package ball.favorite;

import com.alibaba.fastjson.JSONObject;

import user.info.User;

public interface IFavorite {
	public static IFavorite getInstance() {
		return new FavoriteImpl();
	}
	void favoritePlayerList(User user, JSONObject jsonRequest, JSONObject jsonResponse) throws Exception;

}
