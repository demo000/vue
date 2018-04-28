package com.mrp.vue.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "transactions")
@Setter
@Getter
public class Transactions implements Serializable {
    @GeneratedValue
    @Id
    private Long id;
    @SerializedName("price")
    private double price;
    @SerializedName("color")
    private String color;
    @SerializedName("make")
    private String make;
    @SerializedName("sold")
    private Date sold;

}
