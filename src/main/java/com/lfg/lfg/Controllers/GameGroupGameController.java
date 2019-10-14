package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.GamerGroupGame;
import com.lfg.lfg.Services.GamerGroupGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameGroupGameController {
    @Autowired
    GamerGroupGameService gamerGroupGameService;
    // Change to post instead of Get
    @RequestMapping("group/addgroupgame")
    public String saveGamerGroupGame(@RequestParam String gamerGroupName,@RequestParam  String gameTitle){
        gamerGroupGameService.saveGamerGroupGame(gamerGroupName,gameTitle);
        return "Yes";
    }
    @RequestMapping("group/getgames")
    public GamerGroupGame findGamesbyGroup(@RequestParam String gameTitle,@RequestParam String groupName){
        return gamerGroupGameService.findGamerGroupGame(gameTitle,groupName);
    }

}
