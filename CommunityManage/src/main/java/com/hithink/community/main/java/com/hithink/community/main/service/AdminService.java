package com.hithink.community.main.service;

import com.hithink.community.main.bean.Admin;

import java.util.List;



public interface AdminService {
    int insert(Admin admin);

    int delete(int id);

    //public int deleteModel(Admin admin);
    int update(Admin admin);

    int updateActive(Admin admin);

    List<Admin> selectModel(Admin admin);

    List<Admin> selectAll(Admin admin);

    int selectCount(Admin admin);

    Admin selectId(int id);
}
