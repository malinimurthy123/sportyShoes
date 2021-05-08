package com.sportyfinalproject.controller;

import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserCrudController {

    @Autowired
    private UserCrudService userCrudController;

    @PostMapping("/user")
    public Users createUser(@RequestBody Users user1){

        return userCrudController.createUser(user1);
    }

    @PutMapping("/user")
    public Users updateUser(@RequestBody Users user) {
        return userCrudController.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public Users getUser(@PathVariable int id) {
        return userCrudController.getUser(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUSerById(@PathVariable int id) {
        userCrudController.deleteUSerById(id);
    }


    @GetMapping("/allusers")
    public List<Users> getUsers() {
        return userCrudController.listAllUser();
    }
}
