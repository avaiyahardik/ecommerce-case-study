package com.hardik.sapient.service.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.sapient.converter.brand.BrandConverterService;
import com.hardik.sapient.converter.category.CategoryConverterService;
import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.CategoryEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.model.Category;
import com.hardik.sapient.repository.BrandRepository;
import com.hardik.sapient.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository brandRepsitory;

	@Autowired
	private CategoryConverterService brandConverterService;

	@Override
	public List<Category> getAllCategories() {
		return brandConverterService.daosToDtos(brandRepsitory.findAll());
	}

	@Override
	public CategoryEntity saveCategory(Category categoryEntity) {
		return brandRepsitory.save(brandConverterService.dtoToDao(categoryEntity));
	}
}
