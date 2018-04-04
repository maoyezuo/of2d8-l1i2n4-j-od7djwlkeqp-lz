package ball.team;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ball.player.PlayerInfo;

public class Team {
	private int id;
	
	private Map<Long, PlayerInfo> playerMap = new HashMap<Long, PlayerInfo>();
	
	public void add(PlayerInfo playerInfo) {
		playerMap.put(playerInfo.getId(), playerInfo);
	}
	public PlayerInfo remove(long id) {
		return playerMap.get(Long.valueOf(id));
	}
	
	public int simpleFightCapacity() { 
		int total = 0;
		Iterator<Entry<Long, PlayerInfo>> it =  playerMap.entrySet().iterator();
		while(it.hasNext()){
		    Entry<Long, PlayerInfo> entry = it.next();
		    total += entry.getValue().simpleFightCapacity();
		}
		return total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
