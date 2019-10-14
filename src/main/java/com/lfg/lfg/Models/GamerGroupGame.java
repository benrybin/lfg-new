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
    private String gameTitle;
    private Integer groupIdtemp;

    public GamerGroupGame(Game games, GamerGroup gamerGroup,String gameTitle,Integer groupId) {
        this.games = games;
        this.gamerGroup = gamerGroup;
        this.gameTitle = gameTitle;
        this.groupIdtemp = groupId;
    }

    public GamerGroupGame() {
    }

    public String getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(String playstyle) {
        this.playstyle = playstyle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Game getGames() {
        return games;
    }

    public void setGames(Game games) {
        this.games = games;
    }

    public GamerGroup getGamerGroup() {
        return gamerGroup;
    }

    public void setGamerGroup(GamerGroup gamerGroup) {
        this.gamerGroup = gamerGroup;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }


    public Integer getGroupIdtemp() {
        return groupIdtemp;
    }

    public void setGroupIdtemp(Integer groupIdtemp) {
        this.groupIdtemp = groupIdtemp;
    }
}
