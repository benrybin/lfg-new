package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<Group,Integer> {
}
