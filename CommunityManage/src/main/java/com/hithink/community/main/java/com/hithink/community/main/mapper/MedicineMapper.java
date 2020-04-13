package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Medicine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineMapper {
    int insert(Medicine medicine);

    int delete(int id);

    int deleteModel(Medicine medicine);
    //public int deleteModel(Medicine medicine);
    int update(Medicine medicine);

    int updateActive(Medicine medicine);

    List<Medicine> selectModel(Medicine medicine);

    List<Medicine> selectAll(Medicine medicine);

    int selectCount(Medicine medicine);

    Medicine selectId(int id);
}
