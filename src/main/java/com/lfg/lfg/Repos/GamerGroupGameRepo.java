package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.GamerGroupGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerGroupGameRepo extends JpaRepository<GamerGroupGame,Integer> {


    GamerGroupGame findByGameTitle(String gameTitle);
    boolean existsByGameTitle(String gameTitle);
}
