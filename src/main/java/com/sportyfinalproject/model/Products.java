package com.sportyfinalproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table
public class Products {

    @Id
    @GeneratedValue

    private int productid;
    private String name;
    private int price;
    private String category;
    private String brand;
    private String colour;
}
