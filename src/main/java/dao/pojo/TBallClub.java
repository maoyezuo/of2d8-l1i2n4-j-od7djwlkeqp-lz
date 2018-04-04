package dao.pojo;

public class TBallClub {
    private Long id;

    private String name;

    private Integer money;

    private Integer reputation;

    private Integer nation;

    private Integer league;

    private Boolean levelteam0;

    private Boolean levelteam21;

    private Boolean levelteam18;

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

    public Boolean getLevelteam0() {
        return levelteam0;
    }

    public void setLevelteam0(Boolean levelteam0) {
        this.levelteam0 = levelteam0;
    }

    public Boolean getLevelteam21() {
        return levelteam21;
    }

    public void setLevelteam21(Boolean levelteam21) {
        this.levelteam21 = levelteam21;
    }

    public Boolean getLevelteam18() {
        return levelteam18;
    }

    public void setLevelteam18(Boolean levelteam18) {
        this.levelteam18 = levelteam18;
    }
}