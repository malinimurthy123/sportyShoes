package com.sportyfinalproject.service;

import com.sportyfinalproject.model.Users;

public interface UserCrudService {

    public Users createUser(Users users);
    public Users updateUser(Users users);
    public Users getUser(int id);
    public void deleteUSerById(int id);
}
