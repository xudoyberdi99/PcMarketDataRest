package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.Basket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Basket.class)
public interface CustomBasket {
    Integer getid();
}
