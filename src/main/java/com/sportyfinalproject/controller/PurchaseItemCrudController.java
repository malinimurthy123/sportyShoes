package com.sportyfinalproject.controller;


import com.sportyfinalproject.model.PurchaseItem;
import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.service.PurchaseItemCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseItemCrudController {

    @Autowired
    private PurchaseItemCrudService purchaseItemCrudService;

    @PostMapping("/purchaseitem")
    public PurchaseItem createProduct(@RequestBody PurchaseItem purchaseItem) {
        return purchaseItemCrudService.buyProduct(purchaseItem);
    }

    @GetMapping("/allpurchases")
    public List<PurchaseItem> getallPurchasess() {
        return purchaseItemCrudService.listAllPurchase();
    }

}
