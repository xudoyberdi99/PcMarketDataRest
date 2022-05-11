package com.pcmarket.repository;

import com.pcmarket.entity.Address;
import com.pcmarket.projection.CustomAddress;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "address",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
