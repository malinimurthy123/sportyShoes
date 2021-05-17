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
public class Users {

    @OneToMany
    private List<CartItem> cartItemList;

    @Id
    @GeneratedValue
    private int userid;
    private String name;
    private String password1;
    private int age;
    private long contact;
}
