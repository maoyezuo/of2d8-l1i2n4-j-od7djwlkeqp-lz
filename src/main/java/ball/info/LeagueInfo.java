package ball.info;

public class LeagueInfo {
	public LeagueInfo(int id, String name, int maxTeamNum, int reputation) {
		this.id = id;
		this.name = name;
		this.maxTeamNum = maxTeamNum;
		this.reputation = reputation;
	}

	private int id;
	private String name;
	private int maxTeamNum;
	private int reputation;//声望
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxTeamNum() {
		return maxTeamNum;
	}
	public void setMaxTeamNum(int maxTeamNum) {
		this.maxTeamNum = maxTeamNum;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	

}
