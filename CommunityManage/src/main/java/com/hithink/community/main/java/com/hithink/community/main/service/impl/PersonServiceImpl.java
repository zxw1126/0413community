package com.hithink.community.main.service.impl;

import com.hithink.community.main.bean.Person;
import com.hithink.community.main.mapper.PersonMapper;
import com.hithink.community.main.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapper personMapper;

    @Override
    public int insert(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int delete(int id) {
        return personMapper.delete(id);
    }

    @Override
    public int update(Person person) {
        return personMapper.update(person);
    }

    @Override
    public int updateActive(Person person) {
        return personMapper.updateActive(person);
    }

    @Override
    public List<Person> selectModel(Person person) {
        return personMapper.selectModel(person);
    }

    @Override
    public List<Person> selectAll(Person person) {
        return personMapper.selectAll(person);
    }

    @Override
    public int selectCount(Person person) {
        return personMapper.selectCount(person);
    }

    @Override
    public Person selectId(int id) {
        return personMapper.selectId(id);
    }
}
