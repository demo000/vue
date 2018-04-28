package com.mrp.vue.repository;

import com.mrp.vue.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonJpaReponsitory extends JpaRepository<Person, Long> {


    /**
     * @param name
     * @return
     */
    @Query("select p from Person p where p.name = ?1")
    List<Person> findByName(String name);

    /**
     * 带分页查询
     *
     * @param name
     * @param pageable
     * @return
     */
    List<Person> findByNameLike(String name, Pageable pageable);

    /**
     * @param name
     * @param address
     * @return
     */
    @Query("select p from Person p where p.name like  CONCAT('%',:name,'%')  and p.address like CONCAT('%',:address,'%')")
    List<Person> findByNameLikeAndAddressLike(@Param("name") String name, @Param("address") String address);
}
