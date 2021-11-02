package com.soccer.action.ejb;

import com.soccer.action.dao.ClubDaoI;
import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Club;
import com.soccer.action.utils.AppException;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ClubEjb implements ClubEjbI {

    @Inject
    private ClubDaoI clubDao;

    @Override
    public Club save(Club club) throws Exception {
        if (club == null)
            throw new AppException("Invalid club details!!");

        if (club.getName() == null )
            throw new AppException("Club Name is required!");

        club = clubDao.save(club);

        return club;
    }

    @Override
    public ModelListWrapper<Club> list(Club club, int start, int limit) {
        return clubDao.list(club, start, limit);
    }


    @Override
    public Club delete(Club club) {
        return null;
    }
}
