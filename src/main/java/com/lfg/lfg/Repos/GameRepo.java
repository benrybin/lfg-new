package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<Game,Integer> {

    boolean existsByTitle(String name);
    Game findByTitle(String name);


}
