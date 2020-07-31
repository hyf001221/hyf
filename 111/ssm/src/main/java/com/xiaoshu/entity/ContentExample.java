package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.List;

public class ContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentExample() {
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

        public Criteria andContenidIsNull() {
            addCriterion("contenId is null");
            return (Criteria) this;
        }

        public Criteria andContenidIsNotNull() {
            addCriterion("contenId is not null");
            return (Criteria) this;
        }

        public Criteria andContenidEqualTo(Integer value) {
            addCriterion("contenId =", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidNotEqualTo(Integer value) {
            addCriterion("contenId <>", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidGreaterThan(Integer value) {
            addCriterion("contenId >", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contenId >=", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidLessThan(Integer value) {
            addCriterion("contenId <", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidLessThanOrEqualTo(Integer value) {
            addCriterion("contenId <=", value, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidIn(List<Integer> values) {
            addCriterion("contenId in", values, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidNotIn(List<Integer> values) {
            addCriterion("contenId not in", values, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidBetween(Integer value1, Integer value2) {
            addCriterion("contenId between", value1, value2, "contenid");
            return (Criteria) this;
        }

        public Criteria andContenidNotBetween(Integer value1, Integer value2) {
            addCriterion("contenId not between", value1, value2, "contenid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidIsNull() {
            addCriterion("contentCatgoryId is null");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidIsNotNull() {
            addCriterion("contentCatgoryId is not null");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidEqualTo(String value) {
            addCriterion("contentCatgoryId =", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidNotEqualTo(String value) {
            addCriterion("contentCatgoryId <>", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidGreaterThan(String value) {
            addCriterion("contentCatgoryId >", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidGreaterThanOrEqualTo(String value) {
            addCriterion("contentCatgoryId >=", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidLessThan(String value) {
            addCriterion("contentCatgoryId <", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidLessThanOrEqualTo(String value) {
            addCriterion("contentCatgoryId <=", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidLike(String value) {
            addCriterion("contentCatgoryId like", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidNotLike(String value) {
            addCriterion("contentCatgoryId not like", value, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidIn(List<String> values) {
            addCriterion("contentCatgoryId in", values, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidNotIn(List<String> values) {
            addCriterion("contentCatgoryId not in", values, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidBetween(String value1, String value2) {
            addCriterion("contentCatgoryId between", value1, value2, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContentcatgoryidNotBetween(String value1, String value2) {
            addCriterion("contentCatgoryId not between", value1, value2, "contentcatgoryid");
            return (Criteria) this;
        }

        public Criteria andContenttitleIsNull() {
            addCriterion("contenttitle is null");
            return (Criteria) this;
        }

        public Criteria andContenttitleIsNotNull() {
            addCriterion("contenttitle is not null");
            return (Criteria) this;
        }

        public Criteria andContenttitleEqualTo(String value) {
            addCriterion("contenttitle =", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleNotEqualTo(String value) {
            addCriterion("contenttitle <>", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleGreaterThan(String value) {
            addCriterion("contenttitle >", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleGreaterThanOrEqualTo(String value) {
            addCriterion("contenttitle >=", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleLessThan(String value) {
            addCriterion("contenttitle <", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleLessThanOrEqualTo(String value) {
            addCriterion("contenttitle <=", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleLike(String value) {
            addCriterion("contenttitle like", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleNotLike(String value) {
            addCriterion("contenttitle not like", value, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleIn(List<String> values) {
            addCriterion("contenttitle in", values, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleNotIn(List<String> values) {
            addCriterion("contenttitle not in", values, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleBetween(String value1, String value2) {
            addCriterion("contenttitle between", value1, value2, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenttitleNotBetween(String value1, String value2) {
            addCriterion("contenttitle not between", value1, value2, "contenttitle");
            return (Criteria) this;
        }

        public Criteria andContenturlIsNull() {
            addCriterion("contenturl is null");
            return (Criteria) this;
        }

        public Criteria andContenturlIsNotNull() {
            addCriterion("contenturl is not null");
            return (Criteria) this;
        }

        public Criteria andContenturlEqualTo(String value) {
            addCriterion("contenturl =", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotEqualTo(String value) {
            addCriterion("contenturl <>", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlGreaterThan(String value) {
            addCriterion("contenturl >", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlGreaterThanOrEqualTo(String value) {
            addCriterion("contenturl >=", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLessThan(String value) {
            addCriterion("contenturl <", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLessThanOrEqualTo(String value) {
            addCriterion("contenturl <=", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLike(String value) {
            addCriterion("contenturl like", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotLike(String value) {
            addCriterion("contenturl not like", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlIn(List<String> values) {
            addCriterion("contenturl in", values, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotIn(List<String> values) {
            addCriterion("contenturl not in", values, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlBetween(String value1, String value2) {
            addCriterion("contenturl between", value1, value2, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotBetween(String value1, String value2) {
            addCriterion("contenturl not between", value1, value2, "contenturl");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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