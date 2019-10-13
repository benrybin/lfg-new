package com.lfg.lfg.Services;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.GamerGroupGame;
import com.lfg.lfg.Repos.GameRepo;
import com.lfg.lfg.Repos.GamerGroupGameRepo;
import com.lfg.lfg.Repos.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamerGroupGameService {
    @Autowired
    private GamerGroupGameRepo gamerGroupGameRepo;
    @Autowired
    private GroupRepo groupRepo;
    @Autowired
    private GameRepo gameRepo;


    public Boolean saveGamerGroupGame(String gamerGroupName, String gameTitle){

        if(!gamerGroupGameRepo.existsByGameTitle(gameTitle)){
             Game game = gameRepo.findByTitle(gameTitle);
             GamerGroup gamerGroup = groupRepo.findBygroupName(gamerGroupName);
            GamerGroupGame savedGame = new GamerGroupGame(game,gamerGroup,game.getTitle());
            gamerGroupGameRepo.save(savedGame);
            return true;
        }

        return false;


    }
    public GamerGroupGame findGamerGroupGame(String gameTitle){
        return gamerGroupGameRepo.findByGameTitle(gameTitle);
    }
}
