package com.piggybank.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.SortedSet;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

import lombok.Data;

@Data
@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private BigDecimal value;
	
	
	@Enumerated(EnumType.ORDINAL)
	private TransactionType type;
	
	private LocalDateTime date;
	
	private String description;
	
	@OrderBy("NAME ASC")
	@ManyToMany
	@JoinTable(
			name = "TRANSACTION_CATEGORY",
			joinColumns = @JoinColumn(name = "TRANSACTION_ID"),
			inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID")
	)
	private SortedSet<Category> categories;
	
}
