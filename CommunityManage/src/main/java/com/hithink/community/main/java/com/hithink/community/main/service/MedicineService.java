package com.hithink.community.main.service;

import com.hithink.community.main.bean.Medicine;

import java.util.List;

public interface MedicineService {
    int insert(Medicine medicine);

    int delete(int id);

    //public int deleteModel(Medicine Medicine);
    int update(Medicine medicine);

    int updateActive(Medicine medicine);

    List<Medicine> selectModel(Medicine medicine);

    List<Medicine> selectAll(Medicine medicine);

    int selectCount(Medicine medicine);

    Medicine selectId(int id);
}
