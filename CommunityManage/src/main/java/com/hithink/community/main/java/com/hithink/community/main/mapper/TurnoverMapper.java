package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Turnover;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TurnoverMapper {
    int insert(Turnover turnover);

    int delete(int id);

    int deleteModel(Turnover turnover);
    //public int deleteModel(Turnover turnover);
    int update(Turnover turnover);

    int updateActive(Turnover turnover);

    List<Turnover> selectModel(Turnover turnover);

    List<Turnover> selectAll(Turnover turnover);

    int selectCount(Turnover turnover);

    Turnover selectId(int id);
}
