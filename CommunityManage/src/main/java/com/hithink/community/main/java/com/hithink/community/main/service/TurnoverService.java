package com.hithink.community.main.service;

import com.hithink.community.main.bean.Turnover;

import java.util.List;

public interface TurnoverService {
    int insert(Turnover turnover);

    int delete(int id);

    //public int deleteModel(Turnover Turnover);
    int update(Turnover turnover);

    int updateActive(Turnover turnover);

    List<Turnover> selectModel(Turnover turnover);

    List<Turnover> selectAll(Turnover turnover);

    int selectCount(Turnover turnover);

    Turnover selectId(int id);
}
