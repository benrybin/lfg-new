package com.lfg.lfg.Models;

import javax.persistence.*;

@Entity
public class UserGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String playstyle;
    private String gameTitle;
    private Integer hours;
    private Integer tempuserId;

    @ManyToOne
    @JoinColumn(name="game_id")
    private Game gamesUser;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public UserGame(Game gamesUser, User user,String gameTitle) {
        this.gamesUser = gamesUser;
        this.user = user;
        this.gameTitle = gameTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(String playstyle) {
        this.playstyle = playstyle;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Game getGamesUser() {
        return gamesUser;
    }

    public void setGamesUser(Game gamesUser) {
        this.gamesUser = gamesUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Integer getTempuserId() {
        return tempuserId;
    }

    public void setTempuserId(Integer tempuserId) {
        this.tempuserId = tempuserId;
    }
}
