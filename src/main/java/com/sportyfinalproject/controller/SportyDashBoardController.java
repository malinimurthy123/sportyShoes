package com.sportyfinalproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SportyDashBoardController {

    @GetMapping("/dashboard")
    public String dashboard(){

        return "Welcome to Sporty DashBoard";
    }

}
