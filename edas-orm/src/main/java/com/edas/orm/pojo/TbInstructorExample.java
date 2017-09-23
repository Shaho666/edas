package com.edas.orm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbInstructorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInstructorExample() {
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

        public Criteria andInstructorIdIsNull() {
            addCriterion("instructor_id is null");
            return (Criteria) this;
        }

        public Criteria andInstructorIdIsNotNull() {
            addCriterion("instructor_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorIdEqualTo(String value) {
            addCriterion("instructor_id =", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdNotEqualTo(String value) {
            addCriterion("instructor_id <>", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdGreaterThan(String value) {
            addCriterion("instructor_id >", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_id >=", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdLessThan(String value) {
            addCriterion("instructor_id <", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdLessThanOrEqualTo(String value) {
            addCriterion("instructor_id <=", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdLike(String value) {
            addCriterion("instructor_id like", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdNotLike(String value) {
            addCriterion("instructor_id not like", value, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdIn(List<String> values) {
            addCriterion("instructor_id in", values, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdNotIn(List<String> values) {
            addCriterion("instructor_id not in", values, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdBetween(String value1, String value2) {
            addCriterion("instructor_id between", value1, value2, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorIdNotBetween(String value1, String value2) {
            addCriterion("instructor_id not between", value1, value2, "instructorId");
            return (Criteria) this;
        }

        public Criteria andInstructorNameIsNull() {
            addCriterion("instructor_name is null");
            return (Criteria) this;
        }

        public Criteria andInstructorNameIsNotNull() {
            addCriterion("instructor_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorNameEqualTo(String value) {
            addCriterion("instructor_name =", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameNotEqualTo(String value) {
            addCriterion("instructor_name <>", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameGreaterThan(String value) {
            addCriterion("instructor_name >", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_name >=", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameLessThan(String value) {
            addCriterion("instructor_name <", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameLessThanOrEqualTo(String value) {
            addCriterion("instructor_name <=", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameLike(String value) {
            addCriterion("instructor_name like", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameNotLike(String value) {
            addCriterion("instructor_name not like", value, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameIn(List<String> values) {
            addCriterion("instructor_name in", values, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameNotIn(List<String> values) {
            addCriterion("instructor_name not in", values, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameBetween(String value1, String value2) {
            addCriterion("instructor_name between", value1, value2, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorNameNotBetween(String value1, String value2) {
            addCriterion("instructor_name not between", value1, value2, "instructorName");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordIsNull() {
            addCriterion("instructor_password is null");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordIsNotNull() {
            addCriterion("instructor_password is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordEqualTo(String value) {
            addCriterion("instructor_password =", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordNotEqualTo(String value) {
            addCriterion("instructor_password <>", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordGreaterThan(String value) {
            addCriterion("instructor_password >", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_password >=", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordLessThan(String value) {
            addCriterion("instructor_password <", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordLessThanOrEqualTo(String value) {
            addCriterion("instructor_password <=", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordLike(String value) {
            addCriterion("instructor_password like", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordNotLike(String value) {
            addCriterion("instructor_password not like", value, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordIn(List<String> values) {
            addCriterion("instructor_password in", values, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordNotIn(List<String> values) {
            addCriterion("instructor_password not in", values, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordBetween(String value1, String value2) {
            addCriterion("instructor_password between", value1, value2, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPasswordNotBetween(String value1, String value2) {
            addCriterion("instructor_password not between", value1, value2, "instructorPassword");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceIsNull() {
            addCriterion("instructor_place is null");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceIsNotNull() {
            addCriterion("instructor_place is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceEqualTo(Integer value) {
            addCriterion("instructor_place =", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceNotEqualTo(Integer value) {
            addCriterion("instructor_place <>", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceGreaterThan(Integer value) {
            addCriterion("instructor_place >", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructor_place >=", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceLessThan(Integer value) {
            addCriterion("instructor_place <", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("instructor_place <=", value, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceIn(List<Integer> values) {
            addCriterion("instructor_place in", values, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceNotIn(List<Integer> values) {
            addCriterion("instructor_place not in", values, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceBetween(Integer value1, Integer value2) {
            addCriterion("instructor_place between", value1, value2, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("instructor_place not between", value1, value2, "instructorPlace");
            return (Criteria) this;
        }

        public Criteria andInstructorTelIsNull() {
            addCriterion("instructor_tel is null");
            return (Criteria) this;
        }

        public Criteria andInstructorTelIsNotNull() {
            addCriterion("instructor_tel is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorTelEqualTo(String value) {
            addCriterion("instructor_tel =", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelNotEqualTo(String value) {
            addCriterion("instructor_tel <>", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelGreaterThan(String value) {
            addCriterion("instructor_tel >", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_tel >=", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelLessThan(String value) {
            addCriterion("instructor_tel <", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelLessThanOrEqualTo(String value) {
            addCriterion("instructor_tel <=", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelLike(String value) {
            addCriterion("instructor_tel like", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelNotLike(String value) {
            addCriterion("instructor_tel not like", value, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelIn(List<String> values) {
            addCriterion("instructor_tel in", values, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelNotIn(List<String> values) {
            addCriterion("instructor_tel not in", values, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelBetween(String value1, String value2) {
            addCriterion("instructor_tel between", value1, value2, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorTelNotBetween(String value1, String value2) {
            addCriterion("instructor_tel not between", value1, value2, "instructorTel");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailIsNull() {
            addCriterion("instructor_email is null");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailIsNotNull() {
            addCriterion("instructor_email is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailEqualTo(String value) {
            addCriterion("instructor_email =", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailNotEqualTo(String value) {
            addCriterion("instructor_email <>", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailGreaterThan(String value) {
            addCriterion("instructor_email >", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_email >=", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailLessThan(String value) {
            addCriterion("instructor_email <", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailLessThanOrEqualTo(String value) {
            addCriterion("instructor_email <=", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailLike(String value) {
            addCriterion("instructor_email like", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailNotLike(String value) {
            addCriterion("instructor_email not like", value, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailIn(List<String> values) {
            addCriterion("instructor_email in", values, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailNotIn(List<String> values) {
            addCriterion("instructor_email not in", values, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailBetween(String value1, String value2) {
            addCriterion("instructor_email between", value1, value2, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorEmailNotBetween(String value1, String value2) {
            addCriterion("instructor_email not between", value1, value2, "instructorEmail");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeIsNull() {
            addCriterion("instructor_age is null");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeIsNotNull() {
            addCriterion("instructor_age is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeEqualTo(Integer value) {
            addCriterion("instructor_age =", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeNotEqualTo(Integer value) {
            addCriterion("instructor_age <>", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeGreaterThan(Integer value) {
            addCriterion("instructor_age >", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructor_age >=", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeLessThan(Integer value) {
            addCriterion("instructor_age <", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeLessThanOrEqualTo(Integer value) {
            addCriterion("instructor_age <=", value, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeIn(List<Integer> values) {
            addCriterion("instructor_age in", values, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeNotIn(List<Integer> values) {
            addCriterion("instructor_age not in", values, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeBetween(Integer value1, Integer value2) {
            addCriterion("instructor_age between", value1, value2, "instructorAge");
            return (Criteria) this;
        }

        public Criteria andInstructorAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("instructor_age not between", value1, value2, "instructorAge");
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