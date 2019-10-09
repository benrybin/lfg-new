package com.lfg.lfg.Services;

import com.lfg.lfg.Repos.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepo gameRepo;
}
