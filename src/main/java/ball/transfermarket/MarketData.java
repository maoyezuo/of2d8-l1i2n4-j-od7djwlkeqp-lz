package ball.transfermarket;

import java.util.HashMap;
import java.util.Map;

import ball.club.ClubImpl;
import ball.club.OriginalLeagueData;
import ball.club.OriginalNationData;
import ball.info.ClubInfo;
import ball.info.LeagueInfo;
import ball.info.NationInfo;
import ball.club.OriginalClubData;
import ball.player.PlayerInfo;
import ball.team.Team;
import tools.Clone;
import tools.RandomTool;
import tools.StringName;

public class MarketData {
	private static Map<Long, PlayerInfo> playerMap = new HashMap<Long, PlayerInfo>();
	
	public static synchronized void add(PlayerInfo playerInfo) {
		playerMap.put(playerInfo.getId(), playerInfo);
	}
	
	public static synchronized void remove(Long playerId) {
		playerMap.remove(playerId);
	}
	
	public static synchronized PlayerInfo get(Long playerId) {
		return playerMap.get(playerId);
	}
	
	public static void init() throws Exception {
		//球员
		for (int i = 0; i < 10000; i++) {
			add(new PlayerInfo(i, RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20)));
		}
		
		//国家
		for (int i = 0; i < 1; i++) {
			String name0 = StringName.getRandomString(RandomTool.random.nextInt(5)+13);
			name0 = name0.replace(name0.substring(0, 1), name0.substring(0, 1).toUpperCase());
			OriginalNationData.add(new NationInfo(i, name0, 3000+RandomTool.random.nextInt(2000)));
		}
		
		//联赛
		for (int i = 0; i < 1; i++) {
			String name0 = StringName.getRandomString(9);
			name0 = name0.replace(name0.substring(0, 1), name0.substring(0, 1).toUpperCase());
			String name1 = StringName.getRandomString(6);
			name1 = name1.replace(name1.substring(0, 1), name1.substring(0, 1).toUpperCase());
			OriginalLeagueData.add(new LeagueInfo(i, name0+" "+name1, 20, 3000+RandomTool.random.nextInt(2000)));
		}
		
		//俱乐部
		long pidInit = 0;
		int randomAddPlayerNum = 4;
		for (int i = 0; i < 20; i++) {
			ClubInfo clubInfo = new ClubInfo();
			clubInfo.setId(i);
			clubInfo.setNation(0);
			clubInfo.setLeague(0);
			Team team0 = clubInfo.getTeam0();
			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team0, clubInfo.getId());
			Team team21 = clubInfo.getTeam21();
			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team21, clubInfo.getId());
			Team team18 = clubInfo.getTeam18();
			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team18, clubInfo.getId());
			OriginalClubData.add(clubInfo);
		}
//		ClubImpl.getInstance().initAgainstList(Clone.clone(OriginalClubData.getList()));
		
	}

	private static long randomAddPlayer(long pidInit, int randomAddPlayerNum, Team team18, long clubId) {
		int pnum = RandomTool.random.nextInt(11+7+RandomTool.random.nextInt(randomAddPlayerNum));
		PlayerInfo playerInfo = null;
		for (int j = 0; j < pnum; j++) {
			playerInfo = playerMap.get(pidInit);
			playerInfo.setClubId(clubId);
			team18.add(playerInfo);
			pidInit++;
		}
		return pidInit;
	}
}
