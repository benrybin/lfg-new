package com.lfg.lfg.Models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany
    private List<Game> games;
    @OneToMany
    private List<Group> groups;
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
    private String lanuage;
    private Boolean mic;
    private String discordName;
    private String steamName;

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

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
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

    public String getLanuage() {
        return lanuage;
    }

    public void setLanuage(String lanuage) {
        this.lanuage = lanuage;
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
}
