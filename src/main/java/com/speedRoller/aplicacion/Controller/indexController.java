package com.speedRoller.aplicacion.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("/")
public class indexController {
    
    @GetMapping("home")
    public String Home() {
        return "index";
    }
    
      @GetMapping("/mision")
    public String mision() {
        return "mision";
    }
}

//localhost:8085/index 