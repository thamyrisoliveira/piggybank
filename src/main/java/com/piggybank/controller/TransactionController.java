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

import com.piggybank.entity.Transaction;
import com.piggybank.service.TransactionService;

@RestController
@RequestMapping(path = "transaction")
public class TransactionController {

	@Autowired

	private TransactionService transactionService;

	@PostMapping
	public Transaction save(@RequestBody Transaction transaction) {
		return transactionService.save(transaction);
	}

	@GetMapping
	public Iterable<Transaction> findAll() {
		return transactionService.findAll();
	}

	@PutMapping
	public Transaction update(@RequestBody Transaction transaction) {
		return transactionService.save(transaction);
	}

	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id) {
		transactionService.remove(id);
	}
	@GetMapping(path = "{id}")
	public Optional<Transaction> findOne(@PathVariable Long id) {
		return transactionService.findById(id);
	}

}
