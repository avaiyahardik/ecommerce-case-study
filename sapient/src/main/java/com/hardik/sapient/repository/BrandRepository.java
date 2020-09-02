package com.hardik.sapient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardik.sapient.entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer> {

	public BrandEntity findByName(String name);

}
