package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Remind;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RemindMapper {
    int insert(Remind remind);

    int delete(int id);

    int deleteModel(Remind remind);
    //public int deleteModel(Remind remind);
    int update(Remind remind);

    int updateActive(Remind remind);

    List<Remind> selectModel(Remind remind);

    List<Remind> selectAll(Remind remind);

    int selectCount(Remind remind);

    Remind selectId(int id);
}
