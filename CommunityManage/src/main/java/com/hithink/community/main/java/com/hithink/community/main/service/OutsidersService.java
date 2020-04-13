package com.hithink.community.main.service;

import com.hithink.community.main.bean.Outsiders;

import java.util.List;

public interface OutsidersService {
    int insert(Outsiders outsiders);

    int delete(int id);

    //public int deleteModel(Outsiders Outsiders);
    int update(Outsiders outsiders);

    int updateActive(Outsiders outsiders);

    List<Outsiders> selectModel(Outsiders outsiders);

    List<Outsiders> selectAll(Outsiders outsiders);

    int selectCount(Outsiders outsiders);

    Outsiders selectId(int id);
}
