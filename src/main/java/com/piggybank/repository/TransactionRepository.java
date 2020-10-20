package com.piggybank.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.piggybank.entity.Transaction;

@Repository
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {

}
