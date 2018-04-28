package com.mrp.vue.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private int age;
    @Column(name = "createtime")
    private Date createTime;
    @Column(name = "updatetime")
    private Date updateTime;
}
