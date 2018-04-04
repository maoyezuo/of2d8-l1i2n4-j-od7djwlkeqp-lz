package dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransferExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Long value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Long value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Long value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Long value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Long> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Long> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Long value1, Long value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("player_name is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("player_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("player_name =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("player_name <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("player_name >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("player_name >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("player_name <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("player_name <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("player_name like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("player_name not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("player_name in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("player_name not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("player_name between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("player_name not between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andOldClubIdIsNull() {
            addCriterion("old_club_id is null");
            return (Criteria) this;
        }

        public Criteria andOldClubIdIsNotNull() {
            addCriterion("old_club_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldClubIdEqualTo(Long value) {
            addCriterion("old_club_id =", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdNotEqualTo(Long value) {
            addCriterion("old_club_id <>", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdGreaterThan(Long value) {
            addCriterion("old_club_id >", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("old_club_id >=", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdLessThan(Long value) {
            addCriterion("old_club_id <", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdLessThanOrEqualTo(Long value) {
            addCriterion("old_club_id <=", value, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdIn(List<Long> values) {
            addCriterion("old_club_id in", values, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdNotIn(List<Long> values) {
            addCriterion("old_club_id not in", values, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdBetween(Long value1, Long value2) {
            addCriterion("old_club_id between", value1, value2, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubIdNotBetween(Long value1, Long value2) {
            addCriterion("old_club_id not between", value1, value2, "oldClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdIsNull() {
            addCriterion("new_club_id is null");
            return (Criteria) this;
        }

        public Criteria andNewClubIdIsNotNull() {
            addCriterion("new_club_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewClubIdEqualTo(Long value) {
            addCriterion("new_club_id =", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdNotEqualTo(Long value) {
            addCriterion("new_club_id <>", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdGreaterThan(Long value) {
            addCriterion("new_club_id >", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("new_club_id >=", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdLessThan(Long value) {
            addCriterion("new_club_id <", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdLessThanOrEqualTo(Long value) {
            addCriterion("new_club_id <=", value, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdIn(List<Long> values) {
            addCriterion("new_club_id in", values, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdNotIn(List<Long> values) {
            addCriterion("new_club_id not in", values, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdBetween(Long value1, Long value2) {
            addCriterion("new_club_id between", value1, value2, "newClubId");
            return (Criteria) this;
        }

        public Criteria andNewClubIdNotBetween(Long value1, Long value2) {
            addCriterion("new_club_id not between", value1, value2, "newClubId");
            return (Criteria) this;
        }

        public Criteria andOldClubNameIsNull() {
            addCriterion("old_club_name is null");
            return (Criteria) this;
        }

        public Criteria andOldClubNameIsNotNull() {
            addCriterion("old_club_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldClubNameEqualTo(String value) {
            addCriterion("old_club_name =", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameNotEqualTo(String value) {
            addCriterion("old_club_name <>", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameGreaterThan(String value) {
            addCriterion("old_club_name >", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_club_name >=", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameLessThan(String value) {
            addCriterion("old_club_name <", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameLessThanOrEqualTo(String value) {
            addCriterion("old_club_name <=", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameLike(String value) {
            addCriterion("old_club_name like", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameNotLike(String value) {
            addCriterion("old_club_name not like", value, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameIn(List<String> values) {
            addCriterion("old_club_name in", values, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameNotIn(List<String> values) {
            addCriterion("old_club_name not in", values, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameBetween(String value1, String value2) {
            addCriterion("old_club_name between", value1, value2, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andOldClubNameNotBetween(String value1, String value2) {
            addCriterion("old_club_name not between", value1, value2, "oldClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameIsNull() {
            addCriterion("new_club_name is null");
            return (Criteria) this;
        }

        public Criteria andNewClubNameIsNotNull() {
            addCriterion("new_club_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewClubNameEqualTo(String value) {
            addCriterion("new_club_name =", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameNotEqualTo(String value) {
            addCriterion("new_club_name <>", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameGreaterThan(String value) {
            addCriterion("new_club_name >", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_club_name >=", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameLessThan(String value) {
            addCriterion("new_club_name <", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameLessThanOrEqualTo(String value) {
            addCriterion("new_club_name <=", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameLike(String value) {
            addCriterion("new_club_name like", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameNotLike(String value) {
            addCriterion("new_club_name not like", value, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameIn(List<String> values) {
            addCriterion("new_club_name in", values, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameNotIn(List<String> values) {
            addCriterion("new_club_name not in", values, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameBetween(String value1, String value2) {
            addCriterion("new_club_name between", value1, value2, "newClubName");
            return (Criteria) this;
        }

        public Criteria andNewClubNameNotBetween(String value1, String value2) {
            addCriterion("new_club_name not between", value1, value2, "newClubName");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Long value) {
            addCriterion("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Long value) {
            addCriterion("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Long value) {
            addCriterion("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Long value) {
            addCriterion("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Long value) {
            addCriterion("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Long value) {
            addCriterion("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Long> values) {
            addCriterion("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Long> values) {
            addCriterion("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Long value1, Long value2) {
            addCriterion("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Long value1, Long value2) {
            addCriterion("lasttime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andHeadIcoIsNull() {
            addCriterion("head_ico is null");
            return (Criteria) this;
        }

        public Criteria andHeadIcoIsNotNull() {
            addCriterion("head_ico is not null");
            return (Criteria) this;
        }

        public Criteria andHeadIcoEqualTo(Integer value) {
            addCriterion("head_ico =", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoNotEqualTo(Integer value) {
            addCriterion("head_ico <>", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoGreaterThan(Integer value) {
            addCriterion("head_ico >", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoGreaterThanOrEqualTo(Integer value) {
            addCriterion("head_ico >=", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoLessThan(Integer value) {
            addCriterion("head_ico <", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoLessThanOrEqualTo(Integer value) {
            addCriterion("head_ico <=", value, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoIn(List<Integer> values) {
            addCriterion("head_ico in", values, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoNotIn(List<Integer> values) {
            addCriterion("head_ico not in", values, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoBetween(Integer value1, Integer value2) {
            addCriterion("head_ico between", value1, value2, "headIco");
            return (Criteria) this;
        }

        public Criteria andHeadIcoNotBetween(Integer value1, Integer value2) {
            addCriterion("head_ico not between", value1, value2, "headIco");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}