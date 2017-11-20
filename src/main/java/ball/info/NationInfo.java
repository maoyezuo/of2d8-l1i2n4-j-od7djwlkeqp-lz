package ball.info;

/***
 * 国家
 * @author Administrator
 *
 */
public class NationInfo {
	private int id;
	private String name;
	private int reputation;//声望
	
	public NationInfo(int id, String name, int reputation) {
		this.id = id;
		this.name = name;
		this.reputation = reputation;
	}

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
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	
}
