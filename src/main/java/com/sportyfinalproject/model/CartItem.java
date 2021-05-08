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
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue
    private int productId;
    private String name;
    private int rate;
    private int price;
    private int qty;
}
