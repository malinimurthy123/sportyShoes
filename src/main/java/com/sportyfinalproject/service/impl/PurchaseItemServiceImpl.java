package com.sportyfinalproject.service.impl;


import com.sportyfinalproject.model.PurchaseItem;
import com.sportyfinalproject.repository.PurchaseItemRepository;
import com.sportyfinalproject.service.PurchaseItemCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchaseItemServiceImpl implements PurchaseItemCrudService {
    @Autowired
    private PurchaseItemRepository purchaseItemRepository;

    @Override
    public PurchaseItem buyProduct(PurchaseItem purchaseItem) {
        return purchaseItemRepository.save(purchaseItem);
    }

    public List<PurchaseItem> listAllPurchase() {
        return purchaseItemRepository.findAll();
    }
}
