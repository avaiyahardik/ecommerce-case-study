package com.hardik.sapient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	public CategoryEntity() {
		// default
	}

	public CategoryEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public CategoryEntity setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public CategoryEntity setName(String name) {
		this.name = name;
		return this;
	}

}
