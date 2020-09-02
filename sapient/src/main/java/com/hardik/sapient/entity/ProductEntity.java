package com.hardik.sapient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.hardik.sapient.model.Brand;
import com.hardik.sapient.model.Product;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String color;

	@OneToOne
	private BrandEntity brand;

	@OneToOne
	private CategoryEntity category;

	public ProductEntity() {
		// default
	}

	public ProductEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public ProductEntity setBrand(BrandEntity brand) {
		this.brand = brand;
		return this;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public ProductEntity setCategory(CategoryEntity category) {
		this.category = category;
		return this;
	}

	public String getColor() {
		return color;
	}

	public ProductEntity setColor(String color) {
		this.color = color;
		return this;
	}

}
