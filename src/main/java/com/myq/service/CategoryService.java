package com.myq.service;

import java.util.List;

import com.myq.model.Category;

public interface CategoryService {
	
	//返回所有新闻种类
	List<Category> findAll();
	//增加新闻种类
	int insertCategory(Category category);
	//更新新闻种类
	void updateCategory(Category category);
	//删除新闻种类
	void deleteCategory(Integer categoryId);
}
