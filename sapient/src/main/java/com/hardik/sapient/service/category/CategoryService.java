package com.hardik.sapient.service.category;

import java.util.List;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.CategoryEntity;
import com.hardik.sapient.model.Brand;
import com.hardik.sapient.model.Category;

public interface CategoryService {

	public List<Category> getAllCategories();

	public CategoryEntity saveCategory(Category categoryEntity);
}
