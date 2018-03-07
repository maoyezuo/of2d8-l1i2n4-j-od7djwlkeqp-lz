package ball.transfermarket;

import java.util.HashMap;
import java.util.Map;

import application.ApplicationContextHelper;
import ball.club.OriginalClubData;
import ball.club.OriginalLeagueData;
import ball.club.OriginalNationData;
import ball.info.ClubInfo;
import ball.info.LeagueInfo;
import ball.info.NationInfo;
import ball.player.PlayerInfo;
import ball.team.Team;
import dao.TBallClubMapper;
import dao.TBallLeagueMapper;
import dao.TBallNationMapper;
import dao.TBallPlayerMapper;
import dao.pojo.TBallClub;
import dao.pojo.TBallLeague;
import dao.pojo.TBallNation;
import dao.pojo.TBallPlayer;
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
//		//球员
//		for (int i = 0; i < 10000; i++) {
//			PlayerInfo playerInfo = new PlayerInfo(i, RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20));
//			add(playerInfo);
//			
//			TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
//			TBallPlayer record = new TBallPlayer();
//			record.setClubId(playerInfo.getClubId());
//			record.setName(playerInfo.getName());
//			record.setPass(playerInfo.getPass());
//			record.setPosition(playerInfo.getPosition().ordinal());
//			record.setPrice(playerInfo.getPrice());
//			record.setSense(playerInfo.getSense());
//			record.setShoot(playerInfo.getShoot());
//			record.setTeamId(playerInfo.getTeamId());
//			record.setTrapping(playerInfo.getTrapping());
//			mapper.insert(record);
//		}
		
		//国家
		for (int i = 0; i < 1; i++) {
			String name0 = StringName.getRandomString(RandomTool.random.nextInt(5)+13);
			name0 = name0.replace(name0.substring(0, 1), name0.substring(0, 1).toUpperCase());
			NationInfo nationInfo = new NationInfo(i, name0, 3000+RandomTool.random.nextInt(2000));
			OriginalNationData.add(nationInfo);
			
			TBallNationMapper mapper = (TBallNationMapper)ApplicationContextHelper.getInstance().getBean("TBallNationMapper");
			TBallNation record = new TBallNation();
			record.setName(nationInfo.getName());
			record.setReputation(nationInfo.getReputation());
			mapper.insert(record);
			System.out.println(record.getId());
		}
		
//		//联赛
//		for (int i = 0; i < 1; i++) {
//			String name0 = StringName.getRandomString(9);
//			name0 = name0.replace(name0.substring(0, 1), name0.substring(0, 1).toUpperCase());
//			String name1 = StringName.getRandomString(6);
//			name1 = name1.replace(name1.substring(0, 1), name1.substring(0, 1).toUpperCase());
//			LeagueInfo leagueInfo = new LeagueInfo(i, name0+" "+name1, 20, 3000+RandomTool.random.nextInt(2000));
//			OriginalLeagueData.add(leagueInfo);
//			
//			TBallLeagueMapper mapper = (TBallLeagueMapper)ApplicationContextHelper.getInstance().getBean("TBallLeagueMapper");
//			TBallLeague record = new TBallLeague();
//			record.setMaxteamnum(leagueInfo.getMaxTeamNum());
//			record.setName(leagueInfo.getName());
//			record.setReputation(leagueInfo.getReputation());
//			mapper.insert(record);
//		}
//		
//		//俱乐部 初始化第一个国家，第一个联赛
//		long pidInit = 0;
//		int randomAddPlayerNum = 4;
//		for (int i = 0; i < 20; i++) {
//			ClubInfo clubInfo = new ClubInfo();
//			clubInfo.setId(i);
//			clubInfo.setNation(1);
//			clubInfo.setLeague(1);
//			TBallClubMapper mapper = (TBallClubMapper)ApplicationContextHelper.getInstance().getBean("TBallClubMapper");
//			TBallClub record = new TBallClub();
//			record.setLeague(clubInfo.getLeague());
//			
//			
//			Team team0 = clubInfo.getTeam0();
//			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team0, clubInfo.getId());
//			Team team21 = clubInfo.getTeam21();
//			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team21, clubInfo.getId());
//			Team team18 = clubInfo.getTeam18();
//			pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team18, clubInfo.getId());
//			OriginalClubData.add(clubInfo);
//		}
		
		
		
		
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
