package dao.pojo;

public class TBallClub {
    private Long id;

    private String name;

    private Integer money;

    private Integer reputation;

    private Integer nation;

    private Integer league;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getLeague() {
        return league;
    }

    public void setLeague(Integer league) {
        this.league = league;
    }
}