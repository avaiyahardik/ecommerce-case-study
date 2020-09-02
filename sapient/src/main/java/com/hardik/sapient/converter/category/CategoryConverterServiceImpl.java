package com.hardik.sapient.converter.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hardik.sapient.entity.CategoryEntity;
import com.hardik.sapient.model.Category;

@Service
public class CategoryConverterServiceImpl implements CategoryConverterService {

	@Override
	public List<CategoryEntity> dtosToDaos(List<Category> dtos) {

		if (dtos != null) {
			List<CategoryEntity> list = new ArrayList<>();
			dtos.forEach(dto -> {
				list.add(new CategoryEntity(dto.getId(), dto.getName()));
			});
			return list;
		}
		return null;
	}

	@Override
	public List<Category> daosToDtos(List<CategoryEntity> daos) {
		if (daos != null) {
			List<Category> list = new ArrayList<>();
			daos.forEach(dao -> {
				list.add(new Category(dao.getId(), dao.getName()));
			});
			return list;
		}
		return null;
	}

	@Override
	public CategoryEntity dtoToDao(Category dto) {
		if (dto != null) {
			return new CategoryEntity(dto.getId(), dto.getName());
		}
		return null;
	}

	@Override
	public Category daoToDto(CategoryEntity dao) {
		if (dao != null) {
			return new Category(dao.getId(), dao.getName());
		}
		return null;
	}

}
