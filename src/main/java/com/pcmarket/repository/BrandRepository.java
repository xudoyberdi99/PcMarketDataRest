package com.pcmarket.repository;

import com.pcmarket.entity.Brand;
import com.pcmarket.projection.CustomBrand;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "brand",excerptProjection = CustomBrand.class)
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
