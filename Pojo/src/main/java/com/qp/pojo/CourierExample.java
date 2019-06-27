package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CourierExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andCourieridIsNull() {
            addCriterion("COURIERID is null");
            return (Criteria) this;
        }

        public Criteria andCourieridIsNotNull() {
            addCriterion("COURIERID is not null");
            return (Criteria) this;
        }

        public Criteria andCourieridEqualTo(Integer value) {
            addCriterion("COURIERID =", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridNotEqualTo(Integer value) {
            addCriterion("COURIERID <>", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridGreaterThan(Integer value) {
            addCriterion("COURIERID >", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURIERID >=", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridLessThan(Integer value) {
            addCriterion("COURIERID <", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridLessThanOrEqualTo(Integer value) {
            addCriterion("COURIERID <=", value, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridIn(List<Integer> values) {
            addCriterion("COURIERID in", values, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridNotIn(List<Integer> values) {
            addCriterion("COURIERID not in", values, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridBetween(Integer value1, Integer value2) {
            addCriterion("COURIERID between", value1, value2, "courierid");
            return (Criteria) this;
        }

        public Criteria andCourieridNotBetween(Integer value1, Integer value2) {
            addCriterion("COURIERID not between", value1, value2, "courierid");
            return (Criteria) this;
        }

        public Criteria andCouriernameIsNull() {
            addCriterion("COURIERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCouriernameIsNotNull() {
            addCriterion("COURIERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCouriernameEqualTo(String value) {
            addCriterion("COURIERNAME =", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotEqualTo(String value) {
            addCriterion("COURIERNAME <>", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameGreaterThan(String value) {
            addCriterion("COURIERNAME >", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameGreaterThanOrEqualTo(String value) {
            addCriterion("COURIERNAME >=", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLessThan(String value) {
            addCriterion("COURIERNAME <", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLessThanOrEqualTo(String value) {
            addCriterion("COURIERNAME <=", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameLike(String value) {
            addCriterion("COURIERNAME like", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotLike(String value) {
            addCriterion("COURIERNAME not like", value, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameIn(List<String> values) {
            addCriterion("COURIERNAME in", values, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotIn(List<String> values) {
            addCriterion("COURIERNAME not in", values, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameBetween(String value1, String value2) {
            addCriterion("COURIERNAME between", value1, value2, "couriername");
            return (Criteria) this;
        }

        public Criteria andCouriernameNotBetween(String value1, String value2) {
            addCriterion("COURIERNAME not between", value1, value2, "couriername");
            return (Criteria) this;
        }
    }

    /**
     */
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