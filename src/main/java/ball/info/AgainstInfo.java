package ball.info;
/**对阵*/
public class AgainstInfo {
	private long teamid1;
	private long teamid2;
	private long time;
	private int stadiumId;
	public long getTeamid1() {
		return teamid1;
	}
	public void setTeamid1(long teamid1) {
		this.teamid1 = teamid1;
	}
	public long getTeamid2() {
		return teamid2;
	}
	public void setTeamid2(long teamid2) {
		this.teamid2 = teamid2;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

}
