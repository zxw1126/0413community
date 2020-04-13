package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Car;
import com.hithink.community.main.mapper.CarMapper;
import com.hithink.community.main.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;
    @Override
    public int insert(Car car) {
        return carMapper.insert(car);
    }

    @Override
    public int delete(int id) {
        return carMapper.delete(id);
    }

    @Override
    public int update(Car car) {
        return carMapper.update(car);
    }

    @Override
    public int updateActive(Car car) {
        return carMapper.updateActive(car);
    }

    @Override
    public List<Car> selectModel(Car car) {
        return carMapper.selectModel(car);
    }

    @Override
    public List<Car> selectAll(Car car) {
        return carMapper.selectAll(car);
    }

    @Override
    public int selectCount(Car car) {
        return carMapper.selectCount(car);
    }

    @Override
    public Car selectId(int id) {
        return carMapper.selectId(id);
    }
}
