package com.lfg.lfg.Services;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Models.User;
import com.lfg.lfg.Models.UserGame;
import com.lfg.lfg.Repos.GameRepo;
import com.lfg.lfg.Repos.UserGameRepo;
import com.lfg.lfg.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGameService {

    @Autowired
    private UserGameRepo userGameRepo;
    @Autowired
    private GameRepo gameRepo;
    @Autowired
    private UserRepo userRepo;

    public Boolean saveUserGame(String userName, String gameTitle){

        if(!userGameRepo.existsByGameTitle(gameTitle)){
            Game currentGame = gameRepo.findByTitle(gameTitle);
            User currentUser = userRepo.findByuserName(userName);
            UserGame savedGame = new UserGame(currentGame,currentUser,currentGame.getTitle());

            userGameRepo.save(savedGame);
            return userGameRepo.existsByGameTitle(gameTitle);


        }
        return false;



    }
}
