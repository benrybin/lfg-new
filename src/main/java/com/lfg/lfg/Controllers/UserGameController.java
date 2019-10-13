package com.lfg.lfg.Controllers;

import com.lfg.lfg.Services.UserGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserGameController {
    @Autowired
    UserGameService userGameService;

    @RequestMapping(path="user/addgame")
    public String saveUserGame(@RequestParam String userName,@RequestParam String gameTitle){
        userGameService.saveUserGame(userName,gameTitle);

        return "yes";

    }
}
