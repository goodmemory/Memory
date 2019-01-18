package com.myq.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class newsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public newsExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNull() {
            addCriterion("menu_title is null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNotNull() {
            addCriterion("menu_title is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleEqualTo(String value) {
            addCriterion("menu_title =", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotEqualTo(String value) {
            addCriterion("menu_title <>", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThan(String value) {
            addCriterion("menu_title >", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("menu_title >=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThan(String value) {
            addCriterion("menu_title <", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThanOrEqualTo(String value) {
            addCriterion("menu_title <=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLike(String value) {
            addCriterion("menu_title like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotLike(String value) {
            addCriterion("menu_title not like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIn(List<String> values) {
            addCriterion("menu_title in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotIn(List<String> values) {
            addCriterion("menu_title not in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleBetween(String value1, String value2) {
            addCriterion("menu_title between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotBetween(String value1, String value2) {
            addCriterion("menu_title not between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuImageIsNull() {
            addCriterion("menu_image is null");
            return (Criteria) this;
        }

        public Criteria andMenuImageIsNotNull() {
            addCriterion("menu_image is not null");
            return (Criteria) this;
        }

        public Criteria andMenuImageEqualTo(String value) {
            addCriterion("menu_image =", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageNotEqualTo(String value) {
            addCriterion("menu_image <>", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageGreaterThan(String value) {
            addCriterion("menu_image >", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageGreaterThanOrEqualTo(String value) {
            addCriterion("menu_image >=", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageLessThan(String value) {
            addCriterion("menu_image <", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageLessThanOrEqualTo(String value) {
            addCriterion("menu_image <=", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageLike(String value) {
            addCriterion("menu_image like", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageNotLike(String value) {
            addCriterion("menu_image not like", value, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageIn(List<String> values) {
            addCriterion("menu_image in", values, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageNotIn(List<String> values) {
            addCriterion("menu_image not in", values, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageBetween(String value1, String value2) {
            addCriterion("menu_image between", value1, value2, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuImageNotBetween(String value1, String value2) {
            addCriterion("menu_image not between", value1, value2, "menuImage");
            return (Criteria) this;
        }

        public Criteria andMenuOrignIsNull() {
            addCriterion("menu_orign is null");
            return (Criteria) this;
        }

        public Criteria andMenuOrignIsNotNull() {
            addCriterion("menu_orign is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOrignEqualTo(String value) {
            addCriterion("menu_orign =", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignNotEqualTo(String value) {
            addCriterion("menu_orign <>", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignGreaterThan(String value) {
            addCriterion("menu_orign >", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignGreaterThanOrEqualTo(String value) {
            addCriterion("menu_orign >=", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignLessThan(String value) {
            addCriterion("menu_orign <", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignLessThanOrEqualTo(String value) {
            addCriterion("menu_orign <=", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignLike(String value) {
            addCriterion("menu_orign like", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignNotLike(String value) {
            addCriterion("menu_orign not like", value, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignIn(List<String> values) {
            addCriterion("menu_orign in", values, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignNotIn(List<String> values) {
            addCriterion("menu_orign not in", values, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignBetween(String value1, String value2) {
            addCriterion("menu_orign between", value1, value2, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuOrignNotBetween(String value1, String value2) {
            addCriterion("menu_orign not between", value1, value2, "menuOrign");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorIsNull() {
            addCriterion("menu_author is null");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorIsNotNull() {
            addCriterion("menu_author is not null");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorEqualTo(String value) {
            addCriterion("menu_author =", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorNotEqualTo(String value) {
            addCriterion("menu_author <>", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorGreaterThan(String value) {
            addCriterion("menu_author >", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("menu_author >=", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorLessThan(String value) {
            addCriterion("menu_author <", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorLessThanOrEqualTo(String value) {
            addCriterion("menu_author <=", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorLike(String value) {
            addCriterion("menu_author like", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorNotLike(String value) {
            addCriterion("menu_author not like", value, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorIn(List<String> values) {
            addCriterion("menu_author in", values, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorNotIn(List<String> values) {
            addCriterion("menu_author not in", values, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorBetween(String value1, String value2) {
            addCriterion("menu_author between", value1, value2, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuAuthorNotBetween(String value1, String value2) {
            addCriterion("menu_author not between", value1, value2, "menuAuthor");
            return (Criteria) this;
        }

        public Criteria andMenuContentIsNull() {
            addCriterion("menu_content is null");
            return (Criteria) this;
        }

        public Criteria andMenuContentIsNotNull() {
            addCriterion("menu_content is not null");
            return (Criteria) this;
        }

        public Criteria andMenuContentEqualTo(String value) {
            addCriterion("menu_content =", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotEqualTo(String value) {
            addCriterion("menu_content <>", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentGreaterThan(String value) {
            addCriterion("menu_content >", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentGreaterThanOrEqualTo(String value) {
            addCriterion("menu_content >=", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLessThan(String value) {
            addCriterion("menu_content <", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLessThanOrEqualTo(String value) {
            addCriterion("menu_content <=", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLike(String value) {
            addCriterion("menu_content like", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotLike(String value) {
            addCriterion("menu_content not like", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentIn(List<String> values) {
            addCriterion("menu_content in", values, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotIn(List<String> values) {
            addCriterion("menu_content not in", values, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentBetween(String value1, String value2) {
            addCriterion("menu_content between", value1, value2, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotBetween(String value1, String value2) {
            addCriterion("menu_content not between", value1, value2, "menuContent");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNull() {
            addCriterion("last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeEqualTo(Date value) {
            addCriterion("last_edit_time =", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotEqualTo(Date value) {
            addCriterion("last_edit_time <>", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThan(Date value) {
            addCriterion("last_edit_time >", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_edit_time >=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThan(Date value) {
            addCriterion("last_edit_time <", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_edit_time <=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIn(List<Date> values) {
            addCriterion("last_edit_time in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotIn(List<Date> values) {
            addCriterion("last_edit_time not in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeBetween(Date value1, Date value2) {
            addCriterion("last_edit_time between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_edit_time not between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("menu_sort is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("menu_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Integer value) {
            addCriterion("menu_sort =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Integer value) {
            addCriterion("menu_sort <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Integer value) {
            addCriterion("menu_sort >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_sort >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Integer value) {
            addCriterion("menu_sort <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("menu_sort <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Integer> values) {
            addCriterion("menu_sort in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Integer> values) {
            addCriterion("menu_sort not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort not between", value1, value2, "menuSort");
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