package com.qp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjptPsSalesorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YjptPsSalesorderExample() {
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

        public Criteria andSoidIsNull() {
            addCriterion("SOID is null");
            return (Criteria) this;
        }

        public Criteria andSoidIsNotNull() {
            addCriterion("SOID is not null");
            return (Criteria) this;
        }

        public Criteria andSoidEqualTo(Integer value) {
            addCriterion("SOID =", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotEqualTo(Integer value) {
            addCriterion("SOID <>", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThan(Integer value) {
            addCriterion("SOID >", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOID >=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThan(Integer value) {
            addCriterion("SOID <", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThanOrEqualTo(Integer value) {
            addCriterion("SOID <=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidIn(List<Integer> values) {
            addCriterion("SOID in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotIn(List<Integer> values) {
            addCriterion("SOID not in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidBetween(Integer value1, Integer value2) {
            addCriterion("SOID between", value1, value2, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotBetween(Integer value1, Integer value2) {
            addCriterion("SOID not between", value1, value2, "soid");
            return (Criteria) this;
        }

        public Criteria andSordernoIsNull() {
            addCriterion("SORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andSordernoIsNotNull() {
            addCriterion("SORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andSordernoEqualTo(String value) {
            addCriterion("SORDERNO =", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoNotEqualTo(String value) {
            addCriterion("SORDERNO <>", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoGreaterThan(String value) {
            addCriterion("SORDERNO >", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoGreaterThanOrEqualTo(String value) {
            addCriterion("SORDERNO >=", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoLessThan(String value) {
            addCriterion("SORDERNO <", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoLessThanOrEqualTo(String value) {
            addCriterion("SORDERNO <=", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoLike(String value) {
            addCriterion("SORDERNO like", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoNotLike(String value) {
            addCriterion("SORDERNO not like", value, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoIn(List<String> values) {
            addCriterion("SORDERNO in", values, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoNotIn(List<String> values) {
            addCriterion("SORDERNO not in", values, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoBetween(String value1, String value2) {
            addCriterion("SORDERNO between", value1, value2, "sorderno");
            return (Criteria) this;
        }

        public Criteria andSordernoNotBetween(String value1, String value2) {
            addCriterion("SORDERNO not between", value1, value2, "sorderno");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNull() {
            addCriterion("REGIONID is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("REGIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(Integer value) {
            addCriterion("REGIONID =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(Integer value) {
            addCriterion("REGIONID <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(Integer value) {
            addCriterion("REGIONID >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGIONID >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(Integer value) {
            addCriterion("REGIONID <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(Integer value) {
            addCriterion("REGIONID <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<Integer> values) {
            addCriterion("REGIONID in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<Integer> values) {
            addCriterion("REGIONID not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(Integer value1, Integer value2) {
            addCriterion("REGIONID between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(Integer value1, Integer value2) {
            addCriterion("REGIONID not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRenovationidIsNull() {
            addCriterion("RENOVATIONID is null");
            return (Criteria) this;
        }

        public Criteria andRenovationidIsNotNull() {
            addCriterion("RENOVATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRenovationidEqualTo(Integer value) {
            addCriterion("RENOVATIONID =", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidNotEqualTo(Integer value) {
            addCriterion("RENOVATIONID <>", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidGreaterThan(Integer value) {
            addCriterion("RENOVATIONID >", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENOVATIONID >=", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidLessThan(Integer value) {
            addCriterion("RENOVATIONID <", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidLessThanOrEqualTo(Integer value) {
            addCriterion("RENOVATIONID <=", value, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidIn(List<Integer> values) {
            addCriterion("RENOVATIONID in", values, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidNotIn(List<Integer> values) {
            addCriterion("RENOVATIONID not in", values, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidBetween(Integer value1, Integer value2) {
            addCriterion("RENOVATIONID between", value1, value2, "renovationid");
            return (Criteria) this;
        }

        public Criteria andRenovationidNotBetween(Integer value1, Integer value2) {
            addCriterion("RENOVATIONID not between", value1, value2, "renovationid");
            return (Criteria) this;
        }

        public Criteria andDesignidIsNull() {
            addCriterion("DESIGNID is null");
            return (Criteria) this;
        }

        public Criteria andDesignidIsNotNull() {
            addCriterion("DESIGNID is not null");
            return (Criteria) this;
        }

        public Criteria andDesignidEqualTo(Integer value) {
            addCriterion("DESIGNID =", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotEqualTo(Integer value) {
            addCriterion("DESIGNID <>", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThan(Integer value) {
            addCriterion("DESIGNID >", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DESIGNID >=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThan(Integer value) {
            addCriterion("DESIGNID <", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThanOrEqualTo(Integer value) {
            addCriterion("DESIGNID <=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidIn(List<Integer> values) {
            addCriterion("DESIGNID in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotIn(List<Integer> values) {
            addCriterion("DESIGNID not in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidBetween(Integer value1, Integer value2) {
            addCriterion("DESIGNID between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotBetween(Integer value1, Integer value2) {
            addCriterion("DESIGNID not between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andAfteridIsNull() {
            addCriterion("AFTERID is null");
            return (Criteria) this;
        }

        public Criteria andAfteridIsNotNull() {
            addCriterion("AFTERID is not null");
            return (Criteria) this;
        }

        public Criteria andAfteridEqualTo(Integer value) {
            addCriterion("AFTERID =", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridNotEqualTo(Integer value) {
            addCriterion("AFTERID <>", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridGreaterThan(Integer value) {
            addCriterion("AFTERID >", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("AFTERID >=", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridLessThan(Integer value) {
            addCriterion("AFTERID <", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridLessThanOrEqualTo(Integer value) {
            addCriterion("AFTERID <=", value, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridIn(List<Integer> values) {
            addCriterion("AFTERID in", values, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridNotIn(List<Integer> values) {
            addCriterion("AFTERID not in", values, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridBetween(Integer value1, Integer value2) {
            addCriterion("AFTERID between", value1, value2, "afterid");
            return (Criteria) this;
        }

        public Criteria andAfteridNotBetween(Integer value1, Integer value2) {
            addCriterion("AFTERID not between", value1, value2, "afterid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidIsNull() {
            addCriterion("SALESCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidIsNotNull() {
            addCriterion("SALESCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidEqualTo(String value) {
            addCriterion("SALESCOMPANYID =", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotEqualTo(String value) {
            addCriterion("SALESCOMPANYID <>", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidGreaterThan(String value) {
            addCriterion("SALESCOMPANYID >", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("SALESCOMPANYID >=", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidLessThan(String value) {
            addCriterion("SALESCOMPANYID <", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidLessThanOrEqualTo(String value) {
            addCriterion("SALESCOMPANYID <=", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidLike(String value) {
            addCriterion("SALESCOMPANYID like", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotLike(String value) {
            addCriterion("SALESCOMPANYID not like", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidIn(List<String> values) {
            addCriterion("SALESCOMPANYID in", values, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotIn(List<String> values) {
            addCriterion("SALESCOMPANYID not in", values, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidBetween(String value1, String value2) {
            addCriterion("SALESCOMPANYID between", value1, value2, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotBetween(String value1, String value2) {
            addCriterion("SALESCOMPANYID not between", value1, value2, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNull() {
            addCriterion("SALEID is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("SALEID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Integer value) {
            addCriterion("SALEID =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Integer value) {
            addCriterion("SALEID <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Integer value) {
            addCriterion("SALEID >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALEID >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Integer value) {
            addCriterion("SALEID <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Integer value) {
            addCriterion("SALEID <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Integer> values) {
            addCriterion("SALEID in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Integer> values) {
            addCriterion("SALEID not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Integer value1, Integer value2) {
            addCriterion("SALEID between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("SALEID not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("OWNERID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("OWNERID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("OWNERID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("OWNERID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("OWNERID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNERID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("OWNERID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("OWNERID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("OWNERID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("OWNERID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("OWNERID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNERID not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("WORKID is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("WORKID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("WORKID =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("WORKID <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("WORKID >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKID >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("WORKID <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("WORKID <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("WORKID in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("WORKID not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("WORKID between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKID not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidIsNull() {
            addCriterion("PROPERTIESID is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesidIsNotNull() {
            addCriterion("PROPERTIESID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesidEqualTo(Integer value) {
            addCriterion("PROPERTIESID =", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidNotEqualTo(Integer value) {
            addCriterion("PROPERTIESID <>", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidGreaterThan(Integer value) {
            addCriterion("PROPERTIESID >", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROPERTIESID >=", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidLessThan(Integer value) {
            addCriterion("PROPERTIESID <", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidLessThanOrEqualTo(Integer value) {
            addCriterion("PROPERTIESID <=", value, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidIn(List<Integer> values) {
            addCriterion("PROPERTIESID in", values, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidNotIn(List<Integer> values) {
            addCriterion("PROPERTIESID not in", values, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTIESID between", value1, value2, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andPropertiesidNotBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTIESID not between", value1, value2, "propertiesid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNull() {
            addCriterion("BUILDINGID is null");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNotNull() {
            addCriterion("BUILDINGID is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingidEqualTo(Integer value) {
            addCriterion("BUILDINGID =", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotEqualTo(Integer value) {
            addCriterion("BUILDINGID <>", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThan(Integer value) {
            addCriterion("BUILDINGID >", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUILDINGID >=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThan(Integer value) {
            addCriterion("BUILDINGID <", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThanOrEqualTo(Integer value) {
            addCriterion("BUILDINGID <=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIn(List<Integer> values) {
            addCriterion("BUILDINGID in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotIn(List<Integer> values) {
            addCriterion("BUILDINGID not in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidBetween(Integer value1, Integer value2) {
            addCriterion("BUILDINGID between", value1, value2, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotBetween(Integer value1, Integer value2) {
            addCriterion("BUILDINGID not between", value1, value2, "buildingid");
            return (Criteria) this;
        }

        public Criteria andDepositamountIsNull() {
            addCriterion("DEPOSITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDepositamountIsNotNull() {
            addCriterion("DEPOSITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositamountEqualTo(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT =", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT <>", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountGreaterThan(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT >", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT >=", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountLessThan(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT <", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITAMOUNT <=", value, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountIn(List<BigDecimal> values) {
            addCriterion("DEPOSITAMOUNT in", values, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSITAMOUNT not in", values, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITAMOUNT between", value1, value2, "depositamount");
            return (Criteria) this;
        }

        public Criteria andDepositamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITAMOUNT not between", value1, value2, "depositamount");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("PAYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("PAYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(String value) {
            addCriterion("PAYSTATE =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(String value) {
            addCriterion("PAYSTATE <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(String value) {
            addCriterion("PAYSTATE >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYSTATE >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(String value) {
            addCriterion("PAYSTATE <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(String value) {
            addCriterion("PAYSTATE <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLike(String value) {
            addCriterion("PAYSTATE like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotLike(String value) {
            addCriterion("PAYSTATE not like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<String> values) {
            addCriterion("PAYSTATE in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<String> values) {
            addCriterion("PAYSTATE not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(String value1, String value2) {
            addCriterion("PAYSTATE between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(String value1, String value2) {
            addCriterion("PAYSTATE not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("PAYTIME is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("PAYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("PAYTIME =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("PAYTIME <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("PAYTIME >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYTIME >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("PAYTIME <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("PAYTIME <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("PAYTIME in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("PAYTIME not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("PAYTIME between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("PAYTIME not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("AUDITSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("AUDITSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(String value) {
            addCriterion("AUDITSTATE =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(String value) {
            addCriterion("AUDITSTATE <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(String value) {
            addCriterion("AUDITSTATE >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSTATE >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(String value) {
            addCriterion("AUDITSTATE <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(String value) {
            addCriterion("AUDITSTATE <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLike(String value) {
            addCriterion("AUDITSTATE like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotLike(String value) {
            addCriterion("AUDITSTATE not like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<String> values) {
            addCriterion("AUDITSTATE in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<String> values) {
            addCriterion("AUDITSTATE not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(String value1, String value2) {
            addCriterion("AUDITSTATE between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(String value1, String value2) {
            addCriterion("AUDITSTATE not between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAudituserIsNull() {
            addCriterion("AUDITUSER is null");
            return (Criteria) this;
        }

        public Criteria andAudituserIsNotNull() {
            addCriterion("AUDITUSER is not null");
            return (Criteria) this;
        }

        public Criteria andAudituserEqualTo(String value) {
            addCriterion("AUDITUSER =", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserNotEqualTo(String value) {
            addCriterion("AUDITUSER <>", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserGreaterThan(String value) {
            addCriterion("AUDITUSER >", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITUSER >=", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserLessThan(String value) {
            addCriterion("AUDITUSER <", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserLessThanOrEqualTo(String value) {
            addCriterion("AUDITUSER <=", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserLike(String value) {
            addCriterion("AUDITUSER like", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserNotLike(String value) {
            addCriterion("AUDITUSER not like", value, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserIn(List<String> values) {
            addCriterion("AUDITUSER in", values, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserNotIn(List<String> values) {
            addCriterion("AUDITUSER not in", values, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserBetween(String value1, String value2) {
            addCriterion("AUDITUSER between", value1, value2, "audituser");
            return (Criteria) this;
        }

        public Criteria andAudituserNotBetween(String value1, String value2) {
            addCriterion("AUDITUSER not between", value1, value2, "audituser");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AUDITDATE =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AUDITDATE <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AUDITDATE >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AUDITDATE <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AUDITDATE <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AUDITDATE in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AUDITDATE not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AUDITDATE not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditmgIsNull() {
            addCriterion("AUDITMG is null");
            return (Criteria) this;
        }

        public Criteria andAuditmgIsNotNull() {
            addCriterion("AUDITMG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditmgEqualTo(String value) {
            addCriterion("AUDITMG =", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgNotEqualTo(String value) {
            addCriterion("AUDITMG <>", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgGreaterThan(String value) {
            addCriterion("AUDITMG >", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITMG >=", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgLessThan(String value) {
            addCriterion("AUDITMG <", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgLessThanOrEqualTo(String value) {
            addCriterion("AUDITMG <=", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgLike(String value) {
            addCriterion("AUDITMG like", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgNotLike(String value) {
            addCriterion("AUDITMG not like", value, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgIn(List<String> values) {
            addCriterion("AUDITMG in", values, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgNotIn(List<String> values) {
            addCriterion("AUDITMG not in", values, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgBetween(String value1, String value2) {
            addCriterion("AUDITMG between", value1, value2, "auditmg");
            return (Criteria) this;
        }

        public Criteria andAuditmgNotBetween(String value1, String value2) {
            addCriterion("AUDITMG not between", value1, value2, "auditmg");
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

        public Criteria andRoomsidIsNull() {
            addCriterion("ROOMSID is null");
            return (Criteria) this;
        }

        public Criteria andRoomsidIsNotNull() {
            addCriterion("ROOMSID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsidEqualTo(Integer value) {
            addCriterion("ROOMSID =", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidNotEqualTo(Integer value) {
            addCriterion("ROOMSID <>", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidGreaterThan(Integer value) {
            addCriterion("ROOMSID >", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOMSID >=", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidLessThan(Integer value) {
            addCriterion("ROOMSID <", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidLessThanOrEqualTo(Integer value) {
            addCriterion("ROOMSID <=", value, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidIn(List<Integer> values) {
            addCriterion("ROOMSID in", values, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidNotIn(List<Integer> values) {
            addCriterion("ROOMSID not in", values, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidBetween(Integer value1, Integer value2) {
            addCriterion("ROOMSID between", value1, value2, "roomsid");
            return (Criteria) this;
        }

        public Criteria andRoomsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOMSID not between", value1, value2, "roomsid");
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