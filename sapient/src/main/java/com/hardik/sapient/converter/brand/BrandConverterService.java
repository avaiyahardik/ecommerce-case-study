package com.hardik.sapient.converter.brand;

import java.util.List;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.model.Brand;

public interface BrandConverterService {
	public List<BrandEntity> dtosToDaos(List<Brand> dtos);

	public List<Brand> daosToDtos(List<BrandEntity> daos);

	public BrandEntity dtoToDao(Brand dto);

	public Brand daoToDto(BrandEntity dao);

}
