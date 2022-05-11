package com.pcmarket.projection;

import com.pcmarket.entity.Address;
import com.pcmarket.entity.TeamMember;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = TeamMember.class)
public interface CustomTeamMember {
    Integer getId();
}
