package com.mrp.vue.repository;

import com.mrp.vue.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserInfoRepository extends Repository<UserInfo,Long> {

    List<UserInfo> getUserInfoByName(String name);
}
