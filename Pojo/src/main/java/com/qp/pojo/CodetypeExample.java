package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CodetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CodetypeExample() {
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

        public Criteria andCodetypeidIsNull() {
            addCriterion("CODETYPEID is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeidIsNotNull() {
            addCriterion("CODETYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeidEqualTo(Integer value) {
            addCriterion("CODETYPEID =", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotEqualTo(Integer value) {
            addCriterion("CODETYPEID <>", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidGreaterThan(Integer value) {
            addCriterion("CODETYPEID >", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CODETYPEID >=", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidLessThan(Integer value) {
            addCriterion("CODETYPEID <", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("CODETYPEID <=", value, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidIn(List<Integer> values) {
            addCriterion("CODETYPEID in", values, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotIn(List<Integer> values) {
            addCriterion("CODETYPEID not in", values, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidBetween(Integer value1, Integer value2) {
            addCriterion("CODETYPEID between", value1, value2, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("CODETYPEID not between", value1, value2, "codetypeid");
            return (Criteria) this;
        }

        public Criteria andCodetypenameIsNull() {
            addCriterion("CODETYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andCodetypenameIsNotNull() {
            addCriterion("CODETYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypenameEqualTo(String value) {
            addCriterion("CODETYPENAME =", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameNotEqualTo(String value) {
            addCriterion("CODETYPENAME <>", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameGreaterThan(String value) {
            addCriterion("CODETYPENAME >", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("CODETYPENAME >=", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameLessThan(String value) {
            addCriterion("CODETYPENAME <", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameLessThanOrEqualTo(String value) {
            addCriterion("CODETYPENAME <=", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameLike(String value) {
            addCriterion("CODETYPENAME like", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameNotLike(String value) {
            addCriterion("CODETYPENAME not like", value, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameIn(List<String> values) {
            addCriterion("CODETYPENAME in", values, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameNotIn(List<String> values) {
            addCriterion("CODETYPENAME not in", values, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameBetween(String value1, String value2) {
            addCriterion("CODETYPENAME between", value1, value2, "codetypename");
            return (Criteria) this;
        }

        public Criteria andCodetypenameNotBetween(String value1, String value2) {
            addCriterion("CODETYPENAME not between", value1, value2, "codetypename");
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