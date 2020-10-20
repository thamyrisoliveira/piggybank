package com.piggybank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piggybank.entity.Category;
import com.piggybank.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	
	private CategoryRepository categoryRepository;
	
	public Category save(Category category) {
		categoryRepository.save(category);
		return category;
	}
	public void remove(Long  id) {
		categoryRepository.deleteById(id);
	
	}
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}
}
