package com.piggybank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Category implements Comparable<Category> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String name;

	@Override
	public int compareTo(Category o) {
		return this.name.compareTo(o.getName());
	}
}
