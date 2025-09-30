package com.speedroller.aplicacion.Controller;

import java.util.List;

import javax.swing.Spring;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.speedroller.aplicacion.Service.userService;
import com.speedroller.aplicacion.Model.userModel;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    userService usuarioService;


    @GetMapping("/listar")
    public String listarUser(Model model) {
        List<userModel> usuarios = usuarioService.listarUser(); // o findAll()
        model.addAttribute("usuarios", usuarios);
        return "user/listar_user";
    }

    // Mostrar formulario para crear nuevo usuario
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new userModel()); // objeto vacío para el formulario
        return "/user/form_user";
    }

    // Guardar el usuario enviado por el formulario
    @PostMapping("/guardar")
    public String guardarUsuario(@Valid @ModelAttribute("usuario") userModel usuario, BindingResult result) {
        
    

        // ¿Hubo errores de validación?
        if (result.hasErrors()) {
        return "/user/form_user"; // vuelve al formulario, con los errores
        }
        
        // Si no hay errores → guarda y redirige
        usuarioService.guardar(usuario); // guarda en BD
        System.out.println("¡Usuario válido! Guardando a : " + usuario.getName());
        return "redirect:/user/listar"; // redirige a la lista
    }

}