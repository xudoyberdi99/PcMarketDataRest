package com.pcmarket.repository;

import com.pcmarket.entity.TeamMember;
import com.pcmarket.projection.CustomTeamMember;
import com.pcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teamMember",excerptProjection = CustomTeamMember.class)
public interface TeamMemberRepository extends JpaRepository<TeamMember,Integer> {
}
