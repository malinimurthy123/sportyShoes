package com.sportyfinalproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table
public class Category {

    @OneToMany
    private List<Products> products;

    @Id
    @GeneratedValue
    private int categoryId;

    private String CategoryName;
}
