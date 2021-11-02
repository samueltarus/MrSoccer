package com.soccer.action.dao;

import java.util.List;

public class ModelListWrapper<C> {

    private List<C> list;

    private int count;

    public List<C> getList() {
        return list;
    }

    public void setList(List<C> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
