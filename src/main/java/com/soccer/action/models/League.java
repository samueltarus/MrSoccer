package com.soccer.action.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name = "league_table")
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "league_name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
