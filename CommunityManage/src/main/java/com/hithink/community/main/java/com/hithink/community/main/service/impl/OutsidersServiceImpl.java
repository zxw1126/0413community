package com.hithink.community.main.service.impl;


import com.hithink.community.main.bean.Outsiders;
import com.hithink.community.main.mapper.OutsidersMapper;
import com.hithink.community.main.service.OutsidersService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OutsidersServiceImpl implements OutsidersService {
    @Resource
    private OutsidersMapper outsidersMapper;

    @Override
    public int insert(Outsiders outsiders) {
        return outsidersMapper.insert(outsiders);
    }

    @Override
    public int delete(int id) {
        return outsidersMapper.delete(id);
    }

    @Override
    public int update(Outsiders outsiders) {
        return outsidersMapper.update(outsiders);
    }

    @Override
    public int updateActive(Outsiders outsiders) {
        return outsidersMapper.updateActive(outsiders);
    }

    @Override
    public List<Outsiders> selectModel(Outsiders outsiders) {
        return outsidersMapper.selectModel(outsiders);
    }

    @Override
    public List<Outsiders> selectAll(Outsiders outsiders) {
        return outsidersMapper.selectAll(outsiders);
    }

    @Override
    public int selectCount(Outsiders outsiders) {
        return outsidersMapper.selectCount(outsiders);
    }

    @Override
    public Outsiders selectId(int id) {
        return outsidersMapper.selectId(id);
    }
}
