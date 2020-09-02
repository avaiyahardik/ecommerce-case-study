package com.hardik.sapient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	public BrandEntity() {
		// default
	}

	public BrandEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public BrandEntity setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public BrandEntity setName(String name) {
		this.name = name;
		return this;
	}

}
