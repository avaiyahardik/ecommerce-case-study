package com.hardik.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.sapient.common.Response;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.model.Category;
import com.hardik.sapient.service.brand.BrandService;
import com.hardik.sapient.service.category.CategoryService;

@RestController()
public class CategoryController {

	@Autowired
	private CategoryService categoryervice;

	@GetMapping("/category")
	public Response getBrands() {
		Response response = new Response();
		response.setData(categoryervice.getAllCategories());
		return response;
	}

	@PostMapping("/category")
	public Response saveBrand(@RequestBody Category category) {
		Response response = new Response();
		response.setData(categoryervice.saveCategory(category));
		return response;
	}

}
