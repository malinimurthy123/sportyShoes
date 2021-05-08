package com.sportyfinalproject.service.impl;

import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.repository.UsersRepository;
import com.sportyfinalproject.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
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
        if (UserRepo.findById(id).isPresent()) {
            return UserRepo.findById(id).get();
        }
        throw new NoSuchElementException();
    }

    @Override
    public void deleteUSerById(int id) {
        UserRepo.deleteById(id);
    }

    @Override
    public List<Users> listAllUser() {

         return UserRepo.findAll();
    }
}

