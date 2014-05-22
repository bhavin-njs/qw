package com.qw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qw.dao.ICategoryDAO;
import com.qw.entity.CategoryEntity;

@Service
public class CategoryManager implements ICategoryManager {

	   @Autowired
	   private ICategoryDAO ICategoryDAO;

	   @Transactional
	   public void addCategory(CategoryEntity employee) {
	       ICategoryDAO.addCategory(employee);
	   }

	   @Transactional
	   public List<CategoryEntity> getAllCategories() {
	       return ICategoryDAO.getAllCategories();
	   }

	   @Transactional
	   public void deleteCategory(Integer employeeId) {
	       ICategoryDAO.deleteCategory(employeeId);
	   }
	   public void setICategoryDAO(ICategoryDAO ICategoryDAO) {
	       this.ICategoryDAO = ICategoryDAO;
	   }

}
