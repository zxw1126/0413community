package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Medicine;
import com.hithink.community.main.mapper.MedicineMapper;
import com.hithink.community.main.service.MedicineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicineServiceImpl implements MedicineService {

    @Resource
    private MedicineMapper medicineMapper;

    @Override
    public int insert(Medicine medicine) {
        return medicineMapper.insert(medicine);
    }

    @Override
    public int delete(int id) {
        return medicineMapper.delete(id);
    }

    @Override
    public int update(Medicine medicine) {
        return medicineMapper.update(medicine);
    }

    @Override
    public int updateActive(Medicine medicine) {
        return medicineMapper.updateActive(medicine);
    }

    @Override
    public List<Medicine> selectModel(Medicine medicine) {
        return medicineMapper.selectModel(medicine);
    }

    @Override
    public List<Medicine> selectAll(Medicine medicine) {
        return medicineMapper.selectAll(medicine);
    }

    @Override
    public int selectCount(Medicine medicine) {
        return medicineMapper.selectCount(medicine);
    }

    @Override
    public Medicine selectId(int id) {
        return medicineMapper.selectId(id);
    }
}
