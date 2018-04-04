package ball.transfermarket;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import application.ApplicationContextHelper;
import ball.club.OriginalClubData;
import ball.club.OriginalLeagueData;
import ball.club.OriginalNationData;
import ball.info.ClubInfo;
import ball.info.LeagueInfo;
import ball.info.NationInfo;
import ball.player.PlayerInfo;
import ball.player.PositionStadium;
import ball.team.Team;
import dao.TBallClubMapper;
import dao.TBallLeagueMapper;
import dao.TBallNationMapper;
import dao.TBallPlayerMapper;
import dao.TBallTeamMapper;
import dao.pojo.TBallClub;
import dao.pojo.TBallLeague;
import dao.pojo.TBallNation;
import dao.pojo.TBallPlayer;
import dao.pojo.TBallPlayerExample;
import dao.pojo.TBallTeam;
import tools.RandomTool;
import tools.StringName;

public class MarketData {
	private final static Logger logger = Logger.getLogger(MarketData.class);
	private static Map<Long, PlayerInfo> playerMap = new ConcurrentHashMap<Long, PlayerInfo>();
	
	public static synchronized void add(PlayerInfo playerInfo) {
		playerMap.put(playerInfo.getId(), playerInfo);
	}
	
	public static synchronized void remove(Long playerId) {
		playerMap.remove(playerId);
	}
	
	public static synchronized PlayerInfo get(Long playerId) {
		return playerMap.get(playerId);
	}
	
	public static synchronized Map<Long, PlayerInfo> getPlayerMap() {
		return playerMap;
	}
	
	
	public static void initMake() throws Exception {
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
//			record.setNationId(playerInfo.getNationId());
//			mapper.insert(record);
//			playerInfo.setId(record.getId());
//			playerMap.put(playerInfo.getId(), playerInfo);
//		}
		
		//国家
		int firstNationId = 0;
		for (int i = 0; i < 1; i++) {
			NationInfo nationInfo = new NationInfo(i, StringName.getRandomName(3+RandomTool.random.nextInt(8)), 3000+RandomTool.random.nextInt(2000));
			OriginalNationData.add(nationInfo);
			
			TBallNationMapper mapper = (TBallNationMapper)ApplicationContextHelper.getInstance().getBean("TBallNationMapper");
			TBallNation record = new TBallNation();
			record.setName(nationInfo.getName());
			record.setReputation(nationInfo.getReputation());
			mapper.insert(record);
			firstNationId = record.getId();
		}
		
		//联赛
		int firstLeagueId = 0;
		for (int i = 0; i < 1; i++) {
			LeagueInfo leagueInfo = new LeagueInfo(i, StringName.getRandomName(3+RandomTool.random.nextInt(8)), 20, 3000+RandomTool.random.nextInt(2000));
			OriginalLeagueData.add(leagueInfo);
			
			TBallLeagueMapper mapper = (TBallLeagueMapper)ApplicationContextHelper.getInstance().getBean("TBallLeagueMapper");
			TBallLeague record = new TBallLeague();
			record.setMaxteamnum(leagueInfo.getMaxTeamNum());
			record.setName(leagueInfo.getName());
			record.setReputation(leagueInfo.getReputation());
			mapper.insert(record);
			firstLeagueId = record.getId();
		}
		
		//俱乐部 初始化第一个国家，第一个联赛
		long pidInit = 1;
		int randomAddPlayerNum = 4;
		for (int i = 0; i < 20; i++) {
			ClubInfo clubInfo = new ClubInfo();
			clubInfo.setName(StringName.getRandomName(3+RandomTool.random.nextInt(8)));
			clubInfo.setNation(firstNationId);
			clubInfo.setLeague(firstLeagueId);
			clubInfo.setMoney(3000000+RandomTool.random.nextInt(20000000));
			clubInfo.setReputation(3000+RandomTool.random.nextInt(2000));
			TBallClubMapper mapper = (TBallClubMapper)ApplicationContextHelper.getInstance().getBean("TBallClubMapper");
			TBallClub record = new TBallClub();
			record.setNation(clubInfo.getNation());
			record.setLeague(clubInfo.getLeague());
			record.setName(clubInfo.getName());
			record.setMoney(clubInfo.getMoney());
			record.setReputation(clubInfo.getReputation());
			record.setLevelteam0(clubInfo.isLevelTeam0());
			record.setLevelteam21(clubInfo.isLevelTeam21());
			record.setLevelteam18(clubInfo.isLevelTeam18());
			mapper.insert(record);
			logger.info(record.getId());
			clubInfo.setId(record.getId());
			
			if(clubInfo.isLevelTeam0()) {
				Team team0 = clubInfo.getTeam0();
				
				TBallTeamMapper tballTeamMapper = (TBallTeamMapper)ApplicationContextHelper.getInstance().getBean("TBallTeamMapper");
				TBallTeam recordTBallTeam = new TBallTeam();
				recordTBallTeam.setLevelType(0);
				tballTeamMapper.insert(recordTBallTeam);
				team0.setId(recordTBallTeam.getId());
				
				pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team0, clubInfo.getId());
			}
			if(clubInfo.isLevelTeam21()) {
				Team team21 = clubInfo.getTeam21();
				
				TBallTeamMapper tballTeamMapper = (TBallTeamMapper)ApplicationContextHelper.getInstance().getBean("TBallTeamMapper");
				TBallTeam recordTBallTeam = new TBallTeam();
				recordTBallTeam.setLevelType(21);
				tballTeamMapper.insert(recordTBallTeam);
				team21.setId(recordTBallTeam.getId());
				
				pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team21, clubInfo.getId());
			}
			if(clubInfo.isLevelTeam18()) {
				Team team18 = clubInfo.getTeam18();
				
				TBallTeamMapper tballTeamMapper = (TBallTeamMapper)ApplicationContextHelper.getInstance().getBean("TBallTeamMapper");
				TBallTeam recordTBallTeam = new TBallTeam();
				recordTBallTeam.setLevelType(18);
				tballTeamMapper.insert(recordTBallTeam);
				team18.setId(recordTBallTeam.getId());
				
				pidInit = randomAddPlayer(pidInit, randomAddPlayerNum, team18, clubInfo.getId());
			}
			OriginalClubData.add(clubInfo);
		}
		
