package com.sportyfinalproject.service.impl;

import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.repository.UsersRepository;
import com.sportyfinalproject.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCrudServiceImpl implements UserCrudService {


    @Autowired
    private UsersRepository UserRepo;

    @Override
    public Users createUser(Users users) {
        return UserRepo.save(users);
    }

    @Override
    public Users updateUser(Users users) {
        return UserRepo.save(users);
    }

    @Override
    public Users getUser(int id) {
        return UserRepo.findById(id).get();
    }

    @Override
    public void deleteUSerById(int id) {
        UserRepo.deleteById(id);
    }
}
