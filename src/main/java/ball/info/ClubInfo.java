package ball.info;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import ball.team.Team;

public class ClubInfo implements Serializable{
	private static final long serialVersionUID = 5233327890080665278L;
	private long id;
	private String name;
	private int money;
	private Team team0;
	private Team team21;
	private Team team18;
	private boolean levelTeam0;//一线队 是否组建
	private boolean levelTeam21;//U21队
	private boolean levelTeam18;//U18队
	private int nation;
	private int league;
	private int reputation;
	private Map<Long, List<AgainstInfo>> againstListByClubMap;
	
	public ClubInfo() {
		levelTeam0 = true;
		if(levelTeam0) {
			team0 = new Team();
		}
		levelTeam21 = true;
		if(levelTeam21) {
			team21 = new Team();
		}
		levelTeam18 = true;
		if(levelTeam18) {
			team18 = new Team();
		}
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Team getTeam0() {
		return team0;
	}
	public void setTeam0(Team team0) {
		this.team0 = team0;
	}
	public Team getTeam21() {
		return team21;
	}
	public void setTeam21(Team team21) {
		this.team21 = team21;
	}
	public Team getTeam18() {
		return team18;
	}
	public void setTeam18(Team team18) {
		this.team18 = team18;
	}
	public boolean isLevelTeam0() {
		return levelTeam0;
	}
	public void setLevelTeam0(boolean levelTeam0) {
		this.levelTeam0 = levelTeam0;
	}
	public boolean isLevelTeam21() {
		return levelTeam21;
	}
	public void setLevelTeam21(boolean levelTeam21) {
		this.levelTeam21 = levelTeam21;
	}
	public boolean isLevelTeam18() {
		return levelTeam18;
	}
	public void setLevelTeam18(boolean levelTeam18) {
		this.levelTeam18 = levelTeam18;
	}

	public int getNation() {
		return nation;
	}

	public void setNation(int nation) {
		this.nation = nation;
	}

	public int getLeague() {
		return league;
	}

	public void setLeague(int league) {
		this.league = league;
	}

	public Map<Long, List<AgainstInfo>> getAgainstListByClubMap() {
		return againstListByClubMap;
	}

	public void setAgainstListByClubMap(Map<Long, List<AgainstInfo>> againstListByClubMap) {
		this.againstListByClubMap = againstListByClubMap;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public ClubInfo deepClone() throws IOException, OptionalDataException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (ClubInfo)(oi.readObject());
	}
	
}
