package com.soccer.action.dao;

import com.soccer.action.models.Standings;

public interface StandingsDaoI {

    Standings save(Standings standings);
    ModelListWrapper<Standings> list (Standings filter, int start, int limit);

}
