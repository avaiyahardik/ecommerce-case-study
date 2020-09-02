package com.hardik.sapient.converter.brand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;

@Service
public class BrandConverterServiceImpl implements BrandConverterService {

	@Override
	public List<BrandEntity> dtosToDaos(List<Brand> dtos) {

		if (dtos != null) {
			List<BrandEntity> list = new ArrayList<>();
			dtos.forEach(dto -> {
				list.add(new BrandEntity(dto.getId(), dto.getName()));
			});
			return list;
		}
		return null;
	}

	@Override
	public List<Brand> daosToDtos(List<BrandEntity> daos) {
		if (daos != null) {
			List<Brand> list = new ArrayList<>();
			daos.forEach(dao -> {
				list.add(new Brand(dao.getId(), dao.getName()));
			});
			return list;
		}
		return null;
	}

	@Override
	public BrandEntity dtoToDao(Brand dto) {
		if (dto != null) {
			return new BrandEntity(dto.getId(), dto.getName());
		}
		return null;
	}

	@Override
	public Brand daoToDto(BrandEntity dao) {
		if (dao != null) {
			return new Brand(dao.getId(), dao.getName());
		}
		return null;
	}

}
