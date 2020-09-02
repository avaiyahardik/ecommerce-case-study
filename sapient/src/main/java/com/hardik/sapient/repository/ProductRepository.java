package com.hardik.sapient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardik.sapient.entity.BrandEntity;
import com.hardik.sapient.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

	public List<ProductEntity> findByBrand(BrandEntity brand);

	public List<ProductEntity> findByColor(String color);
}
