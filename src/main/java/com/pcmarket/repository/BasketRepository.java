package com.pcmarket.repository;

import com.pcmarket.entity.Basket;
import com.pcmarket.projection.CustomBasket;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "basket",excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
