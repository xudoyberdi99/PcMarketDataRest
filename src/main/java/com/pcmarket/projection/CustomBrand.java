package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomBrand {
    Integer getId();
}
