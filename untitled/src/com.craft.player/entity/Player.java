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
  
