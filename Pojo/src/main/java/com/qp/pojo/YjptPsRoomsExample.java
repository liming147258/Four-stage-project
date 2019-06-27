package com.qp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjptPsRoomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YjptPsRoomsExample() {
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

        public Criteria andRoomsnameIsNull() {
            addCriterion("ROOMSNAME is null");
            return (Criteria) this;
        }

        public Criteria andRoomsnameIsNotNull() {
            addCriterion("ROOMSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsnameEqualTo(String value) {
            addCriterion("ROOMSNAME =", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameNotEqualTo(String value) {
            addCriterion("ROOMSNAME <>", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameGreaterThan(String value) {
            addCriterion("ROOMSNAME >", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMSNAME >=", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameLessThan(String value) {
            addCriterion("ROOMSNAME <", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameLessThanOrEqualTo(String value) {
            addCriterion("ROOMSNAME <=", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameLike(String value) {
            addCriterion("ROOMSNAME like", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameNotLike(String value) {
            addCriterion("ROOMSNAME not like", value, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameIn(List<String> values) {
            addCriterion("ROOMSNAME in", values, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameNotIn(List<String> values) {
            addCriterion("ROOMSNAME not in", values, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameBetween(String value1, String value2) {
            addCriterion("ROOMSNAME between", value1, value2, "roomsname");
            return (Criteria) this;
        }

        public Criteria andRoomsnameNotBetween(String value1, String value2) {
            addCriterion("ROOMSNAME not between", value1, value2, "roomsname");
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

        public Criteria andHousingidIsNull() {
            addCriterion("HOUSINGID is null");
            return (Criteria) this;
        }

        public Criteria andHousingidIsNotNull() {
            addCriterion("HOUSINGID is not null");
            return (Criteria) this;
        }

        public Criteria andHousingidEqualTo(String value) {
            addCriterion("HOUSINGID =", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidNotEqualTo(String value) {
            addCriterion("HOUSINGID <>", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidGreaterThan(String value) {
            addCriterion("HOUSINGID >", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSINGID >=", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidLessThan(String value) {
            addCriterion("HOUSINGID <", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidLessThanOrEqualTo(String value) {
            addCriterion("HOUSINGID <=", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidLike(String value) {
            addCriterion("HOUSINGID like", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidNotLike(String value) {
            addCriterion("HOUSINGID not like", value, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidIn(List<String> values) {
            addCriterion("HOUSINGID in", values, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidNotIn(List<String> values) {
            addCriterion("HOUSINGID not in", values, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidBetween(String value1, String value2) {
            addCriterion("HOUSINGID between", value1, value2, "housingid");
            return (Criteria) this;
        }

        public Criteria andHousingidNotBetween(String value1, String value2) {
            addCriterion("HOUSINGID not between", value1, value2, "housingid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`LEVEL` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`LEVEL` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("`LEVEL` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("`LEVEL` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("`LEVEL` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("`LEVEL` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("`LEVEL` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("`LEVEL` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("`LEVEL` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("`LEVEL` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("`LEVEL` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("`LEVEL` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andConstructionareaIsNull() {
            addCriterion("CONSTRUCTIONAREA is null");
            return (Criteria) this;
        }

        public Criteria andConstructionareaIsNotNull() {
            addCriterion("CONSTRUCTIONAREA is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionareaEqualTo(Long value) {
            addCriterion("CONSTRUCTIONAREA =", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaNotEqualTo(Long value) {
            addCriterion("CONSTRUCTIONAREA <>", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaGreaterThan(Long value) {
            addCriterion("CONSTRUCTIONAREA >", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaGreaterThanOrEqualTo(Long value) {
            addCriterion("CONSTRUCTIONAREA >=", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaLessThan(Long value) {
            addCriterion("CONSTRUCTIONAREA <", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaLessThanOrEqualTo(Long value) {
            addCriterion("CONSTRUCTIONAREA <=", value, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaIn(List<Long> values) {
            addCriterion("CONSTRUCTIONAREA in", values, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaNotIn(List<Long> values) {
            addCriterion("CONSTRUCTIONAREA not in", values, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaBetween(Long value1, Long value2) {
            addCriterion("CONSTRUCTIONAREA between", value1, value2, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andConstructionareaNotBetween(Long value1, Long value2) {
            addCriterion("CONSTRUCTIONAREA not between", value1, value2, "constructionarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaIsNull() {
            addCriterion("PRACTICALAREA is null");
            return (Criteria) this;
        }

        public Criteria andPracticalareaIsNotNull() {
            addCriterion("PRACTICALAREA is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalareaEqualTo(Long value) {
            addCriterion("PRACTICALAREA =", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaNotEqualTo(Long value) {
            addCriterion("PRACTICALAREA <>", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaGreaterThan(Long value) {
            addCriterion("PRACTICALAREA >", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaGreaterThanOrEqualTo(Long value) {
            addCriterion("PRACTICALAREA >=", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaLessThan(Long value) {
            addCriterion("PRACTICALAREA <", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaLessThanOrEqualTo(Long value) {
            addCriterion("PRACTICALAREA <=", value, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaIn(List<Long> values) {
            addCriterion("PRACTICALAREA in", values, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaNotIn(List<Long> values) {
            addCriterion("PRACTICALAREA not in", values, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaBetween(Long value1, Long value2) {
            addCriterion("PRACTICALAREA between", value1, value2, "practicalarea");
            return (Criteria) this;
        }

        public Criteria andPracticalareaNotBetween(Long value1, Long value2) {
            addCriterion("PRACTICALAREA not between", value1, value2, "practicalarea");
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