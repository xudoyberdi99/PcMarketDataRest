package com.pcmarket.projection;

import com.pcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
}
