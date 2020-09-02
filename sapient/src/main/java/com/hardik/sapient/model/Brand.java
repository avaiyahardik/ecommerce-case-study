package com.hardik.sapient.model;

public class Brand {
	private int id;
	private String name;

	public Brand() {
		// default
	}

	public Brand(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Brand setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Brand setName(String name) {
		this.name = name;
		return this;
	}

}
