package com.soccer.action.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "players")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int player_id;

    @Column(name = "player_name")
    private String player_name;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "position")
    private String position;

    public Player(int player_id, String player_name, String nationality, String position) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.nationality = nationality;
        this.position = position;
    }

    public Player() {
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
