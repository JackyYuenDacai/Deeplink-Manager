package com.jydacai.DLMServer.data.model;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilterExample() {
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

        public Criteria andDeeplinkidIsNull() {
            addCriterion("deeplinkId is null");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidIsNotNull() {
            addCriterion("deeplinkId is not null");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidEqualTo(String value) {
            addCriterion("deeplinkId =", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidNotEqualTo(String value) {
            addCriterion("deeplinkId <>", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidGreaterThan(String value) {
            addCriterion("deeplinkId >", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidGreaterThanOrEqualTo(String value) {
            addCriterion("deeplinkId >=", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidLessThan(String value) {
            addCriterion("deeplinkId <", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidLessThanOrEqualTo(String value) {
            addCriterion("deeplinkId <=", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidLike(String value) {
            addCriterion("deeplinkId like", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidNotLike(String value) {
            addCriterion("deeplinkId not like", value, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidIn(List<String> values) {
            addCriterion("deeplinkId in", values, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidNotIn(List<String> values) {
            addCriterion("deeplinkId not in", values, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidBetween(String value1, String value2) {
            addCriterion("deeplinkId between", value1, value2, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andDeeplinkidNotBetween(String value1, String value2) {
            addCriterion("deeplinkId not between", value1, value2, "deeplinkid");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelId is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelId is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(String value) {
            addCriterion("channelId =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(String value) {
            addCriterion("channelId <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(String value) {
            addCriterion("channelId >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(String value) {
            addCriterion("channelId >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(String value) {
            addCriterion("channelId <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(String value) {
            addCriterion("channelId <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLike(String value) {
            addCriterion("channelId like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotLike(String value) {
            addCriterion("channelId not like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<String> values) {
            addCriterion("channelId in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<String> values) {
            addCriterion("channelId not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(String value1, String value2) {
            addCriterion("channelId between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(String value1, String value2) {
            addCriterion("channelId not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFilterfieldIsNull() {
            addCriterion("filterField is null");
            return (Criteria) this;
        }

        public Criteria andFilterfieldIsNotNull() {
            addCriterion("filterField is not null");
            return (Criteria) this;
        }

        public Criteria andFilterfieldEqualTo(String value) {
            addCriterion("filterField =", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldNotEqualTo(String value) {
            addCriterion("filterField <>", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldGreaterThan(String value) {
            addCriterion("filterField >", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldGreaterThanOrEqualTo(String value) {
            addCriterion("filterField >=", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldLessThan(String value) {
            addCriterion("filterField <", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldLessThanOrEqualTo(String value) {
            addCriterion("filterField <=", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldLike(String value) {
            addCriterion("filterField like", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldNotLike(String value) {
            addCriterion("filterField not like", value, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldIn(List<String> values) {
            addCriterion("filterField in", values, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldNotIn(List<String> values) {
            addCriterion("filterField not in", values, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldBetween(String value1, String value2) {
            addCriterion("filterField between", value1, value2, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFilterfieldNotBetween(String value1, String value2) {
            addCriterion("filterField not between", value1, value2, "filterfield");
            return (Criteria) this;
        }

        public Criteria andFiltertypeIsNull() {
            addCriterion("filterType is null");
            return (Criteria) this;
        }

        public Criteria andFiltertypeIsNotNull() {
            addCriterion("filterType is not null");
            return (Criteria) this;
        }

        public Criteria andFiltertypeEqualTo(Integer value) {
            addCriterion("filterType =", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeNotEqualTo(Integer value) {
            addCriterion("filterType <>", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeGreaterThan(Integer value) {
            addCriterion("filterType >", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filterType >=", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeLessThan(Integer value) {
            addCriterion("filterType <", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeLessThanOrEqualTo(Integer value) {
            addCriterion("filterType <=", value, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeIn(List<Integer> values) {
            addCriterion("filterType in", values, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeNotIn(List<Integer> values) {
            addCriterion("filterType not in", values, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeBetween(Integer value1, Integer value2) {
            addCriterion("filterType between", value1, value2, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFiltertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("filterType not between", value1, value2, "filtertype");
            return (Criteria) this;
        }

        public Criteria andFilterinverseIsNull() {
            addCriterion("filterInverse is null");
            return (Criteria) this;
        }

        public Criteria andFilterinverseIsNotNull() {
            addCriterion("filterInverse is not null");
            return (Criteria) this;
        }

        public Criteria andFilterinverseEqualTo(Boolean value) {
            addCriterion("filterInverse =", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseNotEqualTo(Boolean value) {
            addCriterion("filterInverse <>", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseGreaterThan(Boolean value) {
            addCriterion("filterInverse >", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("filterInverse >=", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseLessThan(Boolean value) {
            addCriterion("filterInverse <", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseLessThanOrEqualTo(Boolean value) {
            addCriterion("filterInverse <=", value, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseIn(List<Boolean> values) {
            addCriterion("filterInverse in", values, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseNotIn(List<Boolean> values) {
            addCriterion("filterInverse not in", values, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseBetween(Boolean value1, Boolean value2) {
            addCriterion("filterInverse between", value1, value2, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFilterinverseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("filterInverse not between", value1, value2, "filterinverse");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveIsNull() {
            addCriterion("filterMustHave is null");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveIsNotNull() {
            addCriterion("filterMustHave is not null");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveEqualTo(Boolean value) {
            addCriterion("filterMustHave =", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveNotEqualTo(Boolean value) {
            addCriterion("filterMustHave <>", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveGreaterThan(Boolean value) {
            addCriterion("filterMustHave >", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("filterMustHave >=", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveLessThan(Boolean value) {
            addCriterion("filterMustHave <", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveLessThanOrEqualTo(Boolean value) {
            addCriterion("filterMustHave <=", value, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveIn(List<Boolean> values) {
            addCriterion("filterMustHave in", values, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveNotIn(List<Boolean> values) {
            addCriterion("filterMustHave not in", values, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveBetween(Boolean value1, Boolean value2) {
            addCriterion("filterMustHave between", value1, value2, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andFiltermusthaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("filterMustHave not between", value1, value2, "filtermusthave");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNull() {
            addCriterion("valueType is null");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNotNull() {
            addCriterion("valueType is not null");
            return (Criteria) this;
        }

        public Criteria andValuetypeEqualTo(Integer value) {
            addCriterion("valueType =", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotEqualTo(Integer value) {
            addCriterion("valueType <>", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThan(Integer value) {
            addCriterion("valueType >", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("valueType >=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThan(Integer value) {
            addCriterion("valueType <", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThanOrEqualTo(Integer value) {
            addCriterion("valueType <=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeIn(List<Integer> values) {
            addCriterion("valueType in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotIn(List<Integer> values) {
            addCriterion("valueType not in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeBetween(Integer value1, Integer value2) {
            addCriterion("valueType between", value1, value2, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("valueType not between", value1, value2, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andExtvalueIsNull() {
            addCriterion("extValue is null");
            return (Criteria) this;
        }

        public Criteria andExtvalueIsNotNull() {
            addCriterion("extValue is not null");
            return (Criteria) this;
        }

        public Criteria andExtvalueEqualTo(String value) {
            addCriterion("extValue =", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueNotEqualTo(String value) {
            addCriterion("extValue <>", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueGreaterThan(String value) {
            addCriterion("extValue >", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueGreaterThanOrEqualTo(String value) {
            addCriterion("extValue >=", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueLessThan(String value) {
            addCriterion("extValue <", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueLessThanOrEqualTo(String value) {
            addCriterion("extValue <=", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueLike(String value) {
            addCriterion("extValue like", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueNotLike(String value) {
            addCriterion("extValue not like", value, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueIn(List<String> values) {
            addCriterion("extValue in", values, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueNotIn(List<String> values) {
            addCriterion("extValue not in", values, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueBetween(String value1, String value2) {
            addCriterion("extValue between", value1, value2, "extvalue");
            return (Criteria) this;
        }

        public Criteria andExtvalueNotBetween(String value1, String value2) {
            addCriterion("extValue not between", value1, value2, "extvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueIsNull() {
            addCriterion("dvalue is null");
            return (Criteria) this;
        }

        public Criteria andDvalueIsNotNull() {
            addCriterion("dvalue is not null");
            return (Criteria) this;
        }

        public Criteria andDvalueEqualTo(Double value) {
            addCriterion("dvalue =", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueNotEqualTo(Double value) {
            addCriterion("dvalue <>", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueGreaterThan(Double value) {
            addCriterion("dvalue >", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("dvalue >=", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueLessThan(Double value) {
            addCriterion("dvalue <", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueLessThanOrEqualTo(Double value) {
            addCriterion("dvalue <=", value, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueIn(List<Double> values) {
            addCriterion("dvalue in", values, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueNotIn(List<Double> values) {
            addCriterion("dvalue not in", values, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueBetween(Double value1, Double value2) {
            addCriterion("dvalue between", value1, value2, "dvalue");
            return (Criteria) this;
        }

        public Criteria andDvalueNotBetween(Double value1, Double value2) {
            addCriterion("dvalue not between", value1, value2, "dvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueIsNull() {
            addCriterion("extDValue is null");
            return (Criteria) this;
        }

        public Criteria andExtdvalueIsNotNull() {
            addCriterion("extDValue is not null");
            return (Criteria) this;
        }

        public Criteria andExtdvalueEqualTo(Double value) {
            addCriterion("extDValue =", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueNotEqualTo(Double value) {
            addCriterion("extDValue <>", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueGreaterThan(Double value) {
            addCriterion("extDValue >", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("extDValue >=", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueLessThan(Double value) {
            addCriterion("extDValue <", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueLessThanOrEqualTo(Double value) {
            addCriterion("extDValue <=", value, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueIn(List<Double> values) {
            addCriterion("extDValue in", values, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueNotIn(List<Double> values) {
            addCriterion("extDValue not in", values, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueBetween(Double value1, Double value2) {
            addCriterion("extDValue between", value1, value2, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andExtdvalueNotBetween(Double value1, Double value2) {
            addCriterion("extDValue not between", value1, value2, "extdvalue");
            return (Criteria) this;
        }

        public Criteria andIvalueIsNull() {
            addCriterion("ivalue is null");
            return (Criteria) this;
        }

        public Criteria andIvalueIsNotNull() {
            addCriterion("ivalue is not null");
            return (Criteria) this;
        }

        public Criteria andIvalueEqualTo(Integer value) {
            addCriterion("ivalue =", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueNotEqualTo(Integer value) {
            addCriterion("ivalue <>", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueGreaterThan(Integer value) {
            addCriterion("ivalue >", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ivalue >=", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueLessThan(Integer value) {
            addCriterion("ivalue <", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueLessThanOrEqualTo(Integer value) {
            addCriterion("ivalue <=", value, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueIn(List<Integer> values) {
            addCriterion("ivalue in", values, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueNotIn(List<Integer> values) {
            addCriterion("ivalue not in", values, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueBetween(Integer value1, Integer value2) {
            addCriterion("ivalue between", value1, value2, "ivalue");
            return (Criteria) this;
        }

        public Criteria andIvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("ivalue not between", value1, value2, "ivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueIsNull() {
            addCriterion("extIValue is null");
            return (Criteria) this;
        }

        public Criteria andExtivalueIsNotNull() {
            addCriterion("extIValue is not null");
            return (Criteria) this;
        }

        public Criteria andExtivalueEqualTo(Integer value) {
            addCriterion("extIValue =", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueNotEqualTo(Integer value) {
            addCriterion("extIValue <>", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueGreaterThan(Integer value) {
            addCriterion("extIValue >", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("extIValue >=", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueLessThan(Integer value) {
            addCriterion("extIValue <", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueLessThanOrEqualTo(Integer value) {
            addCriterion("extIValue <=", value, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueIn(List<Integer> values) {
            addCriterion("extIValue in", values, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueNotIn(List<Integer> values) {
            addCriterion("extIValue not in", values, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueBetween(Integer value1, Integer value2) {
            addCriterion("extIValue between", value1, value2, "extivalue");
            return (Criteria) this;
        }

        public Criteria andExtivalueNotBetween(Integer value1, Integer value2) {
            addCriterion("extIValue not between", value1, value2, "extivalue");
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