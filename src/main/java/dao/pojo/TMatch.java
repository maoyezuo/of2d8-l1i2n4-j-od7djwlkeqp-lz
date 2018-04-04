package dao.pojo;

public class TMatch {
    private Long id;

    private Long clubId1;

    private Long clubId2;

    private Long matchTime;

    private Long createTime;

    private String clubName1;

    private String clubName2;

    private String scoreMatch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClubId1() {
        return clubId1;
    }

    public void setClubId1(Long clubId1) {
        this.clubId1 = clubId1;
    }

    public Long getClubId2() {
        return clubId2;
    }

    public void setClubId2(Long clubId2) {
        this.clubId2 = clubId2;
    }

    public Long getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Long matchTime) {
        this.matchTime = matchTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getClubName1() {
        return clubName1;
    }

    public void setClubName1(String clubName1) {
        this.clubName1 = clubName1 == null ? null : clubName1.trim();
    }

    public String getClubName2() {
        return clubName2;
    }

    public void setClubName2(String clubName2) {
        this.clubName2 = clubName2 == null ? null : clubName2.trim();
    }

    public String getScoreMatch() {
        return scoreMatch;
    }

    public void setScoreMatch(String scoreMatch) {
        this.scoreMatch = scoreMatch == null ? null : scoreMatch.trim();
    }
}