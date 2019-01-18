package com.myq.dao;

import java.util.List;

import com.myq.model.Category;

public interface CategoryMapperExt {
    //查询所有新闻分类
	List<Category> findAll();
	//更新新闻分类
	void updateByCategory(Category category);
	//删除新闻种类
	void deleteByCategory(Integer categoryId);
	
}