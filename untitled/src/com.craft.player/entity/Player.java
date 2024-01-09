package com.craft.player.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

  private @Id String playerID;
  private int birthYear;
  private int birthMonth;
  
