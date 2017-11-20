package ball.transfermarket;

import ball.player.PlayerInfo;

public class Business {
	public void finalChangeClub(PlayerInfo pinfo,  long clubId) {
		pinfo.setClubId(clubId);
	}
	
	public static Business getInstance() {
		return new Business();
	}

}
