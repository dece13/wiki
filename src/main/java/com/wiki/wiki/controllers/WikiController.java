package com.wiki.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SuppressWarnings("unused")
@Controller
public class WikiController {

    @GetMapping("/grupo13/home")
    public String home(){
         return "index.html";
     }
    
     @GetMapping("/grupo13/home/formulario")
    public String showFormulario() {
        return "formulario.html"; // Nombre de tu página de formulario
    }
}
