package com.pcmarket.repository;

import com.pcmarket.entity.Position;
import com.pcmarket.projection.CustomPosition;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "position",excerptProjection = CustomPosition.class)
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
