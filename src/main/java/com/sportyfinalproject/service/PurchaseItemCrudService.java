package com.sportyfinalproject.service;

import com.sportyfinalproject.model.PurchaseItem;

import java.util.List;

public interface PurchaseItemCrudService {
    public PurchaseItem buyProduct(PurchaseItem purchaseItem);

    public List<PurchaseItem> listAllPurchase();
}
