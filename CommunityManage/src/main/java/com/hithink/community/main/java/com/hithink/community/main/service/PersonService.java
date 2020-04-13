package com.hithink.community.main.service;

import com.hithink.community.main.bean.Person;

import java.util.List;

public interface PersonService {
    int insert(Person person);

    int delete(int id);

    //public int deleteModel(Person Person);
    int update(Person person);

    int updateActive(Person person);

    List<Person> selectModel(Person person);

    List<Person> selectAll(Person person);

    int selectCount(Person person);

    Person selectId(int id);
}
