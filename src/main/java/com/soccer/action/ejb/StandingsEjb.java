package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.dao.StandingsDaoI;
import com.soccer.action.models.Standings;
import com.soccer.action.utils.AppException;

import javax.inject.Inject;

public class StandingsEjb implements StandingsEjbI{

    @Inject
    private StandingsDaoI standingsDao;

    @Override
    public Standings save(Standings standings) throws Exception {
        if (standings == null)
            throw new AppException("Invalid standings details!!");

        if (standings.getClubName() == null)
            throw new AppException("Club Name is required!");

        return standingsDao.save(standings);
    }

    @Override
    public ModelListWrapper<Standings> list(Standings standings, int start, int limit) {
        return standingsDao.list(standings, start, limit);
    }

    @Override
    public Standings delete(Standings standings) {
        return null;
    }
}
