package com.myq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myq.model.Category;
import com.myq.service.CategoryService;
import com.myq.utils.Result;
import com.myq.utils.ResultBuilder;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value="/list")
	public Result list() {
		List<Category> list = categoryService.findAll();
		return ResultBuilder.SUCCESS.build(list);
	}
	@RequestMapping("/add")
	public Result add(Category category) {
		int category1 = categoryService.insertCategory(category);
		return ResultBuilder.SUCCESS.build(category1);
	}
	@RequestMapping("/update")
	public Result update(Category category) {
		categoryService.updateCategory(category);
		return ResultBuilder.SUCCESS.build();
	}
	@RequestMapping("/delete")
	public Result delete(Integer categoryId) {
		categoryService.deleteCategory(categoryId);
		return ResultBuilder.SUCCESS.build();
	}
}
