package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.GamerGroupGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerGroupGameRepo extends JpaRepository<GamerGroupGame,Integer> {


    GamerGroupGame findByGameTitleandgroupId(String gameTitle,Integer groupId);
    boolean existsByGameTitleandgroupId(String gameTitle,Integer groupId);
    GamerGroup findyByGamerGroupIdandGameId(Integer gamerGroupId,Integer gameId);
}
