package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
}
