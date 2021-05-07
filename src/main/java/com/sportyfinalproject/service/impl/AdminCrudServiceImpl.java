package com.sportyfinalproject.service.impl;

import com.sportyfinalproject.model.Admin;
import com.sportyfinalproject.repository.AdminRepository;
import com.sportyfinalproject.service.AdminCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminCrudServiceImpl implements AdminCrudService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin authenticate(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminById(int id) {
        return adminRepository.findById(id).get();
    }


}
