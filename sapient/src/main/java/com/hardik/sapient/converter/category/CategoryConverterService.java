package com.hardik.sapient.converter.category;

import java.util.List;

import com.hardik.sapient.entity.CategoryEntity;
import com.hardik.sapient.model.Category;

public interface CategoryConverterService {
	public List<CategoryEntity> dtosToDaos(List<Category> dtos);

	public List<Category> daosToDtos(List<CategoryEntity> daos);

	public CategoryEntity dtoToDao(Category dto);

	public Category daoToDto(CategoryEntity dao);

}
