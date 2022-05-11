package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.Position;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Position.class)
public interface CustomPosition {
    Integer getId();
}
