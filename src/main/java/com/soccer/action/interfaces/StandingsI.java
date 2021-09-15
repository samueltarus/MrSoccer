package com.soccer.action.interfaces;

import com.soccer.action.models.Standings;

import java.util.List;

public interface StandingsI {
     List<Standings> listPosition() throws Exception;
}
