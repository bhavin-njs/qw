package com.qw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qw.entity.CategoryEntity;

@Repository
public class CategoryDAO implements ICategoryDAO{
	   @Autowired
	   private SessionFactory sessionFactory;
	   
	   public void addCategory(CategoryEntity category) {
	       this.sessionFactory.getCurrentSession().save(category);
	   }
	   @SuppressWarnings("unchecked")
	   public List<CategoryEntity> getAllCategories() {
	       return this.sessionFactory.getCurrentSession().createQuery("from CategoryEntity").list();
	   }

	   public void deleteCategory(Integer categoryId) {
		   CategoryEntity category = (CategoryEntity) sessionFactory.getCurrentSession().load(
				   CategoryEntity.class, categoryId);
	       if (null != category) {
	           this.sessionFactory.getCurrentSession().delete(category);
	       }
	   }


}
