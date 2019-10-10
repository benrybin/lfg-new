package com.lfg.lfg.Services;

import com.lfg.lfg.Models.User;
import com.lfg.lfg.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
    public Boolean save(User user){

        if(userRepo.existsByuserName(user.getUserName())){
            return false;
        }else{
            userRepo.save(user);
            return true;
        }
    }
    public User signIn(User user){
       User temp =  userRepo.findByuserName(user.getUserName());


       if(passwordEncoder.matches(user.getPw(),temp.getPw())) {
           return temp;

       }else{
           System.out.println("User not found");
           return new User();
       }

    }
    public String signUp(String userName,String password,String emailAddress){
        if(userRepo.existsByuserName(userName)){
            return "Username already taken";

        }else if(userRepo.existsByemailAddress(emailAddress)){
            return "Email address already used";

        }else{
            String hashedPw = passwordEncoder.encode(password);
            User temp = new User(userName,hashedPw,emailAddress);
            userRepo.save(temp);
            return "User sucessfully created";

        }
    }
}
