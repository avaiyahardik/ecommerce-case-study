package com.hardik.sapient.service.product;

import java.util.List;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.ProductEntity;
import com.hardik.sapient.model.Brand;

public interface ProductService {

	public List<ProductEntity> getAllProducts();

	public ProductEntity saveProduct(ProductEntity productEntity);

	public List<ProductEntity> findByColor(String color);

	public List<ProductEntity> findByBrand(String brand);
}
