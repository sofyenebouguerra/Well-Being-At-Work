package com.esprit.pidevbackend.Service;

import java.util.Optional;
import java.util.Set;

import com.esprit.pidevbackend.Domain.Category;



public interface ICategoryService {
	public Category addCategory (Category category);
    public Set<Category> getCategorys();
    public Optional<Category> finCategoryById(Long cid);
    public void DeleteCategory (Long cid);
    public Category UpdateCategory (Category category);
    
   
   
}
