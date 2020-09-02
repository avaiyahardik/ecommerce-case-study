package com.hardik.sapient.model;

public class Product {
	private int id;

	private String name;
	private String color;

	private Brand brand;
	private Category category;

	public Product() {
		// default
	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Product setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public Brand getBrand() {
		return brand;
	}

	public Product setBrand(Brand brand) {
		this.brand = brand;
		return this;
	}

	public Category getCategory() {
		return category;
	}

	public Product setCategory(Category category) {
		this.category = category;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Product setColor(String color) {
		this.color = color;
		return this;
	}

}
