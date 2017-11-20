package ball.club.team;

import ball.team.Team;

public class FightTeam {
	
	public static Team fightSimple(Team team1, Team team2) {
		if(team1.simpleFightCapacity()>team2.simpleFightCapacity()) {
			return team1;
		}else {
			return team2;
		}
	}

}
