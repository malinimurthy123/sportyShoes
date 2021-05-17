package com.sportyfinalproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor

public class CartItem {
    @OneToMany
    private List<Users> user1;

    @Id
    @GeneratedValue
    private int productId;
    private String name;
    private int rate;
    private int price;
    private int qty;
}
