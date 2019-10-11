package com.lfg.lfg.Services;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.User;
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

    public Boolean saveGame(Game game) {
        if (gameRepo.existsByName(game.getName())) {

            return false;
        } else {
            gameRepo.save(game);
            return gameRepo.existsByName(game.getName());
        }
    }
    public Boolean addGametoGroup(String game,String groupName){
        Game tempGame = gameRepo.findByName(game);
        GamerGroup tempGamerGroup = groupRepo.findBygroupName(groupName);
        tempGamerGroup.getGames().add(tempGame);
        tempGame.getGamerGroups().add(tempGamerGroup);
        gameRepo.save(tempGame);
        groupRepo.save(tempGamerGroup);
        return true;
    }
    public Boolean addGametoUser(String game,String userName){
        Game tempGame = gameRepo.findByName(game);
        User tempUser = userRepo.findByuserName(userName);
        tempUser.getGames().add(tempGame);
        tempGame.getUsers().add(tempUser);
        gameRepo.save(tempGame);
        userRepo.save(tempUser);
        return true;
    }
}
