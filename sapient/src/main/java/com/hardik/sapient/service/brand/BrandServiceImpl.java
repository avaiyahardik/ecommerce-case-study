package com.hardik.sapient.service.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.sapient.converter.brand.BrandConverterService;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepsitory;

	@Autowired
	private BrandConverterService brandConverterService;

	@Override
	public List<Brand> getAllBrands() {
		return brandConverterService.daosToDtos(brandRepsitory.findAll());
	}

	@Override
	public BrandEntity saveBrand(Brand brandEntity) {
		return brandRepsitory.save(brandConverterService.dtoToDao(brandEntity));
	}

	@Override
	public BrandEntity findByName(String name) {
		return brandRepsitory.findByName(name);
	}

}
