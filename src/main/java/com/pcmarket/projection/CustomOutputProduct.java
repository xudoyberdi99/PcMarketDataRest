package com.pcmarket.projection;


import com.pcmarket.entity.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
}
