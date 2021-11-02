package com.soccer.action.dao;

import com.soccer.action.models.Club;

public interface ClubDaoI {
    Club save(Club club);
    ModelListWrapper<Club> list(Club filter, int start, int limit);
}
