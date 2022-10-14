package com.esprit.pidevbackend.Web;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.pidevbackend.Domain.Category;
import com.esprit.pidevbackend.Service.ICategoryService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Category")
public class CategoryRestController {
	
	@Autowired
	ICategoryService categoryservice;
	
	
	

	@PostMapping("/addC")
	public Category addCategory(@RequestBody Category category) {
		return categoryservice.addCategory(category);
	}
	@GetMapping("/GetAllC")
    public Set<Category> getCategos(){
		return categoryservice.getCategorys();
	}
	@GetMapping("/getC/{cid}")
	public Optional<Category> findById(@PathVariable ("cid") Long cid) {
		return categoryservice.finCategoryById(cid) ;
	}
	@DeleteMapping("/DelC/{cid}")
    public void DeleteG (@PathVariable("cid")  Long cid) {
    	categoryservice.DeleteCategory(cid);
    }
	@PutMapping("/UpC")
    public Category UpdateC (@RequestBody Category category) {
    	return categoryservice.UpdateCategory(category);
    }
	//////////////////////////
	
	
}
