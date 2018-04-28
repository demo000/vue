package com.mrp.vue.service;

import com.mrp.vue.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonService {

    List<Person> queryByName(String name);

    List<Person> findByNameLike(String name, Pageable pageable);

    List<Person> findByNameLikeAndAddressLike(String name, String address);

    List<Person> getAll();
}
