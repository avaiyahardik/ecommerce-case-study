package com.hardik.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.sapient.common.Response;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.service.brand.BrandService;

@RestController()
public class BrandController {

	@Autowired
	private BrandService brandService;

	@GetMapping("/brand")
	public Response getBrands() {
		Response response = new Response();
		response.setData(brandService.getAllBrands());
		return response;
	}

	@PostMapping("/brand")
	public Response saveBrand(@RequestBody Brand brand) {
		Response response = new Response();
		response.setData(brandService.saveBrand(brand));
		return response;
	}

}
