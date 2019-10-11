package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.Game;
import com.lfg.lfg.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping(path="game/add")
    public String addnewGame(@RequestBody Game newGame) {

        if (gameService.saveGame(newGame)) {
            return "Game created Succesfully";
        } else {
            return "Game add failed";
        }
    }
}
