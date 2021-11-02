package com.soccer.action.ejb;

import com.soccer.action.dao.ModelListWrapper;
import com.soccer.action.models.Club;

public interface ClubEjbI {

    Club save(Club club) throws Exception;

    ModelListWrapper<Club> list(Club club, int start, int limit);

    Club delete(Club club);

}
