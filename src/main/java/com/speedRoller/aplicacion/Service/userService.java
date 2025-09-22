package com.speedRoller.aplicacion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.speedRoller.aplicacion.Repository.UserRepository;

import Model.userModel;

@Service
public class userService {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // ← ¡Spring lo inyecta desde SecurityConfig!

    public List<userModel> listarUser(){
        return userRepository.findAll();
    }
    
    public void guardar(userModel usuario){
        // Antes de guardar, codifica la contraseña
        String encodedPassword = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(encodedPassword);
        // Ahora guarda el usuario con la contraseña codificada
        userRepository.save(usuario);
    }

    userModel buscarPorId(Long id){
        return userRepository.findById(id).orElse(null);
    }


}
