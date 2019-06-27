package com.qp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjptPsPropertiesSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YjptPsPropertiesSaleExample() {
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

        public Criteria andPropertiesnameIsNull() {
            addCriterion("PROPERTIESNAME is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameIsNotNull() {
            addCriterion("PROPERTIESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameEqualTo(String value) {
            addCriterion("PROPERTIESNAME =", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameNotEqualTo(String value) {
            addCriterion("PROPERTIESNAME <>", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameGreaterThan(String value) {
            addCriterion("PROPERTIESNAME >", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTIESNAME >=", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameLessThan(String value) {
            addCriterion("PROPERTIESNAME <", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameLessThanOrEqualTo(String value) {
            addCriterion("PROPERTIESNAME <=", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameLike(String value) {
            addCriterion("PROPERTIESNAME like", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameNotLike(String value) {
            addCriterion("PROPERTIESNAME not like", value, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameIn(List<String> values) {
            addCriterion("PROPERTIESNAME in", values, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameNotIn(List<String> values) {
            addCriterion("PROPERTIESNAME not in", values, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameBetween(String value1, String value2) {
            addCriterion("PROPERTIESNAME between", value1, value2, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertiesnameNotBetween(String value1, String value2) {
            addCriterion("PROPERTIESNAME not between", value1, value2, "propertiesname");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("PROPERTYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("PROPERTYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("PROPERTYTYPE =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("PROPERTYTYPE <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("PROPERTYTYPE >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("PROPERTYTYPE <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("PROPERTYTYPE like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("PROPERTYTYPE not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("PROPERTYTYPE in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("PROPERTYTYPE not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE not between", value1, value2, "propertytype");
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

        public Criteria andSalescompanyidEqualTo(Integer value) {
            addCriterion("SALESCOMPANYID =", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotEqualTo(Integer value) {
            addCriterion("SALESCOMPANYID <>", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidGreaterThan(Integer value) {
            addCriterion("SALESCOMPANYID >", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALESCOMPANYID >=", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidLessThan(Integer value) {
            addCriterion("SALESCOMPANYID <", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("SALESCOMPANYID <=", value, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidIn(List<Integer> values) {
            addCriterion("SALESCOMPANYID in", values, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotIn(List<Integer> values) {
            addCriterion("SALESCOMPANYID not in", values, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidBetween(Integer value1, Integer value2) {
            addCriterion("SALESCOMPANYID between", value1, value2, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andSalescompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("SALESCOMPANYID not between", value1, value2, "salescompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidIsNull() {
            addCriterion("PROPERTYCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidIsNotNull() {
            addCriterion("PROPERTYCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidEqualTo(Integer value) {
            addCriterion("PROPERTYCOMPANYID =", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidNotEqualTo(Integer value) {
            addCriterion("PROPERTYCOMPANYID <>", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidGreaterThan(Integer value) {
            addCriterion("PROPERTYCOMPANYID >", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROPERTYCOMPANYID >=", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidLessThan(Integer value) {
            addCriterion("PROPERTYCOMPANYID <", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("PROPERTYCOMPANYID <=", value, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidIn(List<Integer> values) {
            addCriterion("PROPERTYCOMPANYID in", values, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidNotIn(List<Integer> values) {
            addCriterion("PROPERTYCOMPANYID not in", values, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTYCOMPANYID between", value1, value2, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andPropertycompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("PROPERTYCOMPANYID not between", value1, value2, "propertycompanyid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidIsNull() {
            addCriterion("DEVELOPERSID is null");
            return (Criteria) this;
        }

        public Criteria andDevelopersidIsNotNull() {
            addCriterion("DEVELOPERSID is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopersidEqualTo(Integer value) {
            addCriterion("DEVELOPERSID =", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidNotEqualTo(Integer value) {
            addCriterion("DEVELOPERSID <>", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidGreaterThan(Integer value) {
            addCriterion("DEVELOPERSID >", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEVELOPERSID >=", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidLessThan(Integer value) {
            addCriterion("DEVELOPERSID <", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidLessThanOrEqualTo(Integer value) {
            addCriterion("DEVELOPERSID <=", value, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidIn(List<Integer> values) {
            addCriterion("DEVELOPERSID in", values, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidNotIn(List<Integer> values) {
            addCriterion("DEVELOPERSID not in", values, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidBetween(Integer value1, Integer value2) {
            addCriterion("DEVELOPERSID between", value1, value2, "developersid");
            return (Criteria) this;
        }

        public Criteria andDevelopersidNotBetween(Integer value1, Integer value2) {
            addCriterion("DEVELOPERSID not between", value1, value2, "developersid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidIsNull() {
            addCriterion("REGIONALCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidIsNotNull() {
            addCriterion("REGIONALCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidEqualTo(Integer value) {
            addCriterion("REGIONALCOMPANYID =", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidNotEqualTo(Integer value) {
            addCriterion("REGIONALCOMPANYID <>", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidGreaterThan(Integer value) {
            addCriterion("REGIONALCOMPANYID >", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGIONALCOMPANYID >=", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidLessThan(Integer value) {
            addCriterion("REGIONALCOMPANYID <", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("REGIONALCOMPANYID <=", value, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidIn(List<Integer> values) {
            addCriterion("REGIONALCOMPANYID in", values, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidNotIn(List<Integer> values) {
            addCriterion("REGIONALCOMPANYID not in", values, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidBetween(Integer value1, Integer value2) {
            addCriterion("REGIONALCOMPANYID between", value1, value2, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andRegionalcompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("REGIONALCOMPANYID not between", value1, value2, "regionalcompanyid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNull() {
            addCriterion("AVERAGEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNotNull() {
            addCriterion("AVERAGEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceEqualTo(Long value) {
            addCriterion("AVERAGEPRICE =", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotEqualTo(Long value) {
            addCriterion("AVERAGEPRICE <>", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThan(Long value) {
            addCriterion("AVERAGEPRICE >", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThanOrEqualTo(Long value) {
            addCriterion("AVERAGEPRICE >=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThan(Long value) {
            addCriterion("AVERAGEPRICE <", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThanOrEqualTo(Long value) {
            addCriterion("AVERAGEPRICE <=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIn(List<Long> values) {
            addCriterion("AVERAGEPRICE in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotIn(List<Long> values) {
            addCriterion("AVERAGEPRICE not in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceBetween(Long value1, Long value2) {
            addCriterion("AVERAGEPRICE between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotBetween(Long value1, Long value2) {
            addCriterion("AVERAGEPRICE not between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andObtaintimeIsNull() {
            addCriterion("OBTAINTIME is null");
            return (Criteria) this;
        }

        public Criteria andObtaintimeIsNotNull() {
            addCriterion("OBTAINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andObtaintimeEqualTo(Date value) {
            addCriterion("OBTAINTIME =", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeNotEqualTo(Date value) {
            addCriterion("OBTAINTIME <>", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeGreaterThan(Date value) {
            addCriterion("OBTAINTIME >", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OBTAINTIME >=", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeLessThan(Date value) {
            addCriterion("OBTAINTIME <", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeLessThanOrEqualTo(Date value) {
            addCriterion("OBTAINTIME <=", value, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeIn(List<Date> values) {
            addCriterion("OBTAINTIME in", values, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeNotIn(List<Date> values) {
            addCriterion("OBTAINTIME not in", values, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeBetween(Date value1, Date value2) {
            addCriterion("OBTAINTIME between", value1, value2, "obtaintime");
            return (Criteria) this;
        }

        public Criteria andObtaintimeNotBetween(Date value1, Date value2) {
            addCriterion("OBTAINTIME not between", value1, value2, "obtaintime");
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

        public Criteria andAuditorIsNull() {
            addCriterion("AUDITOR is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("AUDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("AUDITOR =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("AUDITOR <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("AUDITOR >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITOR >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("AUDITOR <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("AUDITOR <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("AUDITOR like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("AUDITOR not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("AUDITOR in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("AUDITOR not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("AUDITOR between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("AUDITOR not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("AUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("AUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("AUDITTIME =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("AUDITTIME <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("AUDITTIME >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("AUDITTIME <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("AUDITTIME in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("AUDITTIME not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("AUDITSTATUS like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("AUDITSTATUS not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditremarkIsNull() {
            addCriterion("AUDITREMARK is null");
            return (Criteria) this;
        }

        public Criteria andAuditremarkIsNotNull() {
            addCriterion("AUDITREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAuditremarkEqualTo(String value) {
            addCriterion("AUDITREMARK =", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkNotEqualTo(String value) {
            addCriterion("AUDITREMARK <>", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkGreaterThan(String value) {
            addCriterion("AUDITREMARK >", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITREMARK >=", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkLessThan(String value) {
            addCriterion("AUDITREMARK <", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkLessThanOrEqualTo(String value) {
            addCriterion("AUDITREMARK <=", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkLike(String value) {
            addCriterion("AUDITREMARK like", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkNotLike(String value) {
            addCriterion("AUDITREMARK not like", value, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkIn(List<String> values) {
            addCriterion("AUDITREMARK in", values, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkNotIn(List<String> values) {
            addCriterion("AUDITREMARK not in", values, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkBetween(String value1, String value2) {
            addCriterion("AUDITREMARK between", value1, value2, "auditremark");
            return (Criteria) this;
        }

        public Criteria andAuditremarkNotBetween(String value1, String value2) {
            addCriterion("AUDITREMARK not between", value1, value2, "auditremark");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("INFO is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("INFO is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("INFO =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("INFO <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("INFO >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INFO >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("INFO <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("INFO <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("INFO like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("INFO not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("INFO in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("INFO not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("INFO between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("INFO not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Long value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Long value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Long value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Long value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Long value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Long> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Long> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Long value1, Long value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Long value1, Long value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Long value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Long value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Long value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Long value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Long value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Long> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Long> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Long value1, Long value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Long value1, Long value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIsNull() {
            addCriterion("ACTIVATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIsNotNull() {
            addCriterion("ACTIVATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeEqualTo(String value) {
            addCriterion("ACTIVATIONCODE =", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotEqualTo(String value) {
            addCriterion("ACTIVATIONCODE <>", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeGreaterThan(String value) {
            addCriterion("ACTIVATIONCODE >", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVATIONCODE >=", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeLessThan(String value) {
            addCriterion("ACTIVATIONCODE <", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVATIONCODE <=", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeLike(String value) {
            addCriterion("ACTIVATIONCODE like", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotLike(String value) {
            addCriterion("ACTIVATIONCODE not like", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIn(List<String> values) {
            addCriterion("ACTIVATIONCODE in", values, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotIn(List<String> values) {
            addCriterion("ACTIVATIONCODE not in", values, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeBetween(String value1, String value2) {
            addCriterion("ACTIVATIONCODE between", value1, value2, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotBetween(String value1, String value2) {
            addCriterion("ACTIVATIONCODE not between", value1, value2, "activationcode");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceIsNull() {
            addCriterion("CTITYDISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceIsNotNull() {
            addCriterion("CTITYDISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceEqualTo(String value) {
            addCriterion("CTITYDISTANCE =", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceNotEqualTo(String value) {
            addCriterion("CTITYDISTANCE <>", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceGreaterThan(String value) {
            addCriterion("CTITYDISTANCE >", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceGreaterThanOrEqualTo(String value) {
            addCriterion("CTITYDISTANCE >=", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceLessThan(String value) {
            addCriterion("CTITYDISTANCE <", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceLessThanOrEqualTo(String value) {
            addCriterion("CTITYDISTANCE <=", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceLike(String value) {
            addCriterion("CTITYDISTANCE like", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceNotLike(String value) {
            addCriterion("CTITYDISTANCE not like", value, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceIn(List<String> values) {
            addCriterion("CTITYDISTANCE in", values, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceNotIn(List<String> values) {
            addCriterion("CTITYDISTANCE not in", values, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceBetween(String value1, String value2) {
            addCriterion("CTITYDISTANCE between", value1, value2, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andCtitydistanceNotBetween(String value1, String value2) {
            addCriterion("CTITYDISTANCE not between", value1, value2, "ctitydistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceIsNull() {
            addCriterion("AREADISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andAreadistanceIsNotNull() {
            addCriterion("AREADISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andAreadistanceEqualTo(String value) {
            addCriterion("AREADISTANCE =", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceNotEqualTo(String value) {
            addCriterion("AREADISTANCE <>", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceGreaterThan(String value) {
            addCriterion("AREADISTANCE >", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceGreaterThanOrEqualTo(String value) {
            addCriterion("AREADISTANCE >=", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceLessThan(String value) {
            addCriterion("AREADISTANCE <", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceLessThanOrEqualTo(String value) {
            addCriterion("AREADISTANCE <=", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceLike(String value) {
            addCriterion("AREADISTANCE like", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceNotLike(String value) {
            addCriterion("AREADISTANCE not like", value, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceIn(List<String> values) {
            addCriterion("AREADISTANCE in", values, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceNotIn(List<String> values) {
            addCriterion("AREADISTANCE not in", values, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceBetween(String value1, String value2) {
            addCriterion("AREADISTANCE between", value1, value2, "areadistance");
            return (Criteria) this;
        }

        public Criteria andAreadistanceNotBetween(String value1, String value2) {
            addCriterion("AREADISTANCE not between", value1, value2, "areadistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceIsNull() {
            addCriterion("TRAINDISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andTraindistanceIsNotNull() {
            addCriterion("TRAINDISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTraindistanceEqualTo(String value) {
            addCriterion("TRAINDISTANCE =", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceNotEqualTo(String value) {
            addCriterion("TRAINDISTANCE <>", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceGreaterThan(String value) {
            addCriterion("TRAINDISTANCE >", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceGreaterThanOrEqualTo(String value) {
            addCriterion("TRAINDISTANCE >=", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceLessThan(String value) {
            addCriterion("TRAINDISTANCE <", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceLessThanOrEqualTo(String value) {
            addCriterion("TRAINDISTANCE <=", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceLike(String value) {
            addCriterion("TRAINDISTANCE like", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceNotLike(String value) {
            addCriterion("TRAINDISTANCE not like", value, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceIn(List<String> values) {
            addCriterion("TRAINDISTANCE in", values, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceNotIn(List<String> values) {
            addCriterion("TRAINDISTANCE not in", values, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceBetween(String value1, String value2) {
            addCriterion("TRAINDISTANCE between", value1, value2, "traindistance");
            return (Criteria) this;
        }

        public Criteria andTraindistanceNotBetween(String value1, String value2) {
            addCriterion("TRAINDISTANCE not between", value1, value2, "traindistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceIsNull() {
            addCriterion("METRODISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceIsNotNull() {
            addCriterion("METRODISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceEqualTo(String value) {
            addCriterion("METRODISTANCE =", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceNotEqualTo(String value) {
            addCriterion("METRODISTANCE <>", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceGreaterThan(String value) {
            addCriterion("METRODISTANCE >", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceGreaterThanOrEqualTo(String value) {
            addCriterion("METRODISTANCE >=", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceLessThan(String value) {
            addCriterion("METRODISTANCE <", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceLessThanOrEqualTo(String value) {
            addCriterion("METRODISTANCE <=", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceLike(String value) {
            addCriterion("METRODISTANCE like", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceNotLike(String value) {
            addCriterion("METRODISTANCE not like", value, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceIn(List<String> values) {
            addCriterion("METRODISTANCE in", values, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceNotIn(List<String> values) {
            addCriterion("METRODISTANCE not in", values, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceBetween(String value1, String value2) {
            addCriterion("METRODISTANCE between", value1, value2, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andMetrodistanceNotBetween(String value1, String value2) {
            addCriterion("METRODISTANCE not between", value1, value2, "metrodistance");
            return (Criteria) this;
        }

        public Criteria andProsperityIsNull() {
            addCriterion("PROSPERITY is null");
            return (Criteria) this;
        }

        public Criteria andProsperityIsNotNull() {
            addCriterion("PROSPERITY is not null");
            return (Criteria) this;
        }

        public Criteria andProsperityEqualTo(String value) {
            addCriterion("PROSPERITY =", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityNotEqualTo(String value) {
            addCriterion("PROSPERITY <>", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityGreaterThan(String value) {
            addCriterion("PROSPERITY >", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityGreaterThanOrEqualTo(String value) {
            addCriterion("PROSPERITY >=", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityLessThan(String value) {
            addCriterion("PROSPERITY <", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityLessThanOrEqualTo(String value) {
            addCriterion("PROSPERITY <=", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityLike(String value) {
            addCriterion("PROSPERITY like", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityNotLike(String value) {
            addCriterion("PROSPERITY not like", value, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityIn(List<String> values) {
            addCriterion("PROSPERITY in", values, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityNotIn(List<String> values) {
            addCriterion("PROSPERITY not in", values, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityBetween(String value1, String value2) {
            addCriterion("PROSPERITY between", value1, value2, "prosperity");
            return (Criteria) this;
        }

        public Criteria andProsperityNotBetween(String value1, String value2) {
            addCriterion("PROSPERITY not between", value1, value2, "prosperity");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMedicalIsNull() {
            addCriterion("MEDICAL is null");
            return (Criteria) this;
        }

        public Criteria andMedicalIsNotNull() {
            addCriterion("MEDICAL is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalEqualTo(String value) {
            addCriterion("MEDICAL =", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalNotEqualTo(String value) {
            addCriterion("MEDICAL <>", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalGreaterThan(String value) {
            addCriterion("MEDICAL >", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICAL >=", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalLessThan(String value) {
            addCriterion("MEDICAL <", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalLessThanOrEqualTo(String value) {
            addCriterion("MEDICAL <=", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalLike(String value) {
            addCriterion("MEDICAL like", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalNotLike(String value) {
            addCriterion("MEDICAL not like", value, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalIn(List<String> values) {
            addCriterion("MEDICAL in", values, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalNotIn(List<String> values) {
            addCriterion("MEDICAL not in", values, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalBetween(String value1, String value2) {
            addCriterion("MEDICAL between", value1, value2, "medical");
            return (Criteria) this;
        }

        public Criteria andMedicalNotBetween(String value1, String value2) {
            addCriterion("MEDICAL not between", value1, value2, "medical");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIsNull() {
            addCriterion("ENVIRONMENTAL is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIsNotNull() {
            addCriterion("ENVIRONMENTAL is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalEqualTo(String value) {
            addCriterion("ENVIRONMENTAL =", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotEqualTo(String value) {
            addCriterion("ENVIRONMENTAL <>", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalGreaterThan(String value) {
            addCriterion("ENVIRONMENTAL >", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalGreaterThanOrEqualTo(String value) {
            addCriterion("ENVIRONMENTAL >=", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLessThan(String value) {
            addCriterion("ENVIRONMENTAL <", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLessThanOrEqualTo(String value) {
            addCriterion("ENVIRONMENTAL <=", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalLike(String value) {
            addCriterion("ENVIRONMENTAL like", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotLike(String value) {
            addCriterion("ENVIRONMENTAL not like", value, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalIn(List<String> values) {
            addCriterion("ENVIRONMENTAL in", values, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotIn(List<String> values) {
            addCriterion("ENVIRONMENTAL not in", values, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalBetween(String value1, String value2) {
            addCriterion("ENVIRONMENTAL between", value1, value2, "environmental");
            return (Criteria) this;
        }

        public Criteria andEnvironmentalNotBetween(String value1, String value2) {
            addCriterion("ENVIRONMENTAL not between", value1, value2, "environmental");
            return (Criteria) this;
        }

        public Criteria andGeologicalIsNull() {
            addCriterion("GEOLOGICAL is null");
            return (Criteria) this;
        }

        public Criteria andGeologicalIsNotNull() {
            addCriterion("GEOLOGICAL is not null");
            return (Criteria) this;
        }

        public Criteria andGeologicalEqualTo(String value) {
            addCriterion("GEOLOGICAL =", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalNotEqualTo(String value) {
            addCriterion("GEOLOGICAL <>", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalGreaterThan(String value) {
            addCriterion("GEOLOGICAL >", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalGreaterThanOrEqualTo(String value) {
            addCriterion("GEOLOGICAL >=", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalLessThan(String value) {
            addCriterion("GEOLOGICAL <", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalLessThanOrEqualTo(String value) {
            addCriterion("GEOLOGICAL <=", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalLike(String value) {
            addCriterion("GEOLOGICAL like", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalNotLike(String value) {
            addCriterion("GEOLOGICAL not like", value, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalIn(List<String> values) {
            addCriterion("GEOLOGICAL in", values, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalNotIn(List<String> values) {
            addCriterion("GEOLOGICAL not in", values, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalBetween(String value1, String value2) {
            addCriterion("GEOLOGICAL between", value1, value2, "geological");
            return (Criteria) this;
        }

        public Criteria andGeologicalNotBetween(String value1, String value2) {
            addCriterion("GEOLOGICAL not between", value1, value2, "geological");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("TRAFFIC =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("TRAFFIC <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("TRAFFIC >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("TRAFFIC >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("TRAFFIC <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("TRAFFIC <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("TRAFFIC like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("TRAFFIC not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("TRAFFIC in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("TRAFFIC not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("TRAFFIC between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("TRAFFIC not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesIsNull() {
            addCriterion("LEISUREVENUES is null");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesIsNotNull() {
            addCriterion("LEISUREVENUES is not null");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesEqualTo(String value) {
            addCriterion("LEISUREVENUES =", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesNotEqualTo(String value) {
            addCriterion("LEISUREVENUES <>", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesGreaterThan(String value) {
            addCriterion("LEISUREVENUES >", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesGreaterThanOrEqualTo(String value) {
            addCriterion("LEISUREVENUES >=", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesLessThan(String value) {
            addCriterion("LEISUREVENUES <", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesLessThanOrEqualTo(String value) {
            addCriterion("LEISUREVENUES <=", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesLike(String value) {
            addCriterion("LEISUREVENUES like", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesNotLike(String value) {
            addCriterion("LEISUREVENUES not like", value, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesIn(List<String> values) {
            addCriterion("LEISUREVENUES in", values, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesNotIn(List<String> values) {
            addCriterion("LEISUREVENUES not in", values, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesBetween(String value1, String value2) {
            addCriterion("LEISUREVENUES between", value1, value2, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andLeisurevenuesNotBetween(String value1, String value2) {
            addCriterion("LEISUREVENUES not between", value1, value2, "leisurevenues");
            return (Criteria) this;
        }

        public Criteria andParkingproportionIsNull() {
            addCriterion("PARKINGPROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andParkingproportionIsNotNull() {
            addCriterion("PARKINGPROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andParkingproportionEqualTo(String value) {
            addCriterion("PARKINGPROPORTION =", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionNotEqualTo(String value) {
            addCriterion("PARKINGPROPORTION <>", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionGreaterThan(String value) {
            addCriterion("PARKINGPROPORTION >", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionGreaterThanOrEqualTo(String value) {
            addCriterion("PARKINGPROPORTION >=", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionLessThan(String value) {
            addCriterion("PARKINGPROPORTION <", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionLessThanOrEqualTo(String value) {
            addCriterion("PARKINGPROPORTION <=", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionLike(String value) {
            addCriterion("PARKINGPROPORTION like", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionNotLike(String value) {
            addCriterion("PARKINGPROPORTION not like", value, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionIn(List<String> values) {
            addCriterion("PARKINGPROPORTION in", values, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionNotIn(List<String> values) {
            addCriterion("PARKINGPROPORTION not in", values, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionBetween(String value1, String value2) {
            addCriterion("PARKINGPROPORTION between", value1, value2, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andParkingproportionNotBetween(String value1, String value2) {
            addCriterion("PARKINGPROPORTION not between", value1, value2, "parkingproportion");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNull() {
            addCriterion("FACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNotNull() {
            addCriterion("FACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesEqualTo(String value) {
            addCriterion("FACILITIES =", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotEqualTo(String value) {
            addCriterion("FACILITIES <>", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThan(String value) {
            addCriterion("FACILITIES >", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITIES >=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThan(String value) {
            addCriterion("FACILITIES <", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("FACILITIES <=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLike(String value) {
            addCriterion("FACILITIES like", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotLike(String value) {
            addCriterion("FACILITIES not like", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIn(List<String> values) {
            addCriterion("FACILITIES in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotIn(List<String> values) {
            addCriterion("FACILITIES not in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesBetween(String value1, String value2) {
            addCriterion("FACILITIES between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotBetween(String value1, String value2) {
            addCriterion("FACILITIES not between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesIsNull() {
            addCriterion("COMMERCIALFACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesIsNotNull() {
            addCriterion("COMMERCIALFACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesEqualTo(String value) {
            addCriterion("COMMERCIALFACILITIES =", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesNotEqualTo(String value) {
            addCriterion("COMMERCIALFACILITIES <>", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesGreaterThan(String value) {
            addCriterion("COMMERCIALFACILITIES >", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("COMMERCIALFACILITIES >=", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesLessThan(String value) {
            addCriterion("COMMERCIALFACILITIES <", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesLessThanOrEqualTo(String value) {
            addCriterion("COMMERCIALFACILITIES <=", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesLike(String value) {
            addCriterion("COMMERCIALFACILITIES like", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesNotLike(String value) {
            addCriterion("COMMERCIALFACILITIES not like", value, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesIn(List<String> values) {
            addCriterion("COMMERCIALFACILITIES in", values, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesNotIn(List<String> values) {
            addCriterion("COMMERCIALFACILITIES not in", values, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesBetween(String value1, String value2) {
            addCriterion("COMMERCIALFACILITIES between", value1, value2, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andCommercialfacilitiesNotBetween(String value1, String value2) {
            addCriterion("COMMERCIALFACILITIES not between", value1, value2, "commercialfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesIsNull() {
            addCriterion("SANITATIONFACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesIsNotNull() {
            addCriterion("SANITATIONFACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesEqualTo(String value) {
            addCriterion("SANITATIONFACILITIES =", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesNotEqualTo(String value) {
            addCriterion("SANITATIONFACILITIES <>", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesGreaterThan(String value) {
            addCriterion("SANITATIONFACILITIES >", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("SANITATIONFACILITIES >=", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesLessThan(String value) {
            addCriterion("SANITATIONFACILITIES <", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesLessThanOrEqualTo(String value) {
            addCriterion("SANITATIONFACILITIES <=", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesLike(String value) {
            addCriterion("SANITATIONFACILITIES like", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesNotLike(String value) {
            addCriterion("SANITATIONFACILITIES not like", value, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesIn(List<String> values) {
            addCriterion("SANITATIONFACILITIES in", values, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesNotIn(List<String> values) {
            addCriterion("SANITATIONFACILITIES not in", values, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesBetween(String value1, String value2) {
            addCriterion("SANITATIONFACILITIES between", value1, value2, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andSanitationfacilitiesNotBetween(String value1, String value2) {
            addCriterion("SANITATIONFACILITIES not between", value1, value2, "sanitationfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesIsNull() {
            addCriterion("PROTECTIONFACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesIsNotNull() {
            addCriterion("PROTECTIONFACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesEqualTo(String value) {
            addCriterion("PROTECTIONFACILITIES =", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesNotEqualTo(String value) {
            addCriterion("PROTECTIONFACILITIES <>", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesGreaterThan(String value) {
            addCriterion("PROTECTIONFACILITIES >", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("PROTECTIONFACILITIES >=", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesLessThan(String value) {
            addCriterion("PROTECTIONFACILITIES <", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesLessThanOrEqualTo(String value) {
            addCriterion("PROTECTIONFACILITIES <=", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesLike(String value) {
            addCriterion("PROTECTIONFACILITIES like", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesNotLike(String value) {
            addCriterion("PROTECTIONFACILITIES not like", value, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesIn(List<String> values) {
            addCriterion("PROTECTIONFACILITIES in", values, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesNotIn(List<String> values) {
            addCriterion("PROTECTIONFACILITIES not in", values, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesBetween(String value1, String value2) {
            addCriterion("PROTECTIONFACILITIES between", value1, value2, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andProtectionfacilitiesNotBetween(String value1, String value2) {
            addCriterion("PROTECTIONFACILITIES not between", value1, value2, "protectionfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesIsNull() {
            addCriterion("SECURITYFACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesIsNotNull() {
            addCriterion("SECURITYFACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesEqualTo(String value) {
            addCriterion("SECURITYFACILITIES =", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesNotEqualTo(String value) {
            addCriterion("SECURITYFACILITIES <>", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesGreaterThan(String value) {
            addCriterion("SECURITYFACILITIES >", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYFACILITIES >=", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesLessThan(String value) {
            addCriterion("SECURITYFACILITIES <", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesLessThanOrEqualTo(String value) {
            addCriterion("SECURITYFACILITIES <=", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesLike(String value) {
            addCriterion("SECURITYFACILITIES like", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesNotLike(String value) {
            addCriterion("SECURITYFACILITIES not like", value, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesIn(List<String> values) {
            addCriterion("SECURITYFACILITIES in", values, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesNotIn(List<String> values) {
            addCriterion("SECURITYFACILITIES not in", values, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesBetween(String value1, String value2) {
            addCriterion("SECURITYFACILITIES between", value1, value2, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andSecurityfacilitiesNotBetween(String value1, String value2) {
            addCriterion("SECURITYFACILITIES not between", value1, value2, "securityfacilities");
            return (Criteria) this;
        }

        public Criteria andOpennessIsNull() {
            addCriterion("OPENNESS is null");
            return (Criteria) this;
        }

        public Criteria andOpennessIsNotNull() {
            addCriterion("OPENNESS is not null");
            return (Criteria) this;
        }

        public Criteria andOpennessEqualTo(String value) {
            addCriterion("OPENNESS =", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessNotEqualTo(String value) {
            addCriterion("OPENNESS <>", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessGreaterThan(String value) {
            addCriterion("OPENNESS >", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessGreaterThanOrEqualTo(String value) {
            addCriterion("OPENNESS >=", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessLessThan(String value) {
            addCriterion("OPENNESS <", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessLessThanOrEqualTo(String value) {
            addCriterion("OPENNESS <=", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessLike(String value) {
            addCriterion("OPENNESS like", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessNotLike(String value) {
            addCriterion("OPENNESS not like", value, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessIn(List<String> values) {
            addCriterion("OPENNESS in", values, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessNotIn(List<String> values) {
            addCriterion("OPENNESS not in", values, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessBetween(String value1, String value2) {
            addCriterion("OPENNESS between", value1, value2, "openness");
            return (Criteria) this;
        }

        public Criteria andOpennessNotBetween(String value1, String value2) {
            addCriterion("OPENNESS not between", value1, value2, "openness");
            return (Criteria) this;
        }

        public Criteria andLightingIsNull() {
            addCriterion("LIGHTING is null");
            return (Criteria) this;
        }

        public Criteria andLightingIsNotNull() {
            addCriterion("LIGHTING is not null");
            return (Criteria) this;
        }

        public Criteria andLightingEqualTo(String value) {
            addCriterion("LIGHTING =", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingNotEqualTo(String value) {
            addCriterion("LIGHTING <>", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingGreaterThan(String value) {
            addCriterion("LIGHTING >", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingGreaterThanOrEqualTo(String value) {
            addCriterion("LIGHTING >=", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingLessThan(String value) {
            addCriterion("LIGHTING <", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingLessThanOrEqualTo(String value) {
            addCriterion("LIGHTING <=", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingLike(String value) {
            addCriterion("LIGHTING like", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingNotLike(String value) {
            addCriterion("LIGHTING not like", value, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingIn(List<String> values) {
            addCriterion("LIGHTING in", values, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingNotIn(List<String> values) {
            addCriterion("LIGHTING not in", values, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingBetween(String value1, String value2) {
            addCriterion("LIGHTING between", value1, value2, "lighting");
            return (Criteria) this;
        }

        public Criteria andLightingNotBetween(String value1, String value2) {
            addCriterion("LIGHTING not between", value1, value2, "lighting");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("ENCLOSURE is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("ENCLOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("ENCLOSURE =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("ENCLOSURE <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("ENCLOSURE >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("ENCLOSURE <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("ENCLOSURE like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("ENCLOSURE not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("ENCLOSURE in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("ENCLOSURE not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("ENCLOSURE between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("ENCLOSURE not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andGreeningrateIsNull() {
            addCriterion("GREENINGRATE is null");
            return (Criteria) this;
        }

        public Criteria andGreeningrateIsNotNull() {
            addCriterion("GREENINGRATE is not null");
            return (Criteria) this;
        }

        public Criteria andGreeningrateEqualTo(String value) {
            addCriterion("GREENINGRATE =", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateNotEqualTo(String value) {
            addCriterion("GREENINGRATE <>", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateGreaterThan(String value) {
            addCriterion("GREENINGRATE >", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateGreaterThanOrEqualTo(String value) {
            addCriterion("GREENINGRATE >=", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateLessThan(String value) {
            addCriterion("GREENINGRATE <", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateLessThanOrEqualTo(String value) {
            addCriterion("GREENINGRATE <=", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateLike(String value) {
            addCriterion("GREENINGRATE like", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateNotLike(String value) {
            addCriterion("GREENINGRATE not like", value, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateIn(List<String> values) {
            addCriterion("GREENINGRATE in", values, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateNotIn(List<String> values) {
            addCriterion("GREENINGRATE not in", values, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateBetween(String value1, String value2) {
            addCriterion("GREENINGRATE between", value1, value2, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andGreeningrateNotBetween(String value1, String value2) {
            addCriterion("GREENINGRATE not between", value1, value2, "greeningrate");
            return (Criteria) this;
        }

        public Criteria andVolumeratioIsNull() {
            addCriterion("VOLUMERATIO is null");
            return (Criteria) this;
        }

        public Criteria andVolumeratioIsNotNull() {
            addCriterion("VOLUMERATIO is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeratioEqualTo(String value) {
            addCriterion("VOLUMERATIO =", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioNotEqualTo(String value) {
            addCriterion("VOLUMERATIO <>", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioGreaterThan(String value) {
            addCriterion("VOLUMERATIO >", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioGreaterThanOrEqualTo(String value) {
            addCriterion("VOLUMERATIO >=", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioLessThan(String value) {
            addCriterion("VOLUMERATIO <", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioLessThanOrEqualTo(String value) {
            addCriterion("VOLUMERATIO <=", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioLike(String value) {
            addCriterion("VOLUMERATIO like", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioNotLike(String value) {
            addCriterion("VOLUMERATIO not like", value, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioIn(List<String> values) {
            addCriterion("VOLUMERATIO in", values, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioNotIn(List<String> values) {
            addCriterion("VOLUMERATIO not in", values, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioBetween(String value1, String value2) {
            addCriterion("VOLUMERATIO between", value1, value2, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andVolumeratioNotBetween(String value1, String value2) {
            addCriterion("VOLUMERATIO not between", value1, value2, "volumeratio");
            return (Criteria) this;
        }

        public Criteria andApositionIsNull() {
            addCriterion("APOSITION is null");
            return (Criteria) this;
        }

        public Criteria andApositionIsNotNull() {
            addCriterion("APOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andApositionEqualTo(String value) {
            addCriterion("APOSITION =", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionNotEqualTo(String value) {
            addCriterion("APOSITION <>", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionGreaterThan(String value) {
            addCriterion("APOSITION >", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionGreaterThanOrEqualTo(String value) {
            addCriterion("APOSITION >=", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionLessThan(String value) {
            addCriterion("APOSITION <", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionLessThanOrEqualTo(String value) {
            addCriterion("APOSITION <=", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionLike(String value) {
            addCriterion("APOSITION like", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionNotLike(String value) {
            addCriterion("APOSITION not like", value, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionIn(List<String> values) {
            addCriterion("APOSITION in", values, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionNotIn(List<String> values) {
            addCriterion("APOSITION not in", values, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionBetween(String value1, String value2) {
            addCriterion("APOSITION between", value1, value2, "aposition");
            return (Criteria) this;
        }

        public Criteria andApositionNotBetween(String value1, String value2) {
            addCriterion("APOSITION not between", value1, value2, "aposition");
            return (Criteria) this;
        }

        public Criteria andNumberratioIsNull() {
            addCriterion("NUMBERRATIO is null");
            return (Criteria) this;
        }

        public Criteria andNumberratioIsNotNull() {
            addCriterion("NUMBERRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andNumberratioEqualTo(String value) {
            addCriterion("NUMBERRATIO =", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioNotEqualTo(String value) {
            addCriterion("NUMBERRATIO <>", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioGreaterThan(String value) {
            addCriterion("NUMBERRATIO >", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBERRATIO >=", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioLessThan(String value) {
            addCriterion("NUMBERRATIO <", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioLessThanOrEqualTo(String value) {
            addCriterion("NUMBERRATIO <=", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioLike(String value) {
            addCriterion("NUMBERRATIO like", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioNotLike(String value) {
            addCriterion("NUMBERRATIO not like", value, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioIn(List<String> values) {
            addCriterion("NUMBERRATIO in", values, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioNotIn(List<String> values) {
            addCriterion("NUMBERRATIO not in", values, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioBetween(String value1, String value2) {
            addCriterion("NUMBERRATIO between", value1, value2, "numberratio");
            return (Criteria) this;
        }

        public Criteria andNumberratioNotBetween(String value1, String value2) {
            addCriterion("NUMBERRATIO not between", value1, value2, "numberratio");
            return (Criteria) this;
        }

        public Criteria andIntelligentIsNull() {
            addCriterion("INTELLIGENT is null");
            return (Criteria) this;
        }

        public Criteria andIntelligentIsNotNull() {
            addCriterion("INTELLIGENT is not null");
            return (Criteria) this;
        }

        public Criteria andIntelligentEqualTo(String value) {
            addCriterion("INTELLIGENT =", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentNotEqualTo(String value) {
            addCriterion("INTELLIGENT <>", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentGreaterThan(String value) {
            addCriterion("INTELLIGENT >", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentGreaterThanOrEqualTo(String value) {
            addCriterion("INTELLIGENT >=", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentLessThan(String value) {
            addCriterion("INTELLIGENT <", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentLessThanOrEqualTo(String value) {
            addCriterion("INTELLIGENT <=", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentLike(String value) {
            addCriterion("INTELLIGENT like", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentNotLike(String value) {
            addCriterion("INTELLIGENT not like", value, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentIn(List<String> values) {
            addCriterion("INTELLIGENT in", values, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentNotIn(List<String> values) {
            addCriterion("INTELLIGENT not in", values, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentBetween(String value1, String value2) {
            addCriterion("INTELLIGENT between", value1, value2, "intelligent");
            return (Criteria) this;
        }

        public Criteria andIntelligentNotBetween(String value1, String value2) {
            addCriterion("INTELLIGENT not between", value1, value2, "intelligent");
            return (Criteria) this;
        }

        public Criteria andAirconditionerIsNull() {
            addCriterion("AIRCONDITIONER is null");
            return (Criteria) this;
        }

        public Criteria andAirconditionerIsNotNull() {
            addCriterion("AIRCONDITIONER is not null");
            return (Criteria) this;
        }

        public Criteria andAirconditionerEqualTo(String value) {
            addCriterion("AIRCONDITIONER =", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerNotEqualTo(String value) {
            addCriterion("AIRCONDITIONER <>", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerGreaterThan(String value) {
            addCriterion("AIRCONDITIONER >", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerGreaterThanOrEqualTo(String value) {
            addCriterion("AIRCONDITIONER >=", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerLessThan(String value) {
            addCriterion("AIRCONDITIONER <", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerLessThanOrEqualTo(String value) {
            addCriterion("AIRCONDITIONER <=", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerLike(String value) {
            addCriterion("AIRCONDITIONER like", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerNotLike(String value) {
            addCriterion("AIRCONDITIONER not like", value, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerIn(List<String> values) {
            addCriterion("AIRCONDITIONER in", values, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerNotIn(List<String> values) {
            addCriterion("AIRCONDITIONER not in", values, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerBetween(String value1, String value2) {
            addCriterion("AIRCONDITIONER between", value1, value2, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andAirconditionerNotBetween(String value1, String value2) {
            addCriterion("AIRCONDITIONER not between", value1, value2, "airconditioner");
            return (Criteria) this;
        }

        public Criteria andSupplyIsNull() {
            addCriterion("SUPPLY is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIsNotNull() {
            addCriterion("SUPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyEqualTo(String value) {
            addCriterion("SUPPLY =", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotEqualTo(String value) {
            addCriterion("SUPPLY <>", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyGreaterThan(String value) {
            addCriterion("SUPPLY >", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY >=", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyLessThan(String value) {
            addCriterion("SUPPLY <", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY <=", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyLike(String value) {
            addCriterion("SUPPLY like", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotLike(String value) {
            addCriterion("SUPPLY not like", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyIn(List<String> values) {
            addCriterion("SUPPLY in", values, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotIn(List<String> values) {
            addCriterion("SUPPLY not in", values, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyBetween(String value1, String value2) {
            addCriterion("SUPPLY between", value1, value2, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotBetween(String value1, String value2) {
            addCriterion("SUPPLY not between", value1, value2, "supply");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("`STRUCTURE` is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("`STRUCTURE` is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("`STRUCTURE` =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("`STRUCTURE` <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("`STRUCTURE` >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("`STRUCTURE` >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("`STRUCTURE` <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("`STRUCTURE` <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("`STRUCTURE` like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("`STRUCTURE` not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("`STRUCTURE` in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("`STRUCTURE` not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("`STRUCTURE` between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("`STRUCTURE` not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNull() {
            addCriterion("PROTECTION is null");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNotNull() {
            addCriterion("PROTECTION is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionEqualTo(String value) {
            addCriterion("PROTECTION =", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotEqualTo(String value) {
            addCriterion("PROTECTION <>", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThan(String value) {
            addCriterion("PROTECTION >", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("PROTECTION >=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThan(String value) {
            addCriterion("PROTECTION <", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThanOrEqualTo(String value) {
            addCriterion("PROTECTION <=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLike(String value) {
            addCriterion("PROTECTION like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotLike(String value) {
            addCriterion("PROTECTION not like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionIn(List<String> values) {
            addCriterion("PROTECTION in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotIn(List<String> values) {
            addCriterion("PROTECTION not in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionBetween(String value1, String value2) {
            addCriterion("PROTECTION between", value1, value2, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotBetween(String value1, String value2) {
            addCriterion("PROTECTION not between", value1, value2, "protection");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationIsNull() {
            addCriterion("EXTERIORDECORATION is null");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationIsNotNull() {
            addCriterion("EXTERIORDECORATION is not null");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationEqualTo(String value) {
            addCriterion("EXTERIORDECORATION =", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationNotEqualTo(String value) {
            addCriterion("EXTERIORDECORATION <>", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationGreaterThan(String value) {
            addCriterion("EXTERIORDECORATION >", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERIORDECORATION >=", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationLessThan(String value) {
            addCriterion("EXTERIORDECORATION <", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationLessThanOrEqualTo(String value) {
            addCriterion("EXTERIORDECORATION <=", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationLike(String value) {
            addCriterion("EXTERIORDECORATION like", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationNotLike(String value) {
            addCriterion("EXTERIORDECORATION not like", value, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationIn(List<String> values) {
            addCriterion("EXTERIORDECORATION in", values, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationNotIn(List<String> values) {
            addCriterion("EXTERIORDECORATION not in", values, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationBetween(String value1, String value2) {
            addCriterion("EXTERIORDECORATION between", value1, value2, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andExteriordecorationNotBetween(String value1, String value2) {
            addCriterion("EXTERIORDECORATION not between", value1, value2, "exteriordecoration");
            return (Criteria) this;
        }

        public Criteria andDesignIsNull() {
            addCriterion("DESIGN is null");
            return (Criteria) this;
        }

        public Criteria andDesignIsNotNull() {
            addCriterion("DESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDesignEqualTo(String value) {
            addCriterion("DESIGN =", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotEqualTo(String value) {
            addCriterion("DESIGN <>", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThan(String value) {
            addCriterion("DESIGN >", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN >=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThan(String value) {
            addCriterion("DESIGN <", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThanOrEqualTo(String value) {
            addCriterion("DESIGN <=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLike(String value) {
            addCriterion("DESIGN like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotLike(String value) {
            addCriterion("DESIGN not like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignIn(List<String> values) {
            addCriterion("DESIGN in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotIn(List<String> values) {
            addCriterion("DESIGN not in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignBetween(String value1, String value2) {
            addCriterion("DESIGN between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotBetween(String value1, String value2) {
            addCriterion("DESIGN not between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNull() {
            addCriterion("ORIENTATION is null");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNotNull() {
            addCriterion("ORIENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationEqualTo(String value) {
            addCriterion("ORIENTATION =", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotEqualTo(String value) {
            addCriterion("ORIENTATION <>", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThan(String value) {
            addCriterion("ORIENTATION >", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("ORIENTATION >=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThan(String value) {
            addCriterion("ORIENTATION <", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThanOrEqualTo(String value) {
            addCriterion("ORIENTATION <=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLike(String value) {
            addCriterion("ORIENTATION like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotLike(String value) {
            addCriterion("ORIENTATION not like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationIn(List<String> values) {
            addCriterion("ORIENTATION in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotIn(List<String> values) {
            addCriterion("ORIENTATION not in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationBetween(String value1, String value2) {
            addCriterion("ORIENTATION between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotBetween(String value1, String value2) {
            addCriterion("ORIENTATION not between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andStoreyIsNull() {
            addCriterion("STOREY is null");
            return (Criteria) this;
        }

        public Criteria andStoreyIsNotNull() {
            addCriterion("STOREY is not null");
            return (Criteria) this;
        }

        public Criteria andStoreyEqualTo(String value) {
            addCriterion("STOREY =", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotEqualTo(String value) {
            addCriterion("STOREY <>", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyGreaterThan(String value) {
            addCriterion("STOREY >", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyGreaterThanOrEqualTo(String value) {
            addCriterion("STOREY >=", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyLessThan(String value) {
            addCriterion("STOREY <", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyLessThanOrEqualTo(String value) {
            addCriterion("STOREY <=", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyLike(String value) {
            addCriterion("STOREY like", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotLike(String value) {
            addCriterion("STOREY not like", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyIn(List<String> values) {
            addCriterion("STOREY in", values, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotIn(List<String> values) {
            addCriterion("STOREY not in", values, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyBetween(String value1, String value2) {
            addCriterion("STOREY between", value1, value2, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotBetween(String value1, String value2) {
            addCriterion("STOREY not between", value1, value2, "storey");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNull() {
            addCriterion("DECORATION is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNotNull() {
            addCriterion("DECORATION is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationEqualTo(String value) {
            addCriterion("DECORATION =", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotEqualTo(String value) {
            addCriterion("DECORATION <>", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThan(String value) {
            addCriterion("DECORATION >", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("DECORATION >=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThan(String value) {
            addCriterion("DECORATION <", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThanOrEqualTo(String value) {
            addCriterion("DECORATION <=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLike(String value) {
            addCriterion("DECORATION like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotLike(String value) {
            addCriterion("DECORATION not like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationIn(List<String> values) {
            addCriterion("DECORATION in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotIn(List<String> values) {
            addCriterion("DECORATION not in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationBetween(String value1, String value2) {
            addCriterion("DECORATION between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotBetween(String value1, String value2) {
            addCriterion("DECORATION not between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andSmarthomeIsNull() {
            addCriterion("SMARTHOME is null");
            return (Criteria) this;
        }

        public Criteria andSmarthomeIsNotNull() {
            addCriterion("SMARTHOME is not null");
            return (Criteria) this;
        }

        public Criteria andSmarthomeEqualTo(String value) {
            addCriterion("SMARTHOME =", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeNotEqualTo(String value) {
            addCriterion("SMARTHOME <>", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeGreaterThan(String value) {
            addCriterion("SMARTHOME >", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeGreaterThanOrEqualTo(String value) {
            addCriterion("SMARTHOME >=", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeLessThan(String value) {
            addCriterion("SMARTHOME <", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeLessThanOrEqualTo(String value) {
            addCriterion("SMARTHOME <=", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeLike(String value) {
            addCriterion("SMARTHOME like", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeNotLike(String value) {
            addCriterion("SMARTHOME not like", value, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeIn(List<String> values) {
            addCriterion("SMARTHOME in", values, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeNotIn(List<String> values) {
            addCriterion("SMARTHOME not in", values, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeBetween(String value1, String value2) {
            addCriterion("SMARTHOME between", value1, value2, "smarthome");
            return (Criteria) this;
        }

        public Criteria andSmarthomeNotBetween(String value1, String value2) {
            addCriterion("SMARTHOME not between", value1, value2, "smarthome");
            return (Criteria) this;
        }

        public Criteria andUsagerateIsNull() {
            addCriterion("USAGERATE is null");
            return (Criteria) this;
        }

        public Criteria andUsagerateIsNotNull() {
            addCriterion("USAGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsagerateEqualTo(String value) {
            addCriterion("USAGERATE =", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateNotEqualTo(String value) {
            addCriterion("USAGERATE <>", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateGreaterThan(String value) {
            addCriterion("USAGERATE >", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateGreaterThanOrEqualTo(String value) {
            addCriterion("USAGERATE >=", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateLessThan(String value) {
            addCriterion("USAGERATE <", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateLessThanOrEqualTo(String value) {
            addCriterion("USAGERATE <=", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateLike(String value) {
            addCriterion("USAGERATE like", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateNotLike(String value) {
            addCriterion("USAGERATE not like", value, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateIn(List<String> values) {
            addCriterion("USAGERATE in", values, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateNotIn(List<String> values) {
            addCriterion("USAGERATE not in", values, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateBetween(String value1, String value2) {
            addCriterion("USAGERATE between", value1, value2, "usagerate");
            return (Criteria) this;
        }

        public Criteria andUsagerateNotBetween(String value1, String value2) {
            addCriterion("USAGERATE not between", value1, value2, "usagerate");
            return (Criteria) this;
        }

        public Criteria andReputationIsNull() {
            addCriterion("REPUTATION is null");
            return (Criteria) this;
        }

        public Criteria andReputationIsNotNull() {
            addCriterion("REPUTATION is not null");
            return (Criteria) this;
        }

        public Criteria andReputationEqualTo(String value) {
            addCriterion("REPUTATION =", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotEqualTo(String value) {
            addCriterion("REPUTATION <>", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThan(String value) {
            addCriterion("REPUTATION >", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThanOrEqualTo(String value) {
            addCriterion("REPUTATION >=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThan(String value) {
            addCriterion("REPUTATION <", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThanOrEqualTo(String value) {
            addCriterion("REPUTATION <=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLike(String value) {
            addCriterion("REPUTATION like", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotLike(String value) {
            addCriterion("REPUTATION not like", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationIn(List<String> values) {
            addCriterion("REPUTATION in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotIn(List<String> values) {
            addCriterion("REPUTATION not in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationBetween(String value1, String value2) {
            addCriterion("REPUTATION between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotBetween(String value1, String value2) {
            addCriterion("REPUTATION not between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNull() {
            addCriterion("QUALIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNotNull() {
            addCriterion("QUALIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationEqualTo(String value) {
            addCriterion("QUALIFICATION =", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotEqualTo(String value) {
            addCriterion("QUALIFICATION <>", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThan(String value) {
            addCriterion("QUALIFICATION >", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION >=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThan(String value) {
            addCriterion("QUALIFICATION <", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION <=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLike(String value) {
            addCriterion("QUALIFICATION like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotLike(String value) {
            addCriterion("QUALIFICATION not like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationIn(List<String> values) {
            addCriterion("QUALIFICATION in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotIn(List<String> values) {
            addCriterion("QUALIFICATION not in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationBetween(String value1, String value2) {
            addCriterion("QUALIFICATION between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotBetween(String value1, String value2) {
            addCriterion("QUALIFICATION not between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andBrandvalueIsNull() {
            addCriterion("BRANDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andBrandvalueIsNotNull() {
            addCriterion("BRANDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andBrandvalueEqualTo(String value) {
            addCriterion("BRANDVALUE =", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueNotEqualTo(String value) {
            addCriterion("BRANDVALUE <>", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueGreaterThan(String value) {
            addCriterion("BRANDVALUE >", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueGreaterThanOrEqualTo(String value) {
            addCriterion("BRANDVALUE >=", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueLessThan(String value) {
            addCriterion("BRANDVALUE <", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueLessThanOrEqualTo(String value) {
            addCriterion("BRANDVALUE <=", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueLike(String value) {
            addCriterion("BRANDVALUE like", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueNotLike(String value) {
            addCriterion("BRANDVALUE not like", value, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueIn(List<String> values) {
            addCriterion("BRANDVALUE in", values, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueNotIn(List<String> values) {
            addCriterion("BRANDVALUE not in", values, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueBetween(String value1, String value2) {
            addCriterion("BRANDVALUE between", value1, value2, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andBrandvalueNotBetween(String value1, String value2) {
            addCriterion("BRANDVALUE not between", value1, value2, "brandvalue");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("PROPERTY like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("PROPERTY not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
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