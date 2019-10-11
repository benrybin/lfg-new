package com.lfg.lfg.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity

public class GamerGroup {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String intro;
    private String playStyle;
    private String size;
    private String discordChannel;
    @Column(nullable=false)
    private String groupName;
 @ManyToMany(mappedBy = "groups")
 @JsonIgnoreProperties("groups")
    List<User> users;
 @ManyToMany(mappedBy = "gamerGroups")
 @JsonIgnoreProperties("gamerGroups")
 List<Game> games;


 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }


 public String getIntro() {
  return intro;
 }

 public void setIntro(String intro) {
  this.intro = intro;
 }

 public String getPlayStyle() {
  return playStyle;
 }

 public void setPlayStyle(String playStyle) {
  this.playStyle = playStyle;
 }

 public String getSize() {
  return size;
 }

 public void setSize(String size) {
  this.size = size;
 }

 public String getDiscordChannel() {
  return discordChannel;
 }

 public void setDiscordChannel(String discordChannel) {
  this.discordChannel = discordChannel;
 }

 public String getGroupName() {
  return groupName;
 }

 public void setGroupName(String groupName) {
  this.groupName = groupName;
 }


 public List<User> getUsers() {
  return users;
 }

 public void setUsers(List<User> users) {
  this.users = users;
 }

 public List<Game> getGames() {
  return games;
 }

 public void setGames(List<Game> games) {
  this.games = games;
 }
}
