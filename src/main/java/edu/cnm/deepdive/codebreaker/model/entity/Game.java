package edu.cnm.deepdive.codebreaker.model.entity;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {


  @Column(name = "game_id", updatable = false, nullable = false, columnDefinition = "UUID")
  private UUID id;

  @Column(updatable = false, nullable = false, columnDefinition = "UUID", unique = true)
  private UUID externalKey;

  private User user;

  @Column()
  private Date created;

  @Column(nullable = false, updatable = false, length = 225)
  private String pool;

  @Column()
  private int length;

  @Column(nullable = false, updatable = false, length = 20)
  private String text;

}
