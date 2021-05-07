package com.sportyfinalproject.service;

import com.sportyfinalproject.model.Admin;

public interface AdminCrudService {
    public Admin authenticate(Admin admin);
    public Admin getAdminById(int id);

}
