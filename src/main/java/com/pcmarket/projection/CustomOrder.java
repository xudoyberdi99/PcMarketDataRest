package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.Order;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
}
