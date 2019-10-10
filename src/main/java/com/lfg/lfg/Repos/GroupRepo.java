package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.GamerGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<GamerGroup,Integer> {
    boolean existsBygroupName(String groupName);
    GamerGroup findBygroupName(String groupName);
}