//		ClubImpl.getInstance().initAgainstList(Clone.clone(OriginalClubData.getList()));
		
	}

	/** 为俱乐部球队创建18+球员  */
	private static long randomAddPlayer(long pidInit, int randomAddPlayerNum, Team team, long clubId) {
		int pnum = RandomTool.random.nextInt(11+7+RandomTool.random.nextInt(randomAddPlayerNum));
		PlayerInfo playerInfo = null;
		for (int j = 0; j < pnum; j++) {
//			playerInfo = playerMap.get(pidInit);
//			playerInfo.setClubId(clubId);
//			team.add(playerInfo);
//			pidInit++;
			
//			TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
//			TBallPlayer record = new TBallPlayer();
//			record.setClubId(clubId);
			
			//球员
			playerInfo = new PlayerInfo(j, RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), RandomTool.random.nextInt(20), 15+RandomTool.random.nextInt(20));
			playerInfo.setPosition(PositionStadium.CF2);
			playerInfo.setTeamId(team.getId());
			playerInfo.setName(StringName.getRandomName(3+RandomTool.random.nextInt(8))+" "+StringName.getRandomName(3+RandomTool.random.nextInt(8)));
			playerInfo.setClubId(clubId);
			playerInfo.setNationId(1);
			playerInfo.setPrice(100000+RandomTool.random.nextInt(9999999));
			add(playerInfo);
			
			TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
			TBallPlayer record = new TBallPlayer();
			record.setClubId(playerInfo.getClubId());
			record.setName(playerInfo.getName());
			record.setPass(playerInfo.getPass());
			record.setPosition(playerInfo.getPosition().ordinal());
			record.setPrice(playerInfo.getPrice());
			record.setSense(playerInfo.getSense());
			record.setShoot(playerInfo.getShoot());
			record.setTeamId(playerInfo.getTeamId());
			record.setTrapping(playerInfo.getTrapping());
			record.setNationId(playerInfo.getNationId());
			record.setAge(playerInfo.getAge());
			record.setSex(playerInfo.getSex());
			record.setPosition(playerInfo.getPosition().ordinal());
			mapper.insert(record);
			playerInfo.setId(record.getId());
			playerMap.put(playerInfo.getId(), playerInfo);
		}
		return pidInit;
	}
	
	public static void init() {
		//球员
		TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
		TBallPlayerExample example = new TBallPlayerExample();
		List<TBallPlayer> list = mapper.selectByExample(example);
		PlayerInfo playerInfo = null;
		for (int i = 0; i < list.size(); i++) {
			TBallPlayer tballPlayer = list.get(i);
			playerInfo = new PlayerInfo();
			playerInfo.setAge(tballPlayer.getAge());
			playerInfo.setClubId(tballPlayer.getClubId());
			playerInfo.setId(tballPlayer.getId());
			playerInfo.setName(tballPlayer.getName());
			playerInfo.setNationId(tballPlayer.getNationId());
			playerInfo.setPass(tballPlayer.getPass());
			playerInfo.setPosition(PositionStadium.CF1);//暂时没写转换函数
			playerInfo.setPrice(tballPlayer.getPrice());
			playerInfo.setSense(tballPlayer.getSense());
			playerInfo.setSex(tballPlayer.getSex());
			playerInfo.setShoot(tballPlayer.getShoot());
			playerInfo.setTeamId(tballPlayer.getTeamId());
			playerInfo.setTrapping(tballPlayer.getTrapping());
			playerMap.put(playerInfo.getId(), playerInfo);
		}
		logger.info("球员初始化完成");
	}
}
