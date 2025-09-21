package com.speedRoller.aplicacion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import com.speedRoller.aplicacion.Repository.UserRepository;

import Model.userModel;

@Service
public class userService {
    
    @Autowired
    UserRepository userRepository;

    public List<userModel> listarUser() {
        return userRepository.findAll();
    }
    

}
