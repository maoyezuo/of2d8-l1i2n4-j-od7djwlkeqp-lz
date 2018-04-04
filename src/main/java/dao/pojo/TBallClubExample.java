package dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TBallClubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBallClubExample() {
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andReputationIsNull() {
            addCriterion("reputation is null");
            return (Criteria) this;
        }

        public Criteria andReputationIsNotNull() {
            addCriterion("reputation is not null");
            return (Criteria) this;
        }

        public Criteria andReputationEqualTo(Integer value) {
            addCriterion("reputation =", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotEqualTo(Integer value) {
            addCriterion("reputation <>", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThan(Integer value) {
            addCriterion("reputation >", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("reputation >=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThan(Integer value) {
            addCriterion("reputation <", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThanOrEqualTo(Integer value) {
            addCriterion("reputation <=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationIn(List<Integer> values) {
            addCriterion("reputation in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotIn(List<Integer> values) {
            addCriterion("reputation not in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationBetween(Integer value1, Integer value2) {
            addCriterion("reputation between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("reputation not between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Integer value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Integer value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Integer value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Integer value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Integer value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Integer> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Integer> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Integer value1, Integer value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Integer value1, Integer value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andLeagueIsNull() {
            addCriterion("league is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIsNotNull() {
            addCriterion("league is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueEqualTo(Integer value) {
            addCriterion("league =", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotEqualTo(Integer value) {
            addCriterion("league <>", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueGreaterThan(Integer value) {
            addCriterion("league >", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueGreaterThanOrEqualTo(Integer value) {
            addCriterion("league >=", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueLessThan(Integer value) {
            addCriterion("league <", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueLessThanOrEqualTo(Integer value) {
            addCriterion("league <=", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueIn(List<Integer> values) {
            addCriterion("league in", values, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotIn(List<Integer> values) {
            addCriterion("league not in", values, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueBetween(Integer value1, Integer value2) {
            addCriterion("league between", value1, value2, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotBetween(Integer value1, Integer value2) {
            addCriterion("league not between", value1, value2, "league");
            return (Criteria) this;
        }

        public Criteria andLevelteam0IsNull() {
            addCriterion("levelTeam0 is null");
            return (Criteria) this;
        }

        public Criteria andLevelteam0IsNotNull() {
            addCriterion("levelTeam0 is not null");
            return (Criteria) this;
        }

        public Criteria andLevelteam0EqualTo(Boolean value) {
            addCriterion("levelTeam0 =", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0NotEqualTo(Boolean value) {
            addCriterion("levelTeam0 <>", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0GreaterThan(Boolean value) {
            addCriterion("levelTeam0 >", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0GreaterThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam0 >=", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0LessThan(Boolean value) {
            addCriterion("levelTeam0 <", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0LessThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam0 <=", value, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0In(List<Boolean> values) {
            addCriterion("levelTeam0 in", values, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0NotIn(List<Boolean> values) {
            addCriterion("levelTeam0 not in", values, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0Between(Boolean value1, Boolean value2) {
            addCriterion("levelTeam0 between", value1, value2, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam0NotBetween(Boolean value1, Boolean value2) {
            addCriterion("levelTeam0 not between", value1, value2, "levelteam0");
            return (Criteria) this;
        }

        public Criteria andLevelteam21IsNull() {
            addCriterion("levelTeam21 is null");
            return (Criteria) this;
        }

        public Criteria andLevelteam21IsNotNull() {
            addCriterion("levelTeam21 is not null");
            return (Criteria) this;
        }

        public Criteria andLevelteam21EqualTo(Boolean value) {
            addCriterion("levelTeam21 =", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21NotEqualTo(Boolean value) {
            addCriterion("levelTeam21 <>", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21GreaterThan(Boolean value) {
            addCriterion("levelTeam21 >", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21GreaterThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam21 >=", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21LessThan(Boolean value) {
            addCriterion("levelTeam21 <", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21LessThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam21 <=", value, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21In(List<Boolean> values) {
            addCriterion("levelTeam21 in", values, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21NotIn(List<Boolean> values) {
            addCriterion("levelTeam21 not in", values, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21Between(Boolean value1, Boolean value2) {
            addCriterion("levelTeam21 between", value1, value2, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam21NotBetween(Boolean value1, Boolean value2) {
            addCriterion("levelTeam21 not between", value1, value2, "levelteam21");
            return (Criteria) this;
        }

        public Criteria andLevelteam18IsNull() {
            addCriterion("levelTeam18 is null");
            return (Criteria) this;
        }

        public Criteria andLevelteam18IsNotNull() {
            addCriterion("levelTeam18 is not null");
            return (Criteria) this;
        }

        public Criteria andLevelteam18EqualTo(Boolean value) {
            addCriterion("levelTeam18 =", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18NotEqualTo(Boolean value) {
            addCriterion("levelTeam18 <>", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18GreaterThan(Boolean value) {
            addCriterion("levelTeam18 >", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18GreaterThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam18 >=", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18LessThan(Boolean value) {
            addCriterion("levelTeam18 <", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18LessThanOrEqualTo(Boolean value) {
            addCriterion("levelTeam18 <=", value, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18In(List<Boolean> values) {
            addCriterion("levelTeam18 in", values, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18NotIn(List<Boolean> values) {
            addCriterion("levelTeam18 not in", values, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18Between(Boolean value1, Boolean value2) {
            addCriterion("levelTeam18 between", value1, value2, "levelteam18");
            return (Criteria) this;
        }

        public Criteria andLevelteam18NotBetween(Boolean value1, Boolean value2) {
            addCriterion("levelTeam18 not between", value1, value2, "levelteam18");
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