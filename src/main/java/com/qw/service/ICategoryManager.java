package com.qw.service;

import java.util.List;

import com.qw.entity.CategoryEntity;

public interface ICategoryManager {
	   public void addCategory(CategoryEntity category);
	   public List<CategoryEntity> getAllCategories();
	   public void deleteCategory(Integer categoryId);
}
