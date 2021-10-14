package com.soccer.action.utils;

import java.util.ArrayList;
import java.util.List;

public class ResultWrapper <T> {
    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
