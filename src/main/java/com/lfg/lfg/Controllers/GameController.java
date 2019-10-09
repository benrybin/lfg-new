package com.lfg.lfg.Controllers;

import com.lfg.lfg.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;
}
