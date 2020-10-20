package com.piggybank.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.piggybank.entity.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
