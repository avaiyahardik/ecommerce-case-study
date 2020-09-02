package com.hardik.sapient.model;

public class Category {
	private int id;
	private String name;

	public Category() {
		// default
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Category setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Category setName(String name) {
		this.name = name;
		return this;
	}

}
