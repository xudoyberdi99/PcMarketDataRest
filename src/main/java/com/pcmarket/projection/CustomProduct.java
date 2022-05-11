package com.pcmarket.projection;


import com.pcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
}
