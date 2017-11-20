package ball.club;

import java.util.List;

import ball.info.ClubInfo;

public class OriginalClubImpl {
	public static OriginalClubImpl getInstance() {
		return new OriginalClubImpl();
	}
	
	public List<ClubInfo> getAllList() {
		return OriginalClubData.getList();
	}
	

}
