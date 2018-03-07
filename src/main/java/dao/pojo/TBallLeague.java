package dao.pojo;

public class TBallLeague {
    private Integer id;

    private String name;

    private Integer maxteamnum;

    private Integer reputation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMaxteamnum() {
        return maxteamnum;
    }

    public void setMaxteamnum(Integer maxteamnum) {
        this.maxteamnum = maxteamnum;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }
}