package com.jydacai.DLMServer.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andIpaddrIsNull() {
            addCriterion("ipAddr is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("ipAddr is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("ipAddr =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("ipAddr <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("ipAddr >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddr >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("ipAddr <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("ipAddr <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("ipAddr like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("ipAddr not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("ipAddr in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("ipAddr not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("ipAddr between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("ipAddr not between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andAccessdateIsNull() {
            addCriterion("accessDate is null");
            return (Criteria) this;
        }

        public Criteria andAccessdateIsNotNull() {
            addCriterion("accessDate is not null");
            return (Criteria) this;
        }

        public Criteria andAccessdateEqualTo(Date value) {
            addCriterionForJDBCDate("accessDate =", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accessDate <>", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateGreaterThan(Date value) {
            addCriterionForJDBCDate("accessDate >", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accessDate >=", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateLessThan(Date value) {
            addCriterionForJDBCDate("accessDate <", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accessDate <=", value, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateIn(List<Date> values) {
            addCriterionForJDBCDate("accessDate in", values, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accessDate not in", values, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accessDate between", value1, value2, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccessdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accessDate not between", value1, value2, "accessdate");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNull() {
            addCriterion("accessTime is null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNotNull() {
            addCriterion("accessTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeEqualTo(Date value) {
            addCriterionForJDBCTime("accessTime =", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("accessTime <>", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThan(Date value) {
            addCriterionForJDBCTime("accessTime >", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("accessTime >=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThan(Date value) {
            addCriterionForJDBCTime("accessTime <", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("accessTime <=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIn(List<Date> values) {
            addCriterionForJDBCTime("accessTime in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("accessTime not in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("accessTime between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("accessTime not between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneIsNull() {
            addCriterion("accessTimezone is null");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneIsNotNull() {
            addCriterion("accessTimezone is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneEqualTo(Integer value) {
            addCriterion("accessTimezone =", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneNotEqualTo(Integer value) {
            addCriterion("accessTimezone <>", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneGreaterThan(Integer value) {
            addCriterion("accessTimezone >", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("accessTimezone >=", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneLessThan(Integer value) {
            addCriterion("accessTimezone <", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneLessThanOrEqualTo(Integer value) {
            addCriterion("accessTimezone <=", value, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneIn(List<Integer> values) {
            addCriterion("accessTimezone in", values, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneNotIn(List<Integer> values) {
            addCriterion("accessTimezone not in", values, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneBetween(Integer value1, Integer value2) {
            addCriterion("accessTimezone between", value1, value2, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andAccesstimezoneNotBetween(Integer value1, Integer value2) {
            addCriterion("accessTimezone not between", value1, value2, "accesstimezone");
            return (Criteria) this;
        }

        public Criteria andExtrainfoIsNull() {
            addCriterion("extraInfo is null");
            return (Criteria) this;
        }

        public Criteria andExtrainfoIsNotNull() {
            addCriterion("extraInfo is not null");
            return (Criteria) this;
        }

        public Criteria andExtrainfoEqualTo(String value) {
            addCriterion("extraInfo =", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoNotEqualTo(String value) {
            addCriterion("extraInfo <>", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoGreaterThan(String value) {
            addCriterion("extraInfo >", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoGreaterThanOrEqualTo(String value) {
            addCriterion("extraInfo >=", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoLessThan(String value) {
            addCriterion("extraInfo <", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoLessThanOrEqualTo(String value) {
            addCriterion("extraInfo <=", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoLike(String value) {
            addCriterion("extraInfo like", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoNotLike(String value) {
            addCriterion("extraInfo not like", value, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoIn(List<String> values) {
            addCriterion("extraInfo in", values, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoNotIn(List<String> values) {
            addCriterion("extraInfo not in", values, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoBetween(String value1, String value2) {
            addCriterion("extraInfo between", value1, value2, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andExtrainfoNotBetween(String value1, String value2) {
            addCriterion("extraInfo not between", value1, value2, "extrainfo");
            return (Criteria) this;
        }

        public Criteria andDeniedIsNull() {
            addCriterion("denied is null");
            return (Criteria) this;
        }

        public Criteria andDeniedIsNotNull() {
            addCriterion("denied is not null");
            return (Criteria) this;
        }

        public Criteria andDeniedEqualTo(Boolean value) {
            addCriterion("denied =", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedNotEqualTo(Boolean value) {
            addCriterion("denied <>", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedGreaterThan(Boolean value) {
            addCriterion("denied >", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("denied >=", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedLessThan(Boolean value) {
            addCriterion("denied <", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedLessThanOrEqualTo(Boolean value) {
            addCriterion("denied <=", value, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedIn(List<Boolean> values) {
            addCriterion("denied in", values, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedNotIn(List<Boolean> values) {
            addCriterion("denied not in", values, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedBetween(Boolean value1, Boolean value2) {
            addCriterion("denied between", value1, value2, "denied");
            return (Criteria) this;
        }

        public Criteria andDeniedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("denied not between", value1, value2, "denied");
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