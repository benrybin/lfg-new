package com.lfg.lfg.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min = 8, message = "Minimum password length: 8 characters")
    @Column(nullable=false)
    private String pw;
    @Column(nullable=false)
    private String userName;
    @Column(nullable=false)
    private String emailAddress;
    private String profilePic;
    private String banner;
    private String intro;
    private String timeZone;
    private String region;
    private String language;
    private Boolean mic;
    private String discordName;
    private String steamName;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_gamergroup",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="gamer_group_id"))
    @JsonIgnoreProperties("users")
    List<GamerGroup> groups;
    @ManyToMany(mappedBy = "users")
    @JsonIgnoreProperties("users")
    List<Game> games;


    public User(String userName,String pw,String emailAddress) {
        this.pw = pw;
        this.userName = userName;
        this.emailAddress = emailAddress;
    }



    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }



    public Boolean getMic() {
        return mic;
    }

    public void setMic(Boolean mic) {
        this.mic = mic;
    }

    public String getDiscordName() {
        return discordName;
    }

    public void setDiscordName(String discordName) {
        this.discordName = discordName;
    }

    public String getSteamName() {
        return steamName;
    }

    public void setSteamName(String steamName) {
        this.steamName = steamName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public List<GamerGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<GamerGroup> groups) {
        this.groups = groups;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
