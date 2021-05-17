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
public class Products {

    @OneToMany
    private List<PurchaseItem>purchaseItemList1;
    @OneToMany
    private List<Category> categories;

    @Id
    @GeneratedValue
    private int productid;

    private String productName;
    private int price;
    private String category;
    private String brand;
    private String colour;
}
