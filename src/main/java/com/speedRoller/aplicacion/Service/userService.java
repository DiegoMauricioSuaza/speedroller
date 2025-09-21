package com.speedRoller.aplicacion.Service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import com.speedRoller.aplicacion.Repository.UserRepository;

@Service
public class userService {
    
    UserRepository userRepository;

    public listarUser() {
        return userRepository.findAll();
    }
    

}
