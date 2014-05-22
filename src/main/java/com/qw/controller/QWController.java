package com.qw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qw.entity.CategoryEntity;
import com.qw.service.ICategoryManager;

@Controller
public class QWController {
	   @Autowired
	   private ICategoryManager categoryManager;
	   
	   @RequestMapping(value = "/", method = RequestMethod.GET)
	   public String listCategories(ModelMap map)
	   {
	       map.addAttribute("category", new CategoryEntity());
	       map.addAttribute("categoryList", categoryManager.getAllCategories());
	       return "editCategoryList";
	   }
	   @RequestMapping(value = "/add", method = RequestMethod.POST)
	   public String addCategory(@ModelAttribute(value="category") CategoryEntity category, BindingResult result)
	   {
	       categoryManager.addCategory(category);
	       return "redirect:/";
	   }
	   @RequestMapping("/delete/{categoryId}")
	   public String deleteCategory(@PathVariable("categoryId") Integer categoryId)
	   {
	       categoryManager.deleteCategory(categoryId);
	       return "redirect:/";
	   }
	   public void setICategoryManager(ICategoryManager categoryManager) {
	       this.categoryManager = categoryManager;
	   }
}
