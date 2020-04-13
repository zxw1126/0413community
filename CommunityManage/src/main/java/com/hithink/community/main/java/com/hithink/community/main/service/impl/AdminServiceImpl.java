package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Admin;
import com.hithink.community.main.mapper.AdminMapper;
import com.hithink.community.main.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public int delete(int id) {
        return adminMapper.delete(id);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.update(admin);
    }

    @Override
    public int updateActive(Admin admin) {
        return adminMapper.update(admin);
    }

    @Override
    public List<Admin> selectModel(Admin admin) {
        return adminMapper.selectModel(admin);
    }

    @Override
    public List<Admin> selectAll(Admin admin) {
        return adminMapper.selectAll(admin);
    }

    @Override
    public int selectCount(Admin admin) {
        return adminMapper.selectCount(admin);
    }

    @Override
    public Admin selectId(int id) {
        return adminMapper.selectId(id);
    }
}
