package com.pcmarket.repository;

import com.pcmarket.entity.Comment;
import com.pcmarket.projection.CustomComment;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comment",excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
