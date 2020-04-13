package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Turnover;
import com.hithink.community.main.mapper.TurnoverMapper;
import com.hithink.community.main.service.TurnoverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TurnoverServiceImpl implements TurnoverService {
    @Resource
    private TurnoverMapper turnoverMapper;

    @Override
    public int insert(Turnover turnover) {
        return turnoverMapper.insert(turnover);
    }

    @Override
    public int delete(int id) {
        return turnoverMapper.delete(id);
    }

    @Override
    public int update(Turnover turnover) {
        return turnoverMapper.update(turnover);
    }

    @Override
    public int updateActive(Turnover turnover) {
        return turnoverMapper.updateActive(turnover);
    }

    @Override
    public List<Turnover> selectModel(Turnover turnover) {
        return turnoverMapper.selectModel(turnover);
    }

    @Override
    public List<Turnover> selectAll(Turnover turnover) {
        return turnoverMapper.selectAll(turnover);
    }

    @Override
    public int selectCount(Turnover turnover) {
        return turnoverMapper.selectCount(turnover);
    }

    @Override
    public Turnover selectId(int id) {
        return turnoverMapper.selectId(id);
    }
}
