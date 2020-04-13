package com.hithink.community.main.service;

import com.hithink.community.main.bean.Remind;

import java.util.List;

public interface RemindService {
    int insert(Remind remind);

    int delete(int id);

    //public int deleteModel(Remind Remind);
    int update(Remind remind);

    int updateActive(Remind remind);

    List<Remind> selectModel(Remind remind);

    List<Remind> selectAll(Remind remind);

    int selectCount(Remind remind);

    Remind selectId(int id);
}
