package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.Comment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Comment.class)
public interface CustomComment {
    Integer getId();
}
