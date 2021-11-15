package com.jydacai.DLMServer.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NASExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NASExample() {
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

        public Criteria andTimeIndexIsNull() {
            addCriterion("time_index is null");
            return (Criteria) this;
        }

        public Criteria andTimeIndexIsNotNull() {
            addCriterion("time_index is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIndexEqualTo(Date value) {
            addCriterion("time_index =", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexNotEqualTo(Date value) {
            addCriterion("time_index <>", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexGreaterThan(Date value) {
            addCriterion("time_index >", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexGreaterThanOrEqualTo(Date value) {
            addCriterion("time_index >=", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexLessThan(Date value) {
            addCriterion("time_index <", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexLessThanOrEqualTo(Date value) {
            addCriterion("time_index <=", value, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexIn(List<Date> values) {
            addCriterion("time_index in", values, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexNotIn(List<Date> values) {
            addCriterion("time_index not in", values, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexBetween(Date value1, Date value2) {
            addCriterion("time_index between", value1, value2, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andTimeIndexNotBetween(Date value1, Date value2) {
            addCriterion("time_index not between", value1, value2, "timeIndex");
            return (Criteria) this;
        }

        public Criteria andMilliMulIsNull() {
            addCriterion("milli_mul is null");
            return (Criteria) this;
        }

        public Criteria andMilliMulIsNotNull() {
            addCriterion("milli_mul is not null");
            return (Criteria) this;
        }

        public Criteria andMilliMulEqualTo(Integer value) {
            addCriterion("milli_mul =", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulNotEqualTo(Integer value) {
            addCriterion("milli_mul <>", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulGreaterThan(Integer value) {
            addCriterion("milli_mul >", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulGreaterThanOrEqualTo(Integer value) {
            addCriterion("milli_mul >=", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulLessThan(Integer value) {
            addCriterion("milli_mul <", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulLessThanOrEqualTo(Integer value) {
            addCriterion("milli_mul <=", value, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulIn(List<Integer> values) {
            addCriterion("milli_mul in", values, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulNotIn(List<Integer> values) {
            addCriterion("milli_mul not in", values, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulBetween(Integer value1, Integer value2) {
            addCriterion("milli_mul between", value1, value2, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliMulNotBetween(Integer value1, Integer value2) {
            addCriterion("milli_mul not between", value1, value2, "milliMul");
            return (Criteria) this;
        }

        public Criteria andMilliIndexIsNull() {
            addCriterion("milli_index is null");
            return (Criteria) this;
        }

        public Criteria andMilliIndexIsNotNull() {
            addCriterion("milli_index is not null");
            return (Criteria) this;
        }

        public Criteria andMilliIndexEqualTo(Integer value) {
            addCriterion("milli_index =", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexNotEqualTo(Integer value) {
            addCriterion("milli_index <>", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexGreaterThan(Integer value) {
            addCriterion("milli_index >", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("milli_index >=", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexLessThan(Integer value) {
            addCriterion("milli_index <", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexLessThanOrEqualTo(Integer value) {
            addCriterion("milli_index <=", value, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexIn(List<Integer> values) {
            addCriterion("milli_index in", values, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexNotIn(List<Integer> values) {
            addCriterion("milli_index not in", values, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexBetween(Integer value1, Integer value2) {
            addCriterion("milli_index between", value1, value2, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andMilliIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("milli_index not between", value1, value2, "milliIndex");
            return (Criteria) this;
        }

        public Criteria andAvgAmpIsNull() {
            addCriterion("avg_amp is null");
            return (Criteria) this;
        }

        public Criteria andAvgAmpIsNotNull() {
            addCriterion("avg_amp is not null");
            return (Criteria) this;
        }

        public Criteria andAvgAmpEqualTo(Double value) {
            addCriterion("avg_amp =", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpNotEqualTo(Double value) {
            addCriterion("avg_amp <>", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpGreaterThan(Double value) {
            addCriterion("avg_amp >", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_amp >=", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpLessThan(Double value) {
            addCriterion("avg_amp <", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpLessThanOrEqualTo(Double value) {
            addCriterion("avg_amp <=", value, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpIn(List<Double> values) {
            addCriterion("avg_amp in", values, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpNotIn(List<Double> values) {
            addCriterion("avg_amp not in", values, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpBetween(Double value1, Double value2) {
            addCriterion("avg_amp between", value1, value2, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andAvgAmpNotBetween(Double value1, Double value2) {
            addCriterion("avg_amp not between", value1, value2, "avgAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpIsNull() {
            addCriterion("max_amp is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmpIsNotNull() {
            addCriterion("max_amp is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmpEqualTo(Double value) {
            addCriterion("max_amp =", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpNotEqualTo(Double value) {
            addCriterion("max_amp <>", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpGreaterThan(Double value) {
            addCriterion("max_amp >", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpGreaterThanOrEqualTo(Double value) {
            addCriterion("max_amp >=", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpLessThan(Double value) {
            addCriterion("max_amp <", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpLessThanOrEqualTo(Double value) {
            addCriterion("max_amp <=", value, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpIn(List<Double> values) {
            addCriterion("max_amp in", values, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpNotIn(List<Double> values) {
            addCriterion("max_amp not in", values, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpBetween(Double value1, Double value2) {
            addCriterion("max_amp between", value1, value2, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMaxAmpNotBetween(Double value1, Double value2) {
            addCriterion("max_amp not between", value1, value2, "maxAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpIsNull() {
            addCriterion("min_amp is null");
            return (Criteria) this;
        }

        public Criteria andMinAmpIsNotNull() {
            addCriterion("min_amp is not null");
            return (Criteria) this;
        }

        public Criteria andMinAmpEqualTo(Double value) {
            addCriterion("min_amp =", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpNotEqualTo(Double value) {
            addCriterion("min_amp <>", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpGreaterThan(Double value) {
            addCriterion("min_amp >", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpGreaterThanOrEqualTo(Double value) {
            addCriterion("min_amp >=", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpLessThan(Double value) {
            addCriterion("min_amp <", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpLessThanOrEqualTo(Double value) {
            addCriterion("min_amp <=", value, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpIn(List<Double> values) {
            addCriterion("min_amp in", values, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpNotIn(List<Double> values) {
            addCriterion("min_amp not in", values, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpBetween(Double value1, Double value2) {
            addCriterion("min_amp between", value1, value2, "minAmp");
            return (Criteria) this;
        }

        public Criteria andMinAmpNotBetween(Double value1, Double value2) {
            addCriterion("min_amp not between", value1, value2, "minAmp");
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