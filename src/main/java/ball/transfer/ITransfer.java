package ball.transfer;

import com.alibaba.fastjson.JSONObject;

import user.info.User;

public interface ITransfer {
	public static ITransfer getInstance() {
		return new TransferImpl();
	}
	
	/** 交易榜TOP3  
	 * @param user */
	void top3(User user, JSONObject jsonRequest, JSONObject jsonResponse);
	/** 市场搜索  */
	void searchPlayer(User user, JSONObject jsonRequest, JSONObject jsonResponse);
}
