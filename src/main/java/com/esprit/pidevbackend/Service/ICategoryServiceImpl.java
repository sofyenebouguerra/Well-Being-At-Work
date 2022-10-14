package com.esprit.pidevbackend.Service;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.pidevbackend.Domain.Category;
import com.esprit.pidevbackend.Repository.CategoryRepository;



@Service
public class ICategoryServiceImpl implements ICategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
	 return categoryRepository.save(category);
	}

	@Override
	public Set<Category> getCategorys() {
		// TODO Auto-generated method stub
		return new LinkedHashSet( categoryRepository.findAll());
	}

	@Override
	public void DeleteCategory(Long cid) {
		categoryRepository.deleteById(cid);
	}

	@Override
	public Category UpdateCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Optional<Category> finCategoryById(Long cid) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(cid);
	}

	

	


}

