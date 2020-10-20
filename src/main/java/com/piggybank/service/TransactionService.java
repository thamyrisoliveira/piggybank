package com.piggybank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piggybank.entity.Transaction;
import com.piggybank.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction save(Transaction transaction) {
		transactionRepository.save(transaction);
		return transaction;
	}
	public void remove(Long  id) {
		 transactionRepository.deleteById(id);
	}
	public Iterable<Transaction> findAll() {
		return transactionRepository.findAll();
	}
	public Optional<Transaction> findById(Long id) {
		return transactionRepository.findById(id);
	}

	
}
