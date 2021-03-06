package com.qbt.data.migration.pgsql.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssistantBagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssistantBagExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idIsNull() {
            addCriterion("assistant_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistant_idIsNotNull() {
            addCriterion("assistant_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistant_idEqualTo(Long value) {
            addCriterion("assistant_id =", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idNotEqualTo(Long value) {
            addCriterion("assistant_id <>", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idGreaterThan(Long value) {
            addCriterion("assistant_id >", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idGreaterThanOrEqualTo(Long value) {
            addCriterion("assistant_id >=", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idLessThan(Long value) {
            addCriterion("assistant_id <", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idLessThanOrEqualTo(Long value) {
            addCriterion("assistant_id <=", value, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idIn(List<Long> values) {
            addCriterion("assistant_id in", values, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idNotIn(List<Long> values) {
            addCriterion("assistant_id not in", values, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idBetween(Long value1, Long value2) {
            addCriterion("assistant_id between", value1, value2, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andAssistant_idNotBetween(Long value1, Long value2) {
            addCriterion("assistant_id not between", value1, value2, "assistant_id");
            return (Criteria) this;
        }

        public Criteria andOwner_nameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwner_nameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwner_nameEqualTo(String value) {
            addCriterion("owner_name =", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameGreaterThan(String value) {
            addCriterion("owner_name >", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameLessThan(String value) {
            addCriterion("owner_name <", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameLike(String value) {
            addCriterion("owner_name like", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameNotLike(String value) {
            addCriterion("owner_name not like", value, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameIn(List<String> values) {
            addCriterion("owner_name in", values, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_nameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "owner_name");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileIsNull() {
            addCriterion("owner_mobile is null");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileIsNotNull() {
            addCriterion("owner_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileEqualTo(String value) {
            addCriterion("owner_mobile =", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileNotEqualTo(String value) {
            addCriterion("owner_mobile <>", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileGreaterThan(String value) {
            addCriterion("owner_mobile >", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("owner_mobile >=", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileLessThan(String value) {
            addCriterion("owner_mobile <", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileLessThanOrEqualTo(String value) {
            addCriterion("owner_mobile <=", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileLike(String value) {
            addCriterion("owner_mobile like", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileNotLike(String value) {
            addCriterion("owner_mobile not like", value, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileIn(List<String> values) {
            addCriterion("owner_mobile in", values, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileNotIn(List<String> values) {
            addCriterion("owner_mobile not in", values, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileBetween(String value1, String value2) {
            addCriterion("owner_mobile between", value1, value2, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andOwner_mobileNotBetween(String value1, String value2) {
            addCriterion("owner_mobile not between", value1, value2, "owner_mobile");
            return (Criteria) this;
        }

        public Criteria andBag_coverIsNull() {
            addCriterion("bag_cover is null");
            return (Criteria) this;
        }

        public Criteria andBag_coverIsNotNull() {
            addCriterion("bag_cover is not null");
            return (Criteria) this;
        }

        public Criteria andBag_coverEqualTo(Integer value) {
            addCriterion("bag_cover =", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverNotEqualTo(Integer value) {
            addCriterion("bag_cover <>", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverGreaterThan(Integer value) {
            addCriterion("bag_cover >", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverGreaterThanOrEqualTo(Integer value) {
            addCriterion("bag_cover >=", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverLessThan(Integer value) {
            addCriterion("bag_cover <", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverLessThanOrEqualTo(Integer value) {
            addCriterion("bag_cover <=", value, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverIn(List<Integer> values) {
            addCriterion("bag_cover in", values, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverNotIn(List<Integer> values) {
            addCriterion("bag_cover not in", values, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverBetween(Integer value1, Integer value2) {
            addCriterion("bag_cover between", value1, value2, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andBag_coverNotBetween(Integer value1, Integer value2) {
            addCriterion("bag_cover not between", value1, value2, "bag_cover");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_atEqualTo(Date value) {
            addCriterion("created_at =", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThan(Date value) {
            addCriterion("created_at >", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThan(Date value) {
            addCriterion("created_at <", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atIn(List<Date> values) {
            addCriterion("created_at in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atEqualTo(Date value) {
            addCriterion("updated_at =", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThan(Date value) {
            addCriterion("updated_at <", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIn(List<Date> values) {
            addCriterion("updated_at in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDeleted_atIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeleted_atIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeleted_atEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atLessThan(Date value) {
            addCriterion("deleted_at <", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deleted_at");
            return (Criteria) this;
        }

        public Criteria andDeleted_atNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deleted_at");
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