package com.hardik.sapient.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.sapient.converter.brand.BrandConverterService;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.ProductEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.repository.BrandRepository;
import com.hardik.sapient.repository.ProductRepository;
import com.hardik.sapient.service.brand.BrandService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepsitory;

	@Autowired
	private BrandService brandService;

	@Override
	public List<ProductEntity> getAllProducts() {
		return productRepsitory.findAll();
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		return productRepsitory.save(productEntity);
	}

	@Override
	public List<ProductEntity> findByColor(String color) {
		return productRepsitory.findByColor(color);
	}

	@Override
	public List<ProductEntity> findByBrand(String brandName) {
		BrandEntity brand = brandService.findByName(brandName);
		if (brand != null) {
			return productRepsitory.findByBrand(brand);
		}
		return null;
	}

}
