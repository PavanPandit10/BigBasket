package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Category;
import com.example.Repo.CategoryRepository;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

	@Autowired
	private CategoryRepository repo;
	
	
	@PostMapping
	public Category saveAllData(@RequestBody Category category)
	{
		return repo.save(category);
	}
	
	@GetMapping
	public List<Category> getAllData()
	{
		 return repo.findAll();
	}
}
