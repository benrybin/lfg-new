package com.lfg.lfg.Models;

import javax.persistence.*;

@Entity
public class GamerGroupGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="game_id")
    private Game games;


    @ManyToOne
    @JoinColumn(name="gamegroup_id")
    private GamerGroup gamerGroup;
    private String playstyle;

    public GamerGroupGame(Game games, GamerGroup gamerGroup) {
        this.games = games;
        this.gamerGroup = gamerGroup;
    }

    public String getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(String playstyle) {
        this.playstyle = playstyle;
    }
}
