package com.mrp.vue.service.impl;

import com.mrp.vue.entity.Person;
import com.mrp.vue.repository.PersonJpaReponsitory;
import com.mrp.vue.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.swing.StringUIClientPropertyKey;

import java.util.Collections;
import java.util.List;

@Service
public class PersionServiceImpl implements PersonService {
    @Autowired
    private PersonJpaReponsitory personJpaReponsitory;

    @Override
    public List<Person> queryByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return Collections.EMPTY_LIST;
        }
        return personJpaReponsitory.findByName(name);
    }

    @Override
    public List<Person> findByNameLike(String name, Pageable pageable) {

        return personJpaReponsitory.findByNameLike(name,pageable);
    }

    @Override
    public List<Person> findByNameLikeAndAddressLike(String name, String address) {

        return personJpaReponsitory.findByNameLikeAndAddressLike(name,address);
    }

    @Override
    public List<Person> getAll() {
        return personJpaReponsitory.findAll();
    }
}
