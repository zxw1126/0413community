package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    int insert(Admin admin);

    int delete(int id);

    int deleteModel(Admin admin);
    //public int deleteModel(Admin admin);
    int update(Admin admin);

    int updateActive(Admin admin);

    List<Admin> selectModel(Admin admin);

    List<Admin> selectAll(Admin admin);

    int selectCount(Admin admin);

    Admin selectId(int id);
}
