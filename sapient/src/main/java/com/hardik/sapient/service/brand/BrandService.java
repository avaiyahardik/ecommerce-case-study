package com.hardik.sapient.service.brand;

import java.util.List;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;

public interface BrandService {

	public List<Brand> getAllBrands();

	public BrandEntity saveBrand(Brand brandEntity);

	public BrandEntity findByName(String name);
}
