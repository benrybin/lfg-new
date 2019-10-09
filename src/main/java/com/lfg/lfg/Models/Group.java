package com.lfg.lfg.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="gamergroup")
public class Group {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    List<Game> games;
    @OneToMany
    List<User> members;
    private String intro;
    private String playStyle;
    private String size;
    private String discordChannel;
    private String groupName;
    @ManyToOne
    private User user;


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

 public List<User> getMembers() {
  return members;
 }

 public void setMembers(List<User> members) {
  this.members = members;
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

 public User getUser() {
  return user;
 }

 public void setUser(User user) {
  this.user = user;
 }
}
