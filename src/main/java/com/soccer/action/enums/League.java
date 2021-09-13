package com.soccer.action.enums;

public enum League {
    PREMIER("England Premier League"),
    LALIGA("Laliga of Spain"),
    BUNDESLIGA("Germany Bundesliga"),
    LIGUE1("France Ligue 1"),
    SERIEA("Italy Serie A"),
    NA("Not Available");

    private String name;

    League(String name) {
        this.name = name;
    }
}
