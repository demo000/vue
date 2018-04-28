package com.mrp.vue.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "userinfo")
@Setter
@Getter
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

}
