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
public class PurchaseItem {

    @Id
    @GeneratedValue
    private int id;
    @GeneratedValue
    private int purchaseId;
    @GeneratedValue
    private int productId;

    private int userID;
    private int rate;
    private int quantity;
    private int price;
}

