package dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMatchExample() {
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

        public Criteria andClubId1IsNull() {
            addCriterion("club_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andClubId1IsNotNull() {
            addCriterion("club_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andClubId1EqualTo(Long value) {
            addCriterion("club_id_1 =", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1NotEqualTo(Long value) {
            addCriterion("club_id_1 <>", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1GreaterThan(Long value) {
            addCriterion("club_id_1 >", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1GreaterThanOrEqualTo(Long value) {
            addCriterion("club_id_1 >=", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1LessThan(Long value) {
            addCriterion("club_id_1 <", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1LessThanOrEqualTo(Long value) {
            addCriterion("club_id_1 <=", value, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1In(List<Long> values) {
            addCriterion("club_id_1 in", values, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1NotIn(List<Long> values) {
            addCriterion("club_id_1 not in", values, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1Between(Long value1, Long value2) {
            addCriterion("club_id_1 between", value1, value2, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId1NotBetween(Long value1, Long value2) {
            addCriterion("club_id_1 not between", value1, value2, "clubId1");
            return (Criteria) this;
        }

        public Criteria andClubId2IsNull() {
            addCriterion("club_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andClubId2IsNotNull() {
            addCriterion("club_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andClubId2EqualTo(Long value) {
            addCriterion("club_id_2 =", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2NotEqualTo(Long value) {
            addCriterion("club_id_2 <>", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2GreaterThan(Long value) {
            addCriterion("club_id_2 >", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2GreaterThanOrEqualTo(Long value) {
            addCriterion("club_id_2 >=", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2LessThan(Long value) {
            addCriterion("club_id_2 <", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2LessThanOrEqualTo(Long value) {
            addCriterion("club_id_2 <=", value, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2In(List<Long> values) {
            addCriterion("club_id_2 in", values, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2NotIn(List<Long> values) {
            addCriterion("club_id_2 not in", values, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2Between(Long value1, Long value2) {
            addCriterion("club_id_2 between", value1, value2, "clubId2");
            return (Criteria) this;
        }

        public Criteria andClubId2NotBetween(Long value1, Long value2) {
            addCriterion("club_id_2 not between", value1, value2, "clubId2");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNull() {
            addCriterion("match_time is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNotNull() {
            addCriterion("match_time is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEqualTo(Long value) {
            addCriterion("match_time =", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotEqualTo(Long value) {
            addCriterion("match_time <>", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThan(Long value) {
            addCriterion("match_time >", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("match_time >=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThan(Long value) {
            addCriterion("match_time <", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThanOrEqualTo(Long value) {
            addCriterion("match_time <=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIn(List<Long> values) {
            addCriterion("match_time in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotIn(List<Long> values) {
            addCriterion("match_time not in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeBetween(Long value1, Long value2) {
            addCriterion("match_time between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotBetween(Long value1, Long value2) {
            addCriterion("match_time not between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andClubName1IsNull() {
            addCriterion("club_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andClubName1IsNotNull() {
            addCriterion("club_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andClubName1EqualTo(String value) {
            addCriterion("club_name_1 =", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1NotEqualTo(String value) {
            addCriterion("club_name_1 <>", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1GreaterThan(String value) {
            addCriterion("club_name_1 >", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1GreaterThanOrEqualTo(String value) {
            addCriterion("club_name_1 >=", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1LessThan(String value) {
            addCriterion("club_name_1 <", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1LessThanOrEqualTo(String value) {
            addCriterion("club_name_1 <=", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1Like(String value) {
            addCriterion("club_name_1 like", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1NotLike(String value) {
            addCriterion("club_name_1 not like", value, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1In(List<String> values) {
            addCriterion("club_name_1 in", values, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1NotIn(List<String> values) {
            addCriterion("club_name_1 not in", values, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1Between(String value1, String value2) {
            addCriterion("club_name_1 between", value1, value2, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName1NotBetween(String value1, String value2) {
            addCriterion("club_name_1 not between", value1, value2, "clubName1");
            return (Criteria) this;
        }

        public Criteria andClubName2IsNull() {
            addCriterion("club_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andClubName2IsNotNull() {
            addCriterion("club_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andClubName2EqualTo(String value) {
            addCriterion("club_name_2 =", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2NotEqualTo(String value) {
            addCriterion("club_name_2 <>", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2GreaterThan(String value) {
            addCriterion("club_name_2 >", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2GreaterThanOrEqualTo(String value) {
            addCriterion("club_name_2 >=", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2LessThan(String value) {
            addCriterion("club_name_2 <", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2LessThanOrEqualTo(String value) {
            addCriterion("club_name_2 <=", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2Like(String value) {
            addCriterion("club_name_2 like", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2NotLike(String value) {
            addCriterion("club_name_2 not like", value, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2In(List<String> values) {
            addCriterion("club_name_2 in", values, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2NotIn(List<String> values) {
            addCriterion("club_name_2 not in", values, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2Between(String value1, String value2) {
            addCriterion("club_name_2 between", value1, value2, "clubName2");
            return (Criteria) this;
        }

        public Criteria andClubName2NotBetween(String value1, String value2) {
            addCriterion("club_name_2 not between", value1, value2, "clubName2");
            return (Criteria) this;
        }

        public Criteria andScoreMatchIsNull() {
            addCriterion("score_match is null");
            return (Criteria) this;
        }

        public Criteria andScoreMatchIsNotNull() {
            addCriterion("score_match is not null");
            return (Criteria) this;
        }

        public Criteria andScoreMatchEqualTo(String value) {
            addCriterion("score_match =", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchNotEqualTo(String value) {
            addCriterion("score_match <>", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchGreaterThan(String value) {
            addCriterion("score_match >", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchGreaterThanOrEqualTo(String value) {
            addCriterion("score_match >=", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchLessThan(String value) {
            addCriterion("score_match <", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchLessThanOrEqualTo(String value) {
            addCriterion("score_match <=", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchLike(String value) {
            addCriterion("score_match like", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchNotLike(String value) {
            addCriterion("score_match not like", value, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchIn(List<String> values) {
            addCriterion("score_match in", values, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchNotIn(List<String> values) {
            addCriterion("score_match not in", values, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchBetween(String value1, String value2) {
            addCriterion("score_match between", value1, value2, "scoreMatch");
            return (Criteria) this;
        }

        public Criteria andScoreMatchNotBetween(String value1, String value2) {
            addCriterion("score_match not between", value1, value2, "scoreMatch");
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