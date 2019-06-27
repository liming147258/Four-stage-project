package com.qp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjptPdProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YjptPdProductExample() {
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

        public Criteria andMfidIsNull() {
            addCriterion("MFID is null");
            return (Criteria) this;
        }

        public Criteria andMfidIsNotNull() {
            addCriterion("MFID is not null");
            return (Criteria) this;
        }

        public Criteria andMfidEqualTo(Integer value) {
            addCriterion("MFID =", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotEqualTo(Integer value) {
            addCriterion("MFID <>", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThan(Integer value) {
            addCriterion("MFID >", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MFID >=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThan(Integer value) {
            addCriterion("MFID <", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThanOrEqualTo(Integer value) {
            addCriterion("MFID <=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidIn(List<Integer> values) {
            addCriterion("MFID in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotIn(List<Integer> values) {
            addCriterion("MFID not in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidBetween(Integer value1, Integer value2) {
            addCriterion("MFID between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotBetween(Integer value1, Integer value2) {
            addCriterion("MFID not between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andPdnameIsNull() {
            addCriterion("PDNAME is null");
            return (Criteria) this;
        }

        public Criteria andPdnameIsNotNull() {
            addCriterion("PDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPdnameEqualTo(String value) {
            addCriterion("PDNAME =", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameNotEqualTo(String value) {
            addCriterion("PDNAME <>", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameGreaterThan(String value) {
            addCriterion("PDNAME >", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameGreaterThanOrEqualTo(String value) {
            addCriterion("PDNAME >=", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameLessThan(String value) {
            addCriterion("PDNAME <", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameLessThanOrEqualTo(String value) {
            addCriterion("PDNAME <=", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameLike(String value) {
            addCriterion("PDNAME like", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameNotLike(String value) {
            addCriterion("PDNAME not like", value, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameIn(List<String> values) {
            addCriterion("PDNAME in", values, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameNotIn(List<String> values) {
            addCriterion("PDNAME not in", values, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameBetween(String value1, String value2) {
            addCriterion("PDNAME between", value1, value2, "pdname");
            return (Criteria) this;
        }

        public Criteria andPdnameNotBetween(String value1, String value2) {
            addCriterion("PDNAME not between", value1, value2, "pdname");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("BRANDID is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("BRANDID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(String value) {
            addCriterion("BRANDID =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(String value) {
            addCriterion("BRANDID <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(String value) {
            addCriterion("BRANDID >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(String value) {
            addCriterion("BRANDID >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(String value) {
            addCriterion("BRANDID <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(String value) {
            addCriterion("BRANDID <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLike(String value) {
            addCriterion("BRANDID like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotLike(String value) {
            addCriterion("BRANDID not like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<String> values) {
            addCriterion("BRANDID in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<String> values) {
            addCriterion("BRANDID not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(String value1, String value2) {
            addCriterion("BRANDID between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(String value1, String value2) {
            addCriterion("BRANDID not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andIsfreightIsNull() {
            addCriterion("ISFREIGHT is null");
            return (Criteria) this;
        }

        public Criteria andIsfreightIsNotNull() {
            addCriterion("ISFREIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreightEqualTo(String value) {
            addCriterion("ISFREIGHT =", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightNotEqualTo(String value) {
            addCriterion("ISFREIGHT <>", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightGreaterThan(String value) {
            addCriterion("ISFREIGHT >", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightGreaterThanOrEqualTo(String value) {
            addCriterion("ISFREIGHT >=", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightLessThan(String value) {
            addCriterion("ISFREIGHT <", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightLessThanOrEqualTo(String value) {
            addCriterion("ISFREIGHT <=", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightLike(String value) {
            addCriterion("ISFREIGHT like", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightNotLike(String value) {
            addCriterion("ISFREIGHT not like", value, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightIn(List<String> values) {
            addCriterion("ISFREIGHT in", values, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightNotIn(List<String> values) {
            addCriterion("ISFREIGHT not in", values, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightBetween(String value1, String value2) {
            addCriterion("ISFREIGHT between", value1, value2, "isfreight");
            return (Criteria) this;
        }

        public Criteria andIsfreightNotBetween(String value1, String value2) {
            addCriterion("ISFREIGHT not between", value1, value2, "isfreight");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andRoomregionIsNull() {
            addCriterion("ROOMREGION is null");
            return (Criteria) this;
        }

        public Criteria andRoomregionIsNotNull() {
            addCriterion("ROOMREGION is not null");
            return (Criteria) this;
        }

        public Criteria andRoomregionEqualTo(String value) {
            addCriterion("ROOMREGION =", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionNotEqualTo(String value) {
            addCriterion("ROOMREGION <>", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionGreaterThan(String value) {
            addCriterion("ROOMREGION >", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMREGION >=", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionLessThan(String value) {
            addCriterion("ROOMREGION <", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionLessThanOrEqualTo(String value) {
            addCriterion("ROOMREGION <=", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionLike(String value) {
            addCriterion("ROOMREGION like", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionNotLike(String value) {
            addCriterion("ROOMREGION not like", value, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionIn(List<String> values) {
            addCriterion("ROOMREGION in", values, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionNotIn(List<String> values) {
            addCriterion("ROOMREGION not in", values, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionBetween(String value1, String value2) {
            addCriterion("ROOMREGION between", value1, value2, "roomregion");
            return (Criteria) this;
        }

        public Criteria andRoomregionNotBetween(String value1, String value2) {
            addCriterion("ROOMREGION not between", value1, value2, "roomregion");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("DIRECTION like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("DIRECTION not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("DIRECTION not between", value1, value2, "direction");
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

        public Criteria andPro3dnameIsNull() {
            addCriterion("PRO3DNAME is null");
            return (Criteria) this;
        }

        public Criteria andPro3dnameIsNotNull() {
            addCriterion("PRO3DNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPro3dnameEqualTo(String value) {
            addCriterion("PRO3DNAME =", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameNotEqualTo(String value) {
            addCriterion("PRO3DNAME <>", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameGreaterThan(String value) {
            addCriterion("PRO3DNAME >", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO3DNAME >=", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameLessThan(String value) {
            addCriterion("PRO3DNAME <", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameLessThanOrEqualTo(String value) {
            addCriterion("PRO3DNAME <=", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameLike(String value) {
            addCriterion("PRO3DNAME like", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameNotLike(String value) {
            addCriterion("PRO3DNAME not like", value, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameIn(List<String> values) {
            addCriterion("PRO3DNAME in", values, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameNotIn(List<String> values) {
            addCriterion("PRO3DNAME not in", values, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameBetween(String value1, String value2) {
            addCriterion("PRO3DNAME between", value1, value2, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andPro3dnameNotBetween(String value1, String value2) {
            addCriterion("PRO3DNAME not between", value1, value2, "pro3dname");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("PRODUCTNO is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("PRODUCTNO is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("PRODUCTNO =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("PRODUCTNO <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("PRODUCTNO >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNO >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("PRODUCTNO <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNO <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("PRODUCTNO like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("PRODUCTNO not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("PRODUCTNO in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("PRODUCTNO not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("PRODUCTNO between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNO not between", value1, value2, "productno");
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

        public Criteria andIschoiceIsNull() {
            addCriterion("ISCHOICE is null");
            return (Criteria) this;
        }

        public Criteria andIschoiceIsNotNull() {
            addCriterion("ISCHOICE is not null");
            return (Criteria) this;
        }

        public Criteria andIschoiceEqualTo(String value) {
            addCriterion("ISCHOICE =", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceNotEqualTo(String value) {
            addCriterion("ISCHOICE <>", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceGreaterThan(String value) {
            addCriterion("ISCHOICE >", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceGreaterThanOrEqualTo(String value) {
            addCriterion("ISCHOICE >=", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceLessThan(String value) {
            addCriterion("ISCHOICE <", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceLessThanOrEqualTo(String value) {
            addCriterion("ISCHOICE <=", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceLike(String value) {
            addCriterion("ISCHOICE like", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceNotLike(String value) {
            addCriterion("ISCHOICE not like", value, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceIn(List<String> values) {
            addCriterion("ISCHOICE in", values, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceNotIn(List<String> values) {
            addCriterion("ISCHOICE not in", values, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceBetween(String value1, String value2) {
            addCriterion("ISCHOICE between", value1, value2, "ischoice");
            return (Criteria) this;
        }

        public Criteria andIschoiceNotBetween(String value1, String value2) {
            addCriterion("ISCHOICE not between", value1, value2, "ischoice");
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