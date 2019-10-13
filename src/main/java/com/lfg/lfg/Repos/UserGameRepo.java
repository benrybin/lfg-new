package com.lfg.lfg.Repos;


import com.lfg.lfg.Models.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGameRepo extends JpaRepository<UserGame,Integer> {
    UserGame findByGameTitle(String gameTitle);
    boolean existsByGameTitle(String gameTitle);
}
