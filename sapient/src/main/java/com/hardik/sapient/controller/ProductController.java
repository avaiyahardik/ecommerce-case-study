package com.hardik.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.sapient.common.Response;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.ProductEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.service.brand.BrandService;
import com.hardik.sapient.service.product.ProductService;

@RestController()
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public Response getProducts() {
		Response response = new Response();
		response.setData(productService.getAllProducts());
		return response;
	}

	@GetMapping("/productByBrand")
	public Response getProductsByBrand(@RequestParam String brandName) {
		Response response = new Response();
		response.setData(productService.findByBrand(brandName));
		return response;
	}

	@GetMapping("/productByColor")
	public Response getProductsByColor(@RequestParam String color) {
		Response response = new Response();
		response.setData(productService.findByColor(color));
		return response;
	}

	@PostMapping("/product")
	public Response saveBrand(@RequestBody ProductEntity product) {
		Response response = new Response();
		response.setData(productService.saveProduct(product));
		return response;
	}

}
