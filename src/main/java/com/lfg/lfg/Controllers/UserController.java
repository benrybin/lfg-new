package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.User;
import com.lfg.lfg.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="users/add")
    public String addNewUser(@RequestBody User user){
        System.out.println(user.getUserName());
        return userService.signUp(user.getUserName(),user.getPw(),user.getEmailAddress());
    }
    @RequestMapping(path="users/verify")
    public User verifyUser(@RequestBody User user){

       return userService.signIn(user);
    }



}
