package dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TBallPlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBallPlayerExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(Integer value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(Integer value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(Integer value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(Integer value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(Integer value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<Integer> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<Integer> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(Integer value1, Integer value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(Integer value1, Integer value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andTrappingIsNull() {
            addCriterion("trapping is null");
            return (Criteria) this;
        }

        public Criteria andTrappingIsNotNull() {
            addCriterion("trapping is not null");
            return (Criteria) this;
        }

        public Criteria andTrappingEqualTo(Integer value) {
            addCriterion("trapping =", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingNotEqualTo(Integer value) {
            addCriterion("trapping <>", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingGreaterThan(Integer value) {
            addCriterion("trapping >", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingGreaterThanOrEqualTo(Integer value) {
            addCriterion("trapping >=", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingLessThan(Integer value) {
            addCriterion("trapping <", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingLessThanOrEqualTo(Integer value) {
            addCriterion("trapping <=", value, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingIn(List<Integer> values) {
            addCriterion("trapping in", values, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingNotIn(List<Integer> values) {
            addCriterion("trapping not in", values, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingBetween(Integer value1, Integer value2) {
            addCriterion("trapping between", value1, value2, "trapping");
            return (Criteria) this;
        }

        public Criteria andTrappingNotBetween(Integer value1, Integer value2) {
            addCriterion("trapping not between", value1, value2, "trapping");
            return (Criteria) this;
        }

        public Criteria andShootIsNull() {
            addCriterion("shoot is null");
            return (Criteria) this;
        }

        public Criteria andShootIsNotNull() {
            addCriterion("shoot is not null");
            return (Criteria) this;
        }

        public Criteria andShootEqualTo(Integer value) {
            addCriterion("shoot =", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotEqualTo(Integer value) {
            addCriterion("shoot <>", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootGreaterThan(Integer value) {
            addCriterion("shoot >", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoot >=", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootLessThan(Integer value) {
            addCriterion("shoot <", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootLessThanOrEqualTo(Integer value) {
            addCriterion("shoot <=", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootIn(List<Integer> values) {
            addCriterion("shoot in", values, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotIn(List<Integer> values) {
            addCriterion("shoot not in", values, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootBetween(Integer value1, Integer value2) {
            addCriterion("shoot between", value1, value2, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotBetween(Integer value1, Integer value2) {
            addCriterion("shoot not between", value1, value2, "shoot");
            return (Criteria) this;
        }

        public Criteria andSenseIsNull() {
            addCriterion("sense is null");
            return (Criteria) this;
        }

        public Criteria andSenseIsNotNull() {
            addCriterion("sense is not null");
            return (Criteria) this;
        }

        public Criteria andSenseEqualTo(Integer value) {
            addCriterion("sense =", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseNotEqualTo(Integer value) {
            addCriterion("sense <>", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseGreaterThan(Integer value) {
            addCriterion("sense >", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sense >=", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseLessThan(Integer value) {
            addCriterion("sense <", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseLessThanOrEqualTo(Integer value) {
            addCriterion("sense <=", value, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseIn(List<Integer> values) {
            addCriterion("sense in", values, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseNotIn(List<Integer> values) {
            addCriterion("sense not in", values, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseBetween(Integer value1, Integer value2) {
            addCriterion("sense between", value1, value2, "sense");
            return (Criteria) this;
        }

        public Criteria andSenseNotBetween(Integer value1, Integer value2) {
            addCriterion("sense not between", value1, value2, "sense");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andClubIdIsNull() {
            addCriterion("club_id is null");
            return (Criteria) this;
        }

        public Criteria andClubIdIsNotNull() {
            addCriterion("club_id is not null");
            return (Criteria) this;
        }

        public Criteria andClubIdEqualTo(Long value) {
            addCriterion("club_id =", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotEqualTo(Long value) {
            addCriterion("club_id <>", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdGreaterThan(Long value) {
            addCriterion("club_id >", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("club_id >=", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdLessThan(Long value) {
            addCriterion("club_id <", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdLessThanOrEqualTo(Long value) {
            addCriterion("club_id <=", value, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdIn(List<Long> values) {
            addCriterion("club_id in", values, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotIn(List<Long> values) {
            addCriterion("club_id not in", values, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdBetween(Long value1, Long value2) {
            addCriterion("club_id between", value1, value2, "clubId");
            return (Criteria) this;
        }

        public Criteria andClubIdNotBetween(Long value1, Long value2) {
            addCriterion("club_id not between", value1, value2, "clubId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Long value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Long value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Long value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Long value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Long value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Long> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Long> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Long value1, Long value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Long value1, Long value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
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