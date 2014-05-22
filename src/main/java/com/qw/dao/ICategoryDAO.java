package com.qw.dao;

import java.util.List;

import com.qw.entity.CategoryEntity;

public interface ICategoryDAO {
    public void addCategory(CategoryEntity category);
    public List<CategoryEntity> getAllCategories();
    public void deleteCategory(Integer categoryId);
}
