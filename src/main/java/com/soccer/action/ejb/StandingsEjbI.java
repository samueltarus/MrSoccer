package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Standings;

public interface StandingsEjbI {
    Standings save(Standings standings) throws Exception;

    ModelListWrapper<Standings> list(Standings standings, int start, int limit);

    Standings delete(Standings standings);
}
