package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Remind;
import com.hithink.community.main.mapper.RemindMapper;
import com.hithink.community.main.service.RemindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RemindServiceImpl implements RemindService {
    @Resource
    private RemindMapper remindMapper;

    @Override
    public int insert(Remind remind) {
        return remindMapper.insert(remind);
    }

    @Override
    public int delete(int id) {
        return remindMapper.delete(id);
    }

    @Override
    public int update(Remind remind) {
        return remindMapper.update(remind);
    }

    @Override
    public int updateActive(Remind remind) {
        return remindMapper.updateActive(remind);
    }

    @Override
    public List<Remind> selectModel(Remind remind) {
        return remindMapper.selectModel(remind);
    }

    @Override
    public List<Remind> selectAll(Remind remind) {
        return remindMapper.selectAll(remind);
    }

    @Override
    public int selectCount(Remind remind) {
        return remindMapper.selectCount(remind);
    }

    @Override
    public Remind selectId(int id) {
        return remindMapper.selectId(id);
    }
}
