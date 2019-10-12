package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.User;
import com.lfg.lfg.Services.GameService;
import com.lfg.lfg.Services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GroupController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private GameService gameService;

    @PostMapping(path="groups/add")
    public String addnewGroup(@RequestBody GamerGroup gamerGroup){

        if(groupService.saveGroup(gamerGroup)){
            return "GamerGroup created Succesfully";
        }else{
            return "GamerGroup add failed";
        }

    }
    @RequestMapping("group/adduser")
    public String addUsertoGroup(@RequestParam String userName,@RequestParam String groupName){
       groupService.addUsertoGroup(userName,groupName);

       return "Yes";



    }
    @RequestMapping("group/addgame")
    public String addGametoGroup(@RequestParam String game,@RequestParam String groupName){
        System.out.println(game);
        System.out.println(groupName);
        gameService.addGametoGroup(game,groupName);

        return "Yes";



    }
    @RequestMapping("group/getgames")
    public List<Game> getGamesFromGroup(String groupName){
        return groupService.getGames(groupName);

    }
    @RequestMapping(path="group/getusers")
        public List<User> getUsersfromGroup(@RequestParam String groupName){
        return groupService.getUsers(groupName);
    }
}
