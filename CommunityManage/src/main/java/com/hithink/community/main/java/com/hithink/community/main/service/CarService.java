package com.hithink.community.main.service;

import com.hithink.community.main.bean.Car;

import java.util.List;

public interface CarService {
    int insert(Car car);

    int delete(int id);

    //public int deleteModel(Car Car);
    int update(Car car);

    int updateActive(Car car);

    List<Car> selectModel(Car car);

    List<Car> selectAll(Car car);

    int selectCount(Car car);

    Car selectId(int id);
}
