package com.hithink.community.main.mapper;

import com.hithink.community.main.bean.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface PersonMapper {
    int insert(Person person);

    int delete(int id);

    int deleteModel(Person person);
    //public int deleteModel(Person person);
    int update(Person person);

    int updateActive(Person person);

    List<Person> selectModel(Person person);

    List<Person> selectAll(Person person);

    int selectCount(Person person);

    Person selectId(int id);
}
