package com.lfg.lfg.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String descrip;
    private String genre;
    private String banner;
    @OneToMany(mappedBy = "games", cascade = CascadeType.ALL)
    private List<GamerGroupGame> groupGames;
    @OneToMany(mappedBy = "gamesUser", cascade = CascadeType.ALL)
    private List<UserGame> userGames;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
