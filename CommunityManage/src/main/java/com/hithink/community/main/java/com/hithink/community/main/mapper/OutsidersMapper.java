package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Outsiders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutsidersMapper {
    int insert(Outsiders outsiders);

    int delete(int id);

    int deleteModel(Outsiders outsiders);
    //public int deleteModel(Outsiders outsiders);
    int update(Outsiders outsiders);

    int updateActive(Outsiders outsiders);

    List<Outsiders> selectModel(Outsiders outsiders);

    List<Outsiders> selectAll(Outsiders outsiders);

    int selectCount(Outsiders outsiders);

    Outsiders selectId(int id);
}

