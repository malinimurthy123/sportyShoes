package com.sportyfinalproject.controller;

import com.sportyfinalproject.model.Products;
import com.sportyfinalproject.model.PurchaseItem;
import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.service.ProductCrudService;
import com.sportyfinalproject.service.PurchaseItemCrudService;
import com.sportyfinalproject.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportyDashBoardController {

    @Autowired
    private UserCrudService userCrudController;

    @Autowired
    private PurchaseItemCrudService purchaseItemCrudService;

    @Autowired
    private ProductCrudService productCrudService;

    @GetMapping("/dashboard")
    public String dashboard(){

        return "Welcome to Sporty Shoes DashBoard";
    }



}
