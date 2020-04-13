package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarMapper {
    int insert(Car car);

    int delete(int id);

    int deleteModel(Car car);
    //public int deleteModel(Car car);
    int update(Car car);

    int updateActive(Car car);

    List<Car> selectModel(Car car);

    List<Car> selectAll(Car car);

    int selectCount(Car car);

    Car selectId(int id);
}
