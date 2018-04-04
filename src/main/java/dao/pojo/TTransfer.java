package dao.pojo;

public class TTransfer {
    private Long id;

    private String buyerId;

    private Integer price;

    private String sellerId;

    private String buyerName;

    private String sellerName;

    private Long playerId;

    private String playerName;

    private Long oldClubId;

    private Long newClubId;

    private String oldClubName;

    private String newClubName;

    private Long createtime;

    private Long lasttime;

    private Integer headIco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }

    public Long getOldClubId() {
        return oldClubId;
    }

    public void setOldClubId(Long oldClubId) {
        this.oldClubId = oldClubId;
    }

    public Long getNewClubId() {
        return newClubId;
    }

    public void setNewClubId(Long newClubId) {
        this.newClubId = newClubId;
    }

    public String getOldClubName() {
        return oldClubName;
    }

    public void setOldClubName(String oldClubName) {
        this.oldClubName = oldClubName == null ? null : oldClubName.trim();
    }

    public String getNewClubName() {
        return newClubName;
    }

    public void setNewClubName(String newClubName) {
        this.newClubName = newClubName == null ? null : newClubName.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getLasttime() {
        return lasttime;
    }

    public void setLasttime(Long lasttime) {
        this.lasttime = lasttime;
    }

    public Integer getHeadIco() {
        return headIco;
    }

    public void setHeadIco(Integer headIco) {
        this.headIco = headIco;
    }
}