package com.pcmarket.repository;

import com.pcmarket.entity.Order;
import com.pcmarket.projection.CustomOrder;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
