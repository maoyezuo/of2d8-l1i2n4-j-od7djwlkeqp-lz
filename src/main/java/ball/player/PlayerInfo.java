package ball.player;

public class PlayerInfo {
	private long id;
	private String name="";
	private int pass;
	private int trapping;
	private int shoot;
	private int sense;
	private int price;
	private PositionStadium position;
	private long clubId;
	private long teamId;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	
}
