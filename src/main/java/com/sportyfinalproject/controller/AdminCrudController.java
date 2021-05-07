package com.sportyfinalproject.controller;

import com.sportyfinalproject.model.Admin;
import com.sportyfinalproject.service.AdminCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminCrudController {

    @Autowired
    private AdminCrudService adminCrudService;

    @PostMapping("/admin")
    public Admin autheticateAdmin(@RequestBody Admin admin){

        return adminCrudService.authenticate(admin);
    }

    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable int id){

        return adminCrudService.getAdminById(id);
    }
}
