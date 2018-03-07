package dao.pojo;

public class TBallPlayer {
    private Long id;

    private String name;

    private Integer price;

    private Integer pass;

    private Integer trapping;

    private Integer shoot;

    private Integer sense;

    private Integer position;

    private Long clubId;

    private Long teamId;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getTrapping() {
        return trapping;
    }

    public void setTrapping(Integer trapping) {
        this.trapping = trapping;
    }

    public Integer getShoot() {
        return shoot;
    }

    public void setShoot(Integer shoot) {
        this.shoot = shoot;
    }

    public Integer getSense() {
        return sense;
    }

    public void setSense(Integer sense) {
        this.sense = sense;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}