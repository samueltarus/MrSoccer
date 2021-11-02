package com.soccer.action.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "standings")
public class Standings implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "clubName")
    private String clubName;

    @Column(name = "gamesPlayed")
    private int gamesPlayed;

    @Column(name = "clubPosition")
    private int clubPosition;

    @Column(name = "clubPoints")
    private int clubPoints;

    public Standings(int id, String clubName, int gamesPlayed, int clubPosition, int clubPoints) {
        this.id = id;
        this.clubName = clubName;
        this.gamesPlayed = gamesPlayed;
        this.clubPosition = clubPosition;
        this.clubPoints = clubPoints;
    }

    public Standings() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getClubPosition() {
        return clubPosition;
    }

    public void setClubPosition(int clubPosition) {
        this.clubPosition = clubPosition;
    }

    public int getClubPoints() {
        return clubPoints;
    }

    public void setClubPoints(int clubPoints) {
        this.clubPoints = clubPoints;
    }
}
