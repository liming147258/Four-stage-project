package com.qp.pojo;

import java.util.ArrayList;
import java.util.List;

public class CodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CodeExample() {
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

        public Criteria andCodeidIsNull() {
            addCriterion("CODEID is null");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNotNull() {
            addCriterion("CODEID is not null");
            return (Criteria) this;
        }

        public Criteria andCodeidEqualTo(Integer value) {
            addCriterion("CODEID =", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotEqualTo(Integer value) {
            addCriterion("CODEID <>", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThan(Integer value) {
            addCriterion("CODEID >", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CODEID >=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThan(Integer value) {
            addCriterion("CODEID <", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThanOrEqualTo(Integer value) {
            addCriterion("CODEID <=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidIn(List<Integer> values) {
            addCriterion("CODEID in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotIn(List<Integer> values) {
            addCriterion("CODEID not in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidBetween(Integer value1, Integer value2) {
            addCriterion("CODEID between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("CODEID not between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodenumberIsNull() {
            addCriterion("CODENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCodenumberIsNotNull() {
            addCriterion("CODENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCodenumberEqualTo(String value) {
            addCriterion("CODENUMBER =", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotEqualTo(String value) {
            addCriterion("CODENUMBER <>", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberGreaterThan(String value) {
            addCriterion("CODENUMBER >", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CODENUMBER >=", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLessThan(String value) {
            addCriterion("CODENUMBER <", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLessThanOrEqualTo(String value) {
            addCriterion("CODENUMBER <=", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLike(String value) {
            addCriterion("CODENUMBER like", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotLike(String value) {
            addCriterion("CODENUMBER not like", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberIn(List<String> values) {
            addCriterion("CODENUMBER in", values, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotIn(List<String> values) {
            addCriterion("CODENUMBER not in", values, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberBetween(String value1, String value2) {
            addCriterion("CODENUMBER between", value1, value2, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotBetween(String value1, String value2) {
            addCriterion("CODENUMBER not between", value1, value2, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNull() {
            addCriterion("CODENAME is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("CODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("CODENAME =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("CODENAME <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("CODENAME >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("CODENAME >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("CODENAME <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("CODENAME <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("CODENAME like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("CODENAME not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("CODENAME in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("CODENAME not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("CODENAME between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("CODENAME not between", value1, value2, "codename");
            return (Criteria) this;
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