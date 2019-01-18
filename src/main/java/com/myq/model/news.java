package com.myq.model;

import java.util.Date;

public class news {
    private Integer menuId;

    private String menuTitle;

    private String menuImage;

    private String menuOrign;

    private String menuAuthor;

    private String menuContent;

    private Integer categoryId;

    private Date createTime;

    private Date lastEditTime;

    private Integer menuSort;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    public String getMenuOrign() {
        return menuOrign;
    }

    public void setMenuOrign(String menuOrign) {
        this.menuOrign = menuOrign;
    }

    public String getMenuAuthor() {
        return menuAuthor;
    }

    public void setMenuAuthor(String menuAuthor) {
        this.menuAuthor = menuAuthor;
    }

    public String getMenuContent() {
        return menuContent;
    }

    public void setMenuContent(String menuContent) {
        this.menuContent = menuContent;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }
}