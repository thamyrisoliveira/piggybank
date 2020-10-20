package com.piggybank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piggybank.entity.Category;
import com.piggybank.service.CategoryService;

@RestController
@RequestMapping(path = "category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);
	}
	
	@GetMapping
	public Iterable<Category> findAll(){
		return categoryService.findAll();
	}
	
	@PutMapping
	public Category update(@RequestBody Category category){
		return categoryService.save(category);
	}
	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id) {
		categoryService.remove(id);
	}
	@GetMapping(path = "{id}")
	public Optional<Category> findOne(@PathVariable Long id) {
		return categoryService.findById(id);
	}
	
}
