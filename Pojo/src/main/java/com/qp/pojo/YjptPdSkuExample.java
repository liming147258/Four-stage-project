package com.qp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YjptPdSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YjptPdSkuExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSukidIsNull() {
            addCriterion("SUKID is null");
            return (Criteria) this;
        }

        public Criteria andSukidIsNotNull() {
            addCriterion("SUKID is not null");
            return (Criteria) this;
        }

        public Criteria andSukidEqualTo(Integer value) {
            addCriterion("SUKID =", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidNotEqualTo(Integer value) {
            addCriterion("SUKID <>", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidGreaterThan(Integer value) {
            addCriterion("SUKID >", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUKID >=", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidLessThan(Integer value) {
            addCriterion("SUKID <", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidLessThanOrEqualTo(Integer value) {
            addCriterion("SUKID <=", value, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidIn(List<Integer> values) {
            addCriterion("SUKID in", values, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidNotIn(List<Integer> values) {
            addCriterion("SUKID not in", values, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidBetween(Integer value1, Integer value2) {
            addCriterion("SUKID between", value1, value2, "sukid");
            return (Criteria) this;
        }

        public Criteria andSukidNotBetween(Integer value1, Integer value2) {
            addCriterion("SUKID not between", value1, value2, "sukid");
            return (Criteria) this;
        }

        public Criteria andPvidsIsNull() {
            addCriterion("PVIDS is null");
            return (Criteria) this;
        }

        public Criteria andPvidsIsNotNull() {
            addCriterion("PVIDS is not null");
            return (Criteria) this;
        }

        public Criteria andPvidsEqualTo(String value) {
            addCriterion("PVIDS =", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsNotEqualTo(String value) {
            addCriterion("PVIDS <>", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsGreaterThan(String value) {
            addCriterion("PVIDS >", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsGreaterThanOrEqualTo(String value) {
            addCriterion("PVIDS >=", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsLessThan(String value) {
            addCriterion("PVIDS <", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsLessThanOrEqualTo(String value) {
            addCriterion("PVIDS <=", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsLike(String value) {
            addCriterion("PVIDS like", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsNotLike(String value) {
            addCriterion("PVIDS not like", value, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsIn(List<String> values) {
            addCriterion("PVIDS in", values, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsNotIn(List<String> values) {
            addCriterion("PVIDS not in", values, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsBetween(String value1, String value2) {
            addCriterion("PVIDS between", value1, value2, "pvids");
            return (Criteria) this;
        }

        public Criteria andPvidsNotBetween(String value1, String value2) {
            addCriterion("PVIDS not between", value1, value2, "pvids");
            return (Criteria) this;
        }

        public Criteria andPdidIsNull() {
            addCriterion("PDID is null");
            return (Criteria) this;
        }

        public Criteria andPdidIsNotNull() {
            addCriterion("PDID is not null");
            return (Criteria) this;
        }

        public Criteria andPdidEqualTo(Integer value) {
            addCriterion("PDID =", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotEqualTo(Integer value) {
            addCriterion("PDID <>", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThan(Integer value) {
            addCriterion("PDID >", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PDID >=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThan(Integer value) {
            addCriterion("PDID <", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThanOrEqualTo(Integer value) {
            addCriterion("PDID <=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidIn(List<Integer> values) {
            addCriterion("PDID in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotIn(List<Integer> values) {
            addCriterion("PDID not in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidBetween(Integer value1, Integer value2) {
            addCriterion("PDID between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("PDID not between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("ISENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("ISENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(String value) {
            addCriterion("ISENABLE =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(String value) {
            addCriterion("ISENABLE <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(String value) {
            addCriterion("ISENABLE >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(String value) {
            addCriterion("ISENABLE >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(String value) {
            addCriterion("ISENABLE <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(String value) {
            addCriterion("ISENABLE <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLike(String value) {
            addCriterion("ISENABLE like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotLike(String value) {
            addCriterion("ISENABLE not like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<String> values) {
            addCriterion("ISENABLE in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<String> values) {
            addCriterion("ISENABLE not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(String value1, String value2) {
            addCriterion("ISENABLE between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(String value1, String value2) {
            addCriterion("ISENABLE not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andCreatetorIsNull() {
            addCriterion("CREATETOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatetorIsNotNull() {
            addCriterion("CREATETOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetorEqualTo(String value) {
            addCriterion("CREATETOR =", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotEqualTo(String value) {
            addCriterion("CREATETOR <>", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorGreaterThan(String value) {
            addCriterion("CREATETOR >", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETOR >=", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLessThan(String value) {
            addCriterion("CREATETOR <", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLessThanOrEqualTo(String value) {
            addCriterion("CREATETOR <=", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLike(String value) {
            addCriterion("CREATETOR like", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotLike(String value) {
            addCriterion("CREATETOR not like", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorIn(List<String> values) {
            addCriterion("CREATETOR in", values, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotIn(List<String> values) {
            addCriterion("CREATETOR not in", values, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorBetween(String value1, String value2) {
            addCriterion("CREATETOR between", value1, value2, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotBetween(String value1, String value2) {
            addCriterion("CREATETOR not between", value1, value2, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("VOLUME =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("VOLUME <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("VOLUME >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("VOLUME <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("VOLUME in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("VOLUME not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeIsNull() {
            addCriterion("PACKVOLUME is null");
            return (Criteria) this;
        }

        public Criteria andPackvolumeIsNotNull() {
            addCriterion("PACKVOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andPackvolumeEqualTo(BigDecimal value) {
            addCriterion("PACKVOLUME =", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeNotEqualTo(BigDecimal value) {
            addCriterion("PACKVOLUME <>", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeGreaterThan(BigDecimal value) {
            addCriterion("PACKVOLUME >", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKVOLUME >=", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeLessThan(BigDecimal value) {
            addCriterion("PACKVOLUME <", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKVOLUME <=", value, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeIn(List<BigDecimal> values) {
            addCriterion("PACKVOLUME in", values, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeNotIn(List<BigDecimal> values) {
            addCriterion("PACKVOLUME not in", values, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKVOLUME between", value1, value2, "packvolume");
            return (Criteria) this;
        }

        public Criteria andPackvolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKVOLUME not between", value1, value2, "packvolume");
            return (Criteria) this;
        }

        public Criteria andDisamountIsNull() {
            addCriterion("DISAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDisamountIsNotNull() {
            addCriterion("DISAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDisamountEqualTo(BigDecimal value) {
            addCriterion("DISAMOUNT =", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountNotEqualTo(BigDecimal value) {
            addCriterion("DISAMOUNT <>", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountGreaterThan(BigDecimal value) {
            addCriterion("DISAMOUNT >", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISAMOUNT >=", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountLessThan(BigDecimal value) {
            addCriterion("DISAMOUNT <", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISAMOUNT <=", value, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountIn(List<BigDecimal> values) {
            addCriterion("DISAMOUNT in", values, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountNotIn(List<BigDecimal> values) {
            addCriterion("DISAMOUNT not in", values, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISAMOUNT between", value1, value2, "disamount");
            return (Criteria) this;
        }

        public Criteria andDisamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISAMOUNT not between", value1, value2, "disamount");
            return (Criteria) this;
        }

        public Criteria andLongsIsNull() {
            addCriterion("LONGS is null");
            return (Criteria) this;
        }

        public Criteria andLongsIsNotNull() {
            addCriterion("LONGS is not null");
            return (Criteria) this;
        }

        public Criteria andLongsEqualTo(BigDecimal value) {
            addCriterion("LONGS =", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsNotEqualTo(BigDecimal value) {
            addCriterion("LONGS <>", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsGreaterThan(BigDecimal value) {
            addCriterion("LONGS >", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGS >=", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsLessThan(BigDecimal value) {
            addCriterion("LONGS <", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGS <=", value, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsIn(List<BigDecimal> values) {
            addCriterion("LONGS in", values, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsNotIn(List<BigDecimal> values) {
            addCriterion("LONGS not in", values, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGS between", value1, value2, "longs");
            return (Criteria) this;
        }

        public Criteria andLongsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGS not between", value1, value2, "longs");
            return (Criteria) this;
        }

        public Criteria andWideIsNull() {
            addCriterion("WIDE is null");
            return (Criteria) this;
        }

        public Criteria andWideIsNotNull() {
            addCriterion("WIDE is not null");
            return (Criteria) this;
        }

        public Criteria andWideEqualTo(BigDecimal value) {
            addCriterion("WIDE =", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideNotEqualTo(BigDecimal value) {
            addCriterion("WIDE <>", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideGreaterThan(BigDecimal value) {
            addCriterion("WIDE >", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDE >=", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideLessThan(BigDecimal value) {
            addCriterion("WIDE <", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDE <=", value, "wide");
            return (Criteria) this;
        }

        public Criteria andWideIn(List<BigDecimal> values) {
            addCriterion("WIDE in", values, "wide");
            return (Criteria) this;
        }

        public Criteria andWideNotIn(List<BigDecimal> values) {
            addCriterion("WIDE not in", values, "wide");
            return (Criteria) this;
        }

        public Criteria andWideBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDE between", value1, value2, "wide");
            return (Criteria) this;
        }

        public Criteria andWideNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDE not between", value1, value2, "wide");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andPacknumIsNull() {
            addCriterion("PACKNUM is null");
            return (Criteria) this;
        }

        public Criteria andPacknumIsNotNull() {
            addCriterion("PACKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPacknumEqualTo(Integer value) {
            addCriterion("PACKNUM =", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumNotEqualTo(Integer value) {
            addCriterion("PACKNUM <>", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumGreaterThan(Integer value) {
            addCriterion("PACKNUM >", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACKNUM >=", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumLessThan(Integer value) {
            addCriterion("PACKNUM <", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumLessThanOrEqualTo(Integer value) {
            addCriterion("PACKNUM <=", value, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumIn(List<Integer> values) {
            addCriterion("PACKNUM in", values, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumNotIn(List<Integer> values) {
            addCriterion("PACKNUM not in", values, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumBetween(Integer value1, Integer value2) {
            addCriterion("PACKNUM between", value1, value2, "packnum");
            return (Criteria) this;
        }

        public Criteria andPacknumNotBetween(Integer value1, Integer value2) {
            addCriterion("PACKNUM not between", value1, value2, "packnum");
            return (Criteria) this;
        }

        public Criteria andProjectamoutIsNull() {
            addCriterion("PROJECTAMOUT is null");
            return (Criteria) this;
        }

        public Criteria andProjectamoutIsNotNull() {
            addCriterion("PROJECTAMOUT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectamoutEqualTo(BigDecimal value) {
            addCriterion("PROJECTAMOUT =", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutNotEqualTo(BigDecimal value) {
            addCriterion("PROJECTAMOUT <>", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutGreaterThan(BigDecimal value) {
            addCriterion("PROJECTAMOUT >", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECTAMOUT >=", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutLessThan(BigDecimal value) {
            addCriterion("PROJECTAMOUT <", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECTAMOUT <=", value, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutIn(List<BigDecimal> values) {
            addCriterion("PROJECTAMOUT in", values, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutNotIn(List<BigDecimal> values) {
            addCriterion("PROJECTAMOUT not in", values, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECTAMOUT between", value1, value2, "projectamout");
            return (Criteria) this;
        }

        public Criteria andProjectamoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECTAMOUT not between", value1, value2, "projectamout");
            return (Criteria) this;
        }

        public Criteria andMsamountIsNull() {
            addCriterion("MSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMsamountIsNotNull() {
            addCriterion("MSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMsamountEqualTo(BigDecimal value) {
            addCriterion("MSAMOUNT =", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountNotEqualTo(BigDecimal value) {
            addCriterion("MSAMOUNT <>", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountGreaterThan(BigDecimal value) {
            addCriterion("MSAMOUNT >", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MSAMOUNT >=", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountLessThan(BigDecimal value) {
            addCriterion("MSAMOUNT <", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MSAMOUNT <=", value, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountIn(List<BigDecimal> values) {
            addCriterion("MSAMOUNT in", values, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountNotIn(List<BigDecimal> values) {
            addCriterion("MSAMOUNT not in", values, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MSAMOUNT between", value1, value2, "msamount");
            return (Criteria) this;
        }

        public Criteria andMsamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MSAMOUNT not between", value1, value2, "msamount");
            return (Criteria) this;
        }

        public Criteria andPackweightIsNull() {
            addCriterion("PACKWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPackweightIsNotNull() {
            addCriterion("PACKWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPackweightEqualTo(BigDecimal value) {
            addCriterion("PACKWEIGHT =", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightNotEqualTo(BigDecimal value) {
            addCriterion("PACKWEIGHT <>", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightGreaterThan(BigDecimal value) {
            addCriterion("PACKWEIGHT >", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKWEIGHT >=", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightLessThan(BigDecimal value) {
            addCriterion("PACKWEIGHT <", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKWEIGHT <=", value, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightIn(List<BigDecimal> values) {
            addCriterion("PACKWEIGHT in", values, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightNotIn(List<BigDecimal> values) {
            addCriterion("PACKWEIGHT not in", values, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKWEIGHT between", value1, value2, "packweight");
            return (Criteria) this;
        }

        public Criteria andPackweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKWEIGHT not between", value1, value2, "packweight");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNull() {
            addCriterion("STYLEID is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("STYLEID is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(Integer value) {
            addCriterion("STYLEID =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(Integer value) {
            addCriterion("STYLEID <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(Integer value) {
            addCriterion("STYLEID >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("STYLEID >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(Integer value) {
            addCriterion("STYLEID <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(Integer value) {
            addCriterion("STYLEID <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<Integer> values) {
            addCriterion("STYLEID in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<Integer> values) {
            addCriterion("STYLEID not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(Integer value1, Integer value2) {
            addCriterion("STYLEID between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("STYLEID not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andProductmegIsNull() {
            addCriterion("PRODUCTMEG is null");
            return (Criteria) this;
        }

        public Criteria andProductmegIsNotNull() {
            addCriterion("PRODUCTMEG is not null");
            return (Criteria) this;
        }

        public Criteria andProductmegEqualTo(String value) {
            addCriterion("PRODUCTMEG =", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegNotEqualTo(String value) {
            addCriterion("PRODUCTMEG <>", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegGreaterThan(String value) {
            addCriterion("PRODUCTMEG >", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTMEG >=", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegLessThan(String value) {
            addCriterion("PRODUCTMEG <", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTMEG <=", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegLike(String value) {
            addCriterion("PRODUCTMEG like", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegNotLike(String value) {
            addCriterion("PRODUCTMEG not like", value, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegIn(List<String> values) {
            addCriterion("PRODUCTMEG in", values, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegNotIn(List<String> values) {
            addCriterion("PRODUCTMEG not in", values, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegBetween(String value1, String value2) {
            addCriterion("PRODUCTMEG between", value1, value2, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductmegNotBetween(String value1, String value2) {
            addCriterion("PRODUCTMEG not between", value1, value2, "productmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegIsNull() {
            addCriterion("PRODUCTJMEG is null");
            return (Criteria) this;
        }

        public Criteria andProductjmegIsNotNull() {
            addCriterion("PRODUCTJMEG is not null");
            return (Criteria) this;
        }

        public Criteria andProductjmegEqualTo(String value) {
            addCriterion("PRODUCTJMEG =", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegNotEqualTo(String value) {
            addCriterion("PRODUCTJMEG <>", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegGreaterThan(String value) {
            addCriterion("PRODUCTJMEG >", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTJMEG >=", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegLessThan(String value) {
            addCriterion("PRODUCTJMEG <", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTJMEG <=", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegLike(String value) {
            addCriterion("PRODUCTJMEG like", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegNotLike(String value) {
            addCriterion("PRODUCTJMEG not like", value, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegIn(List<String> values) {
            addCriterion("PRODUCTJMEG in", values, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegNotIn(List<String> values) {
            addCriterion("PRODUCTJMEG not in", values, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegBetween(String value1, String value2) {
            addCriterion("PRODUCTJMEG between", value1, value2, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andProductjmegNotBetween(String value1, String value2) {
            addCriterion("PRODUCTJMEG not between", value1, value2, "productjmeg");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPdstylenameIsNull() {
            addCriterion("PDSTYLENAME is null");
            return (Criteria) this;
        }

        public Criteria andPdstylenameIsNotNull() {
            addCriterion("PDSTYLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPdstylenameEqualTo(String value) {
            addCriterion("PDSTYLENAME =", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameNotEqualTo(String value) {
            addCriterion("PDSTYLENAME <>", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameGreaterThan(String value) {
            addCriterion("PDSTYLENAME >", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameGreaterThanOrEqualTo(String value) {
            addCriterion("PDSTYLENAME >=", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameLessThan(String value) {
            addCriterion("PDSTYLENAME <", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameLessThanOrEqualTo(String value) {
            addCriterion("PDSTYLENAME <=", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameLike(String value) {
            addCriterion("PDSTYLENAME like", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameNotLike(String value) {
            addCriterion("PDSTYLENAME not like", value, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameIn(List<String> values) {
            addCriterion("PDSTYLENAME in", values, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameNotIn(List<String> values) {
            addCriterion("PDSTYLENAME not in", values, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameBetween(String value1, String value2) {
            addCriterion("PDSTYLENAME between", value1, value2, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andPdstylenameNotBetween(String value1, String value2) {
            addCriterion("PDSTYLENAME not between", value1, value2, "pdstylename");
            return (Criteria) this;
        }

        public Criteria andListdateIsNull() {
            addCriterion("LISTDATE is null");
            return (Criteria) this;
        }

        public Criteria andListdateIsNotNull() {
            addCriterion("LISTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andListdateEqualTo(Date value) {
            addCriterionForJDBCDate("LISTDATE =", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LISTDATE <>", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateGreaterThan(Date value) {
            addCriterionForJDBCDate("LISTDATE >", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LISTDATE >=", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateLessThan(Date value) {
            addCriterionForJDBCDate("LISTDATE <", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LISTDATE <=", value, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateIn(List<Date> values) {
            addCriterionForJDBCDate("LISTDATE in", values, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LISTDATE not in", values, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LISTDATE between", value1, value2, "listdate");
            return (Criteria) this;
        }

        public Criteria andListdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LISTDATE not between", value1, value2, "listdate");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINDATE =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINDATE <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("BEGINDATE >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINDATE >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterionForJDBCDate("BEGINDATE <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINDATE <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterionForJDBCDate("BEGINDATE in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BEGINDATE not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGINDATE between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGINDATE not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDDATE not between", value1, value2, "enddate");
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