package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepo extends JpaRepository<Game,Integer> {

    boolean existsByName(String name);
    Game findByName(String name);
    @Query(
            value = "SELECT * FROM lfg.game;",
            nativeQuery = true)
    List<Game> findAllGames();

}
