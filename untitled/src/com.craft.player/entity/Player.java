package com.craft.player.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

  private @Id String playerID;
  private int birthYear;
  private int birthMonth;
  private int birthDay;
  private String birthCountry;
  private String birthState;
  private String birthCity;
  private Integer deathYear;
  private Integer deathMonth;
  private Integer deathDay;
  private String deathCountry;
  private String deathState;
  private String deathCity;
  private String nameFirst;
  private String nameLast;
  private String nameGiven;
  private int weight;
  private int height;
  private String bats;
  private String bbthrows;
  private String debut;
  private String finalGame;
  private String retroID;
  private String bbrefID.
  
  public String getPlayerID() {
    return playerID;
  }

  public void setPlayerId(String playerID)  {
    return this.playerID = playerID;
  }


