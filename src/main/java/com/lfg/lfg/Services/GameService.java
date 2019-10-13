package com.lfg.lfg.Services;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Repos.GameRepo;
import com.lfg.lfg.Repos.GroupRepo;
import com.lfg.lfg.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepo gameRepo;
    @Autowired
    private GroupRepo groupRepo;
    @Autowired
    private UserRepo userRepo;

    public Boolean saveGame(Game game){
        gameRepo.save(game);
        return gameRepo.existsByTitle(game.getTitle());
    }
    public Boolean checkIfGameExists(String title){
        return gameRepo.existsByTitle(title);
    }


}
