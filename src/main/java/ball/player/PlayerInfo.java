package ball.player;

public class PlayerInfo {
	private long id;
	private int pass;
	private int trapping;
	private int shoot;
	private int sense;
	private PositionStadium position;
	private long clubId;
	
	public PlayerInfo() {
	}
	public PlayerInfo(long id, int pass, int trapping, int shoot, int sense) {
		super();
		this.id = id;
		this.pass = pass;
		this.trapping = trapping;
		this.shoot = shoot;
		this.sense = sense;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getTrapping() {
		return trapping;
	}
	public void setTrapping(int trapping) {
		this.trapping = trapping;
	}
	public int getShoot() {
		return shoot;
	}
	public void setShoot(int shoot) {
		this.shoot = shoot;
	}
	public int getSense() {
		return sense;
	}
	public void setSense(int sense) {
		this.sense = sense;
	}
	
	public long getClubId() {
		return clubId;
	}
	public void setClubId(long clubId) {
		this.clubId = clubId;
	}
	public int simpleFightCapacity() { 
		return pass+trapping+shoot+sense;
	}
	public PositionStadium getPosition() {
		return position;
	}
	public void setPosition(PositionStadium position) {
		this.position = position;
	}
	
}
